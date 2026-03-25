package com.okinc.okex.deeplink;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.nfc.NdefMessage;
import android.nfc.NdefRecord;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.net.MailTo;
import androidx.core.splashscreen.SplashScreen;
import com.just.agentweb.DefaultWebClient;
import com.okinc.modular.deeplinkv2.LinkSource;
import java.util.Arrays;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import o.C59449zhJ;
import o.InterfaceC32484meU;
import o.InterfaceC32628mhF;
import o.pUU;
import o.yDV;

/* JADX INFO: loaded from: classes10.dex */
public final class SchemeActivity extends AppCompatActivity implements InterfaceC32628mhF {
    public static final Application Companion = new Application(null);
    private static final String[] URI_PREFIX_MAP = {"", "http://www.", "https://www.", DefaultWebClient.HTTP_SCHEME, DefaultWebClient.HTTPS_SCHEME, "tel:", MailTo.MAILTO_SCHEME, "ftp://anonymous:anonymous@", "ftp://ftp.", "ftps://", "sftp://", "smb://", "nfs://", "ftp://", "dav://", "news:", "telnet://", "imap:", "rtsp://", "urn:", "pop:", "sip:", "sips:", "tftp:", "btspp://", "btl2cap://", "btgoep://", "tcpobex://", "irdaobex://", "file://", "urn:epc:id:", "urn:epc:tag:", "urn:epc:pat:", "urn:epc:raw:", "urn:epc:"};

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okex.deeplink.SchemeActivity.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final String OLrzqt(byte[] bArr) {
            byte b = bArr[0];
            int length = bArr.length;
            String str = (String) yDV.gEmmrt(SchemeActivity.URI_PREFIX_MAP, b);
            if (str == null) {
                str = "";
            }
            return str + new String(bArr, 1, length - 1, Charsets.UTF_8);
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        Intent intent;
        Uri data;
        SplashScreen.Companion.installSplashScreen(this);
        sanitizeIntent(getIntent());
        super.onCreate(bundle);
        InterfaceC32484meU.Companion.KWHzl().iwGUEr();
        if (handleAppLink()) {
            return;
        }
        try {
            intent = getIntent();
        } catch (Throwable th) {
            pUU.AEQbTJ("SchemeActivity", "throwable when parse url from intent in onCreate", th);
        }
        String string = (intent == null || (data = intent.getData()) == null) ? null : data.toString();
        if (string == null || string.length() == 0) {
            finish();
        } else {
            handleUrl(string, LinkSource.EXTERNAL);
        }
    }

    private final void handleUrl(String str, LinkSource linkSource) {
        InterfaceC32484meU.Companion.KWHzl().copydefault(this, str, linkSource);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        sanitizeIntent(intent);
        super.onNewIntent(intent);
        handleAppLink();
    }

    private final void sanitizeIntent(Intent intent) {
        if (intent != null) {
            intent.replaceExtras(new Bundle());
        }
    }

    private final boolean handleAppLink() {
        String scheme;
        try {
            Intent intent = getIntent();
            String action = intent != null ? intent.getAction() : null;
            Intent intent2 = getIntent();
            Uri data = intent2 != null ? intent2.getData() : null;
            if (!Intrinsics.EZpvd((Object) action, (Object) "android.intent.action.VIEW")) {
                if (Intrinsics.EZpvd((Object) action, (Object) "android.nfc.action.NDEF_DISCOVERED")) {
                    return handleNfcLink();
                }
                return false;
            }
            if (data == null || (scheme = data.getScheme()) == null || !C59449zhJ.startsWith$default(scheme, "http", false, 2, null)) {
                return false;
            }
            String string = data.toString();
            Intrinsics.checkNotNullExpressionValue(string, "");
            return handleHttpLink(string);
        } catch (Throwable th) {
            pUU.AEQbTJ("SchemeActivity", "handleAppLink", th);
            return false;
        }
    }

    private final boolean handleHttpLink(String str) {
        handleUrl(str, LinkSource.EXTERNAL);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final boolean handleNfcLink() {
        NdefMessage[] ndefMessageArr;
        NdefMessage ndefMessage;
        if (Build.VERSION.SDK_INT >= 33) {
            Intent intent = getIntent();
            ndefMessageArr = intent != null ? (NdefMessage[]) intent.getParcelableArrayExtra("android.nfc.extra.NDEF_MESSAGES", NdefMessage.class) : null;
        } else {
            Intent intent2 = getIntent();
            Parcelable[] parcelableArrayExtra = intent2 != null ? intent2.getParcelableArrayExtra("android.nfc.extra.NDEF_MESSAGES") : null;
            if (parcelableArrayExtra instanceof NdefMessage[]) {
                ndefMessageArr = (NdefMessage[]) parcelableArrayExtra;
            }
        }
        if (ndefMessageArr != null && (ndefMessage = (NdefMessage) yDV.zsXlph(ndefMessageArr)) != null) {
            NdefRecord[] records = ndefMessage.getRecords();
            Intrinsics.checkNotNullExpressionValue(records, "");
            NdefRecord ndefRecord = (NdefRecord) yDV.zsXlph(records);
            if (ndefRecord == null || ndefRecord.getTnf() != 1 || !Arrays.equals(ndefRecord.getType(), NdefRecord.RTD_URI) || ndefRecord.getPayload().length > 2048) {
                return false;
            }
            Application application = Companion;
            byte[] payload = ndefRecord.getPayload();
            Intrinsics.checkNotNullExpressionValue(payload, "");
            String strOLrzqt = application.OLrzqt(payload);
            pUU.EZpvd("SchemeActivity", "nfc uri: " + strOLrzqt);
            Uri uri = Uri.parse(strOLrzqt);
            Intrinsics.checkNotNullExpressionValue(uri, "");
            String scheme = uri.getScheme();
            if (scheme != null && C59449zhJ.startsWith$default(scheme, "http", false, 2, null)) {
                handleUrl(strOLrzqt, LinkSource.NFC_TAG);
                return true;
            }
        }
        return false;
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
