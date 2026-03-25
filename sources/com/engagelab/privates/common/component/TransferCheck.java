package com.engagelab.privates.common.component;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.engagelab.privates.common.global.MTGlobal;
import com.engagelab.privates.common.log.MTCommonLog;
import com.engagelab.privates.common.utils.RsaUitl;
import com.engagelab.privates.common.utils.StringUtil;
import java.net.URISyntaxException;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes2.dex */
public class TransferCheck {
    private static final String TAG = "TransferCheck";

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean isAllowTransfer(Context context, String str, String str2) {
        try {
            if (!StringUtil.get16MD5String(str).equals(RsaUitl.deRsa(str2))) {
                return false;
            }
            String transfer = MTGlobal.getTransfer(context);
            if (AbstractJsonLexerKt.NULL.equals(transfer) || TextUtils.isEmpty(transfer)) {
                return true;
            }
            try {
                for (String str3 : transfer.split("/")) {
                    if (context.getPackageManager().resolveActivity(parseUri(str), 0).activityInfo.name.equals(str3)) {
                        return true;
                    }
                }
            } catch (Throwable th) {
                MTCommonLog.w(TAG, "isAllowTransfer failed " + th.getMessage());
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static Intent parseUri(String str) throws URISyntaxException {
        if (TextUtils.isEmpty(str)) {
            MTCommonLog.w(TAG, "intent uri is null");
            return null;
        }
        Intent uri = Intent.parseUri(str, 4);
        Intent intent = new Intent(uri);
        uri.addCategory("android.intent.category.BROWSABLE");
        uri.setComponent(null);
        uri.setSelector(null);
        return intent;
    }
}
