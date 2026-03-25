package com.immomo.mls.fun.ui.custom;

import android.R;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.viewpager.widget.ViewPager;
import com.immomo.mls.fun.ud.UDArray;
import com.immomo.mls.fun.ud.UDColor;
import com.immomo.mls.fun.ud.view.UDViewGroup;
import com.immomo.mls.fun.ui.custom.OkLuaSegmentLayout;
import com.okinc.core.widget.OKSlidingTabLayout;
import java.util.List;
import o.C33052mpF;
import o.C7829arH;
import o.C7865arr;
import o.C7870arw;
import o.InterfaceC33549myZ;
import o.InterfaceC60044zuT;
import o.InterfaceC7405ajH;
import o.InterfaceC7476akZ;
import org.luaj.vm2.Globals;
import org.luaj.vm2.LuaFunction;
import org.luaj.vm2.LuaNumber;
import org.luaj.vm2.LuaValue;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC60044zuT
public class OkSegmentLayout<T extends OkLuaSegmentLayout> extends UDViewGroup<T> implements InterfaceC7476akZ {
    public static final String[] KWHzl = {"setPadding", "minimumItemSpacing", "textPadding", "alignment", "alignEndings", "ensureIndexVisible", "reloadWithTitles", "setIndicatorColor", "setIndicatorStyle", "setIndicatorHeight", "setIndicatorStrokeWidth", "setIndicatorCornerRadius", "setAverageShow", "textColor", "selectedTextColor", "setFontNameSize", "setSelectedFontNameSize", "checkStatus", "didScroll", "setTabReselectedListener", "setPageSelectedCallback", "disableRipple", "showTabRedDot", "hideTabRedDot", "showBorderStyle"};
    public static final int OLrzqt = Color.argb(255, 50, 51, 51);
    public final int AEQbTJ;
    public boolean AYXKKw;
    public final int AhwBna;
    public int AkhnZx;
    public OkLuaSegmentLayout AuCTel;
    public JColor DbNXlk;
    public final int EZpvd;
    public final int copydefault;
    public LuaFunction djBIcL;
    public LuaFunction ejfBZ;
    public int fARcdN;
    public LuaFunction fIwbmz;
    public int fJNWhG;
    public InterfaceC7405ajH fetchVPNInfo;
    public int gEmmrt;
    public int getFieldNames;
    public JColor getNewProxyInstance;
    public int hDKMBd;
    public LuaFunction isConnected;
    public int iwGUEr;
    public JColor uzCIH;
    public LuaFunction valueOf;
    public LuaFunction values;
    public Typeface zsXlph;

    @Override // o.InterfaceC7476akZ
    public void AEQbTJ(double d, int i, int i2) {
    }

    @InterfaceC60044zuT
    public LuaValue[] ensureIndexVisible(LuaValue[] luaValueArr) {
        return null;
    }

    @InterfaceC60044zuT
    public OkSegmentLayout(long j, LuaValue[] luaValueArr) {
        super(j, luaValueArr);
        this.AhwBna = 0;
        this.copydefault = 1;
        this.AEQbTJ = 2;
        this.EZpvd = 3;
        this.iwGUEr = 14;
        this.hDKMBd = -1;
        this.fJNWhG = OLrzqt;
        this.AkhnZx = 1;
        KWHzl(luaValueArr);
    }

