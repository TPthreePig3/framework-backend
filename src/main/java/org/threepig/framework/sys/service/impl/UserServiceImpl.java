package org.threepig.framework.sys.service.impl;

import org.springframework.stereotype.Service;
import org.threepig.framework.sys.dto.User;
import org.threepig.framework.sys.service.IUserService;

import io.choerodon.mybatis.service.BaseServiceImpl;

/**
 * @author shawn777 on 2018/8/8.
 */
@Service
public class UserServiceImpl extends BaseServiceImpl<User> implements IUserService {
}
