package com.hexmeet.autotestcases.testsuites

import com.hexmeet.autotestcases.privatecloud.AndroidOp
import com.hexmeet.autotestcases.privatecloud.AppVersion
import com.hexmeet.autotestcases.privatecloud.CallAContactInPrivate
import com.hexmeet.autotestcases.privatecloud.GuestCall
import com.hexmeet.autotestcases.privatecloud.JoinAReserveMeeting
import com.hexmeet.autotestcases.privatecloud.JoinMyMeetingInPrivate
import com.hexmeet.autotestcases.privatecloud.LockMeetingInMeetingControl
import com.hexmeet.autotestcases.privatecloud.OperateInAGuestCall
import com.hexmeet.autotestcases.privatecloud.OperateInAReservedMeeting
import com.hexmeet.autotestcases.privatecloud.OperateReserveMeeting
import com.hexmeet.autotestcases.privatecloud.PostponeMeetingInMeetingControl
import com.hexmeet.autotestcases.privatecloud.SignIn

import org.junit.runner.RunWith
import org.junit.runners.Suite

@RunWith(Suite.class)
@Suite.SuiteClasses([
        AndroidOp,
        AppVersion,
        SignIn,
        JoinMyMeetingInPrivate,
        GuestCall,
        OperateInAGuestCall,
        CallAContactInPrivate,
        JoinAReserveMeeting,
        OperateReserveMeeting,
        PostponeMeetingInMeetingControl,
        LockMeetingInMeetingControl,
        OperateInAReservedMeeting
])

class PrivateCloudTestSuite {
}