    private void KWHzl(LuaValue[] luaValueArr) {
        this.AuCTel.setOnScrollChangeListener(new View.OnScrollChangeListener() { // from class: com.immomo.mls.fun.ui.custom.OkSegmentLayout.2
            @Override // android.view.View.OnScrollChangeListener
            public void onScrollChange(View view, int i, int i2, int i3, int i4) {
                if (OkSegmentLayout.this.isConnected != null) {
                    OkSegmentLayout.this.isConnected.invoke(LuaValue.varargsOf(new LuaValue[0]));
                }
            }
        });
        if (luaValueArr == null) {
            throw new IllegalArgumentException();
        }
        if (luaValueArr.length == 2) {
            UDColor uDColor = (UDColor) luaValueArr[2];
            this.getNewProxyInstance = uDColor.AEQbTJ();
            uDColor.destroy();
        }
        this.getFieldNames = C33052mpF.EZpvd(5.0f, AubY());
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ([Lorg/luaj/vm2/LuaValue;)Landroid/view/View; */
    /* JADX DEBUG: Method merged with bridge method: EZpvd([Lorg/luaj/vm2/LuaValue;)Landroid/view/ViewGroup; */
    @Override // com.immomo.mls.fun.ud.view.UDViewGroup
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public T AEQbTJ(LuaValue[] luaValueArr) {
        T t = (T) new OkLuaSegmentLayout(AubY(), this, luaValueArr);
        this.AuCTel = t;
        return t;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v1, resolved type: V */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] setPadding(LuaValue[] luaValueArr) {
        ((OkLuaSegmentLayout) f_()).setPaddingRelative(C7865arr.copydefault(luaValueArr[0].toInt()), C7865arr.copydefault(luaValueArr[1].toInt()), C7865arr.copydefault(luaValueArr[2].toInt()), C7865arr.copydefault(luaValueArr[3].toInt()));
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] minimumItemSpacing(LuaValue[] luaValueArr) {
        LuaValue luaValue;
        if (luaValueArr != null && luaValueArr.length > 0 && (luaValue = luaValueArr[0]) != null) {
            this.fARcdN = luaValue.toInt();
            valueOf();
            return null;
        }
        return LuaValue.varargsOf(LuaValue.rNumber(this.fARcdN));
    }

    @InterfaceC60044zuT
    public LuaValue[] textPadding(LuaValue[] luaValueArr) {
        LuaValue luaValue;
        if (luaValueArr != null && luaValueArr.length > 0 && (luaValue = luaValueArr[0]) != null) {
            this.getFieldNames = luaValue.toInt();
            isConnected();
            return null;
        }
        return LuaValue.varargsOf(LuaValue.rNumber(this.getFieldNames));
    }

    @InterfaceC60044zuT
    public LuaValue[] alignment(LuaValue[] luaValueArr) {
        LuaValue luaValue;
        if (luaValueArr != null && luaValueArr.length > 0 && (luaValue = luaValueArr[0]) != null) {
            int i = luaValue.toInt();
            this.gEmmrt = i;
            if (i == 0) {
                this.AuCTel.baseTabLayout.setTabGravity(1);
                isConnected();
                return null;
            }
            if (i == 3) {
                this.AuCTel.baseTabLayout.setTabSpaceEqual(true);
                this.AuCTel.baseTabLayout.setTabGravity(2);
                return null;
            }
            if (i != 2) {
                return null;
            }
            this.AuCTel.baseTabLayout.setTabGravity(3);
            return null;
        }
        return LuaValue.varargsOf(LuaValue.rNumber(this.gEmmrt));
    }

    @InterfaceC60044zuT
    public LuaValue[] disableRipple(LuaValue[] luaValueArr) {
        OkLuaSegmentLayout okLuaSegmentLayout = this.AuCTel;
        if (okLuaSegmentLayout == null) {
            return null;
        }
        OKSlidingTabLayout oKSlidingTabLayout = okLuaSegmentLayout.baseTabLayout;
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] alignEndings(LuaValue[] luaValueArr) {
        LuaValue luaValue;
        if (luaValueArr != null && luaValueArr.length > 0 && (luaValue = luaValueArr[0]) != null) {
            this.AYXKKw = luaValue.toBoolean();
            return null;
        }
        return LuaValue.varargsOf(LuaValue.rBoolean(this.AYXKKw));
    }

    @InterfaceC60044zuT
    public LuaValue[] reloadWithTitles(LuaValue[] luaValueArr) {
        if (luaValueArr == null || luaValueArr.length == 0) {
            return null;
        }
        LuaValue luaValue = luaValueArr[0];
        if (luaValue == null) {
            return null;
        }
        UDArray uDArray = (UDArray) luaValue;
        List listEZpvd = uDArray.EZpvd();
        uDArray.destroy();
        if (this.AuCTel.baseTabLayout.copydefault() != listEZpvd.size()) {
            return null;
        }
        for (int i = 0; i < listEZpvd.size(); i++) {
            this.AuCTel.baseTabLayout.AEQbTJ(i).setText((CharSequence) listEZpvd.get(i));
        }
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] setIndicatorColor(LuaValue[] luaValueArr) {
        LuaValue luaValue;
        if (luaValueArr == null || luaValueArr.length != 1 || (luaValue = luaValueArr[0]) == null) {
            return null;
        }
        UDColor uDColor = (UDColor) luaValue.toUserdata();
        this.DbNXlk = uDColor.AEQbTJ();
        uDColor.destroy();
        this.AuCTel.baseTabLayout.setIndicatorHeight(C33052mpF.EZpvd(1, AubY()));
        this.AuCTel.baseTabLayout.setIndicatorWidthEqualTitle(true);
        if (this.DbNXlk.getColor(this.globals) == 0) {
            this.AuCTel.baseTabLayout.setIndicatorColor(0);
            return null;
        }
        OKSlidingTabLayout oKSlidingTabLayout = this.AuCTel.baseTabLayout;
        JColor jColor = this.DbNXlk;
        oKSlidingTabLayout.setIndicatorColor(jColor == null ? OLrzqt : jColor.getColor(this.globals));
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] setAverageShow(LuaValue[] luaValueArr) {
        LuaValue luaValue;
        if (luaValueArr == null || luaValueArr.length != 1 || (luaValue = luaValueArr[0]) == null || !Boolean.valueOf(luaValue.toBoolean()).booleanValue()) {
            return null;
        }
        this.AuCTel.baseTabLayout.setAverageShow();
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] setIndicatorStyle(LuaValue[] luaValueArr) {
        LuaValue luaValue;
        int i;
        if (luaValueArr == null || luaValueArr.length != 1 || (luaValue = luaValueArr[0]) == null || (i = luaValue.toInt()) < 0 || i > 3) {
            return null;
        }
        this.AuCTel.baseTabLayout.setIndicatorStyle(i);
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] setIndicatorCornerRadius(LuaValue[] luaValueArr) {
        LuaValue luaValue;
        int i;
        if (luaValueArr == null || luaValueArr.length != 1 || (luaValue = luaValueArr[0]) == null || (i = luaValue.toInt()) < 0) {
            return null;
        }
        this.AuCTel.baseTabLayout.setIndicatorCornerRadius(i);
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] setIndicatorHeight(LuaValue[] luaValueArr) {
        LuaValue luaValue;
        int i;
        if (luaValueArr == null || luaValueArr.length != 1 || (luaValue = luaValueArr[0]) == null || (i = luaValue.toInt()) < 0) {
            return null;
        }
        this.AuCTel.baseTabLayout.setIndicatorHeight(i);
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] setIndicatorStrokeWidth(LuaValue[] luaValueArr) {
        LuaValue luaValue;
        int i;
        if (luaValueArr == null || luaValueArr.length != 1 || (luaValue = luaValueArr[0]) == null || (i = luaValue.toInt()) < 0) {
            return null;
        }
        this.AuCTel.baseTabLayout.setIndicatorStrokeWidth(i);
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] textColor(LuaValue[] luaValueArr) {
        LuaValue luaValue;
        if (luaValueArr != null && luaValueArr.length == 1 && (luaValue = luaValueArr[0]) != null) {
            UDColor uDColor = (UDColor) luaValue.toUserdata();
            this.getNewProxyInstance = uDColor.AEQbTJ();
            uDColor.destroy();
            gEmmrt();
            return null;
        }
        LuaValue[] luaValueArr2 = new LuaValue[1];
        Globals globals = getGlobals();
        JColor jColor = this.getNewProxyInstance;
        luaValueArr2[0] = new UDColor(globals, jColor == null ? OLrzqt : jColor.getColor(this.globals));
        return LuaValue.varargsOf(luaValueArr2);
    }

    @InterfaceC60044zuT
    public LuaValue[] selectedTextColor(LuaValue[] luaValueArr) {
        LuaValue luaValue;
        if (luaValueArr == null || luaValueArr.length != 1 || (luaValue = luaValueArr[0]) == null) {
            return LuaValue.varargsOf(new UDColor(getGlobals(), this.uzCIH.getColor(this.globals)));
        }
        UDColor uDColor = (UDColor) luaValue.toUserdata();
        this.uzCIH = uDColor.AEQbTJ();
        uDColor.destroy();
        AYXKKw();
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] setFontNameSize(LuaValue[] luaValueArr) {
        LuaValue luaValue;
        LuaValue luaValue2;
        if (luaValueArr != null && luaValueArr.length == 2 && (luaValue2 = luaValueArr[1]) != null) {
            this.iwGUEr = luaValue2.toInt();
            OLrzqt(luaValueArr[0].toJavaString());
        }
        if (luaValueArr == null || luaValueArr.length != 2 || (luaValue = luaValueArr[0]) == null) {
            return null;
        }
        this.zsXlph = C7829arH.KWHzl.AEQbTJ(luaValue.toJavaString(), AubY());
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] setSelectedFontNameSize(LuaValue[] luaValueArr) {
        LuaValue luaValue;
        C7870arw.KWHzl("-------->OkSegmentLayout:setSelectedFontNameSize");
        if (luaValueArr == null || luaValueArr.length != 2 || (luaValue = luaValueArr[1]) == null) {
            return null;
        }
        this.hDKMBd = luaValue.toInt();
        AhwBna();
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] setItemTabClickListener(LuaValue[] luaValueArr) {
        LuaFunction luaFunction = this.values;
        if (luaFunction != null) {
            luaFunction.destroy();
        }
        this.values = luaValueArr[0].toLuaFunction();
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] setTabReselectedListener(LuaValue[] luaValueArr) {
        LuaFunction luaFunction = this.ejfBZ;
        if (luaFunction != null) {
            luaFunction.destroy();
        }
        this.ejfBZ = luaValueArr[0].toLuaFunction();
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] setPageSelectedCallback(LuaValue[] luaValueArr) {
        LuaFunction luaFunction = this.fIwbmz;
        if (luaFunction != null) {
            luaFunction.destroy();
        }
        this.fIwbmz = luaValueArr[0].toLuaFunction();
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] checkStatus(LuaValue[] luaValueArr) {
        LuaFunction luaFunction = this.valueOf;
        if (luaFunction != null) {
            luaFunction.destroy();
        }
        this.valueOf = luaValueArr[0].toLuaFunction();
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] didScroll(LuaValue[] luaValueArr) {
        LuaFunction luaFunction = this.isConnected;
        if (luaFunction != null) {
            luaFunction.destroy();
        }
        this.isConnected = luaValueArr[0].toLuaFunction();
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] showTabRedDot(LuaValue[] luaValueArr) {
        LuaValue luaValue;
        int i;
        OkLuaSegmentLayout okLuaSegmentLayout;
        OKSlidingTabLayout oKSlidingTabLayout;
        if (luaValueArr == null || luaValueArr.length <= 0 || (luaValue = luaValueArr[0]) == null || (i = luaValue.toInt()) < 0 || (okLuaSegmentLayout = this.AuCTel) == null || (oKSlidingTabLayout = okLuaSegmentLayout.baseTabLayout) == null) {
            return null;
        }
        oKSlidingTabLayout.copydefault(i, true);
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] hideTabRedDot(LuaValue[] luaValueArr) {
        LuaValue luaValue;
        int i;
        OkLuaSegmentLayout okLuaSegmentLayout;
        OKSlidingTabLayout oKSlidingTabLayout;
        if (luaValueArr == null || luaValueArr.length <= 0 || (luaValue = luaValueArr[0]) == null || (i = luaValue.toInt()) < 0 || (okLuaSegmentLayout = this.AuCTel) == null || (oKSlidingTabLayout = okLuaSegmentLayout.baseTabLayout) == null) {
            return null;
        }
        oKSlidingTabLayout.copydefault(i, false);
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] showBorderStyle(LuaValue[] luaValueArr) {
        LuaValue luaValue;
        OKSlidingTabLayout oKSlidingTabLayout;
        if (luaValueArr == null) {
            return null;
        }
        try {
            if (luaValueArr.length <= 0 || (luaValue = luaValueArr[0]) == null) {
                return null;
            }
            boolean z = luaValue.toBoolean();
            OkLuaSegmentLayout okLuaSegmentLayout = this.AuCTel;
            if (okLuaSegmentLayout == null || (oKSlidingTabLayout = okLuaSegmentLayout.baseTabLayout) == null) {
                return null;
            }
            oKSlidingTabLayout.AEQbTJ(Boolean.valueOf(z));
            return null;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public final void OLrzqt(String str) {
        this.AuCTel.baseTabLayout.setTextsize(this.iwGUEr);
        this.zsXlph = C7829arH.KWHzl.AEQbTJ(str, AubY());
        for (int i = 0; i < this.AuCTel.baseTabLayout.copydefault(); i++) {
            this.AuCTel.baseTabLayout.AEQbTJ(i).setTypeface(this.zsXlph);
        }
    }

    public final void AhwBna() {
        for (int i = 0; i < this.AuCTel.baseTabLayout.copydefault(); i++) {
            TextView textViewAEQbTJ = this.AuCTel.baseTabLayout.AEQbTJ(i);
            if (this.AuCTel.baseTabLayout.copydefault() == i) {
                textViewAEQbTJ.setTextSize(2, this.hDKMBd);
            } else {
                textViewAEQbTJ.setTextSize(2, this.iwGUEr);
            }
        }
    }

    public final void gEmmrt() {
        OKSlidingTabLayout oKSlidingTabLayout = this.AuCTel.baseTabLayout;
        JColor jColor = this.getNewProxyInstance;
        oKSlidingTabLayout.setTextUnselectColor(jColor == null ? OLrzqt : jColor.getColor(this.globals));
        for (int i = 0; i < this.AuCTel.baseTabLayout.copydefault(); i++) {
            TextView textViewAEQbTJ = this.AuCTel.baseTabLayout.AEQbTJ(i);
            if (i == this.AuCTel.baseTabLayout.AEQbTJ()) {
                JColor jColor2 = this.uzCIH;
                textViewAEQbTJ.setTextColor(jColor2 == null ? OLrzqt : jColor2.getColor(this.globals));
            } else {
                JColor jColor3 = this.getNewProxyInstance;
                textViewAEQbTJ.setTextColor(jColor3 == null ? OLrzqt : jColor3.getColor(this.globals));
            }
        }
    }

    public final void isConnected() {
        this.AuCTel.baseTabLayout.setTabPadding(this.getFieldNames);
    }

    public final void valueOf() {
        for (int i = 0; i < this.AuCTel.baseTabLayout.copydefault(); i++) {
            TextView textViewAEQbTJ = this.AuCTel.baseTabLayout.AEQbTJ(i);
            ViewGroup.LayoutParams layoutParams = textViewAEQbTJ.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ((ViewGroup.MarginLayoutParams) layoutParams).setMarginEnd(C7865arr.copydefault(this.fARcdN));
            }
            textViewAEQbTJ.setLayoutParams(layoutParams);
        }
    }

    public final void AYXKKw() {
        OKSlidingTabLayout oKSlidingTabLayout = this.AuCTel.baseTabLayout;
        int iAEQbTJ = oKSlidingTabLayout.AEQbTJ();
        JColor jColor = this.uzCIH;
        oKSlidingTabLayout.setTextSelectColor(iAEQbTJ, jColor == null ? OLrzqt : jColor.getColor(this.globals));
    }

    public void KWHzl(List<String> list) {
        if (list == null || list.size() == 0) {
            return;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            TextView textViewEZpvd = this.AuCTel.baseTabLayout.EZpvd(i);
            String str = list.get(i);
            if (TextUtils.isEmpty(str)) {
                textViewEZpvd.setVisibility(8);
            } else {
                textViewEZpvd.setText(str);
                textViewEZpvd.setVisibility(0);
            }
        }
    }

    public void copydefault(List<String> list) {
        if (list == null || list.size() == 0) {
            return;
        }
        OLrzqt(list);
        this.AuCTel.baseTabLayout.setOnTabSelectListener(new InterfaceC33549myZ() { // from class: com.immomo.mls.fun.ui.custom.OkSegmentLayout.5
            @Override // o.InterfaceC33549myZ
            public void OLrzqt(int i) {
                if (OkSegmentLayout.this.djBIcL != null) {
                    OkSegmentLayout.this.djBIcL.invoke(LuaValue.varargsOf(LuaNumber.valueOf(OkSegmentLayout.this.AuCTel.baseTabLayout.AEQbTJ() + 1)));
                }
            }

            @Override // o.InterfaceC33549myZ
            public void KWHzl(int i) {
                if (OkSegmentLayout.this.ejfBZ != null) {
                    OkSegmentLayout.this.ejfBZ.invoke(LuaValue.varargsOf(LuaNumber.valueOf(OkSegmentLayout.this.AuCTel.baseTabLayout.AEQbTJ() + 1)));
                }
            }
        });
        this.AuCTel.baseTabLayout.OLrzqt(new OKSlidingTabLayout.TaskDescription() { // from class: o.alQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.okinc.core.widget.OKSlidingTabLayout.TaskDescription
            public final void KWHzl(int i) {
                this.copydefault.AEQbTJ(i);
            }
        });
    }

    public final /* synthetic */ void AEQbTJ(int i) {
        LuaFunction luaFunction = this.fIwbmz;
        if (luaFunction != null) {
            luaFunction.invoke(LuaValue.varargsOf(LuaNumber.valueOf(i)));
        }
    }

    public final void OLrzqt(List<String> list) {
        new ColorStateList(new int[][]{new int[]{R.attr.state_selected}, new int[0]}, new int[]{this.uzCIH.getColor(this.globals), this.getNewProxyInstance.getColor(this.globals)});
        int size = list.size();
        for (int i = 0; i < size; i++) {
            this.AuCTel.baseTabLayout.AEQbTJ(list.get(i));
        }
        int size2 = list.size();
        for (int i2 = 0; i2 < size2; i2++) {
            TextView textViewAEQbTJ = this.AuCTel.baseTabLayout.AEQbTJ(i2);
            Typeface typeface = this.zsXlph;
            if (typeface != null) {
                textViewAEQbTJ.setTypeface(typeface);
            }
            Typeface typeface2 = this.zsXlph;
            if (typeface2 != null) {
                textViewAEQbTJ.setTypeface(typeface2);
            }
        }
    }

    public void AEQbTJ(ViewPager viewPager) {
        this.AuCTel.baseTabLayout.setViewPager(viewPager);
    }

    @Override // com.immomo.mls.fun.ud.view.UDView, o.InterfaceC7383aim.ActionBar
    public void AEQbTJ() {
        this.fetchVPNInfo = null;
        super.AEQbTJ();
    }

    @Override // com.immomo.mls.fun.ud.view.UDView, o.InterfaceC7383aim.ActionBar
    public void copydefault() {
        InterfaceC7405ajH interfaceC7405ajH = new InterfaceC7405ajH() { // from class: com.immomo.mls.fun.ui.custom.OkSegmentLayout.3
            @Override // o.InterfaceC7405ajH
            public void EZpvd() {
                if (OkSegmentLayout.this.DbNXlk != null) {
                    OkSegmentLayout.this.AuCTel.baseTabLayout.setIndicatorColor(OkSegmentLayout.this.DbNXlk.getColor(OkSegmentLayout.this.globals));
                }
                OkSegmentLayout.this.OLrzqt();
            }
        };
        this.fetchVPNInfo = interfaceC7405ajH;
        KWHzl(interfaceC7405ajH);
        super.copydefault();
    }

    public final void OLrzqt() {
        JColor jColor;
        for (int i = 0; i < this.AuCTel.baseTabLayout.copydefault(); i++) {
            TextView textViewAEQbTJ = this.AuCTel.baseTabLayout.AEQbTJ(i);
            if (i != this.AuCTel.baseTabLayout.AEQbTJ() || (jColor = this.uzCIH) == null) {
                JColor jColor2 = this.getNewProxyInstance;
                if (jColor2 != null) {
                    textViewAEQbTJ.setTextColor(jColor2.getColor(this.globals));
                }
            } else {
                textViewAEQbTJ.setTextColor(jColor.getColor(this.globals));
            }
        }
    }
}
