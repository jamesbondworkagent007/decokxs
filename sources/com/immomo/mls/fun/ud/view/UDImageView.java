package com.immomo.mls.fun.ud.view;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.widget.ImageView;
import androidx.annotation.Nullable;
import com.bumptech.glide.Glide;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.immomo.mls.fun.constants.ContentMode;
import com.immomo.mls.fun.ud.UDArray;
import com.immomo.mls.fun.ud.UDImageInfo;
import com.immomo.mls.fun.ud.view.UDImageView;
import com.immomo.mls.fun.ui.custom.data.JDImageInfo;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.C33054mpH;
import o.C5335Nt;
import o.C7323ahf;
import o.C7539alj;
import o.C7833arL;
import o.C7840arS;
import o.C7865arr;
import o.InterfaceC60041zuQ;
import o.InterfaceC60044zuT;
import o.InterfaceC7410ajM;
import o.InterfaceC7471akU;
import o.wXL;
import org.luaj.vm2.LuaBoolean;
import org.luaj.vm2.LuaFunction;
import org.luaj.vm2.LuaNumber;
import org.luaj.vm2.LuaString;
import org.luaj.vm2.LuaTable;
import org.luaj.vm2.LuaValue;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC60044zuT
public class UDImageView<I extends ImageView & InterfaceC7471akU> extends UDView<I> {
    public static final String[] EZpvd = {TtmlNode.TAG_IMAGE, "contentMode", "lazyLoad", "setImageUrl", "setSVGImageWithCallback", "setImageWithCallback", "borderWidth", "padding", "setCornerImage", "startAnimationImages", "stopAnimationImages", "isAnimating", "blurImage", "addShadow", "setBlurBg", "setPlaceholderWithText", "setOriginImageWithBase64AndCallback", "loadBlockiesIcon"};
    public static final String OLrzqt = UDImageView.class.getSimpleName();
    public LuaFunction AEQbTJ;
    public LuaFunction KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean AhwBna() {
        return this.KWHzl != null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean gEmmrt() {
        return this.AEQbTJ != null;
    }

    @InterfaceC60044zuT
    public UDImageView(long j, LuaValue[] luaValueArr) {
        super(j, luaValueArr);
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ([Lorg/luaj/vm2/LuaValue;)Landroid/view/View; */
    @Override // com.immomo.mls.fun.ud.view.UDView
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public I AEQbTJ(LuaValue[] luaValueArr) {
        return new C7539alj(AubY(), this, luaValueArr);
    }

    @InterfaceC60044zuT
    public LuaValue[] image(LuaValue[] luaValueArr) {
        if (luaValueArr.length == 1) {
            OLrzqt();
            UDImageInfo uDImageInfo = (UDImageInfo) luaValueArr[0];
            JDImageInfo jDImageInfoEZpvd = uDImageInfo.EZpvd();
            if (jDImageInfoEZpvd.isNetUrl() && jDImageInfoEZpvd.isAvatar) {
                KWHzl(jDImageInfoEZpvd.getNetUrl(), jDImageInfoEZpvd.initialPlaceHolderName, null);
            } else {
                AEQbTJ(jDImageInfoEZpvd);
            }
            uDImageInfo.destroy();
            return null;
        }
        JDImageInfo jDImageInfoValueOf = valueOf();
        return jDImageInfoValueOf != null ? LuaValue.varargsOf(new UDImageInfo(getGlobals(), jDImageInfoValueOf)) : LuaValue.rNil();
    }

    @Override // com.immomo.mls.fun.ud.view.UDView
    public LuaValue[] setNineImage(LuaValue[] luaValueArr) {
        LuaValue[] nineImage = super.setNineImage(luaValueArr);
        ((C7539alj) f_()).setImageUrlEmpty();
        return nineImage;
    }

    @InterfaceC60044zuT
    public LuaValue[] contentMode(LuaValue[] luaValueArr) {
        if (luaValueArr.length != 1) {
            return LuaValue.varargsOf(LuaNumber.valueOf(f_().getScaleType().ordinal()));
        }
        if (luaValueArr[0].isNil()) {
            C7833arL.KWHzl("contentMode is nil. You must use 'ContentMode.XXXX'");
            return null;
        }
        int i = luaValueArr[0].toInt();
        if (i == ContentMode.CENTER) {
            C7833arL.OLrzqt("ContentMode.CENTER is deprecated", this.globals);
        }
        f_().setScaleType(ImageView.ScaleType.values()[i]);
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] loadBlockiesIcon(LuaValue[] luaValueArr) {
        if (luaValueArr.length == 0) {
            return null;
        }
        String javaString = luaValueArr.length > 0 ? luaValueArr[0].toJavaString() : "";
        if (TextUtils.isEmpty(javaString)) {
            return null;
        }
        wXL wxl = new wXL(javaString, 8);
        Drawable drawableKWHzl = luaValueArr.length > 1 ? C7323ahf.AYXKKw().KWHzl(AubY(), ((UDImageInfo) luaValueArr[1].toUserdata()).EZpvd()) : null;
        C5335Nt<Drawable> c5335NtKWHzl = Glide.AEQbTJ(AubY()).KWHzl(wxl);
        if (drawableKWHzl != null) {
            c5335NtKWHzl.EZpvd(drawableKWHzl).AEQbTJ(drawableKWHzl).OLrzqt(drawableKWHzl);
        }
        c5335NtKWHzl.EZpvd((ImageView) this.dHguZz);
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] lazyLoad(LuaValue[] luaValueArr) {
        if (luaValueArr.length != 1) {
            return f_().EZpvd() ? LuaValue.varargsOf(LuaValue.True()) : LuaValue.varargsOf(LuaValue.False());
        }
        f_().setLazyLoad(luaValueArr[0].toBoolean());
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] setImageUrl(LuaValue[] luaValueArr) {
        OLrzqt();
        UDImageInfo uDImageInfo = (luaValueArr.length <= 0 || luaValueArr[0].isNil()) ? null : (UDImageInfo) luaValueArr[0];
        UDImageInfo uDImageInfo2 = (luaValueArr.length <= 1 || luaValueArr[1].isNil()) ? null : (UDImageInfo) luaValueArr[1];
        JDImageInfo jDImageInfoEZpvd = uDImageInfo != null ? uDImageInfo.EZpvd() : null;
        if (jDImageInfoEZpvd != null && jDImageInfoEZpvd.isNetUrl() && jDImageInfoEZpvd.isAvatar) {
            KWHzl(jDImageInfoEZpvd.getNetUrl(), jDImageInfoEZpvd.initialPlaceHolderName, null);
        } else {
            AEQbTJ(jDImageInfoEZpvd, uDImageInfo2 != null ? uDImageInfo2.EZpvd() : null, false);
        }
        if (uDImageInfo != null) {
            uDImageInfo.destroy();
        }
        if (uDImageInfo2 != null) {
            uDImageInfo2.destroy();
        }
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] setOriginImageWithBase64AndCallback(LuaValue[] luaValueArr) {
        String str;
        boolean z = false;
        String javaString = (luaValueArr.length <= 0 || luaValueArr[0].isNil()) ? "" : luaValueArr[0].toJavaString();
        if (luaValueArr.length > 1 && !luaValueArr[1].isNil()) {
            z = luaValueArr[1].toBoolean();
        }
        UDImageInfo uDImageInfo = (luaValueArr.length <= 2 || luaValueArr[2].isNil()) ? null : (UDImageInfo) luaValueArr[2];
        this.AEQbTJ = (luaValueArr.length <= 3 || luaValueArr[3].isNil()) ? null : luaValueArr[3].toLuaFunction();
        if (z) {
            str = "SVG:" + javaString;
        } else {
            str = "PIXEL:" + javaString;
        }
        f_().setImageWithBase64AndCallback("BASE64:" + str, z, uDImageInfo);
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] setSVGImageWithCallback(LuaValue[] luaValueArr) {
        JDImageInfo jDImageInfoEZpvd;
        UDImageInfo uDImageInfo = (luaValueArr.length <= 0 || luaValueArr[0].isNil()) ? null : (UDImageInfo) luaValueArr[0];
        UDImageInfo uDImageInfo2 = (luaValueArr.length <= 1 || luaValueArr[1].isNil()) ? null : (UDImageInfo) luaValueArr[1];
        this.AEQbTJ = (luaValueArr.length <= 2 || luaValueArr[2].isNil()) ? null : luaValueArr[2].toLuaFunction();
        boolean z = luaValueArr.length > 3 && !luaValueArr[3].isNil() && luaValueArr[3].toBoolean();
        if (uDImageInfo != null) {
            jDImageInfoEZpvd = uDImageInfo.EZpvd();
            if (z) {
                jDImageInfoEZpvd.setName("PIXEL:" + jDImageInfoEZpvd.getName());
            } else {
                jDImageInfoEZpvd.setName("SVG:" + jDImageInfoEZpvd.getName());
            }
        } else {
            jDImageInfoEZpvd = null;
        }
        AEQbTJ(jDImageInfoEZpvd, uDImageInfo2 != null ? uDImageInfo2.EZpvd() : null, false);
        if (uDImageInfo != null) {
            uDImageInfo.destroy();
        }
        if (uDImageInfo2 != null) {
            uDImageInfo2.destroy();
        }
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] setBlurBg(LuaValue[] luaValueArr) {
        UDImageInfo uDImageInfo = (luaValueArr.length <= 0 || luaValueArr[0].isNil()) ? null : (UDImageInfo) luaValueArr[0];
        boolean z = true;
        UDImageInfo uDImageInfo2 = (luaValueArr.length <= 1 || luaValueArr[1].isNil()) ? null : (UDImageInfo) luaValueArr[1];
        this.KWHzl = (luaValueArr.length <= 2 || luaValueArr[2].isNil()) ? null : luaValueArr[2].toLuaFunction();
        if (luaValueArr.length > 3 && !luaValueArr[3].isNil()) {
            z = luaValueArr[3].toBoolean();
        }
        f_().setBgBlurCheck(uDImageInfo.EZpvd(), uDImageInfo2.EZpvd(), z);
        uDImageInfo.destroy();
        uDImageInfo2.destroy();
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] setPlaceholderWithText(LuaValue[] luaValueArr) {
        UDImageInfo uDImageInfo = (luaValueArr.length <= 0 || luaValueArr[0].isNil()) ? null : (UDImageInfo) luaValueArr[0];
        f_().setPlaceHolderNoText(uDImageInfo.EZpvd(), (luaValueArr.length <= 1 || luaValueArr[1].isNil()) ? "" : luaValueArr[1].toJavaString());
        uDImageInfo.destroy();
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] setImageWithCallback(LuaValue[] luaValueArr) {
        boolean z = false;
        UDImageInfo uDImageInfo = (luaValueArr.length <= 0 || luaValueArr[0].isNil()) ? null : (UDImageInfo) luaValueArr[0];
        UDImageInfo uDImageInfo2 = (luaValueArr.length <= 1 || luaValueArr[1].isNil()) ? null : (UDImageInfo) luaValueArr[1];
        this.AEQbTJ = (luaValueArr.length <= 2 || luaValueArr[2].isNil()) ? null : luaValueArr[2].toLuaFunction();
        if (luaValueArr.length > 3 && luaValueArr[3].isBoolean() && luaValueArr[3].toBoolean() && this.AEQbTJ != null) {
            z = true;
        }
        JDImageInfo jDImageInfoEZpvd = uDImageInfo != null ? uDImageInfo.EZpvd() : null;
        if (jDImageInfoEZpvd != null && jDImageInfoEZpvd.isNetUrl() && jDImageInfoEZpvd.isAvatar) {
            final String netUrl = jDImageInfoEZpvd.getNetUrl();
            KWHzl(netUrl, jDImageInfoEZpvd.initialPlaceHolderName, new Function1() { // from class: o.ajW
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return this.EZpvd.OLrzqt(netUrl, (java.lang.Boolean) obj);
                }
            });
        } else {
            AEQbTJ(jDImageInfoEZpvd, uDImageInfo2 != null ? uDImageInfo2.EZpvd() : null, z);
        }
        if (uDImageInfo != null) {
            uDImageInfo.destroy();
        }
        if (uDImageInfo2 != null) {
            uDImageInfo2.destroy();
        }
        return null;
    }

    public final /* synthetic */ Unit OLrzqt(String str, Boolean bool) {
        LuaFunction luaFunction = this.AEQbTJ;
        if (luaFunction != null) {
            luaFunction.invoke(LuaValue.varargsOf(LuaBoolean.AEQbTJ(bool.booleanValue()), LuaString.copydefault(""), LuaString.copydefault(str)));
        }
        return Unit.INSTANCE;
    }

    @InterfaceC60044zuT
    public LuaValue[] blurImage(LuaValue[] luaValueArr) {
        if (luaValueArr.length > 0 && !luaValueArr[0].isNil()) {
            final float f = (float) luaValueArr[0].toDouble();
            if (f < 0.0f) {
                f = 0.0f;
            }
            if (f > 25.0f) {
                f = 25.0f;
            }
            if (f >= 0.0f && f <= 25.0f) {
                if (valueOf() != null && valueOf().getLocalUrl().length() > 0 && f_().getDrawable() == null) {
                    C7840arS.EZpvd(AYXKKw());
                    C7840arS.KWHzl(AYXKKw(), new Runnable() { // from class: com.immomo.mls.fun.ud.view.UDImageView.5
                        /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: I */
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // java.lang.Runnable
                        public void run() {
                            ((InterfaceC7471akU) ((ImageView) UDImageView.this.f_())).setBlurImage(f);
                        }
                    }, 300L);
                    return null;
                }
                f_().setBlurImage(f);
            }
        }
        return null;
    }

    @Override // com.immomo.mls.fun.ud.view.UDView
    public LuaValue[] addShadow(LuaValue[] luaValueArr) {
        C7833arL.KWHzl("ImageView 不支持 addShadow()。");
        return null;
    }

    public final void KWHzl(@Nullable String str, @Nullable String str2, @Nullable Function1<Boolean, Unit> function1) {
        I iF_ = f_();
        if (TextUtils.isEmpty(str)) {
            str = "";
        }
        if (function1 == null) {
            function1 = new Function1() { // from class: o.ajV
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return UDImageView.AEQbTJ((java.lang.Boolean) obj);
                }
            };
        }
        C33054mpH.EZpvd(iF_, str, str2, function1);
    }

    public static /* synthetic */ Unit AEQbTJ(Boolean bool) {
        return Unit.INSTANCE;
    }

    public void AEQbTJ(JDImageInfo jDImageInfo, JDImageInfo jDImageInfo2, boolean z) {
        if (z) {
            f_().setImageUrlWithPlaceHolderAndOriginSize(jDImageInfo, jDImageInfo2);
        } else {
            f_().setImageUrlWithPlaceHolder(jDImageInfo, jDImageInfo2);
        }
    }

    @Override // com.immomo.mls.fun.ud.view.UDView
    @InterfaceC60044zuT
    public LuaValue[] borderWidth(LuaValue[] luaValueArr) {
        return super.borderWidth(LuaValue.varargsOf(LuaNumber.copydefault((float) luaValueArr[0].toDouble())));
    }

    @Override // com.immomo.mls.fun.ud.view.UDView
    @InterfaceC60044zuT
    public LuaValue[] padding(LuaValue[] luaValueArr) {
        C7833arL.KWHzl("ImageView not support padding");
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] setCornerImage(LuaValue[] luaValueArr) {
        OLrzqt();
        UDImageInfo uDImageInfo = (UDImageInfo) luaValueArr[0];
        UDImageInfo uDImageInfo2 = (UDImageInfo) luaValueArr[1];
        float f = (float) luaValueArr[2].toDouble();
        if (luaValueArr.length == 5) {
            AEQbTJ(f, luaValueArr[4].toInt());
        } else {
            copydefault(C7865arr.copydefault(f));
        }
        ((C7539alj) f_()).setImageUrlEmpty();
        AEQbTJ(uDImageInfo.EZpvd(), uDImageInfo2.EZpvd(), false);
        uDImageInfo.destroy();
        uDImageInfo2.destroy();
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] startAnimationImages(LuaValue[] luaValueArr) {
        List listEZpvd;
        OLrzqt();
        LuaValue luaValue = luaValueArr[0];
        float f = (float) luaValueArr[1].toDouble();
        boolean z = luaValueArr[2].toBoolean();
        if (luaValue instanceof LuaTable) {
            listEZpvd = AEQbTJ((LuaTable) luaValue);
        } else {
            listEZpvd = luaValue instanceof UDArray ? ((UDArray) luaValue).EZpvd() : null;
        }
        if (listEZpvd != null && !listEZpvd.isEmpty()) {
            luaValue.destroy();
            f_().EZpvd(listEZpvd, (long) (f * 1000.0f), z);
        }
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] stopAnimationImages(LuaValue[] luaValueArr) {
        f_().copydefault();
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] isAnimating(LuaValue[] luaValueArr) {
        return LuaValue.varargsOf(LuaBoolean.AEQbTJ(f_().AEQbTJ()));
    }

    public void AEQbTJ(JDImageInfo jDImageInfo) {
        f_().setImage(jDImageInfo);
    }

    public JDImageInfo valueOf() {
        return f_().OLrzqt();
    }

    @Override // com.immomo.mls.fun.ud.view.UDView
    public void OLrzqt(JDImageInfo jDImageInfo) {
        super.OLrzqt(jDImageInfo);
        f_().setImageDrawable(null);
        stopAnimationImages(null);
    }

    public final void OLrzqt() {
        this.dNCPSb = false;
        InterfaceC7410ajM interfaceC7410ajMZsXlph = zsXlph();
        if (interfaceC7410ajMZsXlph != null) {
            interfaceC7410ajMZsXlph.setBgDrawable(null);
        }
    }

    private static List<JDImageInfo> AEQbTJ(LuaTable luaTable) {
        ArrayList arrayList = new ArrayList();
        InterfaceC60041zuQ<LuaTable.Application> it = luaTable.iterator();
        if (it == null) {
            return arrayList;
        }
        while (it.hasNext()) {
            arrayList.add(((UDImageInfo) it.next().KWHzl).EZpvd());
        }
        it.AEQbTJ();
        luaTable.destroy();
        return arrayList;
    }

    public void AEQbTJ(boolean z, String str, String str2) {
        LuaFunction luaFunction = this.AEQbTJ;
        if (luaFunction == null) {
            return;
        }
        luaFunction.invoke(LuaValue.varargsOf(LuaBoolean.AEQbTJ(z), LuaString.copydefault(str2), LuaString.copydefault(str)));
    }

    public void EZpvd(boolean z, String str, String str2, int i, int i2) {
        LuaFunction luaFunction = this.AEQbTJ;
        if (luaFunction == null) {
            return;
        }
        luaFunction.invoke(LuaValue.varargsOf(LuaBoolean.AEQbTJ(z), LuaString.copydefault(str2), LuaString.copydefault(str), LuaNumber.valueOf(i), LuaNumber.valueOf(i2)));
    }

    public void copydefault(boolean z, String str) {
        LuaFunction luaFunction = this.KWHzl;
        if (luaFunction == null) {
            return;
        }
        luaFunction.invoke(LuaValue.varargsOf(LuaBoolean.AEQbTJ(z), LuaString.copydefault(str)));
    }

    public final String AYXKKw() {
        return hashCode() + OLrzqt;
    }

    @Override // com.immomo.mls.fun.ud.view.UDView
    public LuaValue[] onClick(LuaValue[] luaValueArr) {
        return super.onClick(luaValueArr);
    }

    @Override // org.luaj.vm2.LuaUserdata, org.luaj.vm2.NLuaValue, org.luaj.vm2.LuaValue
    public void destroy() {
        super.destroy();
        this.AEQbTJ = null;
        this.KWHzl = null;
    }
}
