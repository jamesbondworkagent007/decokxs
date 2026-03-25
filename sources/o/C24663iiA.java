package o;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.okinc.business.dexlogic.bean.ContentTip;
import com.okinc.business.dexlogic.bean.CrossChainBridgeRulesData;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.iiA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C24663iiA extends AbstractC24712iix {
    public final CrossChainBridgeRulesData copydefault;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C24663iiA(@NotNull androidx.fragment.app.FragmentManager fragmentManager, android.app.Activity activity, @NotNull AbstractC23101hrq abstractC23101hrq, @NotNull InterfaceC22335hdS interfaceC22335hdS) {
        super(fragmentManager, activity, abstractC23101hrq);
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(abstractC23101hrq, "");
        Intrinsics.checkNotNullParameter(interfaceC22335hdS, "");
        this.copydefault = interfaceC22335hdS instanceof CrossChainBridgeRulesData ? (CrossChainBridgeRulesData) interfaceC22335hdS : null;
    }

    @Override // o.AbstractC24712iix
    public java.lang.String gEmmrt() {
        ContentTip contentTip;
        CrossChainBridgeRulesData crossChainBridgeRulesData = this.copydefault;
        java.lang.String title = (crossChainBridgeRulesData == null || (contentTip = crossChainBridgeRulesData.getContentTip()) == null) ? null : contentTip.getTitle();
        return title == null ? "" : title;
    }

    @Override // o.AbstractC24712iix
    public java.lang.String AEQbTJ() {
        ContentTip contentTip;
        CrossChainBridgeRulesData crossChainBridgeRulesData = this.copydefault;
        java.lang.String msg = (crossChainBridgeRulesData == null || (contentTip = crossChainBridgeRulesData.getContentTip()) == null) ? null : contentTip.getMsg();
        return msg == null ? "" : msg;
    }

    public boolean AYXKKw() {
        CrossChainBridgeRulesData crossChainBridgeRulesData = this.copydefault;
        if (crossChainBridgeRulesData != null) {
            return crossChainBridgeRulesData.isSwiftBridgeBlackList();
        }
        return false;
    }

    @Override // o.AbstractC24712iix
    public boolean OLrzqt(@NotNull Function0<Unit> function0, androidx.fragment.app.FragmentManager fragmentManager) {
        Intrinsics.checkNotNullParameter(function0, "");
        boolean zAYXKKw = AYXKKw();
        if (zAYXKKw) {
            AbstractC24712iix.showCheckDialog$default(this, fragmentManager, -1, C23274hvD.Fragment.setRccState, 0, 0, null, null, null, null, TypedValues.PositionType.TYPE_PERCENT_HEIGHT, null);
        }
        return zAYXKKw;
    }
}
