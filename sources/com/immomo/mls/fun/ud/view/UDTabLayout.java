package com.immomo.mls.fun.ud.view;

import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.view.ViewCompat;
import androidx.viewpager.widget.ViewPager;
import com.immomo.mls.fun.ud.UDArray;
import com.immomo.mls.fun.ud.UDColor;
import com.immomo.mls.fun.ud.UDRect;
import java.util.List;
import o.C7320ahc;
import o.C7348aiD;
import o.C7350aiF;
import o.C7352aiH;
import o.C7545alp;
import o.C7549alt;
import o.C7840arS;
import o.C7860arm;
import o.C7865arr;
import o.C7910asj;
import o.C7944atQ;
import o.C7978aty;
import o.InterfaceC60044zuT;
import o.InterfaceC7476akZ;
import org.luaj.vm2.LuaFunction;
import org.luaj.vm2.LuaNumber;
import org.luaj.vm2.LuaTable;
import org.luaj.vm2.LuaValue;

/* JADX INFO: loaded from: classes22.dex */
@InterfaceC60044zuT
@Deprecated
public class UDTabLayout<T extends C7549alt> extends UDViewGroup<T> implements InterfaceC7476akZ {
    public static final String[] AEQbTJ = {"setTabSelectedListener", "setItemTabClickListener", "selectScale", "normalFontSize", "tintColor", "currentIndex", "relatedToViewPager", "setCurrentIndexAnimated", "setTapBadgeNumAtIndex", "setTapBadgeTitleAtIndex", "setAlignment", "setTabSpacing", "setTapTitleAtIndex", "setRedDotHiddenAtIndex", "changeRedDotStatusAtIndex", "selectedColor", "setTabScrollingListener", "indicatorColor"};
    public static final int EZpvd = Color.argb(255, 50, 51, 51);
    public LuaFunction AYXKKw;
    public ViewPager AhwBna;
    public int DbNXlk;
    public LuaFunction KWHzl;
    public int OLrzqt;
    public C7860arm copydefault;
    public boolean djBIcL;
    public int fetchVPNInfo;
    public int gEmmrt;
    public LuaFunction valueOf;
    public C7978aty.StateListAnimator values;

