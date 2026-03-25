package com.immomo.mls.fun.ui.item;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.immomo.mls.fun.ud.view.UDView;
import com.immomo.mls.fun.ui.item.MLNOKCryptoCell;
import com.immomo.mls.fun.ui.uilib.tag.MLNOKTag;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C55021xcA;
import o.C55251xgS;
import o.C55298xhM;
import o.C55389xiy;
import o.C7594aml;
import o.InterfaceC60044zuT;
import o.yDV;
import org.jetbrains.annotations.NotNull;
import org.luaj.vm2.LuaValue;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC60044zuT
public final class MLNOKCryptoCell extends UDView<C55021xcA> {
    public static final ActionBar Companion = new ActionBar(null);
    public static final String[] copydefault = {"setCryptoCellStyle", "setCryptoStyle", "setChangeMainTitleStyle", "setCryptoText", "setPriceVisibility", "setChangeVisibility", "setCryptoDescription", "setCryptoTag", "setRankingText", "setRankingColor", "setCryptoIcon", "setPriceMainTitle", "setPriceSubTitle", "setPriceSubTitleColor", "setPriceImage", "setChangeMainTitle", "setChangeSubTitle"};
    public static final Integer[] KWHzl = {0, 1, 2};
    public static final Integer[] OLrzqt = {0, 1, 2};
    public static final Integer[] EZpvd = {0, 1, 2, 3, 4, 5};
    public static final String AEQbTJ = MLNOKCryptoCell.class.getSimpleName();

    @InterfaceC60044zuT
    public MLNOKCryptoCell(long j, LuaValue[] luaValueArr) {
        super(j, luaValueArr);
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ([Lorg/luaj/vm2/LuaValue;)Landroid/view/View; */
    @Override // com.immomo.mls.fun.ud.view.UDView
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public C55021xcA AEQbTJ(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        Context contextAubY = AubY();
        Intrinsics.checkNotNullExpressionValue(contextAubY, "");
        return new C55021xcA(contextAubY, null, 0, 0, 14, null);
    }

    @InterfaceC60044zuT
    public final LuaValue[] setCryptoCellStyle(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        C7594aml.safeAccessTypes$default(luaValueArr, KWHzl, 0, new Function1() { // from class: o.alZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return MLNOKCryptoCell.gEmmrt(this.AEQbTJ, ((java.lang.Integer) obj).intValue());
            }
        }, 2, null);
        return null;
    }

    public static final Unit gEmmrt(MLNOKCryptoCell mLNOKCryptoCell, int i) {
        ((C55021xcA) mLNOKCryptoCell.dHguZz).setCryptoCellStyle(i);
        return Unit.INSTANCE;
    }

    @InterfaceC60044zuT
    public final LuaValue[] setCryptoStyle(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        C7594aml.safeAccessTypes$default(luaValueArr, OLrzqt, 0, new Function1() { // from class: o.ama
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return MLNOKCryptoCell.AYXKKw(this.KWHzl, ((java.lang.Integer) obj).intValue());
            }
        }, 2, null);
        return null;
    }

    public static final Unit AYXKKw(MLNOKCryptoCell mLNOKCryptoCell, int i) {
        ((C55021xcA) mLNOKCryptoCell.dHguZz).setCryptoStyle(i);
        return Unit.INSTANCE;
    }

