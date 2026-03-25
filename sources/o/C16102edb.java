package o;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.InitializerViewModelFactoryBuilder;
import com.okinc.business.defi.biz.net.bean.AAAddressCheck;
import com.okinc.business.defi.biz.net.bean.AddressCheckRes;
import com.okinc.business.defi.wallet.connect.viewmodel.AddressTrackCheckViewModel$aaAddressCheck$1;
import com.okinc.business.defi.wallet.connect.viewmodel.AddressTrackCheckViewModel$addressCheck$1;
import kotlin.Result;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import o.C16102edb;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.edb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C16102edb extends ViewModel {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int EZpvd = 8;
    public final C16035ecN AEQbTJ;
    public final kotlinx.coroutines.channels.Channel<Result<AddressCheckRes>> KWHzl;
    public final C16032ecK OLrzqt;
    public final kotlinx.coroutines.channels.Channel<Result<AAAddressCheck>> copydefault;

    /* JADX INFO: renamed from: o.edb$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.edb.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public static final C16102edb copydefault(CreationExtras creationExtras) {
            Intrinsics.checkNotNullParameter(creationExtras, "");
            C13934dbu c13934dbu = new C13934dbu();
            return new C16102edb(new C16032ecK(c13934dbu, C10954byG.EZpvd.valueOf()), new C16035ecN(c13934dbu));
        }

        public final ViewModelProvider.Factory OLrzqt() {
            InitializerViewModelFactoryBuilder initializerViewModelFactoryBuilder = new InitializerViewModelFactoryBuilder();
            initializerViewModelFactoryBuilder.addInitializer(C56524yIo.AEQbTJ(C16102edb.class), new Function1() { // from class: o.ecZ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C16102edb.ActionBar.copydefault((CreationExtras) obj);
                }
            });
            return initializerViewModelFactoryBuilder.build();
        }
    }

    public C16102edb(@NotNull C16032ecK c16032ecK, @NotNull C16035ecN c16035ecN) {
        Intrinsics.checkNotNullParameter(c16032ecK, "");
        Intrinsics.checkNotNullParameter(c16035ecN, "");
        this.OLrzqt = c16032ecK;
        this.AEQbTJ = c16035ecN;
        this.KWHzl = ChannelKt.Channel$default(Integer.MAX_VALUE, null, null, 6, null);
        this.copydefault = ChannelKt.Channel$default(Integer.MAX_VALUE, null, null, 6, null);
    }

    public final Flow<Result<AddressCheckRes>> EZpvd() {
        return FlowKt.receiveAsFlow(this.KWHzl);
    }

    public final Flow<Result<AAAddressCheck>> copydefault() {
        return FlowKt.receiveAsFlow(this.copydefault);
    }

    public final void OLrzqt(@NotNull java.lang.String str, long j) {
        Intrinsics.checkNotNullParameter(str, "");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new AddressTrackCheckViewModel$addressCheck$1(this, str, j, null), 3, null);
    }

    public final void EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new AddressTrackCheckViewModel$aaAddressCheck$1(this, str, null), 3, null);
    }
}
