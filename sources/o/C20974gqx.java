package o;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import com.okinc.business.defi.biz.constant.MultiTransferMode;
import com.okinc.business.defi.biz.core.error.WalletImportError;
import com.okinc.business.defi.wallet.transfer.batch.multiTransferBean.AddressChildBean;
import com.okinc.business.defi.wallet.transfer.batch.multiTransferBean.AddressGroupBean;
import com.okinc.business.defi.wallet.transfer.batch.multiTransferBean.AddressSourceGroup;
import com.okinc.business.defi.wallet.tx.send.adapter.SendCoinGroup;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gqx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C20974gqx extends ViewModel {
    public MutableLiveData<java.util.ArrayList<AddressGroupBean>> AEQbTJ;
    public final InterfaceC20888gpQ AhwBna;
    public java.lang.Integer EZpvd;
    public final java.lang.String KWHzl;
    public long OLrzqt;
    public final dZL copydefault;

    /* JADX INFO: renamed from: o.gqx$StateListAnimator */
    public final /* synthetic */ class StateListAnimator {
        public static final /* synthetic */ int[] AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[AddressSourceGroup.values().length];
            try {
                iArr[AddressSourceGroup.RECENT.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[AddressSourceGroup.ADDRESS_BOOKS.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[AddressSourceGroup.MY_WALLET.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            AEQbTJ = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Integer EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<java.util.ArrayList<AddressGroupBean>> KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long copydefault() {
        return this.OLrzqt;
    }

    public C20974gqx(@NotNull InterfaceC20888gpQ interfaceC20888gpQ, @NotNull dZL dzl, @NotNull SavedStateHandle savedStateHandle) {
        Intrinsics.checkNotNullParameter(interfaceC20888gpQ, "");
        Intrinsics.checkNotNullParameter(dzl, "");
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        this.AhwBna = interfaceC20888gpQ;
        this.copydefault = dzl;
        this.AEQbTJ = new MutableLiveData<>();
        java.lang.String str = (java.lang.String) savedStateHandle.get("send_coin_group");
        this.KWHzl = str == null ? SendCoinGroup.DEFAULT.getGroup() : str;
        this.OLrzqt = -1L;
    }

    public final void AEQbTJ() {
        java.lang.Object objEZpvd = this.AhwBna.EZpvd();
        if (objEZpvd == null) {
            objEZpvd = -1L;
        }
        this.OLrzqt = C33129mqd.valueOf(objEZpvd);
        this.EZpvd = this.AhwBna.copydefault();
        java.util.ArrayList<AddressGroupBean> arrayListKWHzl = this.AhwBna.KWHzl();
        if (arrayListKWHzl == null) {
            arrayListKWHzl = new java.util.ArrayList<>();
        }
        this.AEQbTJ.postValue(AEQbTJ(arrayListKWHzl, AddressSourceGroup.valueOf(this.KWHzl)));
    }

    public final java.util.ArrayList<AddressGroupBean> AEQbTJ(@NotNull java.util.ArrayList<AddressGroupBean> arrayList, @NotNull AddressSourceGroup addressSourceGroup) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        Intrinsics.checkNotNullParameter(addressSourceGroup, "");
        int i = StateListAnimator.AEQbTJ[addressSourceGroup.ordinal()];
        if (i == 1) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (java.lang.Object obj : arrayList) {
                if (((AddressGroupBean) obj).getAddressGroup() == 3) {
                    arrayList2.add(obj);
                }
            }
            return new java.util.ArrayList<>(arrayList2);
        }
        if (i == 2) {
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            for (java.lang.Object obj2 : arrayList) {
                if (((AddressGroupBean) obj2).getAddressGroup() == 2) {
                    arrayList3.add(obj2);
                }
            }
            return new java.util.ArrayList<>(copydefault(new java.util.ArrayList(arrayList3)));
        }
        if (i != 3) {
            return arrayList;
        }
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        for (java.lang.Object obj3 : arrayList) {
            AddressGroupBean addressGroupBean = (AddressGroupBean) obj3;
            if (addressGroupBean.getAddressGroup() == 4 || addressGroupBean.getAddressGroup() == 1 || addressGroupBean.getAddressGroup() == 5) {
                arrayList4.add(obj3);
            }
        }
        return new java.util.ArrayList<>(arrayList4);
    }

    public final java.util.List<AddressGroupBean> copydefault(java.util.List<AddressGroupBean> list) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (AddressGroupBean addressGroupBean : list) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.util.Iterator<T> it = addressGroupBean.getDataList().iterator();
            while (it.hasNext()) {
                arrayList2.add((AddressChildBean) it.next());
            }
            arrayList.add(new AddressGroupBean(addressGroupBean.getAddressGroup(), addressGroupBean.getTitle(), new java.util.ArrayList(arrayList2), "", false, false, false, WalletImportError.ERROR_CODE_AA_EXIST, null));
        }
        return arrayList;
    }

    public final boolean AhwBna() {
        return valueOf() || gEmmrt();
    }

    public final boolean valueOf() {
        java.lang.Integer num = this.EZpvd;
        return num != null && num.intValue() == MultiTransferMode.MODE_ONE_TO_MANY.getValue();
    }

    public final boolean gEmmrt() {
        java.lang.Integer num = this.EZpvd;
        return num != null && num.intValue() == MultiTransferMode.MODE_MANY_TO_MANY.getValue();
    }
}
