package script.db

databaseChangeLog(logicalFilePath: 'script/db/user.groovy') {
    changeSet(author: 'shawn777', id: '2018-08-8-user') {
        createTable(tableName: "sys_user") {
            column(name: 'id', type: 'BIGINT UNSIGNED', autoIncrement: true, remarks: '表ID，主键，供其他表做外键，unsigned bigint、单表时自增、步长为 1') {
                constraints(primaryKey: true)
            }
            column(name: 'login_name', type: 'VARCHAR(128)', remarks: '用户名') {
                constraints(nullable: false)
                constraints(unique: true)
            }
            column(name: 'email', type: 'VARCHAR(128)', remarks: '电子邮箱地址') {
                constraints(nullable: false)
                constraints(unique: true)
            }

            column(name: 'password', type: 'VARCHAR(128)', remarks: 'Hash后的用户密码') {
                constraints(nullable: false)
            }
            column(name: 'real_name', type: 'VARCHAR(32)', remarks: '用户真实姓名')
            column(name: 'phone', type: 'VARCHAR(32)', remarks: '手机号')

            column(name: "object_version_number", type: "BIGINT UNSIGNED", defaultValue: "1")
            column(name: "created_by", type: "BIGINT UNSIGNED", defaultValue: "0")
            column(name: "creation_date", type: "DATETIME", defaultValueComputed: "CURRENT_TIMESTAMP")
            column(name: "last_updated_by", type: "BIGINT UNSIGNED", defaultValue: "0")
            column(name: "last_update_date", type: "DATETIME", defaultValueComputed: "CURRENT_TIMESTAMP")
        }
    }
}