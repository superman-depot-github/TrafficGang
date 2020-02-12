package com.stjy.login.register

import android.view.View
import com.alibaba.android.arouter.facade.annotation.Route
import com.alibaba.android.arouter.launcher.ARouter
import com.stjy.baselib.base.mvvm.BaseVMFragment
import com.stjy.baselib.utils.ARouterHub
import com.stjy.login.R
import com.stjy.login.model.LoginViewModel

@Route(path = ARouterHub.LOGIN_AUDITDETAILS_FRAGMENT, name = "企业注册信息审核详情")
class AuditDetailsFragment : BaseVMFragment<LoginViewModel>() {

    companion object {
        @JvmStatic
        fun newInstance(): AuditDetailsFragment {
            return ARouter.getInstance()
                    .build(ARouterHub.LOGIN_AUDITDETAILS_FRAGMENT)
                    .navigation() as AuditDetailsFragment
        }
    }

    override fun viewModelClass() = LoginViewModel::class.java

    override fun getLayoutID() = R.layout.fragment_auditdetails

    override fun initView(contentView: View?) {
        setBarTitle("企业注册信息审核详情")
    }

    override fun initData() {

    }

    override fun initListener() {

    }

    override fun isShowBacking() = true

    override fun setNavigationOnClickListener() {
        pop()
    }
}