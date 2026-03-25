package o;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.okinc.business.defi.wallet.eip7702.data.model.EIP7702WalletStatus;
import com.okinc.business.defi.wallet.mine.walletmanage.viewmodel.EditWalletViewModel$getAllWalletAssets$1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.ActivityC17337fBp;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fEh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C17410fEh extends AbstractC33073mpa {
    public final MutableLiveData<java.util.List<fDL<java.lang.Object>>> AEQbTJ;
    public final C15274eCg EZpvd;
    public final MutableLiveData<java.lang.Boolean> OLrzqt;
    public final java.lang.String copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C17410fEh() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<java.util.List<fDL<java.lang.Object>>> EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (wrap:o.eCg:?: TERNARY null = ((wrap:int:0x0001: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:o.eCg:0x0007: CONSTRUCTOR (null o.eCh), (1 int), (null kotlin.jvm.internal.DefaultConstructorMarker) A[MD:(o.eCh, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:28) call: o.eCg.<init>(o.eCh, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r1v0 o.eCg))
 A[MD:(o.eCg):void (m)] (LINE:27) call: o.fEh.<init>(o.eCg):void type: THIS */
    public /* synthetic */ C17410fEh(C15274eCg c15274eCg, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new C15274eCg(null, 1, null) : c15274eCg);
    }

    public C17410fEh(@NotNull C15274eCg c15274eCg) {
        Intrinsics.checkNotNullParameter(c15274eCg, "");
        this.EZpvd = c15274eCg;
        this.AEQbTJ = new MutableLiveData<>();
        this.copydefault = C17410fEh.class.getName();
        this.OLrzqt = new MutableLiveData<>();
    }

    public final void copydefault() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new EditWalletViewModel$getAllWalletAssets$1(this, null), 3, null);
    }

    public final java.util.List<fDL<java.lang.Object>> KWHzl(java.util.List<? extends AbstractC12784ctX> list, java.util.Map<java.lang.String, ? extends EIP7702WalletStatus> map) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        boolean z = list.size() > 1;
        java.util.Iterator<? extends AbstractC12784ctX> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(OLrzqt(it.next(), z, map));
            arrayList.add(new fED());
        }
        arrayList.remove(yDY.AuCTel(arrayList));
        return arrayList;
    }

    public static /* synthetic */ ActivityC17337fBp.Application convertRootWallet2RootWalletGroupBean$default(C17410fEh c17410fEh, AbstractC12784ctX abstractC12784ctX, boolean z, java.util.Map map, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        return c17410fEh.OLrzqt(abstractC12784ctX, z, map);
    }

    public final ActivityC17337fBp.Application OLrzqt(AbstractC12784ctX abstractC12784ctX, boolean z, java.util.Map<java.lang.String, ? extends EIP7702WalletStatus> map) {
        return new ActivityC17337fBp.Application(abstractC12784ctX, false, z, map, 2, null);
    }

    public final void KWHzl() {
        this.OLrzqt.setValue(java.lang.Boolean.TRUE);
    }

    public final void OLrzqt() {
        this.OLrzqt.setValue(java.lang.Boolean.FALSE);
    }

    public final void AEQbTJ() {
        OLrzqt();
        copydefault();
    }
}