    @InterfaceC60044zuT
    public UDTabLayout(long j, LuaValue[] luaValueArr) {
        super(j, luaValueArr);
        int i = EZpvd;
        this.DbNXlk = i;
        this.fetchVPNInfo = i;
        this.OLrzqt = i;
        this.djBIcL = false;
        this.AhwBna = null;
        this.copydefault = null;
        this.values = new C7978aty.StateListAnimator() { // from class: com.immomo.mls.fun.ud.view.UDTabLayout.2
            @Override // o.C7978aty.StateListAnimator
            public void KWHzl(C7978aty.Dialog dialog) {
            }

            @Override // o.C7978aty.StateListAnimator
            public void copydefault(C7978aty.Dialog dialog) {
            }

            @Override // o.C7978aty.StateListAnimator
            public void OLrzqt(C7978aty.Dialog dialog) {
                if (UDTabLayout.this.KWHzl != null) {
                    UDTabLayout.this.KWHzl.invoke(LuaValue.varargsOf(LuaNumber.valueOf(UDTabLayout.this.AYXKKw().KWHzl() + 1)));
                }
                UDTabLayout uDTabLayout = UDTabLayout.this;
                uDTabLayout.AEQbTJ(uDTabLayout.AYXKKw().KWHzl());
            }
        };
        this.gEmmrt = 1;
        OLrzqt(luaValueArr);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: V */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public C7978aty AYXKKw() {
        return ((C7549alt) f_()).KWHzl();
    }

    private void OLrzqt(LuaValue[] luaValueArr) {
        AYXKKw().setTabMode(0);
        this.copydefault = new C7860arm(AubY());
        AYXKKw().setSelectedTabSlidingIndicator(this.copydefault);
        AYXKKw().EZpvd(this.values);
        if (luaValueArr == null) {
            throw new IllegalArgumentException();
        }
        if (luaValueArr.length > 2) {
            UDColor uDColor = (UDColor) luaValueArr[2];
            this.DbNXlk = uDColor.AEQbTJ().getColor(this.globals);
            uDColor.destroy();
        }
        C7978aty c7978atyAYXKKw = AYXKKw();
        int i = this.DbNXlk;
        c7978atyAYXKKw.setTabTextColors(i, i);
        LuaValue luaValue = luaValueArr[0];
        boolean z = luaValue instanceof UDRect;
        if (z && (luaValueArr[1] instanceof UDArray)) {
            C7352aiH c7352aiHEZpvd = ((UDRect) luaValue).EZpvd();
            C7348aiD c7348aiDCopydefault = c7352aiHEZpvd.copydefault();
            C7350aiF c7350aiFEZpvd = c7352aiHEZpvd.EZpvd();
            AhwBna(c7350aiFEZpvd.copydefault());
            AEQbTJ(c7350aiFEZpvd.AEQbTJ());
            fIwbmz((int) c7348aiDCopydefault.copydefault());
            AuCTel((int) c7348aiDCopydefault.OLrzqt());
            OLrzqt((List<String>) ((UDArray) luaValueArr[1]).EZpvd());
            return;
        }
        if (z && (luaValueArr[1] instanceof LuaTable)) {
            C7352aiH c7352aiHEZpvd2 = ((UDRect) luaValue).EZpvd();
            C7348aiD c7348aiDCopydefault2 = c7352aiHEZpvd2.copydefault();
            C7350aiF c7350aiFEZpvd2 = c7352aiHEZpvd2.EZpvd();
            AhwBna(c7350aiFEZpvd2.copydefault());
            AEQbTJ(c7350aiFEZpvd2.AEQbTJ());
            fIwbmz((int) c7348aiDCopydefault2.copydefault());
            AuCTel((int) c7348aiDCopydefault2.OLrzqt());
            OLrzqt(C7910asj.copydefault(luaValueArr[1].toLuaTable()));
            return;
        }
        throw new IllegalArgumentException();
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ([Lorg/luaj/vm2/LuaValue;)Landroid/view/View; */
    /* JADX DEBUG: Method merged with bridge method: EZpvd([Lorg/luaj/vm2/LuaValue;)Landroid/view/ViewGroup; */
    @Override // com.immomo.mls.fun.ud.view.UDViewGroup
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public T AEQbTJ(LuaValue[] luaValueArr) {
        return (T) new C7549alt(AubY(), this, luaValueArr);
    }

    @InterfaceC60044zuT
    public LuaValue[] setTabSelectedListener(LuaValue[] luaValueArr) {
        LuaFunction luaFunction = this.KWHzl;
        if (luaFunction != null) {
            luaFunction.destroy();
        }
        this.KWHzl = luaValueArr[0].toLuaFunction();
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] setItemTabClickListener(LuaValue[] luaValueArr) {
        LuaFunction luaFunction = this.AYXKKw;
        if (luaFunction != null) {
            luaFunction.destroy();
        }
        this.AYXKKw = luaValueArr[0].toLuaFunction();
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] selectScale(LuaValue[] luaValueArr) {
        C7978aty.Dialog dialogAEQbTJ;
        if (luaValueArr.length == 0) {
            return AYXKKw().OLrzqt() >= 1 ? LuaValue.varargsOf(LuaNumber.copydefault(((C7944atQ) AYXKKw().AEQbTJ(0).AEQbTJ()).OLrzqt())) : LuaValue.varargsOf(LuaNumber.valueOf(0));
        }
        for (int i = 0; i < AYXKKw().OLrzqt(); i++) {
            ((C7944atQ) AYXKKw().AEQbTJ(i).AEQbTJ()).KWHzl((float) luaValueArr[0].toDouble());
        }
        int iKWHzl = AYXKKw().KWHzl();
        if (iKWHzl == -1 || (dialogAEQbTJ = AYXKKw().AEQbTJ(iKWHzl)) == null) {
            return null;
        }
        dialogAEQbTJ.valueOf();
        ((C7944atQ) dialogAEQbTJ.AEQbTJ()).copydefault();
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r6v1, resolved type: V */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] normalFontSize(LuaValue[] luaValueArr) {
        if (luaValueArr.length == 0) {
            return AYXKKw().OLrzqt() >= 1 ? LuaValue.varargsOf(LuaNumber.copydefault(C7865arr.KWHzl(((C7944atQ) AYXKKw().AEQbTJ(0).AEQbTJ()).KWHzl()))) : LuaValue.varargsOf(LuaNumber.valueOf(0));
        }
        for (int i = 0; i < AYXKKw().OLrzqt(); i++) {
            ((C7944atQ) AYXKKw().AEQbTJ(i).AEQbTJ()).copydefault((float) luaValueArr[0].toDouble());
        }
        ((C7549alt) f_()).requestLayout();
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] tintColor(LuaValue[] luaValueArr) {
        if (luaValueArr.length == 0) {
            return LuaValue.varargsOf(new UDColor(getGlobals(), this.DbNXlk));
        }
        this.DbNXlk = ((UDColor) luaValueArr[0]).AEQbTJ().getColor(this.globals);
        luaValueArr[0].destroy();
        AEQbTJ(AYXKKw().KWHzl());
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] selectedColor(LuaValue[] luaValueArr) {
        if (luaValueArr.length == 0) {
            return LuaValue.varargsOf(new UDColor(getGlobals(), this.fetchVPNInfo));
        }
        this.fetchVPNInfo = ((UDColor) luaValueArr[0]).AEQbTJ().getColor(this.globals);
        luaValueArr[0].destroy();
        AEQbTJ(AYXKKw().KWHzl());
        if (this.djBIcL) {
            return null;
        }
        KWHzl(this.fetchVPNInfo);
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] indicatorColor(LuaValue[] luaValueArr) {
        if (luaValueArr.length == 0) {
            return LuaValue.varargsOf(new UDColor(getGlobals(), this.OLrzqt));
        }
        this.OLrzqt = ((UDColor) luaValueArr[0]).AEQbTJ().getColor(this.globals);
        luaValueArr[0].destroy();
        KWHzl(this.OLrzqt);
        this.djBIcL = true;
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: V */
    /* JADX WARN: Multi-variable type inference failed */
    public final void KWHzl(int i) {
        this.copydefault.AEQbTJ(i);
        ((C7549alt) f_()).KWHzl().djBIcL().invalidate();
    }

    @InterfaceC60044zuT
    public LuaValue[] setTabScrollingListener(LuaValue[] luaValueArr) {
        LuaFunction luaFunction = this.valueOf;
        if (luaFunction != null) {
            luaFunction.destroy();
        }
        this.valueOf = luaValueArr[0].toLuaFunction();
        AYXKKw().setmITabLayoutScrollProgress(this);
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] currentIndex(LuaValue[] luaValueArr) {
        if (luaValueArr.length != 0) {
            AYXKKw().setSelectedTabPosition(luaValueArr[0].toInt() - 1);
            return null;
        }
        return LuaValue.rNumber(AYXKKw().KWHzl() + 1);
    }

    @InterfaceC60044zuT
    public LuaValue[] relatedToViewPager(LuaValue[] luaValueArr) {
        if (luaValueArr.length == 0 || luaValueArr[0].isNil()) {
            return null;
        }
        this.AhwBna = ((UDViewPager) luaValueArr[0]).DbNXlk();
        boolean z = luaValueArr.length >= 2 ? luaValueArr[1].toBoolean() : false;
        ViewPager viewPager = this.AhwBna;
        if (viewPager != null && ((C7545alp) viewPager).isConnected()) {
            ((C7545alp) this.AhwBna).setRelatedTabLayout(true);
            ((C7545alp) this.AhwBna).setRepeat(false);
            if (this.AhwBna.getAdapter() != null) {
                this.AhwBna.getAdapter().notifyDataSetChanged();
            }
        }
        this.AhwBna.addOnPageChangeListener(new C7978aty.Fragment(AYXKKw(), this));
        AYXKKw().EZpvd(new C7978aty.VoiceInteractor(this.AhwBna, z));
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] setCurrentIndexAnimated(LuaValue[] luaValueArr) {
        if (luaValueArr.length == 0) {
            return null;
        }
        final int i = luaValueArr[0].toInt();
        if (!ViewCompat.isLaidOut(AYXKKw())) {
            C7840arS.KWHzl(gEmmrt(), new Runnable() { // from class: com.immomo.mls.fun.ud.view.UDTabLayout.5
                @Override // java.lang.Runnable
                public void run() {
                    UDTabLayout.this.AYXKKw().setSelectedTabPosition(i - 1);
                }
            }, 10L);
            return null;
        }
        AYXKKw().setSelectedTabPosition(i - 1);
        return null;
    }

    private Object gEmmrt() {
        return "UDTabLayout" + hashCode();
    }

    @InterfaceC60044zuT
    public LuaValue[] setTapBadgeNumAtIndex(LuaValue[] luaValueArr) {
        if (luaValueArr[0].isNumber() && luaValueArr[1].isNumber()) {
            int i = luaValueArr[0].toInt();
            int i2 = luaValueArr[1].toInt() - 1;
            if (i2 > AYXKKw().OLrzqt() - 1) {
                return null;
            }
            C7944atQ c7944atQ = (C7944atQ) AYXKKw().AEQbTJ(i2).AEQbTJ();
            if (i == 0) {
                c7944atQ.OLrzqt("");
            } else {
                c7944atQ.OLrzqt(String.valueOf(i));
            }
        }
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] setTapBadgeTitleAtIndex(LuaValue[] luaValueArr) {
        if (luaValueArr[0].isNil()) {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("setTapBadgeTitleAtIndex() method  title cannot be nil ");
            if (!C7320ahc.AEQbTJ(illegalArgumentException, getGlobals())) {
                throw illegalArgumentException;
            }
        }
        String javaString = (luaValueArr.length <= 0 || luaValueArr[0].isNil()) ? null : luaValueArr[0].toJavaString();
        int i = luaValueArr[1].toInt() - 1;
        if (i > AYXKKw().OLrzqt() - 1) {
            return null;
        }
        C7944atQ c7944atQ = (C7944atQ) AYXKKw().AEQbTJ(i).AEQbTJ();
        if (javaString != null && javaString.length() > 0) {
            c7944atQ.OLrzqt(javaString);
        } else {
            c7944atQ.OLrzqt("");
        }
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] setAlignment(LuaValue[] luaValueArr) {
        LuaValue luaValue;
        if (luaValueArr.length == 1 && (luaValue = luaValueArr[0]) != null && luaValue.type() == 3) {
            this.gEmmrt = (int) luaValue.toDouble();
        }
        OLrzqt();
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] setTabSpacing(LuaValue[] luaValueArr) {
        float f = (float) luaValueArr[0].toDouble();
        C7978aty.PendingIntent pendingIntentDjBIcL = AYXKKw().djBIcL();
        if (pendingIntentDjBIcL == null) {
            return null;
        }
        int childCount = pendingIntentDjBIcL.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = pendingIntentDjBIcL.getChildAt(i);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ((ViewGroup.MarginLayoutParams) layoutParams).setMarginEnd(C7865arr.copydefault(f));
            }
            if (luaValueArr.length > 1) {
                float f2 = (float) luaValueArr[1].toDouble();
                int i2 = (int) f2;
                AYXKKw().setStartEndPadding(f2);
                ViewCompat.setPaddingRelative(childAt, i2, i2, i2, i2);
            }
            childAt.setLayoutParams(layoutParams);
        }
        pendingIntentDjBIcL.requestLayout();
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] setRedDotHiddenAtIndex(LuaValue[] luaValueArr) {
        int i = luaValueArr[0].toInt() - 1;
        if (i > AYXKKw().OLrzqt() - 1) {
            return null;
        }
        C7944atQ c7944atQ = (C7944atQ) AYXKKw().AEQbTJ(i).AEQbTJ();
        if (luaValueArr.length > 1 && luaValueArr[1].toBoolean()) {
            c7944atQ.AEQbTJ(true);
        } else {
            c7944atQ.AEQbTJ(false);
        }
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] changeRedDotStatusAtIndex(LuaValue[] luaValueArr) {
        setRedDotHiddenAtIndex(luaValueArr);
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] setTapTitleAtIndex(LuaValue[] luaValueArr) {
        C7978aty.Dialog dialogAEQbTJ;
        String javaString = luaValueArr.length > 0 ? luaValueArr[0].toJavaString() : null;
        int i = luaValueArr.length > 1 ? luaValueArr[1].toInt() - 1 : -1;
        if (!TextUtils.isEmpty(javaString) && i >= 0 && AYXKKw().OLrzqt() > i && (dialogAEQbTJ = AYXKKw().AEQbTJ(i)) != null) {
            dialogAEQbTJ.OLrzqt(javaString);
        }
        return null;
    }

    private void OLrzqt(List<String> list) {
        if (list == null || list.size() == 0) {
            return;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            AEQbTJ(list.get(i), i);
        }
    }

    public void AEQbTJ(String str, final int i) {
        C7978aty.Dialog dialogGEmmrt = AYXKKw().gEmmrt();
        dialogGEmmrt.OLrzqt(new C7944atQ(str));
        AYXKKw().copydefault(dialogGEmmrt);
        if (dialogGEmmrt.KWHzl() != null) {
            dialogGEmmrt.KWHzl().setOnClickListener(new View.OnClickListener() { // from class: com.immomo.mls.fun.ud.view.UDTabLayout.4
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    if (UDTabLayout.this.AYXKKw != null) {
                        UDTabLayout.this.AYXKKw.invoke(LuaValue.varargsOf(LuaNumber.valueOf(i + 1)));
                    }
                    UDTabLayout.this.AYXKKw().setSelectedTabPosition(i);
                }
            });
        }
    }

    public final void OLrzqt() {
        FrameLayout.LayoutParams layoutParams;
        View childAt = AYXKKw().getChildAt(0);
        if (childAt == null || (layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams()) == null) {
            return;
        }
        int i = this.gEmmrt;
        if (i == 1) {
            layoutParams.gravity = 8388611;
        } else if (i == 2) {
            layoutParams.gravity = 17;
        } else if (i == 3) {
            layoutParams.gravity = 8388613;
        } else {
            layoutParams.gravity = 8388611;
        }
        childAt.setLayoutParams(layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void AEQbTJ(int i) {
        for (int i2 = 0; i2 < AYXKKw().OLrzqt(); i2++) {
            C7944atQ c7944atQ = (C7944atQ) AYXKKw().AEQbTJ(i2).AEQbTJ();
            if (i == i2) {
                c7944atQ.KWHzl(this.fetchVPNInfo);
            } else {
                c7944atQ.KWHzl(this.DbNXlk);
            }
        }
    }

    @Override // o.InterfaceC7476akZ
    public void AEQbTJ(double d, int i, int i2) {
        LuaFunction luaFunction = this.valueOf;
        if (luaFunction != null) {
            luaFunction.invoke(LuaValue.varargsOf(LuaNumber.copydefault(d), LuaNumber.valueOf(i + 1), LuaNumber.valueOf(i2 + 1)));
        }
    }

    @Override // org.luaj.vm2.LuaUserdata
    public void __onLuaGc() {
        super.__onLuaGc();
        C7840arS.EZpvd(gEmmrt());
    }
}
