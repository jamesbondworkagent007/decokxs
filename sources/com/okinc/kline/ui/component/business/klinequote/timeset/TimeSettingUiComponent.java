package com.okinc.kline.ui.component.business.klinequote.timeset;

import android.content.DialogInterface;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import com.okinc.kline.data.TimeIntervalItem;
import com.okinc.kline.library.template.TemplateSetting;
import com.okinc.kline.ui.component.business.klinequote.KlineQuoteDataComponent;
import com.okinc.kline.ui.component.business.klinequote.timeset.TimeSettingUiComponent;
import com.okinc.kline.ui.component.business.klinequote.viemodel.KlineQuoteViewModel;
import com.okinc.kline.ui.view.model.MarketTypeSelect;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C36236oUh;
import o.C36250oUv;
import o.C37830pCg;
import o.C37908pFd;
import o.C39043pkp;
import o.C39339pqT;
import o.C39358pqm;
import o.C39756pyO;
import o.C39816pzV;
import o.InterfaceC39046pks;
import o.InterfaceC56388yDn;
import o.InterfaceC56514yIe;
import o.oML;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class TimeSettingUiComponent implements InterfaceC39046pks {
    public final C39043pkp<oML> OLrzqt;
    public final KlineQuoteDataComponent copydefault;

    public static final /* synthetic */ class TaskDescription implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.AEQbTJ = function1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean equals(Object obj) {
            if ((obj instanceof Observer) && (obj instanceof InterfaceC56514yIe)) {
                return Intrinsics.EZpvd(getFunctionDelegate(), ((InterfaceC56514yIe) obj).getFunctionDelegate());
            }
            return false;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC56514yIe
        public final InterfaceC56388yDn<?> getFunctionDelegate() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.AEQbTJ.invoke(obj);
        }
    }

    public TimeSettingUiComponent(@NotNull C39043pkp<oML> c39043pkp, @NotNull KlineQuoteDataComponent klineQuoteDataComponent) {
        Intrinsics.checkNotNullParameter(c39043pkp, "");
        Intrinsics.checkNotNullParameter(klineQuoteDataComponent, "");
        this.OLrzqt = c39043pkp;
        this.copydefault = klineQuoteDataComponent;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onCreate(@NotNull LifecycleOwner lifecycleOwner) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        super.onCreate(lifecycleOwner);
        EZpvd(lifecycleOwner);
        copydefault();
    }

    private final void copydefault() {
        C39816pzV c39816pzV;
        C39816pzV c39816pzV2;
        AEQbTJ();
        oML oml = (oML) this.OLrzqt.KWHzl();
        if (oml != null && (c39816pzV2 = oml.getFieldNames) != null) {
            c39816pzV2.setData();
        }
        oML oml2 = (oML) this.OLrzqt.KWHzl();
        if (oml2 == null || (c39816pzV = oml2.getFieldNames) == null) {
            return;
        }
        c39816pzV.setOnItemSelectListener(new Function1() { // from class: o.poq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return TimeSettingUiComponent.AEQbTJ(this.AEQbTJ, ((java.lang.Integer) obj).intValue());
            }
        });
    }

    public static final Unit AEQbTJ(TimeSettingUiComponent timeSettingUiComponent, int i) {
        timeSettingUiComponent.AEQbTJ(i);
        return Unit.INSTANCE;
    }

    public final void AEQbTJ() {
        AppCompatImageView appCompatImageView;
        AppCompatImageView appCompatImageView2;
        boolean zIsConnected = C36236oUh.EZpvd.isConnected();
        oML oml = (oML) this.OLrzqt.KWHzl();
        if (oml != null && (appCompatImageView2 = oml.zuBGHE) != null) {
            appCompatImageView2.setVisibility(zIsConnected ? 0 : 8);
        }
        oML oml2 = (oML) this.OLrzqt.KWHzl();
        if (oml2 == null || (appCompatImageView = oml2.QOLQEE) == null) {
            return;
        }
        appCompatImageView.setVisibility(zIsConnected ? 0 : 8);
    }

    public final void EZpvd(@NotNull LifecycleOwner lifecycleOwner) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        this.copydefault.values().AkhnZx().observe(lifecycleOwner, new TaskDescription(new Function1() { // from class: o.pom
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return TimeSettingUiComponent.KWHzl(this.AEQbTJ, (java.lang.String) obj);
            }
        }));
        this.copydefault.values().AubY().observe(lifecycleOwner, new TaskDescription(new Function1() { // from class: o.poo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return TimeSettingUiComponent.EZpvd(this.copydefault, (java.lang.Boolean) obj);
            }
        }));
        this.copydefault.values().UeEOUB().observe(lifecycleOwner, new TaskDescription(new Function1() { // from class: o.pon
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return TimeSettingUiComponent.gEmmrt(this.OLrzqt, (java.lang.Boolean) obj);
            }
        }));
        this.copydefault.values().getFieldNames().observe(lifecycleOwner, new TaskDescription(new Function1() { // from class: o.pos
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return TimeSettingUiComponent.valueOf(this.AEQbTJ, (java.lang.Boolean) obj);
            }
        }));
        this.copydefault.ejfBZ().values().observe(lifecycleOwner, new TaskDescription(new Function1() { // from class: o.pot
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return TimeSettingUiComponent.AYXKKw(this.OLrzqt, (java.lang.Boolean) obj);
            }
        }));
    }

    public static final Unit KWHzl(TimeSettingUiComponent timeSettingUiComponent, String str) {
        oML oml;
        C39816pzV c39816pzV;
        oML oml2;
        ImageView imageView;
        oML oml3;
        ImageView imageView2;
        C39816pzV c39816pzV2;
        if (Intrinsics.EZpvd((Object) str, (Object) timeSettingUiComponent.copydefault.values().ejfBZ())) {
            oML oml4 = (oML) timeSettingUiComponent.OLrzqt.KWHzl();
            if (oml4 != null && (c39816pzV2 = oml4.getFieldNames) != null) {
                c39816pzV2.setData();
            }
            C39043pkp<oML> c39043pkp = timeSettingUiComponent.OLrzqt;
            if (c39043pkp != null && (oml3 = (oML) c39043pkp.KWHzl()) != null && (imageView2 = oml3.AYXKKw) != null) {
                imageView2.setVisibility(8);
            }
        } else if (Intrinsics.EZpvd((Object) str, (Object) timeSettingUiComponent.copydefault.values().QKVWgx())) {
            C39043pkp<oML> c39043pkp2 = timeSettingUiComponent.OLrzqt;
            if (c39043pkp2 != null && (oml2 = (oML) c39043pkp2.KWHzl()) != null && (imageView = oml2.AYXKKw) != null) {
                imageView.setVisibility(0);
            }
        } else if (Intrinsics.EZpvd((Object) str, (Object) timeSettingUiComponent.copydefault.values().isConnected()) && (oml = (oML) timeSettingUiComponent.OLrzqt.KWHzl()) != null && (c39816pzV = oml.getFieldNames) != null) {
            c39816pzV.setData();
        }
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(TimeSettingUiComponent timeSettingUiComponent, Boolean bool) {
        C39816pzV c39816pzV;
        oML oml = (oML) timeSettingUiComponent.OLrzqt.KWHzl();
        if (oml != null && (c39816pzV = oml.getFieldNames) != null) {
            c39816pzV.setData();
        }
        return Unit.INSTANCE;
    }

    public static final Unit gEmmrt(TimeSettingUiComponent timeSettingUiComponent, Boolean bool) {
        C39816pzV c39816pzV;
        oML oml = (oML) timeSettingUiComponent.OLrzqt.KWHzl();
        if (oml != null && (c39816pzV = oml.getFieldNames) != null) {
            c39816pzV.setData();
        }
        return Unit.INSTANCE;
    }

    public static final Unit valueOf(TimeSettingUiComponent timeSettingUiComponent, Boolean bool) {
        oML oml;
        C39816pzV c39816pzV;
        if (bool.booleanValue() && (oml = (oML) timeSettingUiComponent.OLrzqt.KWHzl()) != null && (c39816pzV = oml.getFieldNames) != null) {
            c39816pzV.setData();
        }
        return Unit.INSTANCE;
    }

    public static final Unit AYXKKw(TimeSettingUiComponent timeSettingUiComponent, Boolean bool) {
        if (bool.booleanValue()) {
            timeSettingUiComponent.AEQbTJ();
        }
        return Unit.INSTANCE;
    }

    private final void AEQbTJ(int i) {
        TimeIntervalItem timeIntervalItem;
        if (i == 4) {
            KWHzl();
            C37908pFd.EZpvd(false);
            return;
        }
        if (i == 5) {
            EZpvd();
            C37908pFd.KWHzl();
            return;
        }
        oML oml = (oML) this.OLrzqt.KWHzl();
        if (oml == null || oml.AuCTel == null || (timeIntervalItem = (TimeIntervalItem) CollectionsKt___CollectionsKt.AkhnZx(C37830pCg.EZpvd.KWHzl(), i)) == null) {
            return;
        }
        this.copydefault.values().AEQbTJ(timeIntervalItem);
        C37908pFd.changeTimeEvent$default(timeIntervalItem.getTradingType(), false, 2, null);
    }

    private final void KWHzl() {
        C39339pqT c39339pqTNewInstance$default = C39339pqT.TaskDescription.newInstance$default(C39339pqT.Companion, false, false, 3, null);
        c39339pqTNewInstance$default.OLrzqt(new Function1() { // from class: o.por
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return TimeSettingUiComponent.KWHzl(this.KWHzl, (MarketTypeSelect) obj);
            }
        });
        FragmentManager childFragmentManager = this.copydefault.OLrzqt().getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        String simpleName = this.copydefault.OLrzqt().getClass().getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "");
        c39339pqTNewInstance$default.EZpvd(childFragmentManager, simpleName);
        c39339pqTNewInstance$default.KWHzl(new DialogInterface.OnDismissListener() { // from class: o.pou
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(android.content.DialogInterface dialogInterface) {
                TimeSettingUiComponent.KWHzl(this.KWHzl, dialogInterface);
            }
        });
    }

    public static final Unit KWHzl(TimeSettingUiComponent timeSettingUiComponent, MarketTypeSelect marketTypeSelect) {
        Intrinsics.checkNotNullParameter(marketTypeSelect, "");
        KlineQuoteViewModel klineQuoteViewModelValues = timeSettingUiComponent.copydefault.values();
        Object data = marketTypeSelect.getData();
        Intrinsics.copydefault(data, "");
        klineQuoteViewModelValues.AEQbTJ((TimeIntervalItem) data);
        Object data2 = marketTypeSelect.getData();
        Intrinsics.copydefault(data2, "");
        C37908pFd.changeTimeEvent$default(((TimeIntervalItem) data2).getTradingType(), false, 2, null);
        return Unit.INSTANCE;
    }

    public static final void KWHzl(TimeSettingUiComponent timeSettingUiComponent, DialogInterface dialogInterface) {
        C39816pzV c39816pzV;
        oML oml = (oML) timeSettingUiComponent.OLrzqt.KWHzl();
        if (oml == null || (c39816pzV = oml.getFieldNames) == null) {
            return;
        }
        c39816pzV.setData();
    }

    private final void EZpvd() {
        C36250oUv c36250oUv;
        TemplateSetting templateSettingWlaJM;
        oML oml = (oML) this.OLrzqt.KWHzl();
        if (oml == null || (c36250oUv = oml.AuCTel) == null || (templateSettingWlaJM = c36250oUv.wlaJM()) == null || templateSettingWlaJM.getSideIndicatorNames() == null) {
            return;
        }
        C39358pqm.TaskDescription taskDescription = C39358pqm.Companion;
        String strAuCTel = this.copydefault.AuCTel();
        if (strAuCTel == null) {
            strAuCTel = "";
        }
        C39358pqm c39358pqmNewInstance$default = C39358pqm.TaskDescription.newInstance$default(taskDescription, false, strAuCTel, 1, null);
        c39358pqmNewInstance$default.AEQbTJ(new Function1() { // from class: o.pop
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return TimeSettingUiComponent.EZpvd(this.EZpvd, (MarketTypeSelect) obj);
            }
        });
        c39358pqmNewInstance$default.KWHzl(new DialogInterface.OnDismissListener() { // from class: o.pol
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(android.content.DialogInterface dialogInterface) {
                TimeSettingUiComponent.EZpvd(this.KWHzl, dialogInterface);
            }
        });
        FragmentManager childFragmentManager = this.copydefault.OLrzqt().getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        String simpleName = this.copydefault.OLrzqt().getClass().getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "");
        c39358pqmNewInstance$default.EZpvd(childFragmentManager, simpleName);
    }

    public static final Unit EZpvd(TimeSettingUiComponent timeSettingUiComponent, MarketTypeSelect marketTypeSelect) {
        oML oml;
        C39756pyO c39756pyO;
        Intrinsics.checkNotNullParameter(marketTypeSelect, "");
        if (Intrinsics.EZpvd((Object) marketTypeSelect.getSelectTypeName(), (Object) "VOLUME") && !Intrinsics.EZpvd((Object) timeSettingUiComponent.copydefault.getNewProxyInstance(), (Object) "TYPE_KLINE")) {
            if (marketTypeSelect.getGroup() == 0 && (oml = (oML) timeSettingUiComponent.OLrzqt.KWHzl()) != null && (c39756pyO = oml.fIwbmz) != null) {
                c39756pyO.setMainIndicatorSelect();
            }
            return Unit.INSTANCE;
        }
        timeSettingUiComponent.copydefault.values().AEQbTJ(marketTypeSelect);
        C37908pFd.indicatorSelectFragmentEvent$default(marketTypeSelect.getSelectTypeName(), marketTypeSelect.isSelect(), marketTypeSelect.getGroup() == 0, false, null, 24, null);
        return Unit.INSTANCE;
    }

    public static final void EZpvd(TimeSettingUiComponent timeSettingUiComponent, DialogInterface dialogInterface) {
        C39816pzV c39816pzV;
        oML oml = (oML) timeSettingUiComponent.OLrzqt.KWHzl();
        if (oml == null || (c39816pzV = oml.getFieldNames) == null) {
            return;
        }
        c39816pzV.setData();
    }
}
