package com.hexmeet.autotestcases.testsuites

import com.hexmeet.autotestcases.install.InstallApp
import com.hexmeet.autotestcases.login.*
import com.hexmeet.autotestcases.*
import com.hexmeet.autotestcases.publiccloud.JoinAReserveMeeting
import com.hexmeet.autotestcases.publiccloud.OperateInAReservedMeeting
import org.junit.runner.RunWith
import org.junit.runners.Suite

@RunWith(Suite.class)
@Suite.SuiteClasses([
        Login,
//        JoinAReserveMeeting,
//        OperateInAReservedMeeting
])

class LoginTestSuite {
}
