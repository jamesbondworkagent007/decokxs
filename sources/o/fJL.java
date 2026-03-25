package o;

import androidx.lifecycle.ViewModelKt;
import com.okinc.business.defi.api.bean.passkeywallet.cedefi.AccountType;
import com.okinc.business.defi.api.bean.passkeywallet.cedefi.BindEmailData;
import com.okinc.business.defi.api.bean.passkeywallet.cedefi.EmailOperationInput;
import com.okinc.business.defi.api.bean.passkeywallet.cedefi.EmailOperationSourceType;
import com.okinc.business.defi.wallet.passkey.cedefi.email.viewmodel.CeDeFiWalletEmailViewModel$loadUserEmailInfo$1;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class fJL extends AbstractC33073mpa {
    public final MutableSharedFlow<InterfaceC49371unL<BindEmailData>> AEQbTJ;
    public final SharedFlow<InterfaceC49371unL<BindEmailData>> EZpvd;
    public EmailOperationInput KWHzl;
    public final fJK OLrzqt;
    public Job copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(@NotNull EmailOperationInput emailOperationInput) {
        Intrinsics.checkNotNullParameter(emailOperationInput, "");
        this.KWHzl = emailOperationInput;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final EmailOperationInput KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<InterfaceC49371unL<BindEmailData>> OLrzqt() {
        return this.EZpvd;
    }

    public fJL(@NotNull fJK fjk) {
        Intrinsics.checkNotNullParameter(fjk, "");
        this.OLrzqt = fjk;
        MutableSharedFlow<InterfaceC49371unL<BindEmailData>> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(1, 0, null, 6, null);
        this.AEQbTJ = mutableSharedFlowMutableSharedFlow$default;
        this.EZpvd = mutableSharedFlowMutableSharedFlow$default;
        this.KWHzl = new EmailOperationInput((EmailOperationSourceType) null, (BindEmailData) null, (java.lang.String) null, 7, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ void loadUserEmailInfo$default(fJL fjl, AccountType accountType, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            accountType = AccountType.CeDeFi;
        }
        fjl.copydefault(accountType);
    }

    public final void copydefault(@NotNull AccountType accountType) {
        Intrinsics.checkNotNullParameter(accountType, "");
        Job job = this.copydefault;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (java.lang.Object) null);
        }
        this.copydefault = BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new CeDeFiWalletEmailViewModel$loadUserEmailInfo$1(this, accountType, null), 3, null);
    }

    public final boolean KWHzl(@NotNull java.lang.String str, @NotNull java.util.List<java.lang.String> list) {
        int iIndexOf$default;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        if (!AEQbTJ(str) || list.isEmpty() || (iIndexOf$default = StringsKt__StringsKt.indexOf$default((java.lang.CharSequence) str, '@', 0, false, 6, (java.lang.Object) null)) <= 0 || iIndexOf$default >= str.length() - 1) {
            return false;
        }
        java.lang.String strSubstring = str.substring(iIndexOf$default + 1);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "");
        java.lang.String lowerCase = strSubstring.toLowerCase(java.util.Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            if (C33129mqd.OLrzqt((java.lang.CharSequence) obj)) {
                arrayList.add(obj);
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(arrayList, 10));
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            java.lang.String lowerCase2 = ((java.lang.String) it.next()).toLowerCase(java.util.Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase2, "");
            arrayList2.add(lowerCase2);
        }
        return arrayList2.contains(lowerCase);
    }

    public final boolean AEQbTJ(java.lang.String str) {
        return new Regex("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$").matches(str);
    }
}
