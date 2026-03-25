package o;

import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.core.widget.TextViewCompat;
import o.C32113mPz;
import o.C52761wXj;

/* JADX INFO: renamed from: o.myN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C33537myN extends android.widget.FrameLayout {
    private float appBarHeight;
    private boolean backClickable;
    private int backImageResId;
    private int backgroundColor;
    private int dividerColor;
    private float dividerHeight;
    private boolean doClickable;
    private int doImageColor;
    private int doImageResId;
    private android.widget.ImageView iv_back;
    private android.widget.ImageView iv_do;
    private android.view.View line;
    private android.content.Context mContext;
    private java.util.List<ActionBar> menuItems;
    private Activity onAppBarMenuItemClickListener;
    private android.widget.PopupWindow popupWindow;
    private android.view.ViewGroup rl_app_bar;
    private android.view.ViewGroup rl_do;
    private boolean showBack;
    private boolean showDivider;
    private boolean showDo;
    private boolean showDoImage;
    private boolean showStatusBar;
    private boolean showSubTitle;
    private boolean showTitle;
    private boolean showTitleMenu;
    private int statusBarColor;
    private android.view.View status_bar;
    private java.lang.String subTitle;
    private int subTitleBg;
    private int subTitleColor;
    private float subTitleSize;
    private java.lang.String title;
    private boolean titleBold;
    private boolean titleClickable;
    private int titleColor;
    private int titleMenuResId;
    private float titleSize;
    private android.widget.TextView tv_subTitle;
    private android.widget.TextView tv_title;

    /* JADX INFO: renamed from: o.myN$Activity */
    /* JADX INFO: loaded from: classes15.dex */
    public interface Activity {
        void OLrzqt(ActionBar actionBar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public float getAppBarHeight() {
        return this.appBarHeight;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public android.widget.ImageView getBackImage() {
        return this.iv_back;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public android.widget.ImageView getDoImage() {
        return this.iv_do;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.util.List<ActionBar> getMenuItems() {
        return this.menuItems;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public android.widget.TextView getSubTitle() {
        return this.tv_subTitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public android.widget.TextView getTitle() {
        return this.tv_title;
    }

    public final void setDoImageBackground() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setOnAppBarMenuItemClickListener(Activity activity) {
        this.onAppBarMenuItemClickListener = activity;
    }

    public C33537myN(android.content.Context context) {
        super(context);
        init(context, null);
    }

    public C33537myN(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        init(context, attributeSet);
    }

    public C33537myN(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init(context, attributeSet);
    }

    public final void init(android.content.Context context, android.util.AttributeSet attributeSet) {
        this.mContext = context;
        config(context, attributeSet);
        initView(context);
    }

    public final void config(android.content.Context context, android.util.AttributeSet attributeSet) {
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C32113mPz.PendingIntent.OLrzqt);
        this.showStatusBar = typedArrayObtainStyledAttributes.getBoolean(C32113mPz.PendingIntent.uzCIH, true);
        this.showDivider = typedArrayObtainStyledAttributes.getBoolean(C32113mPz.PendingIntent.fARcdN, true);
        this.showBack = typedArrayObtainStyledAttributes.getBoolean(C32113mPz.PendingIntent.values, true);
        this.showTitle = typedArrayObtainStyledAttributes.getBoolean(C32113mPz.PendingIntent.wlaJM, true);
        this.titleBold = typedArrayObtainStyledAttributes.getBoolean(C32113mPz.PendingIntent.djBIcL, false);
        this.showTitleMenu = typedArrayObtainStyledAttributes.getBoolean(C32113mPz.PendingIntent.zsXlph, false);
        this.showDo = typedArrayObtainStyledAttributes.getBoolean(C32113mPz.PendingIntent.getFieldNames, false);
        this.showSubTitle = typedArrayObtainStyledAttributes.getBoolean(C32113mPz.PendingIntent.getNewProxyInstance, true);
        this.showDoImage = typedArrayObtainStyledAttributes.getBoolean(C32113mPz.PendingIntent.hDKMBd, false);
        this.backClickable = typedArrayObtainStyledAttributes.getBoolean(C32113mPz.PendingIntent.fetchVPNInfo, true);
        this.titleClickable = typedArrayObtainStyledAttributes.getBoolean(C32113mPz.PendingIntent.zLjUOn, true);
        this.doClickable = typedArrayObtainStyledAttributes.getBoolean(C32113mPz.PendingIntent.AuCTel, true);
        this.statusBarColor = typedArrayObtainStyledAttributes.getColor(C32113mPz.PendingIntent.iwGUEr, ContextCompat.getColor(context, C52761wXj.Activity.EZpvd));
        this.backgroundColor = typedArrayObtainStyledAttributes.getColor(C32113mPz.PendingIntent.AkhnZx, ContextCompat.getColor(context, C52761wXj.Activity.EZpvd));
        this.titleColor = typedArrayObtainStyledAttributes.getColor(C32113mPz.PendingIntent.AYXKKw, ContextCompat.getColor(context, C32113mPz.ActionBar.sSMYrx));
        this.subTitleColor = typedArrayObtainStyledAttributes.getColor(C32113mPz.PendingIntent.EZpvd, ContextCompat.getColor(context, C52761wXj.Activity.HJWChPURsaBn));
        this.dividerColor = typedArrayObtainStyledAttributes.getColor(C32113mPz.PendingIntent.fIwbmz, ContextCompat.getColor(context, C32113mPz.ActionBar.DbNXlk));
        this.doImageColor = typedArrayObtainStyledAttributes.getColor(C32113mPz.PendingIntent.DbNXlk, 0);
        this.dividerHeight = typedArrayObtainStyledAttributes.getDimension(C32113mPz.PendingIntent.fJNWhG, 1.0f);
        this.appBarHeight = typedArrayObtainStyledAttributes.getDimension(C32113mPz.PendingIntent.KWHzl, getDefaultBarHeight(context));
        this.titleSize = C55298xhM.AhwBna(typedArrayObtainStyledAttributes.getDimension(C32113mPz.PendingIntent.valueOf, C55298xhM.djBIcL(18.0f, context)), context);
        this.subTitleSize = C55298xhM.AhwBna(typedArrayObtainStyledAttributes.getDimension(C32113mPz.PendingIntent.gEmmrt, C55298xhM.djBIcL(14.0f, context)), context);
        this.backImageResId = typedArrayObtainStyledAttributes.getResourceId(C32113mPz.PendingIntent.isConnected, getDefaultBackImageRes(context));
        this.titleMenuResId = typedArrayObtainStyledAttributes.getResourceId(C32113mPz.PendingIntent.AuCTelauCTel, C52761wXj.TaskDescription.getAdvertisingId);
        this.doImageResId = typedArrayObtainStyledAttributes.getResourceId(C32113mPz.PendingIntent.ejfBZ, C52761wXj.TaskDescription.DzkRMH);
        this.subTitleBg = typedArrayObtainStyledAttributes.getResourceId(C32113mPz.PendingIntent.copydefault, 0);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(C32113mPz.PendingIntent.AhwBna, 0);
        if (resourceId != 0) {
            this.title = context.getResources().getString(resourceId);
        }
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(C32113mPz.PendingIntent.AEQbTJ, 0);
        if (resourceId2 != 0) {
            this.subTitle = context.getResources().getString(resourceId2);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final float getDefaultBarHeight(android.content.Context context) {
        android.util.TypedValue typedValue = new android.util.TypedValue();
        context.getTheme().resolveAttribute(C52761wXj.ActionBar.OxVOHk, typedValue, true);
        int iComplexToDimensionPixelSize = android.util.TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics());
        return iComplexToDimensionPixelSize == 0 ? C55298xhM.copydefault(44.0f, context) : iComplexToDimensionPixelSize;
    }

    public final int getDefaultBackImageRes(android.content.Context context) {
        android.util.TypedValue typedValue = new android.util.TypedValue();
        context.getTheme().resolveAttribute(C52761wXj.ActionBar.QVsKAR, typedValue, true);
        return typedValue.resourceId;
    }

    public final void initView(final android.content.Context context) {
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) android.view.View.inflate(context, C32113mPz.Fragment.wlaJM, this);
        this.rl_app_bar = (android.view.ViewGroup) frameLayout.findViewById(C32113mPz.FragmentManager.dNCPSb);
        this.status_bar = frameLayout.findViewById(C32113mPz.FragmentManager.fvQaOB);
        this.rl_do = (android.view.ViewGroup) frameLayout.findViewById(C32113mPz.FragmentManager.aKErDB);
        this.iv_back = (android.widget.ImageView) frameLayout.findViewById(C32113mPz.FragmentManager.hDKMBd);
        this.iv_do = (android.widget.ImageView) frameLayout.findViewById(C32113mPz.FragmentManager.AubY);
        this.tv_title = (android.widget.TextView) frameLayout.findViewById(C32113mPz.FragmentManager.gwTjWJ);
        this.tv_subTitle = (android.widget.TextView) frameLayout.findViewById(C32113mPz.FragmentManager.dmfpNf);
        android.view.View viewFindViewById = frameLayout.findViewById(C32113mPz.FragmentManager.sSMYrx);
        this.line = viewFindViewById;
        viewFindViewById.getLayoutParams().height = (int) this.dividerHeight;
        this.rl_app_bar.getLayoutParams().height = (int) this.appBarHeight;
        if (!isInEditMode()) {
            this.status_bar.getLayoutParams().height = C33570myu.gEmmrt(getContext());
        }
        this.rl_app_bar.setBackgroundColor(this.backgroundColor);
        this.status_bar.setBackgroundColor(this.statusBarColor);
        this.tv_title.setTextColor(this.titleColor);
        this.tv_subTitle.setTextColor(this.subTitleColor);
        this.line.setBackgroundColor(this.dividerColor);
        this.tv_title.setTextSize(this.titleSize);
        this.tv_subTitle.setTextSize(this.subTitleSize);
        this.iv_back.setImageResource(this.backImageResId);
        this.iv_back.setImageTintList(android.content.res.ColorStateList.valueOf(ContextCompat.getColor(context, C52761wXj.Activity.DeEinT)));
        this.iv_do.setImageResource(this.doImageResId);
        this.iv_do.setImageTintList(android.content.res.ColorStateList.valueOf(ContextCompat.getColor(context, C52761wXj.Activity.Dff)));
        this.tv_title.getPaint().setFakeBoldText(this.titleBold);
        this.tv_title.setText(this.title);
        this.tv_subTitle.setText(this.subTitle);
        if (this.subTitleBg != 0) {
            this.tv_subTitle.setBackground(getResources().getDrawable(this.subTitleBg));
        }
        int i = this.doImageColor;
        if (i != 0) {
            this.iv_do.setColorFilter(i);
        }
        this.tv_title.setClickable(this.titleClickable);
        this.rl_do.setClickable(this.doClickable);
        this.status_bar.setVisibility(this.showStatusBar ? 0 : 8);
        this.rl_do.setVisibility(this.showDo ? 0 : 8);
        this.iv_back.setVisibility(this.showBack ? 0 : 8);
        this.iv_do.setVisibility(this.showDoImage ? 0 : 8);
        this.tv_title.setVisibility(this.showTitle ? 0 : 8);
        setTitleMenuVisible(this.showTitleMenu);
        this.tv_subTitle.setVisibility(this.showSubTitle ? 0 : 8);
        this.line.setVisibility(this.showDivider ? 0 : 8);
        this.iv_back.setOnClickListener(new View.OnClickListener() { // from class: o.myN.2
            @Override // android.view.View.OnClickListener
            public void onClick(android.view.View view) {
                ((android.view.inputmethod.InputMethodManager) context.getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
                C33537myN.this.doAcBack(context);
            }
        });
    }

    public void setAppBarTitle(java.lang.String str) {
        setTitle(str);
    }

    public void setTitle(java.lang.String str) {
        setText(this.tv_title, str);
    }

    public void setSubTitle(java.lang.String str) {
        setText(this.tv_subTitle, str);
    }

    public void setStatusBarVisible(int i) {
        setVisible(this.status_bar, i);
    }

    public void setBackImageVisible(int i) {
        setVisible(this.iv_back, i);
    }

    public void setBackVisible(int i) {
        setBackImageVisible(i);
    }

    public void setTitleVisible(int i) {
        setVisible(this.tv_title, i);
    }

    public void setTitleMenuVisible(boolean z) {
        this.tv_title.setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, z ? this.titleMenuResId : 0, 0);
        TextViewCompat.setCompoundDrawableTintList(this.tv_title, android.content.res.ColorStateList.valueOf(ContextCompat.getColor(this.mContext, C52761wXj.Activity.Dff)));
    }

    public void setTitleTypeface(java.lang.String str) {
        this.tv_title.setTypeface(C55051xce.OLrzqt.AEQbTJ(str));
    }

    public void setTitleMenu(@androidx.annotation.DrawableRes int i) {
        this.tv_title.setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, i, 0);
    }

    public void setSubTitleVisible(int i) {
        setVisible(this.tv_subTitle, i);
    }

    public void setSubDoImageVisible(int i) {
        setVisible(this.iv_do, i);
    }

    public void setSubDoVisible(int i) {
        setVisible(this.rl_do, i);
    }

    public void setDividerVisibility(int i) {
        setVisible(this.line, i);
    }

    public void setBackListener(View.OnClickListener onClickListener) {
        setOnClickListener(this.iv_back, onClickListener);
    }

    public void setTitleListener(View.OnClickListener onClickListener) {
        setOnClickListener(this.tv_title, onClickListener);
    }

    public void setSubDoListener(View.OnClickListener onClickListener) {
        setOnClickListener(this.rl_do, onClickListener);
    }

    public void setTitleSize(float f) {
        setTextSize(this.tv_title, f);
    }

    public void setSubTitleSize(float f) {
        setTextSize(this.tv_subTitle, f);
    }

    public void setTitleColor(int i) {
        setTextColor(this.tv_title, i);
    }

    public void setSubTitleColor(int i) {
        setTextColor(this.tv_subTitle, i);
    }

    public void setAppBarColor(int i) {
        this.rl_app_bar.setBackgroundColor(i);
    }

    public void setBackImage(int i) {
        this.iv_back.setImageResource(i);
    }

    public void setBackImageResource(int i) {
        setImageResource(this.iv_back, i);
    }

    public void setStatusBarColor(int i) {
        this.statusBarColor = i;
        this.status_bar.setBackgroundColor(i);
    }

    public void setBackGroundColor(int i) {
        this.backgroundColor = i;
        this.rl_app_bar.setBackgroundColor(i);
    }

    public void setDividerColor(int i) {
        this.dividerColor = i;
        this.line.setBackgroundColor(i);
    }

    public void setSubDoImageResource(int i) {
        setImageResource(this.iv_do, i);
    }

    public void setTitleClickable(boolean z) {
        setViewClickable(this.tv_title, z);
    }

    public void setBackClickable(boolean z) {
        setViewClickable(this.iv_back, z);
    }

    public void setDoClickable(boolean z) {
        setViewClickable(this.rl_do, z);
    }

    public void setMenuItems(java.util.List<ActionBar> list) {
        this.menuItems = list;
        if (list == null || list.size() == 0) {
            setTitleMenuVisible(false);
        } else {
            setTitleMenuVisible(true);
            setTitleListener(new View.OnClickListener() { // from class: o.myN.5
                @Override // android.view.View.OnClickListener
                public void onClick(android.view.View view) {
                    C33537myN.this.showMenu();
                }
            });
        }
    }

    public final void showMenu() {
        android.view.View viewInflate = android.view.LayoutInflater.from(this.mContext).inflate(C32113mPz.Fragment.uzCIH, (android.view.ViewGroup) null, false);
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) viewInflate.findViewById(C32113mPz.FragmentManager.OcIXYQ);
        for (final int i = 0; i < this.menuItems.size(); i++) {
            android.view.View viewInflate2 = android.view.LayoutInflater.from(this.mContext).inflate(C32113mPz.Fragment.copydefault, (android.view.ViewGroup) linearLayout, false);
            android.widget.ImageView imageView = (android.widget.ImageView) viewInflate2.findViewById(C32113mPz.FragmentManager.wlaJM);
            android.widget.TextView textView = (android.widget.TextView) viewInflate2.findViewById(C32113mPz.FragmentManager.gwTjWJ);
            imageView.setVisibility(this.menuItems.get(i).OLrzqt ? 0 : 4);
            textView.setText(this.menuItems.get(i).copydefault);
            if (i == this.menuItems.size() - 1) {
                viewInflate2.findViewById(C32113mPz.FragmentManager.sSMYrx).setVisibility(8);
            }
            viewInflate2.setOnClickListener(new View.OnClickListener() { // from class: o.myN.3
                @Override // android.view.View.OnClickListener
                public void onClick(android.view.View view) {
                    if (C33537myN.this.onAppBarMenuItemClickListener != null) {
                        C33537myN.this.onAppBarMenuItemClickListener.OLrzqt((ActionBar) C33537myN.this.menuItems.get(i));
                        C33537myN.this.popupWindow.dismiss();
                    }
                }
            });
            linearLayout.addView(viewInflate2);
        }
        android.widget.PopupWindow popupWindow = new android.widget.PopupWindow(viewInflate, -2, -2);
        this.popupWindow = popupWindow;
        popupWindow.setOutsideTouchable(true);
        this.popupWindow.setBackgroundDrawable(new BitmapDrawable());
        viewInflate.measure(0, 0);
        android.widget.PopupWindow popupWindow2 = this.popupWindow;
        android.widget.TextView textView2 = this.tv_title;
        popupWindow2.showAsDropDown(textView2, (textView2.getWidth() / 2) - (viewInflate.getMeasuredWidth() / 2), C55298xhM.copydefault(15.0f, getContext()));
    }

    public void dismissMenu() {
        android.widget.PopupWindow popupWindow = this.popupWindow;
        if (popupWindow == null || !popupWindow.isShowing()) {
            return;
        }
        this.popupWindow.dismiss();
    }

    public void setSubDoImageDrawable(android.graphics.drawable.Drawable drawable) {
        if (drawable != null) {
            this.iv_do.setImageDrawable(drawable);
        }
    }

    public void setSubDoImageDrawable(int i) {
        this.iv_do.setImageResource(i);
    }

    public void setSubTitleBackground(int i) {
        this.tv_subTitle.setBackgroundResource(i);
    }

    public final void setViewClickable(android.view.View view, boolean z) {
        view.setClickable(z);
    }

    public final void setImageResource(android.widget.ImageView imageView, int i) {
        imageView.setImageResource(i);
    }

    public final void setTextColor(android.widget.TextView textView, int i) {
        textView.setTextColor(i);
    }

    public void setBackGround(android.graphics.drawable.Drawable drawable) {
        this.rl_app_bar.setBackground(drawable);
    }

    public void setStatusBackGround(android.graphics.drawable.Drawable drawable) {
        this.status_bar.setBackground(drawable);
    }

    public final void setTextSize(android.widget.TextView textView, float f) {
        textView.setTextSize(f);
    }

    public final void doAcBack(android.content.Context context) {
        if (context instanceof AppCompatActivity) {
            ((AppCompatActivity) context).onBackPressed();
        } else if (context instanceof android.content.ContextWrapper) {
            doAcBack(((android.content.ContextWrapper) context).getBaseContext());
        }
    }

    public final void setOnClickListener(android.view.View view, View.OnClickListener onClickListener) {
        view.setOnClickListener(onClickListener);
    }

    public final void setVisible(android.view.View view, int i) {
        view.setVisibility(i);
    }

    public final void setText(android.widget.TextView textView, java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        textView.setText(str);
    }

    /* JADX INFO: renamed from: o.myN$ActionBar */
    public static class ActionBar {
        public int EZpvd;
        public boolean OLrzqt;
        public java.lang.String copydefault;

        public ActionBar() {
        }

        public ActionBar(boolean z, java.lang.String str, int i) {
            this.OLrzqt = z;
            this.copydefault = str;
            this.EZpvd = i;
        }
    }
}
