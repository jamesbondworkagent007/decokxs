package com.immomo.mls.fun.ui.uilib.tag;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.immomo.mls.fun.ud.view.UDView;
import com.immomo.mls.fun.ui.custom.data.JDImageInfo;
import com.immomo.mls.fun.ui.uilib.tag.MLNOKTag;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C55251xgS;
import o.C7594aml;
import o.C7911ask;
import o.InterfaceC60044zuT;
import o.InterfaceC7852are;
import o.yDV;
import org.jetbrains.annotations.NotNull;
import org.luaj.vm2.LuaValue;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC60044zuT
public final class MLNOKTag extends UDView<C55251xgS> {
    public static final Activity Companion = new Activity(null);
    public static final String[] djBIcL = {"setStyle", "setShape", "setPaintType", "setSize", "title", "setIcon", "setBorderColor", "setBackgroundColor", "setTitleColor"};
    public static final int AEQbTJ = 1;
    public static final int EZpvd = 0;
    public static final Integer[] KWHzl = {Integer.valueOf(EZpvd), 1};
    public static final Integer[] OLrzqt = {-2, -1};
    public static final Integer[] gEmmrt = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};
    public static final Integer[] copydefault = {-3, -4, -5, -6};
    public static final String AYXKKw = MLNOKTag.class.getSimpleName();

    @InterfaceC60044zuT
    public MLNOKTag(long j, LuaValue[] luaValueArr) {
        super(j, luaValueArr);
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ([Lorg/luaj/vm2/LuaValue;)Landroid/view/View; */
    @Override // com.immomo.mls.fun.ud.view.UDView
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public C55251xgS AEQbTJ(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        Context contextAubY = AubY();
        Intrinsics.checkNotNullExpressionValue(contextAubY, "");
        return new C55251xgS(contextAubY, null, 0, 6, null);
    }

    @InterfaceC60044zuT
    public final LuaValue[] title(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        ((C55251xgS) this.dHguZz).setText(C7594aml.safeGetJavaString$default(luaValueArr, 0, null, 2, null));
        return null;
    }

    @InterfaceC60044zuT
    public final LuaValue[] setIcon(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        C7594aml.OLrzqt(luaValueArr, 0, (Function1<? super JDImageInfo, Unit>) new Function1() { // from class: o.apU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return MLNOKTag.EZpvd(this.AEQbTJ, (JDImageInfo) obj);
            }
        });
        return null;
    }

    public static final Unit EZpvd(final MLNOKTag mLNOKTag, JDImageInfo jDImageInfo) {
        if (jDImageInfo != null) {
            Context contextAubY = mLNOKTag.AubY();
            Intrinsics.checkNotNullExpressionValue(contextAubY, "");
            C7911ask.OLrzqt(contextAubY, jDImageInfo, new InterfaceC7852are() { // from class: o.apQ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC7852are
                public final void copydefault(android.graphics.drawable.Drawable drawable, java.lang.String str) {
                    MLNOKTag.AEQbTJ(this.OLrzqt, drawable, str);
                }
            });
        } else {
            ((C55251xgS) mLNOKTag.dHguZz).setShowIcon(false);
            ((C55251xgS) mLNOKTag.dHguZz).setTagIcon(null);
        }
        return Unit.INSTANCE;
    }

    public static final void AEQbTJ(MLNOKTag mLNOKTag, Drawable drawable, String str) {
        ((C55251xgS) mLNOKTag.dHguZz).setShowIcon(true);
        ((C55251xgS) mLNOKTag.dHguZz).setTagIcon(drawable);
    }

    @InterfaceC60044zuT
    public final LuaValue[] setBackgroundColor(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        C7594aml.safeAccessColor$default(luaValueArr, 0, new Function1() { // from class: o.apT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return MLNOKTag.OLrzqt(this.OLrzqt, ((java.lang.Integer) obj).intValue());
            }
        }, 1, null);
        return null;
    }

    public static final Unit OLrzqt(MLNOKTag mLNOKTag, int i) {
        ((C55251xgS) mLNOKTag.dHguZz).setBgColor(i);
        return Unit.INSTANCE;
    }

    @InterfaceC60044zuT
    public final LuaValue[] setTitleColor(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        C7594aml.safeAccessColor$default(luaValueArr, 0, new Function1() { // from class: o.apL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return MLNOKTag.AhwBna(this.AEQbTJ, ((java.lang.Integer) obj).intValue());
            }
        }, 1, null);
        return null;
    }

    public static final Unit AhwBna(MLNOKTag mLNOKTag, int i) {
        ((C55251xgS) mLNOKTag.dHguZz).setTextColor(i);
        return Unit.INSTANCE;
    }

    @InterfaceC60044zuT
    public final LuaValue[] setBorderColor(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        C7594aml.safeAccessColor$default(luaValueArr, 0, new Function1() { // from class: o.apR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return MLNOKTag.copydefault(this.OLrzqt, ((java.lang.Integer) obj).intValue());
            }
        }, 1, null);
        return null;
    }

    public static final Unit copydefault(MLNOKTag mLNOKTag, int i) {
        C55251xgS.setBorder$default((C55251xgS) mLNOKTag.dHguZz, i, 0, 2, null);
        return Unit.INSTANCE;
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.immomo.mls.fun.ui.uilib.tag.MLNOKTag.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final String[] EZpvd() {
            return MLNOKTag.djBIcL;
        }

        public final Integer[] AEQbTJ() {
            return MLNOKTag.gEmmrt;
        }

        public final Integer[] KWHzl() {
            return MLNOKTag.copydefault;
        }
    }

    @InterfaceC60044zuT
    public final LuaValue[] setStyle(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        LuaValue luaValue = (LuaValue) yDV.gEmmrt(luaValueArr, 0);
        if (luaValue == null || !luaValue.isInt()) {
            return null;
        }
        Integer num = (Integer) yDV.gEmmrt(gEmmrt, luaValue.toInt());
        if (num == null) {
            return null;
        }
        ((C55251xgS) this.dHguZz).setOKDSStyle(num.intValue());
        return null;
    }

    @InterfaceC60044zuT
    public final LuaValue[] setShape(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        LuaValue luaValue = (LuaValue) yDV.gEmmrt(luaValueArr, 0);
        if (luaValue == null || !luaValue.isInt()) {
            return null;
        }
        Integer num = (Integer) yDV.gEmmrt(OLrzqt, luaValue.toInt());
        if (num == null) {
            return null;
        }
        ((C55251xgS) this.dHguZz).setTagType(num.intValue());
        return null;
    }

    @InterfaceC60044zuT
    public final LuaValue[] setPaintType(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        LuaValue luaValue = (LuaValue) yDV.gEmmrt(luaValueArr, 0);
        if (luaValue == null || !luaValue.isInt()) {
            return null;
        }
        Integer num = (Integer) yDV.gEmmrt(KWHzl, luaValue.toInt());
        if (num == null) {
            return null;
        }
        ((C55251xgS) this.dHguZz).setTagPaint(num.intValue());
        return null;
    }

    @InterfaceC60044zuT
    public final LuaValue[] setSize(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        LuaValue luaValue = (LuaValue) yDV.gEmmrt(luaValueArr, 0);
        if (luaValue == null || !luaValue.isInt()) {
            return null;
        }
        Integer num = (Integer) yDV.gEmmrt(copydefault, luaValue.toInt());
        if (num == null) {
            return null;
        }
        ((C55251xgS) this.dHguZz).setOKDSSize(num.intValue());
        return null;
    }
}
