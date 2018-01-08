package com.umeng.soexample.share;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.umeng.socialize.UmengTool;
import com.umeng.soexample.R;

/**
 * Created by wangfei on 16/11/10.
 */
public class CheckActivity extends Activity {
    private LinearLayout list;
    private int checkstyle = 0;
    private EditText ed;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            // 安卓5.0以上设置状态栏沉浸式
            Window window = getWindow();
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.setStatusBarColor(getResources().getColor(R.color.umeng_blue));
        }
        setContentView(R.layout.zhq_umeng_check_share);
        ((TextView) findViewById(R.id.umeng_title)).setText(R.string.umeng_check_title);
        findViewById(R.id.umeng_back).setVisibility(View.VISIBLE);
        list = (LinearLayout) findViewById(R.id.list);
        findViewById(R.id.umeng_back).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        ed = (EditText) findViewById(R.id.editcheck);
        ed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (list.getVisibility() != View.VISIBLE) {
                    list.setVisibility(View.VISIBLE);
                } else {
                    list.setVisibility(View.GONE);
                }
            }
        });
        findViewById(R.id.checkbtn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // **************************************************** 自检工具核心API ****************************************************
                // 检查结果：API会以对话框的形式展示
                if (checkstyle == 1) {
                    // 检查签名
                    UmengTool.getSignature(CheckActivity.this);
                } else if (checkstyle == 2) {
                    // 检查新浪
                    UmengTool.checkSina(CheckActivity.this);
                } else if (checkstyle == 3) {
                    // 检查微信
                    UmengTool.checkWx(CheckActivity.this);
                } else if (checkstyle == 4) {
                    // 检查支付宝
                    UmengTool.checkAlipay(CheckActivity.this);
                } else if (checkstyle == 5) {
                    // 检查QQ
                    UmengTool.checkQQ(CheckActivity.this);
                } else if (checkstyle == 6) {
                    // 检查Facebook
                    UmengTool.checkFacebook(CheckActivity.this);
                } else if (checkstyle == 7) {
                    // 检查VK
                    UmengTool.checkVK(CheckActivity.this);
                }
                // **************************************************** 自检工具核心API ****************************************************
            }
        });
        findViewById(R.id.checksign).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                list.setVisibility(View.GONE);
                checkstyle = 1;
                ed.setText(R.string.umeng_check_sign);
            }
        });
        findViewById(R.id.checksina).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                list.setVisibility(View.GONE);
                checkstyle = 2;
                ed.setText(R.string.umeng_check_sina);
            }
        });
        findViewById(R.id.checkwx).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                list.setVisibility(View.GONE);
                checkstyle = 3;
                ed.setText(R.string.umeng_check_wx);
            }
        });
        findViewById(R.id.checkalipay).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                list.setVisibility(View.GONE);
                checkstyle = 4;
                ed.setText(R.string.umeng_check_alipay);
            }
        });
        findViewById(R.id.checkqq).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                list.setVisibility(View.GONE);
                checkstyle = 5;
                ed.setText(R.string.umeng_check_qq);
            }
        });
        findViewById(R.id.checkfb).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                list.setVisibility(View.GONE);
                checkstyle = 6;
                ed.setText(R.string.umeng_check_fb);
            }
        });
        findViewById(R.id.checkvk).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                list.setVisibility(View.GONE);
                checkstyle = 7;
                ed.setText(R.string.umeng_check_vk);
            }
        });

    }
}
