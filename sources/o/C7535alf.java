package o;

import android.text.TextUtils;
import androidx.core.view.ViewCompat;
import com.immomo.mls.fun.constants.TextAlign;
import com.immomo.mls.fun.ud.view.UDLabel;
import o.InterfaceC7383aim;
import org.luaj.vm2.LuaValue;

/* JADX INFO: renamed from: o.alf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C7535alf<U extends UDLabel> extends C7817aqw implements InterfaceC7383aim<UDLabel>, InterfaceC7776aqH {
    public UDLabel EZpvd;
    public boolean OLrzqt;
    public InterfaceC7383aim.ActionBar copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getUserdata()Lcom/immomo/mls/fun/ud/view/UDView; */
    @Override // o.InterfaceC7383aim
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public UDLabel getUserdata() {
        return this.EZpvd;
    }

    @Override // android.widget.TextView, android.view.View
    public int getBaseline() {
        return -1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setViewLifeCycleCallback(InterfaceC7383aim.ActionBar actionBar) {
        this.copydefault = actionBar;
    }

    public C7535alf(android.content.Context context, U u, LuaValue[] luaValueArr) {
        super(context);
        this.OLrzqt = false;
        this.EZpvd = u;
        setViewLifeCycleCallback(u);
        setGravity(TextAlign.LEFT);
        setSingleLine();
        setTextSize(14.0f);
        setTextColor(ViewCompat.MEASURED_STATE_MASK);
        setEllipsize(TextUtils.TruncateAt.END);
        setIncludeFontPadding(false);
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        InterfaceC7383aim.ActionBar actionBar = this.copydefault;
        if (actionBar != null) {
            actionBar.copydefault();
        }
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        InterfaceC7383aim.ActionBar actionBar = this.copydefault;
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
    public void onDraw(android.graphics.Canvas canvas) {
        try {
            super.onDraw(canvas);
        } catch (java.lang.Throwable th) {
            C7870arw.AEQbTJ(th, "draw text error: " + ((java.lang.Object) getText()));
        }
        getUserdata().OLrzqt(canvas);
    }

    @Override // android.view.View
    public boolean dispatchTouchEvent(android.view.MotionEvent motionEvent) {
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

    @Override // android.view.View
    public boolean isFocused() {
        if (this.OLrzqt) {
            return true;
        }
        return super.isFocused();
    }

    public void EZpvd() {
        this.OLrzqt = true;
        setEllipsize(TextUtils.TruncateAt.MARQUEE);
        setMarqueeRepeatLimit(-1);
        setFocusable(true);
        setFocusableInTouchMode(true);
        setSingleLine(true);
    }
}
