package com.example.vincent.msgtest;

import android.app.Activity;

import static com.example.vincent.msgtest.AppMsg.LENGTH_SHORT;

/**
 * @创建者 Vincent
 * @创时间 2016/10/10 10:19
 * @描述 $ TODO
 */
public class PromptUtil {

    private static AppMsg appMsg;
    public static void showAppMsg(Activity mActivity, String text) {
        if (mActivity == null || mActivity.isFinishing()){
            return;
        }
        final AppMsg.Style style = new AppMsg.Style(LENGTH_SHORT,
                R.color.custom);
        boolean customAnimations = true;
        AppMsg provided = null;

        if(appMsg!=null){
            appMsg.cancel();
        }
        appMsg = provided != null ? provided : AppMsg.makeText(mActivity,
                text, style);
        if (customAnimations) {
            appMsg.setAnimation(android.R.anim.slide_in_left,
                    android.R.anim.slide_out_right);
        }
        appMsg.show();

    }
}
