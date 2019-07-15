package com.nick.wanandroid.models

import com.nick.wanandroid.APi
import com.nick.wanandroid.entity.ProjectType
import com.nick.wanandroid.entity.Result
import com.nick.wanandroid.entity.SystemBean
import com.nick.wanandroid.http.RetrofitUtil
import retrofit2.Callback

/**
 * Created by Administrator on 2019/7/15 0015.
 * @author Administrator
 */
class SystemMode {

    fun  getSystemTree(callback: Callback<Result<List<SystemBean>>>){
        val retrofit = RetrofitUtil.instance
        val call = retrofit.create(APi::class.java).getSystemTree()
        call.enqueue(callback)
    }
}