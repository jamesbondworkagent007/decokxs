package com.okinc.business.appupdate.debug;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.LocaleList;
import android.text.Editable;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.RadioGroup;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwnerKt;
import com.okinc.business.appupdate.R;
import com.okinc.business.appupdate.debug.UpgradePreviewActivity;
import com.okinc.business.appupdate.impl.AppUpdateServiceImplKt;
import com.okinc.business.appupdate.update.AlertContent;
import com.okinc.business.appupdate.update.AppRelease;
import com.okinc.business.appupdate.update.AppReleaseApi;
import com.okinc.business.appupdate.update.AppUpdateFragment;
import com.okinc.business.appupdate.update.AppUpdateInfo;
import com.okinc.business.appupdate.update.ReleaseNote;
import com.okinc.business.appupdate.update.UpgradeTypeDetail;
import com.okinc.core.util.SPUtils;
import com.okinc.di.LocalizeDIModule;
import com.okinc.localization.bean.LanguageItem;
import com.okinc.network.okg.response.ResponseData;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC52786wYh;
import o.AbstractC58185ywX;
import o.C33494mxX;
import o.C33527myD;
import o.C33537myN;
import o.C33567myr;
import o.C34703nhO;
import o.C43246rlf;
import o.C55001xbh;
import o.C55008xbo;
import o.C55018xby;
import o.C55276xgr;
import o.C55328xhq;
import o.C56391yDq;
import o.C56402yEa;
import o.C56403yEb;
import o.C56442yFn;
import o.C56443yFo;
import o.C57635ymD;
import o.C58113yvE;
import o.C59449zhJ;
import o.InterfaceC58227yxM;
import o.pTU;
import o.pUU;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final class UpgradePreviewActivity extends AppCompatActivity {
    public static final String LGO_TAG = "UpgradePreviewActivity";
    public static final String UPGRADE_PREVIEW_CHANNEL_KEY = "UPGRADE_PREVIEW_CHANNEL_KEY";
    public static final String UPGRADE_PREVIEW_LANGUAGE_CODE_KEY = "UPGRADE_PREVIEW_LANGUAGE_CODE_KEY";
    public static final String UPGRADE_PREVIEW_VERSION_KEY = "UPGRADE_PREVIEW_VERSION_KEY";
    private C33537myN appBar;
    private C55008xbo input_version;
    private RadioGroup radioGroup;
    private C55018xby select_language;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private HashMap<String, List<ReleaseNote>> map = new HashMap<>();
    private final pTU localizeService = ((LocalizeDIModule.Activity) C58113yvE.copydefault(C43246rlf.OLrzqt.valueOf(), LocalizeDIModule.Activity.class)).gkJEwt();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int setLayoutId() {
        return R.layout.activity_upgrade_preview;
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C33567myr.AEQbTJ((Activity) this, true);
        C33494mxX.copydefault.EZpvd((Activity) this, true);
        setContentView(setLayoutId());
        initView(bundle);
        initData();
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.appupdate.debug.UpgradePreviewActivity.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x00f0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void initView(Bundle bundle) {
        this.select_language = (C55018xby) findViewById(R.id.select_language);
        this.input_version = (C55008xbo) findViewById(R.id.input_version);
        this.appBar = (C33537myN) findViewById(R.id.titleBar);
        this.radioGroup = (RadioGroup) findViewById(R.id.radioGroup);
        C33537myN c33537myN = null;
        if (C34703nhO.AEQbTJ()) {
            RadioGroup radioGroup = this.radioGroup;
            if (radioGroup == null) {
                Intrinsics.gEmmrt("");
                radioGroup = null;
            }
            radioGroup.setVisibility(8);
        } else {
            RadioGroup radioGroup2 = this.radioGroup;
            if (radioGroup2 == null) {
                Intrinsics.gEmmrt("");
                radioGroup2 = null;
            }
            radioGroup2.setVisibility(0);
        }
        View viewFindViewById = findViewById(R.id.tv_version);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
        ((C57635ymD) viewFindViewById).setText("Version");
        C33537myN c33537myN2 = this.appBar;
        if (c33537myN2 == null) {
            Intrinsics.gEmmrt("");
            c33537myN2 = null;
        }
        c33537myN2.setSubTitle("Preview");
        C33537myN c33537myN3 = this.appBar;
        if (c33537myN3 == null) {
            Intrinsics.gEmmrt("");
            c33537myN3 = null;
        }
        c33537myN3.setTitle("Upgrade preview");
        C55008xbo c55008xbo = this.input_version;
        if (c55008xbo == null) {
            Intrinsics.gEmmrt("");
            c55008xbo = null;
        }
        c55008xbo.setText(SPUtils.getString(UPGRADE_PREVIEW_VERSION_KEY, ""));
        C55008xbo c55008xbo2 = this.input_version;
        if (c55008xbo2 == null) {
            Intrinsics.gEmmrt("");
            c55008xbo2 = null;
        }
        c55008xbo2.setLabelText("Version");
        String string = SPUtils.getString(UPGRADE_PREVIEW_CHANNEL_KEY, "");
        if (string == null) {
            RadioGroup radioGroup3 = this.radioGroup;
            if (radioGroup3 == null) {
                Intrinsics.gEmmrt("");
                radioGroup3 = null;
            }
            radioGroup3.check(R.id.rb_china);
        } else {
            int iHashCode = string.hashCode();
            if (iHashCode != 3179) {
                if (iHashCode != 3305) {
                    if (iHashCode == 94631255 && string.equals("china")) {
                        RadioGroup radioGroup4 = this.radioGroup;
                        if (radioGroup4 == null) {
                            Intrinsics.gEmmrt("");
                            radioGroup4 = null;
                        }
                        radioGroup4.check(R.id.rb_china);
                    }
                } else if (string.equals("gp")) {
                    RadioGroup radioGroup5 = this.radioGroup;
                    if (radioGroup5 == null) {
                        Intrinsics.gEmmrt("");
                        radioGroup5 = null;
                    }
                    radioGroup5.check(R.id.rb_gp);
                }
            } else if (string.equals("cn")) {
                RadioGroup radioGroup6 = this.radioGroup;
                if (radioGroup6 == null) {
                    Intrinsics.gEmmrt("");
                    radioGroup6 = null;
                }
                radioGroup6.check(R.id.rb_cn);
            }
        }
        RadioGroup radioGroup7 = this.radioGroup;
        if (radioGroup7 == null) {
            Intrinsics.gEmmrt("");
            radioGroup7 = null;
        }
        radioGroup7.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: com.okinc.business.appupdate.debug.UpgradePreviewActivity$$ExternalSyntheticLambda4
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.widget.RadioGroup.OnCheckedChangeListener
            public final void onCheckedChanged(RadioGroup radioGroup8, int i) {
                UpgradePreviewActivity.initView$lambda$0(this.f$0, radioGroup8, i);
            }
        });
        C33537myN c33537myN4 = this.appBar;
        if (c33537myN4 == null) {
            Intrinsics.gEmmrt("");
        } else {
            c33537myN = c33537myN4;
        }
        c33537myN.getSubTitle().setOnClickListener(new View.OnClickListener() { // from class: com.okinc.business.appupdate.debug.UpgradePreviewActivity$$ExternalSyntheticLambda5
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UpgradePreviewActivity.initView$lambda$1(this.f$0, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void initView$lambda$0(UpgradePreviewActivity upgradePreviewActivity, RadioGroup radioGroup, int i) {
        String str;
        RadioGroup radioGroup2 = upgradePreviewActivity.radioGroup;
        if (radioGroup2 == null) {
            Intrinsics.gEmmrt("");
            radioGroup2 = null;
        }
        int checkedRadioButtonId = radioGroup2.getCheckedRadioButtonId();
        if (checkedRadioButtonId != R.id.rb_china) {
            if (checkedRadioButtonId == R.id.rb_cn) {
                str = "cn";
            } else {
                str = checkedRadioButtonId == R.id.rb_gp ? "gp" : "china";
            }
        }
        SPUtils.put(UPGRADE_PREVIEW_CHANNEL_KEY, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$1(UpgradePreviewActivity upgradePreviewActivity, View view) {
        String string;
        Editable text;
        C55008xbo c55008xbo = upgradePreviewActivity.input_version;
        if (c55008xbo == null) {
            Intrinsics.gEmmrt("");
            c55008xbo = null;
        }
        C55001xbh c55001xbhAkhnZx = c55008xbo.AkhnZx();
        if (c55001xbhAkhnZx == null || (text = c55001xbhAkhnZx.getText()) == null || (string = text.toString()) == null) {
            string = "";
        }
        SPUtils.put(UPGRADE_PREVIEW_VERSION_KEY, string);
        String string2 = SPUtils.getString(UPGRADE_PREVIEW_LANGUAGE_CODE_KEY, "");
        String string3 = SPUtils.getString(UPGRADE_PREVIEW_CHANNEL_KEY, "");
        Intrinsics.copydefault((Object) string2);
        Intrinsics.copydefault((Object) string3);
        upgradePreviewActivity.showUpgradeDialog(string, string2, string3);
    }

    /* JADX INFO: renamed from: com.okinc.business.appupdate.debug.UpgradePreviewActivity$initData$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int invokeSuspend$lambda$6$lambda$5$lambda$4$lambda$3(C55276xgr c55276xgr) {
            return 0;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return UpgradePreviewActivity.this.new AnonymousClass1(continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:27:0x00a7  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object languageListFromLocal$default;
            List<C55276xgr> arrayList;
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                pTU ptu = UpgradePreviewActivity.this.localizeService;
                this.label = 1;
                languageListFromLocal$default = pTU.StateListAnimator.getLanguageListFromLocal$default(ptu, null, this, 1, null);
                if (languageListFromLocal$default == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                languageListFromLocal$default = obj;
            }
            List<LanguageItem> list = (List) languageListFromLocal$default;
            pUU.KWHzl(UpgradePreviewActivity.LGO_TAG, "getLanguageListFromLocal:" + (list != null ? C56443yFo.AEQbTJ(list.size()) : null));
            if (list != null && list.size() == 0) {
                C55328xhq.show$default(C55328xhq.OLrzqt, "获取多语言列表失败", (Drawable) null, 0, (Integer) null, 0, 0, 62, (Object) null);
            }
            if (list != null) {
                ArrayList arrayList2 = new ArrayList(C56403yEb.AYXKKw(list, 10));
                for (LanguageItem languageItem : list) {
                    arrayList2.add(new C55276xgr(languageItem.getDisplayName(), languageItem.getLanguageCode(), null, false, false, null, null, 124, null));
                }
                arrayList = CollectionsKt___CollectionsKt.fJNWhG((Collection) arrayList2);
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
            }
            final C55018xby c55018xby = UpgradePreviewActivity.this.select_language;
            if (c55018xby == null) {
                Intrinsics.gEmmrt("");
                c55018xby = null;
            }
            final UpgradePreviewActivity upgradePreviewActivity = UpgradePreviewActivity.this;
            final AbstractC52786wYh abstractC52786wYhOLrzqt = c55018xby.OLrzqt();
            if (abstractC52786wYhOLrzqt != null) {
                C55018xby.Activity activity = abstractC52786wYhOLrzqt instanceof C55018xby.Activity ? (C55018xby.Activity) abstractC52786wYhOLrzqt : null;
                if (activity != null) {
                    activity.EZpvd(new Function1() { // from class: com.okinc.business.appupdate.debug.UpgradePreviewActivity$initData$1$$ExternalSyntheticLambda0
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return UpgradePreviewActivity.AnonymousClass1.invokeSuspend$lambda$6$lambda$5$lambda$2(upgradePreviewActivity, c55018xby, abstractC52786wYhOLrzqt, (CharSequence) obj2);
                        }
                    });
                }
                Object objFirstOrNull = CollectionsKt___CollectionsKt.firstOrNull(arrayList);
                String string = SPUtils.getString(UpgradePreviewActivity.UPGRADE_PREVIEW_LANGUAGE_CODE_KEY, "");
                if (!TextUtils.isEmpty(string)) {
                    Intrinsics.copydefault((Object) string);
                    objFirstOrNull = upgradePreviewActivity.findDataByCode(arrayList, string);
                }
                pUU.KWHzl(UpgradePreviewActivity.LGO_TAG, "firstItem:" + objFirstOrNull);
                C55276xgr c55276xgr = (C55276xgr) objFirstOrNull;
                if (c55276xgr != null) {
                    abstractC52786wYhOLrzqt.copydefault(c55276xgr, new Function1() { // from class: com.okinc.business.appupdate.debug.UpgradePreviewActivity$initData$1$$ExternalSyntheticLambda1
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return Integer.valueOf(UpgradePreviewActivity.AnonymousClass1.invokeSuspend$lambda$6$lambda$5$lambda$4$lambda$3((C55276xgr) obj2));
                        }
                    });
                    Object objOLrzqt = c55276xgr.OLrzqt();
                    Intrinsics.copydefault(objOLrzqt, "");
                    SPUtils.put(UpgradePreviewActivity.UPGRADE_PREVIEW_LANGUAGE_CODE_KEY, (String) objOLrzqt);
                    c55276xgr.copydefault(true);
                }
            }
            c55018xby.setItems(arrayList);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$6$lambda$5$lambda$2(UpgradePreviewActivity upgradePreviewActivity, C55018xby c55018xby, AbstractC52786wYh abstractC52786wYh, CharSequence charSequence) {
            if (charSequence != null) {
                C55018xby c55018xby2 = upgradePreviewActivity.select_language;
                if (c55018xby2 == null) {
                    Intrinsics.gEmmrt("");
                    c55018xby2 = null;
                }
                C55276xgr c55276xgrFindDataByTitle = upgradePreviewActivity.findDataByTitle(c55018xby2.copydefault(), charSequence);
                Object objOLrzqt = c55276xgrFindDataByTitle != null ? c55276xgrFindDataByTitle.OLrzqt() : null;
                Intrinsics.copydefault(objOLrzqt, "");
                SPUtils.put(UpgradePreviewActivity.UPGRADE_PREVIEW_LANGUAGE_CODE_KEY, (String) objOLrzqt);
            }
            Context context = c55018xby.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            String string = SPUtils.getString(UpgradePreviewActivity.UPGRADE_PREVIEW_LANGUAGE_CODE_KEY, "");
            Intrinsics.checkNotNullExpressionValue(string, "");
            upgradePreviewActivity.setLocale(context, string);
            abstractC52786wYh.dismiss();
            upgradePreviewActivity.restart();
            return Unit.INSTANCE;
        }
    }

    public final void initData() {
        C55018xby c55018xby = this.select_language;
        if (c55018xby == null) {
            Intrinsics.gEmmrt("");
            c55018xby = null;
        }
        c55018xby.setLabelText("Language");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new AnonymousClass1(null), 3, null);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    public final void showUpgradeDialog(@NotNull final String str, @NotNull final String str2, @NotNull final String str3) {
        String str4;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        List<ReleaseNote> list = this.map.get(str3);
        if (list == null || list.size() == 0) {
            if (C34703nhO.AEQbTJ()) {
                str4 = "com.okx.tr";
            } else {
                str4 = str3.equals("cn") ? "com.okinc.okex" : "com.okinc.okex.gp";
            }
            String str5 = str4;
            pUU.KWHzl(LGO_TAG, "showUpgradeDialog channel:" + str3 + " appId:" + str5);
            AbstractC58185ywX abstractC58185ywXKWHzl = C33527myD.KWHzl(AppReleaseApi.DefaultImpls.getAppRelease$default(AppReleaseApi.Companion.getInstance(), str, null, str5, str3, 0, "fc5cd631bb49437ebe2f75a3d493f8d0", 18, null));
            final Function1 function1 = new Function1() { // from class: com.okinc.business.appupdate.debug.UpgradePreviewActivity$$ExternalSyntheticLambda0
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return UpgradePreviewActivity.showUpgradeDialog$lambda$2(this.f$0, str3, str2, str, (ResponseData) obj);
                }
            };
            InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: com.okinc.business.appupdate.debug.UpgradePreviewActivity$$ExternalSyntheticLambda1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(Object obj) {
                    function1.invoke(obj);
                }
            };
            final Function1 function12 = new Function1() { // from class: com.okinc.business.appupdate.debug.UpgradePreviewActivity$$ExternalSyntheticLambda2
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return UpgradePreviewActivity.showUpgradeDialog$lambda$4((Throwable) obj);
                }
            };
            abstractC58185ywXKWHzl.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: com.okinc.business.appupdate.debug.UpgradePreviewActivity$$ExternalSyntheticLambda3
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(Object obj) {
                    function12.invoke(obj);
                }
            });
            return;
        }
        pUU.KWHzl(LGO_TAG, "get releaseNotes form cache:" + list);
        for (ReleaseNote releaseNote : list) {
            String strReplace$default = C59449zhJ.replace$default(releaseNote.getLanguage(), "_", "-", false, 4, (Object) null);
            Locale locale = Locale.ROOT;
            String lowerCase = strReplace$default.toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "");
            String lowerCase2 = str2.toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(lowerCase2, "");
            if (lowerCase.equals(lowerCase2)) {
                showUpgradeDialog(this, str, releaseNote.getText());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showUpgradeDialog$lambda$2(UpgradePreviewActivity upgradePreviewActivity, String str, String str2, String str3, ResponseData responseData) {
        List<ReleaseNote> listAhwBna;
        AppRelease appRelease = (AppRelease) responseData.getData();
        if (appRelease == null || (listAhwBna = appRelease.getReleaseNotes()) == null) {
            listAhwBna = yDY.AhwBna();
        }
        pUU.KWHzl(LGO_TAG, "get releaseNotes form net:" + listAhwBna);
        if (listAhwBna != null && listAhwBna.size() > 0) {
            upgradePreviewActivity.map.put(str, listAhwBna);
            for (ReleaseNote releaseNote : listAhwBna) {
                String strReplace$default = C59449zhJ.replace$default(releaseNote.getLanguage(), "_", "-", false, 4, (Object) null);
                Locale locale = Locale.ROOT;
                String lowerCase = strReplace$default.toLowerCase(locale);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "");
                String lowerCase2 = str2.toLowerCase(locale);
                Intrinsics.checkNotNullExpressionValue(lowerCase2, "");
                if (lowerCase.equals(lowerCase2)) {
                    upgradePreviewActivity.showUpgradeDialog(upgradePreviewActivity, str3, releaseNote.getText());
                }
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showUpgradeDialog$lambda$4(Throwable th) {
        pUU.KWHzl(LGO_TAG, "get releaseNotes form net error:" + th);
        C55328xhq.show$default(C55328xhq.OLrzqt, th.getMessage(), (Drawable) null, 0, (Integer) null, 0, 0, 62, (Object) null);
        return Unit.INSTANCE;
    }

    public final C55276xgr findDataByTitle(@NotNull List<C55276xgr> list, @NotNull CharSequence charSequence) {
        Object next;
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(charSequence, "");
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.EZpvd(((C55276xgr) next).AhwBna(), charSequence)) {
                break;
            }
        }
        return (C55276xgr) next;
    }

    public final C55276xgr findDataByCode(@NotNull List<C55276xgr> list, @NotNull String str) {
        Object next;
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.EZpvd(((C55276xgr) next).OLrzqt(), (Object) str)) {
                break;
            }
        }
        return (C55276xgr) next;
    }

    public final void showUpgradeDialog(@NotNull AppCompatActivity appCompatActivity, @NotNull String str, @NotNull List<String> list) {
        AppUpdateFragment appUpdateFragmentNewInstance;
        Intrinsics.checkNotNullParameter(appCompatActivity, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        AlertContent alertContent = new AlertContent((String) null, (String) null, (List) null, (List) null, 15, (DefaultConstructorMarker) null);
        alertContent.setUrl("https://test.apk");
        alertContent.setLogoURL("https://static.coinall.ltd/cdn/assets/imgs/222/EC9C796F95059A3B.png");
        alertContent.setMessages(list);
        alertContent.setTitleList(C56402yEa.EZpvd(appCompatActivity.getResources().getString(R.string.pr_appupdate_dialog_header_upgrade_time)));
        AppUpdateInfo appUpdateInfo = new AppUpdateInfo(str, "1", alertContent, "690a25e39c600b815c86157052509154", (UpgradeTypeDetail) null, (Integer) null, (String) null, 96, (DefaultConstructorMarker) null);
        if (appCompatActivity.getSupportFragmentManager().findFragmentByTag(LGO_TAG) != null || (appUpdateFragmentNewInstance = AppUpdateFragment.Companion.newInstance(appUpdateInfo, AppUpdateServiceImplKt.getAppUpdateService().getUpdateProgress())) == null) {
            return;
        }
        FragmentManager supportFragmentManager = appCompatActivity.getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
        appUpdateFragmentNewInstance.show(supportFragmentManager, LGO_TAG);
    }

    public final void setLocale(@NotNull Context context, @NotNull String str) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        updateLocale(context, getLocal(str));
        recreate();
    }

    public final Locale getLocal(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        List<String> listSplitLanguageCode = splitLanguageCode(str);
        Locale locale = new Locale(str);
        if (listSplitLanguageCode.size() != 2) {
            return listSplitLanguageCode.size() == 1 ? new Locale(listSplitLanguageCode.get(0)) : locale;
        }
        String str2 = listSplitLanguageCode.get(0);
        Locale locale2 = Locale.ROOT;
        String lowerCase = str2.toLowerCase(locale2);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        String upperCase = listSplitLanguageCode.get(1).toUpperCase(locale2);
        Intrinsics.checkNotNullExpressionValue(upperCase, "");
        return new Locale(lowerCase, upperCase);
    }

    public final List<String> splitLanguageCode(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return StringsKt__StringsKt.split$default((CharSequence) str, new String[]{"-", ","}, false, 0, 6, (Object) null);
    }

    public final ContextWrapper updateLocale(@NotNull Context context, @NotNull Locale locale) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(locale, "");
        Locale.setDefault(locale);
        Configuration configuration = context.getResources().getConfiguration();
        configuration.screenLayout = 128;
        configuration.setLayoutDirection(locale);
        context.createConfigurationContext(configuration);
        return new ContextWrapper(context);
    }

    private final String checkLocaleStringExist(Activity activity, String str, int i) {
        pUU.KWHzl(LGO_TAG, "checkLocaleStringExist before:" + activity.getResources().getConfiguration().getLocales());
        Locale local = getLocal(str);
        pUU.KWHzl(LGO_TAG, "checkLocaleStringExist:" + local + " " + activity.getResources().getConfiguration().getLocales());
        Configuration configuration = new Configuration(activity.getResources().getConfiguration());
        configuration.setLocale(local);
        Context contextCreateConfigurationContext = activity.createConfigurationContext(configuration);
        pUU.KWHzl(LGO_TAG, "checkLocaleStringExist after:" + contextCreateConfigurationContext.getResources().getConfiguration().getLocales() + " " + activity.getResources().getConfiguration().getLocales());
        return contextCreateConfigurationContext.getResources().getString(i).toString();
    }

    public final void restart() {
        Intent intent = new Intent(this, (Class<?>) UpgradePreviewActivity.class);
        intent.addFlags(335544320);
        finish();
        startActivity(intent);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        String string = SPUtils.getString(UPGRADE_PREVIEW_LANGUAGE_CODE_KEY, "");
        Intrinsics.checkNotNullExpressionValue(string, "");
        Locale local = getLocal(string);
        pUU.KWHzl(LGO_TAG, "attachBaseContext sp locale: " + local);
        context.getResources().getConfiguration().setLayoutDirection(local);
        Resources resources = context.getResources();
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        Configuration configuration = resources.getConfiguration();
        configuration.locale = local;
        configuration.setLocales(new LocaleList(local));
        resources.updateConfiguration(configuration, displayMetrics);
        super.attachBaseContext(context);
        pUU.KWHzl(LGO_TAG, "attachBaseContext " + context.getResources().getConfiguration().getLocales());
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
