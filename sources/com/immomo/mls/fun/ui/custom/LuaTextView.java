package com.immomo.mls.fun.ui.custom;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.view.MotionEvent;
import androidx.core.view.ViewCompat;
import com.immomo.mls.fun.ui.custom.OkImageButton;
import o.C7817aqw;
import o.C7870arw;
import o.InterfaceC7383aim;
import o.InterfaceC7776aqH;
import org.luaj.vm2.LuaValue;

/* JADX INFO: loaded from: classes3.dex */
public class LuaTextView<U extends OkImageButton> extends C7817aqw implements InterfaceC7383aim<OkImageButton>, InterfaceC7776aqH {
    private InterfaceC7383aim.ActionBar cycleCallback;
    private OkImageButton udLabel;

    @Override // android.widget.TextView, android.view.View
    public int getBaseline() {
        return -1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getUserdata()Lcom/immomo/mls/fun/ud/view/UDView; */
    @Override // o.InterfaceC7383aim
    public OkImageButton getUserdata() {
        return this.udLabel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setViewLifeCycleCallback(InterfaceC7383aim.ActionBar actionBar) {
        this.cycleCallback = actionBar;
    }

    public LuaTextView(Context context, U u, LuaValue[] luaValueArr) {
        super(context);
        this.udLabel = u;
        setViewLifeCycleCallback(u);
        setGravity(17);
        setSingleLine();
        setTextSize(14.0f);
        setTextColor(ViewCompat.MEASURED_STATE_MASK);
        setEllipsize(TextUtils.TruncateAt.END);
        setIncludeFontPadding(false);
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        InterfaceC7383aim.ActionBar actionBar = this.cycleCallback;
        if (actionBar != null) {
            actionBar.copydefault();
        }
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        InterfaceC7383aim.ActionBar actionBar = this.cycleCallback;
        if (actionBar != null) {
            actionBar.AEQbTJ();
        }
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        getUserdata().OLrzqt(i, i2);
    }

    @Override // o.C7769aqA, androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        getUserdata().OLrzqt(i, i2, i3, i4);
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        try {
            super.onDraw(canvas);
        } catch (Throwable th) {
            C7870arw.AEQbTJ(th, "draw text error: " + ((Object) getText()));
        }
        getUserdata().OLrzqt(canvas);
    }

    @Override // android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return isEnabled() && super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.widget.TextView
    public void setMinWidth(int i) {
        super.setMinWidth(i);
        setMinimumWidth(i);
    }

    @Override // android.widget.TextView
    public void setMinHeight(int i) {
        super.setMinHeight(i);
        setMinimumHeight(i);
    }
}
