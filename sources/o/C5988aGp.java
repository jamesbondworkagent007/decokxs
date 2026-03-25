package o;

import com.okinc.auth.impl.passkey.model.AuthenticatorDisplayModel;
import com.okinc.auth.impl.passkey.model.CredentialType;
import com.okinc.auth.impl.passkey.model.GetAuthenticatorListResponse;
import java.util.Date;
import kotlin.jvm.internal.Intrinsics;
import o.C8206ayP;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.aGp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C5988aGp {
    public static final AuthenticatorDisplayModel AEQbTJ(@NotNull GetAuthenticatorListResponse.TaskDescription taskDescription, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        java.lang.String strAYXKKw;
        java.lang.String strAYXKKw2;
        CredentialType credentialType;
        java.lang.Long lValueOf;
        java.lang.Long lAhwBna;
        Intrinsics.checkNotNullParameter(taskDescription, "");
        java.util.List<GetAuthenticatorListResponse.Chain> listKWHzl = z4 ? taskDescription.KWHzl() : taskDescription.AEQbTJ();
        java.lang.String strEZpvd = taskDescription.EZpvd();
        if (strEZpvd == null) {
            strEZpvd = "";
        }
        java.lang.String strAYXKKw3 = taskDescription.AYXKKw();
        java.lang.String str = strAYXKKw3 != null ? strAYXKKw3 : "";
        java.util.List listAhwBna = null;
        if (taskDescription.AhwBna() != null && ((lAhwBna = taskDescription.AhwBna()) == null || lAhwBna.longValue() != 0)) {
            strAYXKKw = pTA.formatSimpleDateTime$default(new Date(taskDescription.AhwBna().longValue()), null, 1, null);
        } else {
            strAYXKKw = C33070mpX.AYXKKw(C8206ayP.Dialog.getNewProxyInstance);
        }
        if (taskDescription.valueOf() != null && ((lValueOf = taskDescription.valueOf()) == null || lValueOf.longValue() != 0)) {
            strAYXKKw2 = pTA.formatSimpleDateTime$default(new Date(taskDescription.valueOf().longValue()), null, 1, null);
        } else {
            strAYXKKw2 = C33070mpX.AYXKKw(C8206ayP.Dialog.getNewProxyInstance);
        }
        java.lang.Boolean boolGEmmrt = taskDescription.gEmmrt();
        int i = 0;
        boolean zBooleanValue = boolGEmmrt != null ? boolGEmmrt.booleanValue() : false;
        CredentialType[] credentialTypeArrValues = CredentialType.values();
        int length = credentialTypeArrValues.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                credentialType = null;
                break;
            }
            credentialType = credentialTypeArrValues[i2];
            if (Intrinsics.EZpvd((java.lang.Object) credentialType.getValue(), (java.lang.Object) taskDescription.copydefault())) {
                break;
            }
            i2++;
        }
        if (credentialType == null) {
            credentialType = CredentialType.UNKNOWN;
        }
        if (listKWHzl != null) {
            java.util.ArrayList<GetAuthenticatorListResponse.Chain> arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : listKWHzl) {
                if (Intrinsics.EZpvd((java.lang.Object) ((GetAuthenticatorListResponse.Chain) obj).getStatus(), (java.lang.Object) "1")) {
                    arrayList.add(obj);
                }
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (GetAuthenticatorListResponse.Chain chain : arrayList) {
                java.lang.String darkChainLogo = z3 ? chain.getDarkChainLogo() : chain.getLightChainLogo();
                if (darkChainLogo != null) {
                    arrayList2.add(darkChainLogo);
                }
            }
            listAhwBna = arrayList2;
        }
        if (listAhwBna == null) {
            listAhwBna = yDY.AhwBna();
        }
        if (listKWHzl != null && !listKWHzl.isEmpty()) {
            java.util.Iterator<T> it = listKWHzl.iterator();
            while (it.hasNext()) {
                if (Intrinsics.EZpvd((java.lang.Object) ((GetAuthenticatorListResponse.Chain) it.next()).getStatus(), (java.lang.Object) "1") && (i = i + 1) < 0) {
                    yDY.djBIcL();
                }
            }
        }
        return new AuthenticatorDisplayModel(strEZpvd, str, strAYXKKw, strAYXKKw2, zBooleanValue, credentialType, listAhwBna, i, listKWHzl == null ? yDY.AhwBna() : listKWHzl, false, z5, z6, z4, z, z2, 512, null);
    }
}
