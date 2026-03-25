package com.immomo.mls.fun.ui.uilib.banner;

import android.content.Context;
import android.widget.ImageView;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.immomo.mls.fun.ud.view.UDView;
import com.immomo.mls.fun.ui.custom.data.JDImageInfo;
import com.immomo.mls.fun.ui.uilib.banner.MLNOKHorizontalBanner;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52776wXy;
import o.C55298xhM;
import o.C56403yEb;
import o.C7594aml;
import o.C7910asj;
import o.C7911ask;
import o.InterfaceC60044zuT;
import o.InterfaceC7852are;
import o.wXI;
import o.yDV;
import org.jetbrains.annotations.NotNull;
import org.luaj.vm2.LuaFunction;
import org.luaj.vm2.LuaTable;
import org.luaj.vm2.LuaValue;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC60044zuT
public final class MLNOKHorizontalBanner extends UDView<wXI> {
    public static final Activity Companion = new Activity(null);
    public static final String[] KWHzl = {"setItems", "setCurrentPage", "getCurrentPage", "setCurrentPageWithAnimation", "setAutoPlay", "setAutoTurningTime", "setItemClicked", "setStyle"};
    public static final Integer[] AEQbTJ = {0, 2, 1};
    public static final String copydefault = MLNOKHorizontalBanner.class.getSimpleName();

    @InterfaceC60044zuT
    public MLNOKHorizontalBanner(long j, LuaValue[] luaValueArr) {
        super(j, luaValueArr);
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ([Lorg/luaj/vm2/LuaValue;)Landroid/view/View; */
    @Override // com.immomo.mls.fun.ud.view.UDView
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public wXI AEQbTJ(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        Context contextAubY = AubY();
        Intrinsics.checkNotNullExpressionValue(contextAubY, "");
        return new wXI(contextAubY, null, 0, 6, null);
    }

    @InterfaceC60044zuT
    public final LuaValue[] setItems(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        C7594aml.safeAccessTable$default(luaValueArr, 0, new Function1() { // from class: o.amG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return MLNOKHorizontalBanner.copydefault(this.copydefault, (LuaTable) obj);
            }
        }, 1, null);
        return null;
    }

    public static final Unit copydefault(MLNOKHorizontalBanner mLNOKHorizontalBanner, LuaTable luaTable) {
        Intrinsics.checkNotNullParameter(luaTable, "");
        List listOLrzqt = C7910asj.OLrzqt(luaTable);
        Intrinsics.checkNotNullExpressionValue(listOLrzqt, "");
        ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(listOLrzqt, 10));
        for (Object obj : listOLrzqt) {
            Intrinsics.copydefault(obj, "");
            Map map = (Map) obj;
            String str = (String) map.get("title");
            String str2 = (String) map.get("content");
            String str3 = (String) map.get("buttonText");
            final JDImageInfo jDImageInfo = (JDImageInfo) map.get(TtmlNode.TAG_IMAGE);
            arrayList.add(new C52776wXy(str, str2, str3, null, new Function1() { // from class: o.amH
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return MLNOKHorizontalBanner.KWHzl(jDImageInfo, (android.widget.ImageView) obj2);
                }
            }, 8, null));
        }
        ((wXI) mLNOKHorizontalBanner.dHguZz).setItems(CollectionsKt___CollectionsKt.fJNWhG((Collection) arrayList));
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(JDImageInfo jDImageInfo, ImageView imageView) {
        Intrinsics.checkNotNullParameter(imageView, "");
        if (jDImageInfo != null) {
            C7911ask.AEQbTJ(imageView, jDImageInfo, (InterfaceC7852are) null);
        }
        return Unit.INSTANCE;
    }

    @InterfaceC60044zuT
    public final LuaValue[] getCurrentPage(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        return LuaValue.rNumber(((wXI) this.dHguZz).copydefault());
    }

    @InterfaceC60044zuT
    public final LuaValue[] setItemClicked(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        OLrzqt(luaValueArr, "itemClicked", new UDView.TaskDescription() { // from class: o.amI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.immomo.mls.fun.ud.view.UDView.TaskDescription
            public final void OLrzqt(LuaFunction luaFunction) {
                MLNOKHorizontalBanner.EZpvd(this.copydefault, luaFunction);
            }
        });
        return null;
    }

    public static final void EZpvd(MLNOKHorizontalBanner mLNOKHorizontalBanner, final LuaFunction luaFunction) {
        ((wXI) mLNOKHorizontalBanner.dHguZz).setOnItemClick(new Function1() { // from class: o.amL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return MLNOKHorizontalBanner.KWHzl(luaFunction, ((java.lang.Integer) obj).intValue());
            }
        });
    }

    public static final Unit KWHzl(LuaFunction luaFunction, int i) {
        if (luaFunction != null) {
            luaFunction.EZpvd(((double) i) + ((double) 1));
        }
        return Unit.INSTANCE;
    }

    @InterfaceC60044zuT
    public final LuaValue[] setStyle(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        C7594aml.safeAccessTypes$default(luaValueArr, AEQbTJ, 0, new Function1() { // from class: o.amK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return MLNOKHorizontalBanner.AEQbTJ(this.KWHzl, ((java.lang.Integer) obj).intValue());
            }
        }, 2, null);
        return null;
    }

    public static final Unit AEQbTJ(MLNOKHorizontalBanner mLNOKHorizontalBanner, int i) {
        ((wXI) mLNOKHorizontalBanner.dHguZz).setStyle(i);
        return Unit.INSTANCE;
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.immomo.mls.fun.ui.uilib.banner.MLNOKHorizontalBanner.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final String[] copydefault() {
            return MLNOKHorizontalBanner.KWHzl;
        }
    }

    @Override // com.immomo.mls.fun.ud.view.UDView
    public LuaValue[] height(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        LuaValue luaValue = (LuaValue) yDV.gEmmrt(luaValueArr, 0);
        if (luaValue != null && luaValue.isInt()) {
            ((wXI) this.dHguZz).KWHzl(C55298xhM.dpInt$default(luaValue.toInt(), (Context) null, 1, (Object) null));
        }
        return super.height(luaValueArr);
    }

    @InterfaceC60044zuT
    public final LuaValue[] setCurrentPage(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        LuaValue luaValue = (LuaValue) yDV.gEmmrt(luaValueArr, 0);
        if (luaValue == null || !luaValue.isInt()) {
            return null;
        }
        ((wXI) this.dHguZz).setCurrentPage(luaValue.toInt(), false);
        return null;
    }

    @InterfaceC60044zuT
    public final LuaValue[] setCurrentPageWithAnimation(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        LuaValue luaValue = (LuaValue) yDV.gEmmrt(luaValueArr, 0);
        if (luaValue == null || !luaValue.isInt()) {
            return null;
        }
        ((wXI) this.dHguZz).setCurrentPage(luaValue.toInt(), true);
        return null;
    }

    @InterfaceC60044zuT
    public final LuaValue[] setAutoPlay(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        LuaValue luaValue = (LuaValue) yDV.gEmmrt(luaValueArr, 0);
        if (luaValue == null || !luaValue.isBoolean()) {
            return null;
        }
        ((wXI) this.dHguZz).setAutoPlay(luaValue.toBoolean());
        return null;
    }

    @InterfaceC60044zuT
    public final LuaValue[] setAutoTurningTime(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        LuaValue luaValue = (LuaValue) yDV.gEmmrt(luaValueArr, 0);
        if (luaValue == null || !luaValue.isNumber()) {
            return null;
        }
        ((wXI) this.dHguZz).setAutoTurningTime(luaValue.toLong());
        return null;
    }
}
