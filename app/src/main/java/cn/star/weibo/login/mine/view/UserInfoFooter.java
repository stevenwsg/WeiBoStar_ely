package cn.star.weibo.login.mine.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.RelativeLayout;

import cn.star.weibo.R;


/**
 * Created by ronghui on 2015/10/9.
 * <p/>
 * RecyclerView的FooterView，简单的展示一个TextView
 */
public class UserInfoFooter extends RelativeLayout {

    public UserInfoFooter(Context context) {
        super(context);
        init(context);
    }

    public UserInfoFooter(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    public UserInfoFooter(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context);
    }

    public void init(Context context) {
        inflate(context, R.layout.user_profile_layout_homepage_footerview, this);
    }
}