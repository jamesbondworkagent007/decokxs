package com.okinc.debugbox.activity;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.provider.Settings;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.business.defi.api.model.tx.signdata.MultiTransferSignData;
import com.okinc.debugbox.activity.PhoneInfoActivity;
import com.okinc.localization.LocalizeResources;
import com.okinc.localization2.bean.AppLocale;
import com.okinc.network.okg.dns.DohTypeEnum;
import com.okinc.okuser.data.User;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonBuilder;
import kotlinx.serialization.json.JsonElementKt;
import kotlinx.serialization.json.JsonKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.AbstractC8033avB;
import o.AbstractC8041avJ;
import o.C31976mKx;
import o.C32864mld;
import o.C32866mlf;
import o.C33129mqd;
import o.C34703nhO;
import o.C43246rlf;
import o.C43292rmY;
import o.C43372rnz;
import o.C43384roK;
import o.C56403yEb;
import o.C59449zhJ;
import o.mLF;
import o.mMT;
import o.mMY;
import o.mOF;
import o.mPA;
import o.oJV;
import o.pTU;
import o.pUU;
import o.xVW;
import o.yCM;
import o.yDV;
import o.yDY;
import o.yFA;
import o.yFK;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
public final class PhoneInfoActivity extends mLF {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int OLrzqt = 8;
    public StateListAnimator AhwBna;
    public TextView DbNXlk;
    public RecyclerView fetchVPNInfo;
    public LinearLayout gEmmrt;
    public TextView isConnected;

    @yCM
    public pTU localizeService;
    public final ArrayList<mMT> valueOf = new ArrayList<>();
    public final Json AYXKKw = JsonKt.Json$default(null, new Function1() { // from class: o.mLX
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Object invoke(java.lang.Object obj) {
            return PhoneInfoActivity.KWHzl((JsonBuilder) obj);
        }
    }, 1, null);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.mKV
    public int AEQbTJ() {
        return C31976mKx.Application.DbNXlk;
    }

    /* JADX DEBUG: Possible override for method o.mLF.AYXKKw()V */
    public final pTU AYXKKw() {
        pTU ptu = this.localizeService;
        if (ptu != null) {
            return ptu;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    public static final Unit KWHzl(JsonBuilder jsonBuilder) {
        Intrinsics.checkNotNullParameter(jsonBuilder, "");
        jsonBuilder.setEncodeDefaults(true);
        jsonBuilder.setIgnoreUnknownKeys(true);
        jsonBuilder.setLenient(true);
        return Unit.INSTANCE;
    }

    @Override // o.mKV
    public void AEQbTJ(Bundle bundle) {
        this.gEmmrt = (LinearLayout) findViewById(C31976mKx.Activity.DXXBbs);
        this.isConnected = (TextView) findViewById(C31976mKx.Activity.Dmq);
        this.DbNXlk = (TextView) findViewById(C31976mKx.Activity.ixgjPv);
        this.fetchVPNInfo = (RecyclerView) findViewById(C31976mKx.Activity.ODXsMY);
        LinearLayout linearLayout = this.gEmmrt;
        TextView textView = null;
        if (linearLayout == null) {
            Intrinsics.gEmmrt("");
            linearLayout = null;
        }
        linearLayout.setOnClickListener(new View.OnClickListener() { // from class: o.mLW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                PhoneInfoActivity.EZpvd(this.OLrzqt, view);
            }
        });
        TextView textView2 = this.DbNXlk;
        if (textView2 == null) {
            Intrinsics.gEmmrt("");
        } else {
            textView = textView2;
        }
        textView.setOnClickListener(new View.OnClickListener() { // from class: o.mMc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                PhoneInfoActivity.copydefault(this.KWHzl, view);
            }
        });
    }

    public static final void EZpvd(PhoneInfoActivity phoneInfoActivity, View view) {
        phoneInfoActivity.finish();
    }

