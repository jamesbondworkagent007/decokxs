package o;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.okinc.business.defi.biz.constant.WalletType;
import com.okinc.business.defi.biz.net.bean.MoreFunctionInfo;
import com.okinc.business.defi.biz.net.bean.MoreFunctionModuleInfo;
import com.okinc.business.defi.biz.net.bean.SingleTeeStatus;
import com.okinc.business.defi.wallet.home.more.MoreFunctionViewModel$fetchMoreFunctionList$1;
import com.okinc.business.defi.wallet.home.more.MoreFunctionViewModel$refreshAccountTeeStatus$1;
import com.okinc.core.util.SPUtils;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import o.C13754dXa;
import o.InterfaceC13426dKx;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fbK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C18060fbK extends AbstractC33073mpa {
    public final fVJ AhwBna;
    public final MutableLiveData<java.util.List<MoreFunctionModuleInfo>> EZpvd;
    public final C18056fbG KWHzl;
    public final MutableLiveData<SingleTeeStatus> OLrzqt;
    public final LiveData<java.util.List<MoreFunctionModuleInfo>> copydefault;
    public final LiveData<SingleTeeStatus> gEmmrt;
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int AEQbTJ = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<java.util.List<MoreFunctionModuleInfo>> AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<SingleTeeStatus> EZpvd() {
        return this.gEmmrt;
    }

    public final void djBIcL() {
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (r1v0 o.fbG)
  (wrap:o.fVJ:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:o.fVJ:0x000c: INVOKE 
  (wrap:o.dKx:0x0008: INVOKE 
  (wrap:o.dKx$TaskDescription:0x0004: SGET  A[WRAPPED] (LINE:50) o.dKx.Companion o.dKx$TaskDescription)
  (null android.content.Context)
  (1 int)
  (null java.lang.Object)
 STATIC call: o.dKx.TaskDescription.getInstance$default(o.dKx$TaskDescription, android.content.Context, int, java.lang.Object):o.dKx A[MD:(o.dKx$TaskDescription, android.content.Context, int, java.lang.Object):o.dKx (m), WRAPPED] (LINE:50))
 INTERFACE call: o.dKx.getFieldNames():o.fVJ A[MD:():o.fVJ (m), WRAPPED] (LINE:50)) : (r2v0 o.fVJ))
 A[MD:(o.fbG, o.fVJ):void (m)] (LINE:48) call: o.fbK.<init>(o.fbG, o.fVJ):void type: THIS */
    public /* synthetic */ C18060fbK(C18056fbG c18056fbG, fVJ fvj, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(c18056fbG, (i & 2) != 0 ? InterfaceC13426dKx.TaskDescription.getInstance$default(InterfaceC13426dKx.Companion, null, 1, null).getFieldNames() : fvj);
    }

    public C18060fbK(@NotNull C18056fbG c18056fbG, @NotNull fVJ fvj) {
        Intrinsics.checkNotNullParameter(c18056fbG, "");
        Intrinsics.checkNotNullParameter(fvj, "");
        this.KWHzl = c18056fbG;
        this.AhwBna = fvj;
        MutableLiveData<java.util.List<MoreFunctionModuleInfo>> mutableLiveData = new MutableLiveData<>();
        this.EZpvd = mutableLiveData;
        this.copydefault = mutableLiveData;
        MutableLiveData<SingleTeeStatus> mutableLiveData2 = new MutableLiveData<>();
        this.OLrzqt = mutableLiveData2;
        this.gEmmrt = mutableLiveData2;
    }

    /* JADX INFO: renamed from: o.fbK$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.fbK.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C18060fbK(@NotNull C13934dbu c13934dbu) {
        this(new C18056fbG(c13934dbu), null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(c13934dbu, "");
    }

    public final void OLrzqt() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new MoreFunctionViewModel$fetchMoreFunctionList$1(this, null), 3, null);
    }

    public final void copydefault() {
        java.util.List<MoreFunctionModuleInfo> listKWHzl;
        java.lang.String string = SPUtils.getString("WalletMoreModuleInfo", "");
        try {
            C33489mxS c33489mxS = C33489mxS.KWHzl;
            KSerializer kSerializerListSerializer = BuiltinSerializersKt.ListSerializer(MoreFunctionModuleInfo.Companion.serializer());
            Intrinsics.copydefault((java.lang.Object) string);
            listKWHzl = (java.util.List) c33489mxS.OLrzqt((DeserializationStrategy) kSerializerListSerializer, string);
        } catch (java.lang.Exception e) {
            e.getMessage();
            listKWHzl = null;
        }
        if (listKWHzl == null) {
            listKWHzl = KWHzl();
        }
        this.EZpvd.setValue(listKWHzl);
    }

    public final java.util.List<MoreFunctionModuleInfo> KWHzl() {
        WalletType walletType = WalletType.HDWallet;
        int i = 0;
        java.util.List listGEmmrt = yDY.gEmmrt(java.lang.Integer.valueOf(walletType.ordinal()), java.lang.Integer.valueOf(WalletType.KeyWallet.ordinal()), java.lang.Integer.valueOf(WalletType.ConnectWallet.ordinal()), java.lang.Integer.valueOf(WalletType.TrackingWallet.ordinal()), java.lang.Integer.valueOf(WalletType.DemoWallet.ordinal()), java.lang.Integer.valueOf(WalletType.HardwareWallet.ordinal()), java.lang.Integer.valueOf(WalletType.MPCWallet.ordinal()), java.lang.Integer.valueOf(WalletType.AAWallet.ordinal()));
        java.lang.String strAYXKKw = C33070mpX.AYXKKw(C13754dXa.FragmentManager.ComponentActivity4);
        java.lang.String strAYXKKw2 = C33070mpX.AYXKKw(C13754dXa.FragmentManager.BackHandlerKtBackHandler3);
        C34704nhP c34704nhP = C34704nhP.copydefault;
        int i2 = 1;
        boolean z = false;
        java.lang.Integer num = null;
        java.lang.String str = null;
        java.lang.Integer num2 = null;
        int i3 = 1792;
        DefaultConstructorMarker defaultConstructorMarker = null;
        return C56402yEa.EZpvd(new MoreFunctionModuleInfo(strAYXKKw, yDY.gEmmrt(new MoreFunctionInfo(104, strAYXKKw2, "https://static.okx.com/cdn/wallet/banner/48275147-98aa-418f-8a67-4dd159af1c3b-web3_scan_day.png", "https://static.okx.com/cdn/wallet/banner/b9fb826f-044e-4b93-bc2e-e053cda7f2d7-web3_scan_night.png", c34704nhP.AEQbTJ() + "://web3/wallet/home/scan", i2, listGEmmrt, z, num, (java.lang.String) null, (java.lang.Integer) null, (java.lang.Integer) i, 1792, (DefaultConstructorMarker) null), new MoreFunctionInfo(104, C33070mpX.AYXKKw(C13754dXa.FragmentManager.BackHandlerKtBackHandler3), "https://static.okx.com/cdn/wallet/banner/48275147-98aa-418f-8a67-4dd159af1c3b-web3_scan_day.png", "https://static.okx.com/cdn/wallet/banner/b9fb826f-044e-4b93-bc2e-e053cda7f2d7-web3_scan_night.png", c34704nhP.AEQbTJ() + "://web3/wallet/home/scan", i2, listGEmmrt, z, num, str, num2, (java.lang.Integer) 1, 1792, (DefaultConstructorMarker) null), new MoreFunctionInfo(106, C33070mpX.AYXKKw(C13754dXa.FragmentManager.registerForActivityResultlambda0), "https://static.okx.com/cdn/wallet/banner/9ad2b617-f424-4462-ac2d-4a9684f7e318-multisenderlight.png", "https://static.okx.com/cdn/wallet/banner/2f5ee4ad-f1e0-4c31-a759-053ef20fffea-multisenderdark.png", c34704nhP.AEQbTJ() + "://web3/wallet/home/multiTransfer", i2, listGEmmrt, z, num, str, num2, (java.lang.Integer) i, i3, defaultConstructorMarker), new MoreFunctionInfo(103, C33070mpX.AYXKKw(C13754dXa.FragmentManager.handleMessage), "https://static.okx.com/cdn/wallet/banner/44e62771-f26c-4400-bfe4-61e4d99c2339-web3_add_accounts_day.png", "https://static.okx.com/cdn/wallet/banner/9b328f61-551f-403f-97e1-1101c4268050-web3_add_accounts_night.png", c34704nhP.AEQbTJ() + "://wallet/wallet/home/batchCreateAccount", i2, C56402yEa.EZpvd(java.lang.Integer.valueOf(walletType.ordinal())), z, num, str, num2, (java.lang.Integer) i, i3, defaultConstructorMarker))));
    }

    public final java.util.List<MoreFunctionModuleInfo> AEQbTJ(AbstractC12782ctV abstractC12782ctV) {
        java.util.List<MoreFunctionModuleInfo> listAEQbTJ;
        java.util.List<MoreFunctionModuleInfo> value = this.copydefault.getValue();
        return (value == null || (listAEQbTJ = C18061fbL.AEQbTJ(value, abstractC12782ctV)) == null) ? yDY.AhwBna() : listAEQbTJ;
    }

    public final void EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new MoreFunctionViewModel$refreshAccountTeeStatus$1(this, str, str2, null), 3, null);
    }
}