    @InterfaceC60044zuT
    public final LuaValue[] setChangeMainTitleStyle(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        C7594aml.safeAccessTypes$default(luaValueArr, EZpvd, 0, new Function1() { // from class: o.alY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return MLNOKCryptoCell.valueOf(this.EZpvd, ((java.lang.Integer) obj).intValue());
            }
        }, 2, null);
        return null;
    }

    public static final Unit valueOf(MLNOKCryptoCell mLNOKCryptoCell, int i) {
        ((C55021xcA) mLNOKCryptoCell.dHguZz).setChangeMainTitleStyle(i);
        return Unit.INSTANCE;
    }

    @InterfaceC60044zuT
    public final LuaValue[] setCryptoText(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        ((C55021xcA) this.dHguZz).setCryptoText(C7594aml.safeGetJavaString$default(luaValueArr, 0, null, 2, null), C7594aml.safeGetJavaString$default(luaValueArr, 1, null, 2, null));
        return null;
    }

    @InterfaceC60044zuT
    public final LuaValue[] setCryptoDescription(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        ((C55021xcA) this.dHguZz).KWHzl().setText(C7594aml.safeGetJavaString$default(luaValueArr, 0, null, 3, null));
        return null;
    }

    @InterfaceC60044zuT
    public final LuaValue[] setCryptoTag(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        C55021xcA c55021xcA = (C55021xcA) this.dHguZz;
        Context contextAubY = AubY();
        Intrinsics.checkNotNullExpressionValue(contextAubY, "");
        final C55251xgS c55251xgS = new C55251xgS(contextAubY, null, 0, 6, null);
        LuaValue luaValue = (LuaValue) yDV.gEmmrt(luaValueArr, 0);
        if (luaValue == null || !luaValue.isString()) {
            c55251xgS.setText((CharSequence) null);
        } else {
            c55251xgS.setText(luaValue.toJavaString());
        }
        MLNOKTag.Activity activity = MLNOKTag.Companion;
        C7594aml.OLrzqt(luaValueArr, activity.KWHzl(), 1, (Function1<? super Integer, Unit>) new Function1() { // from class: o.alU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return MLNOKCryptoCell.KWHzl(c55251xgS, ((java.lang.Integer) obj).intValue());
            }
        });
        C7594aml.OLrzqt(luaValueArr, activity.AEQbTJ(), 2, (Function1<? super Integer, Unit>) new Function1() { // from class: o.alW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return MLNOKCryptoCell.AEQbTJ(c55251xgS, ((java.lang.Integer) obj).intValue());
            }
        });
        Context context = c55251xgS.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        C7594aml.OLrzqt(luaValueArr, context, 4, (Function1<? super Drawable, Unit>) new Function1() { // from class: o.alT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return MLNOKCryptoCell.KWHzl(c55251xgS, (android.graphics.drawable.Drawable) obj);
            }
        });
        c55021xcA.setCryptoExtraView(c55251xgS);
        return null;
    }

    public static final Unit KWHzl(C55251xgS c55251xgS, int i) {
        c55251xgS.setOKDSSize(i);
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(C55251xgS c55251xgS, int i) {
        c55251xgS.setOKDSStyle(i);
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(C55251xgS c55251xgS, Drawable drawable) {
        c55251xgS.setShowIcon(drawable != null);
        c55251xgS.setTagIcon(drawable);
        return Unit.INSTANCE;
    }

    @InterfaceC60044zuT
    public final LuaValue[] setRankingText(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        ((C55021xcA) this.dHguZz).AkhnZx().setText(C7594aml.safeGetJavaString$default(luaValueArr, 0, null, 3, null));
        return null;
    }

    @InterfaceC60044zuT
    public final LuaValue[] setRankingColor(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        C7594aml.safeAccessColor$default(luaValueArr, 0, new Function1() { // from class: o.alV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return MLNOKCryptoCell.djBIcL(this.EZpvd, ((java.lang.Integer) obj).intValue());
            }
        }, 1, null);
        return null;
    }

    public static final Unit djBIcL(MLNOKCryptoCell mLNOKCryptoCell, int i) {
        ((C55021xcA) mLNOKCryptoCell.dHguZz).AkhnZx().setTextColor(i);
        return Unit.INSTANCE;
    }

    @InterfaceC60044zuT
    public final LuaValue[] setCryptoIcon(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        C55389xiy c55389xiyGEmmrt = ((C55021xcA) this.dHguZz).gEmmrt();
        ViewGroup.LayoutParams layoutParams = c55389xiyGEmmrt.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = C55298xhM.dp2px$default(32.0f, null, 1, null);
            layoutParams.height = C55298xhM.dp2px$default(32.0f, null, 1, null);
            c55389xiyGEmmrt.setLayoutParams(layoutParams);
            C7594aml.loadImage$default(luaValueArr, c55389xiyGEmmrt, 0, (Function1) null, 6, (Object) null);
            return null;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
    }

    @InterfaceC60044zuT
    public final LuaValue[] setPriceMainTitle(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        ((C55021xcA) this.dHguZz).AYXKKw().setText(C7594aml.safeGetJavaString$default(luaValueArr, 0, null, 3, null));
        return null;
    }

    @InterfaceC60044zuT
    public final LuaValue[] setPriceSubTitle(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        ((C55021xcA) this.dHguZz).values().setText(C7594aml.safeGetJavaString$default(luaValueArr, 0, null, 3, null));
        return null;
    }

    @InterfaceC60044zuT
    public final LuaValue[] setPriceSubTitleColor(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        C7594aml.safeAccessColor$default(luaValueArr, 0, new Function1() { // from class: o.alX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return MLNOKCryptoCell.AhwBna(this.KWHzl, ((java.lang.Integer) obj).intValue());
            }
        }, 1, null);
        return null;
    }

    public static final Unit AhwBna(MLNOKCryptoCell mLNOKCryptoCell, int i) {
        ((C55021xcA) mLNOKCryptoCell.dHguZz).values().setTextColor(i);
        return Unit.INSTANCE;
    }

    @InterfaceC60044zuT
    public final LuaValue[] setPriceImage(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        C55021xcA c55021xcA = (C55021xcA) this.dHguZz;
        ImageView imageView = new ImageView(AubY());
        C7594aml.loadImage$default(luaValueArr, imageView, 0, (Function1) null, 6, (Object) null);
        c55021xcA.setPriceExtraView(imageView);
        return null;
    }

    @InterfaceC60044zuT
    public final LuaValue[] setChangeMainTitle(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        ((C55021xcA) this.dHguZz).AEQbTJ().setText(C7594aml.safeGetJavaString$default(luaValueArr, 0, null, 3, null));
        return null;
    }

    @InterfaceC60044zuT
    public final LuaValue[] setChangeSubTitle(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        ((C55021xcA) this.dHguZz).EZpvd().setText(C7594aml.safeGetJavaString$default(luaValueArr, 0, null, 3, null));
        return null;
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.immomo.mls.fun.ui.item.MLNOKCryptoCell.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final String[] KWHzl() {
            return MLNOKCryptoCell.copydefault;
        }
    }

    @InterfaceC60044zuT
    public final LuaValue[] setPriceVisibility(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        LuaValue luaValue = (LuaValue) yDV.gEmmrt(luaValueArr, 0);
        if (luaValue == null || !luaValue.isBoolean()) {
            return null;
        }
        ((C55021xcA) this.dHguZz).setPriceVisibility(luaValue.toBoolean());
        return null;
    }

    @InterfaceC60044zuT
    public final LuaValue[] setChangeVisibility(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        LuaValue luaValue = (LuaValue) yDV.gEmmrt(luaValueArr, 0);
        if (luaValue == null || !luaValue.isBoolean()) {
            return null;
        }
        ((C55021xcA) this.dHguZz).setChangeVisibility(luaValue.toBoolean());
        return null;
    }
}
