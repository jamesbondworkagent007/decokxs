package o;

import com.immomo.mls.fun.globals.UDLuaView;

/* JADX INFO: renamed from: o.aiv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C7392aiv extends C7546alq<UDLuaView> {
    public C7834arM EZpvd;
    public boolean OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void AEQbTJ(boolean z) {
        this.OLrzqt = z;
    }

    public C7392aiv(android.content.Context context, UDLuaView uDLuaView) {
        super(context, uDLuaView);
        this.EZpvd = null;
        this.OLrzqt = false;
    }

    public void copydefault(java.util.Map map) {
        getUserdata().EZpvd(map);
    }

    @Override // o.C7812aqr, o.C7771aqC, android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        boolean z;
        super.onSizeChanged(i, i2, i3, i4);
        if ((i == i3 && i2 == i4) || ((UDLuaView) this.copydefault).KWHzl(i, i2) || !this.OLrzqt) {
            return;
        }
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            android.view.View childAt = getChildAt(i5);
            if (childAt.getWidth() == i3) {
                childAt.getLayoutParams().width = i;
                z = true;
            } else {
                z = false;
            }
            if (childAt.getHeight() == i4) {
                childAt.getLayoutParams().height = i2;
            } else {
                if (z) {
                }
            }
            childAt.requestLayout();
        }
    }

    @Override // o.C7546alq, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // o.C7546alq, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        djBIcL();
    }

    public void setKeyboardChangeListener(boolean z) {
        if (this.EZpvd == null) {
            C7834arM c7834arM = new C7834arM(z, getUserdata());
            this.EZpvd = c7834arM;
            c7834arM.copydefault(this);
        }
    }

    public void djBIcL() {
        C7834arM c7834arM = this.EZpvd;
        if (c7834arM != null) {
            c7834arM.EZpvd(this);
            this.EZpvd = null;
        }
    }

    public void copydefault() {
        UDLuaView userdata = getUserdata();
        if (userdata == null || userdata.getGlobals() == null) {
            return;
        }
        userdata.getGlobals().KWHzl(true);
        userdata.OLrzqt();
    }

    public void AEQbTJ() {
        UDLuaView userdata = getUserdata();
        if (userdata == null || userdata.getGlobals() == null) {
            return;
        }
        userdata.getGlobals().KWHzl(false);
        userdata.valueOf();
    }

    public void OLrzqt() {
        UDLuaView userdata = getUserdata();
        if (userdata == null || userdata.getGlobals() == null) {
            return;
        }
        userdata.AYXKKw();
    }

    public void OLrzqt(android.view.KeyEvent keyEvent) {
        UDLuaView userdata;
        if (keyEvent.getKeyCode() != 4 || (userdata = getUserdata()) == null) {
            return;
        }
        userdata.EZpvd();
    }

    public boolean KWHzl() {
        UDLuaView userdata = getUserdata();
        if (userdata != null) {
            return userdata.gEmmrt();
        }
        return true;
    }

    @Override // o.C7546alq, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(android.view.MotionEvent motionEvent) {
        return super.dispatchTouchEvent(motionEvent);
    }

    public void EZpvd() {
        UDLuaView userdata = getUserdata();
        if (userdata != null) {
            userdata.KWHzl();
        }
    }
}
