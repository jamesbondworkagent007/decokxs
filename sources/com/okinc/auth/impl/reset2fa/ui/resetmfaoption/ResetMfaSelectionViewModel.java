package com.okinc.auth.impl.reset2fa.ui.resetmfaoption;

import androidx.autofill.HintConstants;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModelKt;
import com.okinc.auth.api.reset2fa.RebindMfaEntryPoint;
import com.okinc.auth.api.reset2fa.data.model.ResetMfaInitiateResponse;
import com.okinc.auth.impl.reset2fa.ui.resetmfaoption.ResetMfaSelectionViewModel;
import com.okinc.auth.impl.reset2fa.ui.resetmfaoption.ResetOption;
import com.okinc.network.okg.cor.SubdomainStrategy;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.AbstractC33073mpa;
import o.C32989mnw;
import o.C33129mqd;
import o.C56392yDr;
import o.C56403yEb;
import o.C6624aSp;
import o.InterfaceC56387yDm;
import o.yCM;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class ResetMfaSelectionViewModel extends AbstractC33073mpa {
    public final MutableLiveData<C32989mnw<Boolean>> AEQbTJ;
    public final LiveData<C32989mnw<String>> AYXKKw;
    public final MutableLiveData<C32989mnw<Unit>> AhwBna;
    public final LiveData<C32989mnw<Pair<String, ResetMfaInitiateResponse>>> AkhnZx;
    public final LiveData<C32989mnw<Unit>> AuCTel;
    public final LiveData<C32989mnw<String>> DbNXlk;
    public final MutableLiveData<C32989mnw<String>> EZpvd;
    public final MutableLiveData<List<ResetOption>> KWHzl;
    public final MutableLiveData<C32989mnw<Pair<String, ResetMfaInitiateResponse>>> OLrzqt;
    public final MutableLiveData<C32989mnw<String>> copydefault;
    public final InterfaceC56387yDm djBIcL;
    public final InterfaceC56387yDm fARcdN;
    public final InterfaceC56387yDm fIwbmz;
    public final LiveData<C32989mnw<String>> fJNWhG;
    public final LiveData<C32989mnw<Boolean>> fetchVPNInfo;
    public final MutableLiveData<C32989mnw<String>> gEmmrt;
    public final C6624aSp isConnected;
    public final LiveData<List<ResetOption>> valueOf;
    public final SavedStateHandle values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<C32989mnw<Pair<String, ResetMfaInitiateResponse>>> AYXKKw() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<List<ResetOption>> EZpvd() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<C32989mnw<String>> KWHzl() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<C32989mnw<Boolean>> copydefault() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<C32989mnw<Unit>> djBIcL() {
        return this.AuCTel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<C32989mnw<String>> gEmmrt() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<C32989mnw<String>> valueOf() {
        return this.fJNWhG;
    }

    @yCM
    public ResetMfaSelectionViewModel(@NotNull SavedStateHandle savedStateHandle, @NotNull C6624aSp c6624aSp) {
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        Intrinsics.checkNotNullParameter(c6624aSp, "");
        this.values = savedStateHandle;
        this.isConnected = c6624aSp;
        this.djBIcL = C56392yDr.copydefault(new Function0() { // from class: o.aTD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return ResetMfaSelectionViewModel.fetchVPNInfo(this.EZpvd);
            }
        });
        this.fIwbmz = C56392yDr.copydefault(new Function0() { // from class: o.aTH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return ResetMfaSelectionViewModel.DbNXlk(this.copydefault);
            }
        });
        this.fARcdN = C56392yDr.copydefault(new Function0() { // from class: o.aTL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return ResetMfaSelectionViewModel.isConnected(this.OLrzqt);
            }
        });
        MutableLiveData<List<ResetOption>> mutableLiveData = new MutableLiveData<>();
        this.KWHzl = mutableLiveData;
        this.valueOf = mutableLiveData;
        MutableLiveData<C32989mnw<Pair<String, ResetMfaInitiateResponse>>> mutableLiveData2 = new MutableLiveData<>();
        this.OLrzqt = mutableLiveData2;
        this.AkhnZx = mutableLiveData2;
        MutableLiveData<C32989mnw<String>> mutableLiveData3 = new MutableLiveData<>();
        this.copydefault = mutableLiveData3;
        this.AYXKKw = mutableLiveData3;
        MutableLiveData<C32989mnw<String>> mutableLiveData4 = new MutableLiveData<>();
        this.gEmmrt = mutableLiveData4;
        this.fJNWhG = mutableLiveData4;
        MutableLiveData<C32989mnw<Unit>> mutableLiveData5 = new MutableLiveData<>();
        this.AhwBna = mutableLiveData5;
        this.AuCTel = mutableLiveData5;
        MutableLiveData<C32989mnw<Boolean>> mutableLiveData6 = new MutableLiveData<>();
        this.AEQbTJ = mutableLiveData6;
        this.fetchVPNInfo = mutableLiveData6;
        MutableLiveData<C32989mnw<String>> mutableLiveData7 = new MutableLiveData<>();
        this.EZpvd = mutableLiveData7;
        this.DbNXlk = mutableLiveData7;
    }

    public final RebindMfaEntryPoint OLrzqt() {
        return (RebindMfaEntryPoint) this.djBIcL.getValue();
    }

    public static final RebindMfaEntryPoint fetchVPNInfo(ResetMfaSelectionViewModel resetMfaSelectionViewModel) {
        Object obj = resetMfaSelectionViewModel.values.get("KEY_ENTRY_POINT");
        if (obj != null) {
            return (RebindMfaEntryPoint) obj;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    public final String values() {
        return (String) this.fIwbmz.getValue();
    }

    public static final String DbNXlk(ResetMfaSelectionViewModel resetMfaSelectionViewModel) {
        return (String) resetMfaSelectionViewModel.values.get("KEY_SOURCE_MFA_TYPE");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SubdomainStrategy fetchVPNInfo() {
        return (SubdomainStrategy) this.fARcdN.getValue();
    }

    public static final SubdomainStrategy isConnected(ResetMfaSelectionViewModel resetMfaSelectionViewModel) {
        return (SubdomainStrategy) resetMfaSelectionViewModel.values.get("KEY_SUBDOMAIN_STRATEGY");
    }

    public final void copydefault(@NotNull List<? extends ResetOption> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.KWHzl.setValue(list);
    }

    public static /* synthetic */ List buildList$default(ResetMfaSelectionViewModel resetMfaSelectionViewModel, boolean z, boolean z2, boolean z3, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            z2 = false;
        }
        if ((i & 4) != 0) {
            z3 = false;
        }
        return resetMfaSelectionViewModel.EZpvd(z, z2, z3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [98=4] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0094  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List<ResetOption> EZpvd(boolean z, boolean z2, boolean z3) {
        boolean z4;
        if (C33129mqd.KWHzl((Collection) this.KWHzl.getValue())) {
            List<ResetOption> value = this.KWHzl.getValue();
            Intrinsics.copydefault(value);
            return value;
        }
        ArrayList arrayList = new ArrayList();
        if (z) {
            arrayList.add(ResetOption.Mobile.INSTANCE);
        }
        if (z2) {
            arrayList.add(ResetOption.Email.INSTANCE);
        }
        if (z3) {
            arrayList.add(ResetOption.AuthApp.INSTANCE);
        }
        ArrayList arrayList2 = new ArrayList(C56403yEb.AYXKKw(arrayList, 10));
        int i = 0;
        for (Object obj : arrayList) {
            if (i < 0) {
                yDY.AYXKKw();
            }
            ResetOption resetOption = (ResetOption) obj;
            String strValues = values();
            if (strValues == null) {
                z4 = false;
            } else {
                int iHashCode = strValues.hashCode();
                if (iHashCode != -1629195906) {
                    if (iHashCode != -682296506) {
                        if (iHashCode == 2048751704 && strValues.equals("KEY_SOURCE_EMAIL")) {
                            z4 = resetOption instanceof ResetOption.Email;
                        }
                    } else if (strValues.equals("KEY_SOURCE_MOBILE")) {
                        z4 = resetOption instanceof ResetOption.Mobile;
                    }
                } else if (strValues.equals("KEY_SOURCE_GA")) {
                    z4 = resetOption instanceof ResetOption.AuthApp;
                }
            }
            resetOption.setChecked(z4);
            arrayList2.add(resetOption);
            i++;
        }
        this.KWHzl.setValue(arrayList2);
        return arrayList2;
    }

    public final void AEQbTJ() {
        ArrayList arrayList = new ArrayList();
        List<ResetOption> value = this.KWHzl.getValue();
        if (value == null) {
            value = yDY.AhwBna();
        }
        ArrayList arrayList2 = new ArrayList(C56403yEb.AYXKKw(value, 10));
        for (ResetOption resetOption : value) {
            if (resetOption.getChecked()) {
                if (resetOption instanceof ResetOption.Mobile) {
                    arrayList.add("MOBILE");
                } else if (resetOption instanceof ResetOption.Email) {
                    arrayList.add("EMAIL");
                } else {
                    if (!(resetOption instanceof ResetOption.AuthApp)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    arrayList.add("AUTHENTICATOR");
                }
            }
            arrayList2.add(Unit.INSTANCE);
        }
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new ResetMfaSelectionViewModel$getInitiate$2(this, arrayList, null), 3, null);
    }

    public final String AhwBna() {
        StringBuilder sb = new StringBuilder();
        List<ResetOption> value = this.KWHzl.getValue();
        if (value == null) {
            value = yDY.AhwBna();
        }
        ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(value, 10));
        for (ResetOption resetOption : value) {
            if (resetOption.getChecked()) {
                if (resetOption instanceof ResetOption.Mobile) {
                    if (sb.length() > 0) {
                        sb.append("_");
                    }
                    sb.append(HintConstants.AUTOFILL_HINT_PHONE);
                } else if (resetOption instanceof ResetOption.Email) {
                    if (sb.length() > 0) {
                        sb.append("_");
                    }
                    sb.append("email");
                } else {
                    if (!(resetOption instanceof ResetOption.AuthApp)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    if (sb.length() > 0) {
                        sb.append("_");
                    }
                    sb.append("ga");
                }
            }
            arrayList.add(Unit.INSTANCE);
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }
}