    public static final void copydefault(PhoneInfoActivity phoneInfoActivity, View view) {
        StringBuilder sb = new StringBuilder();
        Iterator<mMT> it = phoneInfoActivity.valueOf.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "");
        while (it.hasNext()) {
            mMT next = it.next();
            Intrinsics.checkNotNullExpressionValue(next, "");
            mMT mmt = next;
            sb.append(mmt.copydefault());
            sb.append(":  ");
            sb.append(mmt.KWHzl());
            sb.append('\n');
        }
        Object systemService = phoneInfoActivity.getSystemService("clipboard");
        Intrinsics.copydefault(systemService, "");
        ((ClipboardManager) systemService).setPrimaryClip(ClipData.newPlainText(null, sb.toString()));
        Toast.makeText(phoneInfoActivity, "所有信息已经复制到剪贴板", 0).show();
    }

    @Override // o.mKV
    public void OLrzqt() {
        this.valueOf.add(new mMT("DeviceID", xVW.copydefault(), "PDDeviceIDCell", null, "PDDeviceIDValueCell"));
        User userOLrzqt = C43292rmY.OLrzqt.AwvSrB().OLrzqt();
        RecyclerView recyclerView = null;
        String tk = userOLrzqt != null ? userOLrzqt.getTk() : null;
        if (tk == null) {
            tk = "";
        }
        this.valueOf.add(new mMT("User tk", tk));
        C32864mld c32864mld = C32864mld.OLrzqt;
        String strInvoke = c32864mld.AhwBna().invoke();
        String str = AbstractJsonLexerKt.NULL;
        if (strInvoke == null) {
            strInvoke = AbstractJsonLexerKt.NULL;
        }
        this.valueOf.add(new mMT("Amplitude DeviceId/AdvertisingId/GAID", strInvoke));
        String strInvoke2 = c32864mld.gEmmrt().invoke();
        if (strInvoke2 != null) {
            str = strInvoke2;
        }
        this.valueOf.add(new mMT("ByteDance DeviceId", str));
        this.valueOf.add(new mMT("ANDROID ID", Settings.System.getString(getContentResolver(), "android_id")));
        ArrayList<mMT> arrayList = this.valueOf;
        C43384roK c43384roK = C43384roK.KWHzl;
        arrayList.add(new mMT("UserAgent", c43384roK.copydefault()));
        this.valueOf.add(new mMT("WebUserAgent", c43384roK.valueOf()));
        ArrayList<mMT> arrayList2 = this.valueOf;
        mMY mmy = mMY.EZpvd;
        Function0<String> function0OLrzqt = mmy.OLrzqt();
        String strInvoke3 = function0OLrzqt != null ? function0OLrzqt.invoke() : null;
        if (strInvoke3 == null) {
            strInvoke3 = "";
        }
        arrayList2.add(new mMT("Push Channel", strInvoke3));
        ArrayList<mMT> arrayList3 = this.valueOf;
        Function0<String> function0KWHzl = mmy.KWHzl();
        String strInvoke4 = function0KWHzl != null ? function0KWHzl.invoke() : null;
        arrayList3.add(new mMT("Push DeviceToken", strInvoke4 == null ? "" : strInvoke4, null, null, "PDDeviceTokenValueCell"));
        this.valueOf.add(new mMT("OS Version", Build.VERSION.RELEASE));
        AppLocale appLocaleOLrzqt = AYXKKw().OLrzqt();
        this.valueOf.add(new mMT("OS language", appLocaleOLrzqt.getMarket() + ":" + appLocaleOLrzqt.getLanguageCode()));
        boolean zCopydefault = copydefault(this);
        String strAEQbTJ = AEQbTJ(this);
        mOF.KWHzl.OLrzqt(zCopydefault);
        this.valueOf.add(new mMT("Embedded Language Resources", zCopydefault + "," + strAEQbTJ + "," + oJV.AEQbTJ.values(), null, null, "valueEmbeddedLanguagePack"));
        boolean z = getResources() instanceof LocalizeResources;
        boolean z2 = C43246rlf.OLrzqt.valueOf().getResources() instanceof LocalizeResources;
        this.valueOf.add(new mMT("Localization Runtime Info", "pageHook:" + z + ", appHook:" + z2));
        this.valueOf.add(new mMT("App Name", C34703nhO.OLrzqt(getApplicationContext())));
        this.valueOf.add(new mMT("App PackageName", C34703nhO.KWHzl(getApplicationContext())));
        this.valueOf.add(new mMT("App Version", C34703nhO.valueOf(getApplicationContext()), "PDDeviceAppVersionCell", null, "PDDeviceAppVersionValueCell"));
        C43372rnz c43372rnz = C43372rnz.copydefault;
        DohTypeEnum dohTypeEnum = DohTypeEnum.HTTP;
        String host$default = C43372rnz.getHost$default(c43372rnz, dohTypeEnum, false, null, 4, null);
        DohTypeEnum dohTypeEnum2 = DohTypeEnum.V5;
        String host$default2 = C43372rnz.getHost$default(c43372rnz, dohTypeEnum2, false, null, 4, null);
        this.valueOf.add(new mMT("Other Info", "\n            " + host$default + ":" + (host$default != null ? c43372rnz.KWHzl(dohTypeEnum, host$default) : null) + "}\n            " + host$default2 + ":" + (host$default2 != null ? c43372rnz.KWHzl(dohTypeEnum2, host$default2) : null) + "}\n            "));
        RecyclerView recyclerView2 = this.fetchVPNInfo;
        if (recyclerView2 == null) {
            Intrinsics.gEmmrt("");
            recyclerView2 = null;
        }
        recyclerView2.setLayoutManager(new LinearLayoutManager(this));
        this.AhwBna = new StateListAnimator(this, this);
        RecyclerView recyclerView3 = this.fetchVPNInfo;
        if (recyclerView3 == null) {
            Intrinsics.gEmmrt("");
            recyclerView3 = null;
        }
        recyclerView3.setAdapter(this.AhwBna);
        RecyclerView recyclerView4 = this.fetchVPNInfo;
        if (recyclerView4 == null) {
            Intrinsics.gEmmrt("");
        } else {
            recyclerView = recyclerView4;
        }
        recyclerView.addItemDecoration(new mPA(ContextCompat.getColor(this, C31976mKx.TaskDescription.AEQbTJ), (int) getResources().getDimension(C31976mKx.StateListAnimator.AEQbTJ)));
        StateListAnimator stateListAnimator = this.AhwBna;
        Intrinsics.copydefault(stateListAnimator);
        stateListAnimator.OLrzqt(this.valueOf);
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[THROW, INVOKE, MOVE_EXCEPTION, THROW, MOVE_EXCEPTION] complete} */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    public final String AEQbTJ(Context context) {
        int size;
        try {
            String[] list = context.getAssets().list("");
            if (list == null || !yDV.valueOf(list, "startup_keys.json")) {
                size = -1;
            } else {
                InputStream inputStreamOpen = context.getAssets().open("startup_keys.json");
                Intrinsics.checkNotNullExpressionValue(inputStreamOpen, "");
                Reader inputStreamReader = new InputStreamReader(inputStreamOpen, Charsets.UTF_8);
                BufferedReader bufferedReader = inputStreamReader instanceof BufferedReader ? (BufferedReader) inputStreamReader : new BufferedReader(inputStreamReader, 8192);
                try {
                    String strAEQbTJ = yFK.AEQbTJ(bufferedReader);
                    yFA.copydefault(bufferedReader, null);
                    size = JsonElementKt.getJsonArray(this.AYXKKw.parseToJsonElement(strAEQbTJ)).size();
                } finally {
                }
            }
            return String.valueOf(size);
        } catch (Exception e) {
            pUU.OLrzqt(getTAG(), "hasEmbeddedStartupKeys error", e);
            return MultiTransferSignData.DEFAULT_INTERVAL;
        }
    }

    public final boolean copydefault(Activity activity) {
        if (C34703nhO.AEQbTJ()) {
            Locale localeForLanguageTag = Locale.forLanguageTag("tr-Mktr-TR");
            Intrinsics.checkNotNullExpressionValue(localeForLanguageTag, "");
            return copydefault(activity, localeForLanguageTag, "Hata ayıklama modu");
        }
        return copydefault(activity, new Locale("es", "419"), "Modo de depuración");
    }

    public final boolean copydefault(Activity activity, Locale locale, String str) {
        Configuration configuration = new Configuration(activity.getResources().getConfiguration());
        configuration.setLocale(locale);
        return Intrinsics.EZpvd((Object) createConfigurationContext(configuration).getText(C31976mKx.FragmentManager.EZpvd), (Object) str);
    }

    /* JADX INFO: loaded from: classes18.dex */
    public final class StateListAnimator extends AbstractC8041avJ<mMT> {
        public final /* synthetic */ PhoneInfoActivity DbNXlk;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(@NotNull PhoneInfoActivity phoneInfoActivity, Context context) {
            super(context);
            Intrinsics.checkNotNullParameter(context, "");
            this.DbNXlk = phoneInfoActivity;
        }

        @Override // o.AbstractC8041avJ
        public AbstractC8033avB<?> KWHzl(@NotNull ViewGroup viewGroup, int i) {
            Intrinsics.checkNotNullParameter(viewGroup, "");
            return new Activity(this, viewGroup);
        }

        public final class Activity extends AbstractC8033avB<mMT> {
            public final /* synthetic */ StateListAnimator AEQbTJ;
            public View EZpvd;
            public TextView OLrzqt;
            public TextView copydefault;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Activity(@NotNull StateListAnimator stateListAnimator, ViewGroup viewGroup) {
                super(viewGroup, C31976mKx.Application.zsXlph);
                Intrinsics.checkNotNullParameter(viewGroup, "");
                this.AEQbTJ = stateListAnimator;
                View viewAEQbTJ = AEQbTJ(C31976mKx.Activity.flVtFt);
                Intrinsics.checkNotNullExpressionValue(viewAEQbTJ, "");
                this.EZpvd = viewAEQbTJ;
                View viewAEQbTJ2 = AEQbTJ(C31976mKx.Activity.RKcVTr);
                Intrinsics.checkNotNullExpressionValue(viewAEQbTJ2, "");
                this.copydefault = (TextView) viewAEQbTJ2;
                View viewAEQbTJ3 = AEQbTJ(C31976mKx.Activity.DGUQLI);
                Intrinsics.checkNotNullExpressionValue(viewAEQbTJ3, "");
                this.OLrzqt = (TextView) viewAEQbTJ3;
            }

            /* JADX DEBUG: Method merged with bridge method: OLrzqt(Ljava/lang/Object;)V */
            @Override // o.AbstractC8033avB
            public void OLrzqt(mMT mmt) {
                super.OLrzqt(mmt);
                TextView textView = this.copydefault;
                Intrinsics.copydefault(mmt);
                textView.setText(mmt.copydefault());
                this.OLrzqt.setText(mmt.KWHzl());
                if (C33129mqd.OLrzqt((CharSequence) mmt.OLrzqt())) {
                    this.EZpvd.setContentDescription(mmt.OLrzqt());
                } else {
                    this.EZpvd.setContentDescription(EZpvd("item_" + mmt.copydefault()));
                }
                if (C33129mqd.OLrzqt((CharSequence) mmt.AEQbTJ())) {
                    this.copydefault.setContentDescription(mmt.AEQbTJ());
                } else {
                    this.copydefault.setContentDescription(EZpvd("title_" + mmt.copydefault()));
                }
                if (C33129mqd.OLrzqt((CharSequence) mmt.EZpvd())) {
                    this.OLrzqt.setContentDescription(mmt.EZpvd());
                    return;
                }
                this.OLrzqt.setContentDescription(EZpvd("value_" + mmt.copydefault()));
            }

            public final String EZpvd(String str) {
                String strIwGUEr;
                String lowerCase = C59449zhJ.replace$default(str, " ", "_", false, 4, (Object) null).toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "");
                List listSplit$default = StringsKt__StringsKt.split$default((CharSequence) lowerCase, new String[]{"_"}, false, 0, 6, (Object) null);
                ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(listSplit$default, 10));
                int i = 0;
                for (Object obj : listSplit$default) {
                    if (i < 0) {
                        yDY.AYXKKw();
                    }
                    String str2 = (String) obj;
                    if (i == 0) {
                        strIwGUEr = str2.toLowerCase(Locale.ROOT);
                        Intrinsics.checkNotNullExpressionValue(strIwGUEr, "");
                    } else {
                        strIwGUEr = C59449zhJ.iwGUEr(str2);
                    }
                    arrayList.add(strIwGUEr);
                    i++;
                }
                return CollectionsKt___CollectionsKt.joinToString$default(arrayList, "", null, null, 0, null, null, 62, null);
            }
        }
    }

    @Override // o.mLF, o.mKV, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        C32866mlf.onEvent$default("app_pandora_device_info_view", "Show", "page", null, null, null, 28, null);
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.debugbox.activity.PhoneInfoActivity.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    @Override // o.mLF, o.mKV, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.mLF, o.mKV, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.mLF, o.mKV, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }

    @Override // o.mLF, o.mKV, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }
}
