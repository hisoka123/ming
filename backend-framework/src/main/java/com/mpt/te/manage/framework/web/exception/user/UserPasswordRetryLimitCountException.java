package com.mpt.te.manage.framework.web.exception.user;

/**
 * 用户错误记数异常类
 * 
 * @author te
 */
public class UserPasswordRetryLimitCountException extends UserException
{
    private static final long serialVersionUID = 1L;

    public UserPasswordRetryLimitCountException(int retryLimitCount)
    {
        super("user.password.retry.limit.count", new Object[] { retryLimitCount });
    }
}
