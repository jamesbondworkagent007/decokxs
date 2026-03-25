package o;

import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.okinc.business.defi.wallet.tx.send.adapter.SendCoinGroup;
import com.okinc.business.defi.wallet.tx.send.receiveAddress.WalletSendCoinReceiveAddressViewModel$observeData$1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gHw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C19586gHw extends ViewModel {
    public final dZL AEQbTJ;
    public final InterfaceC19585gHv EZpvd;
    public final java.lang.String KWHzl;
    public final SharedFlow<java.util.List<C19574gHk>> OLrzqt;
    public final MutableSharedFlow<java.util.List<C19574gHk>> copydefault;

    /* JADX INFO: renamed from: o.gHw$Application */
    public final /* synthetic */ class Application {
        public static final /* synthetic */ int[] KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[SendCoinGroup.values().length];
            try {
                iArr[SendCoinGroup.RECENT.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[SendCoinGroup.ADDRESS_BOOKS.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[SendCoinGroup.MY_WALLET.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            KWHzl = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<java.util.List<C19574gHk>> AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.KWHzl;
    }

    public C19586gHw(@NotNull InterfaceC19585gHv interfaceC19585gHv, @NotNull dZL dzl, @NotNull SavedStateHandle savedStateHandle) {
        Intrinsics.checkNotNullParameter(interfaceC19585gHv, "");
        Intrinsics.checkNotNullParameter(dzl, "");
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        this.EZpvd = interfaceC19585gHv;
        this.AEQbTJ = dzl;
        MutableSharedFlow<java.util.List<C19574gHk>> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.copydefault = mutableSharedFlowMutableSharedFlow$default;
        this.OLrzqt = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
        java.lang.String str = (java.lang.String) savedStateHandle.get("send_coin_group");
        this.KWHzl = str == null ? SendCoinGroup.DEFAULT.getGroup() : str;
    }

    public final void KWHzl() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new WalletSendCoinReceiveAddressViewModel$observeData$1(this, null), 3, null);
    }

    public final java.util.ArrayList<C19574gHk> OLrzqt(java.util.ArrayList<C19574gHk> arrayList, SendCoinGroup sendCoinGroup) {
        int i = Application.KWHzl[sendCoinGroup.ordinal()];
        if (i == 1) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (java.lang.Object obj : arrayList) {
                if (((C19574gHk) obj).KWHzl() == 3) {
                    arrayList2.add(obj);
                }
            }
            return new java.util.ArrayList<>(arrayList2);
        }
        if (i == 2) {
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            for (java.lang.Object obj2 : arrayList) {
                if (((C19574gHk) obj2).KWHzl() == 2) {
                    arrayList3.add(obj2);
                }
            }
            return new java.util.ArrayList<>(EZpvd(new java.util.ArrayList(arrayList3)));
        }
        if (i != 3) {
            return arrayList;
        }
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        for (java.lang.Object obj3 : arrayList) {
            C19574gHk c19574gHk = (C19574gHk) obj3;
            if (c19574gHk.KWHzl() == 4 || c19574gHk.KWHzl() == 1 || c19574gHk.KWHzl() == 5) {
                arrayList4.add(obj3);
            }
        }
        return new java.util.ArrayList<>(arrayList4);
    }

    private final java.util.List<C19574gHk> EZpvd(java.util.List<C19574gHk> list) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (C19574gHk c19574gHk : list) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.util.Iterator<T> it = c19574gHk.copydefault().iterator();
            while (it.hasNext()) {
                arrayList2.add((C19577gHn) it.next());
            }
            arrayList.add(new C19574gHk(c19574gHk.KWHzl(), c19574gHk.AEQbTJ(), new java.util.ArrayList(arrayList2)));
        }
        return arrayList;
    }
}
