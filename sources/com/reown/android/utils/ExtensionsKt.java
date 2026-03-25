package com.reown.android.utils;

import android.net.Uri;
import com.okinc.requests.ProtocolConstants;
import com.reown.android.Core;
import com.reown.android.internal.common.exception.GenericException;
import com.reown.android.internal.common.exception.InvalidProjectIdException;
import com.reown.android.internal.common.exception.ProjectIdDoesNotExistException;
import com.reown.android.internal.common.exception.UnableToConnectToWebsocketException;
import com.reown.android.internal.common.exception.WalletConnectException;
import com.reown.android.internal.common.model.AppMetaData;
import com.reown.android.internal.common.model.Redirect;
import com.reown.utils.UtilFunctionsKt;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C56523yIn;
import o.C56529yIt;
import o.yDV;
import o.yDY;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class ExtensionsKt {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final /* synthetic */ int getDefaultId(C56523yIn c56523yIn) {
        Intrinsics.checkNotNullParameter(c56523yIn, "");
        return -1;
    }

    public static final /* synthetic */ String strippedUrl(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        Uri uri = Uri.parse(str);
        return uri.getScheme() + "://" + uri.getAuthority();
    }

    public static final /* synthetic */ boolean isValidRelayServerUrl(String str) {
        Uri uri;
        String queryParameter;
        Intrinsics.checkNotNullParameter(str, "");
        return (!(StringsKt__StringsKt.fARcdN((CharSequence) str) ^ true) || (uri = Uri.parse(str)) == null || !yDV.valueOf(new String[]{ProtocolConstants.WSS, "ws"}, uri.getScheme()) || (queryParameter = uri.getQueryParameter("projectId")) == null || StringsKt__StringsKt.fARcdN((CharSequence) queryParameter)) ? false : true;
    }

    public static final /* synthetic */ String projectId(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        Uri uri = Uri.parse(str);
        Intrinsics.copydefault(uri);
        String queryParameter = uri.getQueryParameter("projectId");
        Intrinsics.copydefault((Object) queryParameter);
        Intrinsics.checkNotNullExpressionValue(queryParameter, "");
        return queryParameter;
    }

    public static final /* synthetic */ WalletConnectException getToWalletConnectException(Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        String message = th.getMessage();
        if (message != null && StringsKt__StringsKt.contains$default((CharSequence) message, (CharSequence) "401", false, 2, (Object) null)) {
            return new UnableToConnectToWebsocketException(th.getMessage() + ". It's possible that JWT has expired. Try initializing the CoreClient again.");
        }
        String message2 = th.getMessage();
        if (message2 != null && StringsKt__StringsKt.contains$default((CharSequence) message2, (CharSequence) "404", false, 2, (Object) null)) {
            return new ProjectIdDoesNotExistException("Project ID doesn't exist: " + th.getMessage());
        }
        String message3 = th.getMessage();
        if (message3 != null && StringsKt__StringsKt.contains$default((CharSequence) message3, (CharSequence) "403", false, 2, (Object) null)) {
            return new InvalidProjectIdException("Invalid project ID: " + th.getMessage());
        }
        return new GenericException("Error while connecting, please check your Internet connection or contact support: " + th.getMessage());
    }

    public static final Core.Model.AppMetaData toClient(AppMetaData appMetaData) {
        String empty;
        String empty2;
        String empty3;
        List<String> listAhwBna;
        Redirect redirect;
        Redirect redirect2;
        Redirect redirect3;
        if (appMetaData == null || (empty = appMetaData.getName()) == null) {
            empty = UtilFunctionsKt.getEmpty(C56529yIt.KWHzl);
        }
        String str = empty;
        if (appMetaData == null || (empty2 = appMetaData.getDescription()) == null) {
            empty2 = UtilFunctionsKt.getEmpty(C56529yIt.KWHzl);
        }
        String str2 = empty2;
        if (appMetaData == null || (empty3 = appMetaData.getUrl()) == null) {
            empty3 = UtilFunctionsKt.getEmpty(C56529yIt.KWHzl);
        }
        String str3 = empty3;
        if (appMetaData == null || (listAhwBna = appMetaData.getIcons()) == null) {
            listAhwBna = yDY.AhwBna();
        }
        List<String> list = listAhwBna;
        String universal = null;
        String str4 = (appMetaData == null || (redirect3 = appMetaData.getRedirect()) == null) ? null : redirect3.getNative();
        if (appMetaData != null && (redirect2 = appMetaData.getRedirect()) != null) {
            universal = redirect2.getUniversal();
        }
        return new Core.Model.AppMetaData(str, str2, str3, list, str4, universal, (appMetaData == null || (redirect = appMetaData.getRedirect()) == null) ? false : redirect.getLinkMode(), null, 128, null);
    }
}
