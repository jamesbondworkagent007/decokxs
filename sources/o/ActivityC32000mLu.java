package o;

import androidx.core.content.ContextCompat;
import androidx.core.content.FileProvider;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.base.uploadlog.UpLoadLogException;
import com.okinc.base.uploadlog.UploadLogTriggerMethodEnum;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.core.util.SPUtils;
import com.okinc.debugbox.activity.DebugListActivity$initData$3$5;
import com.okinc.debugbox.activity.PhoneInfoActivity;
import com.okinc.debugbox.track.report.ReportMonitorManager;
import com.okinc.uilab.item.OKRegularCell;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineExceptionHandler;
import o.AbstractC8041avJ;
import o.C31976mKx;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mLu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class ActivityC32000mLu extends mKV {
    public static final Activity Companion = new Activity(null);
    public static final int EZpvd = 8;
    public C55230xfy AYXKKw;
    public ReportMonitorManager AhwBna;
    public StateListAnimator OLrzqt;
    public RecyclerView valueOf;
    public final InterfaceC56387yDm copydefault = C56392yDr.copydefault(new Function0() { // from class: o.mLD
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return ActivityC32000mLu.copydefault();
        }
    });
    public java.util.ArrayList<mMS> KWHzl = new java.util.ArrayList<>();
    public java.util.ArrayList<mMS> AEQbTJ = new java.util.ArrayList<>();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.mKV
    public int AEQbTJ() {
        return C31976mKx.Application.valueOf;
    }

    /* JADX INFO: renamed from: o.mLu$Application */
    public static final class Application extends AbstractC56429yFa implements CoroutineExceptionHandler {
        public Application(CoroutineExceptionHandler.Key key) {
            super(key);
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(CoroutineContext coroutineContext, java.lang.Throwable th) {
            C33134mqi.AEQbTJ("Export storage usage fail (导出存储使用情况失败) [" + th.getMessage() + "]");
        }
    }

    public final java.util.List<mMP> EZpvd() {
        return (java.util.List) this.copydefault.getValue();
    }

    public static final java.util.List copydefault() {
        java.util.List listKWHzl = C43251rlk.KWHzl(C56524yIo.AEQbTJ(mMP.class));
        if (listKWHzl != null) {
            return CollectionsKt___CollectionsKt.EZpvd(listKWHzl, new ActionBar());
        }
        return null;
    }

    @Override // o.mKV
    public void AEQbTJ(android.os.Bundle bundle) {
        ((C33537myN) findViewById(C31976mKx.Activity.AEQbTJ)).setAppBarTitle("Debug Tools (调试工具)");
        this.valueOf = (RecyclerView) findViewById(C31976mKx.Activity.ODXsMY);
        C55230xfy c55230xfy = (C55230xfy) findViewById(C31976mKx.Activity.OJuSTm);
        this.AYXKKw = c55230xfy;
        C55230xfy c55230xfy2 = null;
        if (c55230xfy == null) {
            Intrinsics.gEmmrt("");
            c55230xfy = null;
        }
        c55230xfy.KWHzl().setContentDescription("PandoraListViewSearchBarID");
        C55230xfy c55230xfy3 = this.AYXKKw;
        if (c55230xfy3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            c55230xfy2 = c55230xfy3;
        }
        c55230xfy2.KWHzl().addTextChangedListener(new TaskDescription());
    }

    /* JADX INFO: renamed from: o.mLu$TaskDescription */
    public static final class TaskDescription implements android.text.TextWatcher {
        @Override // android.text.TextWatcher
        public void beforeTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        public TaskDescription() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(android.text.Editable editable) {
            java.lang.String string;
            ActivityC32000mLu activityC32000mLu = ActivityC32000mLu.this;
            if (editable == null || (string = editable.toString()) == null) {
                string = "";
            }
            activityC32000mLu.EZpvd(string);
        }
    }

    @Override // o.mKV
    public void OLrzqt() {
        java.util.ArrayList<mMS> arrayList = new java.util.ArrayList<>();
        arrayList.add(new mMS("Device Info (设备信息)", PhoneInfoActivity.class, "PDDeviceInfoCellID"));
        arrayList.add(new mMS("WebView Test (网页测试)", mMM.class));
        arrayList.add(new mMS("Network Debugging (网络调试)", mLG.class));
        arrayList.add(new mMS("Analytics Debugging (埋点调试)", mKR.class));
        arrayList.add(new mMS("Dashboard Monitor (大盘上报监控)"));
        arrayList.add(new mMS("A/B Test Debug (灰度调试)", mKE.class, "PDABTestDebugCellID"));
        arrayList.add(new mMS("APK Fingerprint (安装包指纹)", mKX.class));
        arrayList.add(new mMS("Debug Mode (Debug模式)"));
        arrayList.add(new mMS("Mini Program (小程序)"));
        arrayList.add(new mMS("Upload Log (上传日志)"));
        arrayList.add(new mMS("Export Log (导出日志)", "PDExportLogCellID"));
        arrayList.add(new mMS("Change Currency Symbol (切换法币格式化符号)"));
        arrayList.add(new mMS("Device Disk Usage Report (设备磁盘使用报告)", "PDDeviceDiskUsageReport"));
        arrayList.add(new mMS("Mock Crash (模拟崩溃)", "Mock crash"));
        arrayList.add(new mMS("Fix for Android 14", "Fix the stuttering issue on Android 14"));
        java.util.List<mMP> listEZpvd = EZpvd();
        if (listEZpvd != null) {
            for (mMP mmp : listEZpvd) {
                if (mmp.supportRelease()) {
                    if (mmp.getPriority() == 0) {
                        arrayList.add(0, new mMS(mmp.name(), mmp, mmp.contentDesc()));
                    } else {
                        arrayList.add(new mMS(mmp.name(), mmp, mmp.contentDesc()));
                    }
                }
            }
        }
        this.KWHzl = arrayList;
        this.AEQbTJ = new java.util.ArrayList<>(this.KWHzl);
        RecyclerView recyclerView = this.valueOf;
        RecyclerView recyclerView2 = null;
        if (recyclerView == null) {
            Intrinsics.gEmmrt("");
            recyclerView = null;
        }
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        this.OLrzqt = new StateListAnimator(this);
        RecyclerView recyclerView3 = this.valueOf;
        if (recyclerView3 == null) {
            Intrinsics.gEmmrt("");
            recyclerView3 = null;
        }
        recyclerView3.setAdapter(this.OLrzqt);
        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(this, 1);
        android.graphics.drawable.Drawable drawable = ContextCompat.getDrawable(this, C31976mKx.ActionBar.KWHzl);
        if (drawable != null) {
            dividerItemDecoration.setDrawable(drawable);
        }
        RecyclerView recyclerView4 = this.valueOf;
        if (recyclerView4 == null) {
            Intrinsics.gEmmrt("");
        } else {
            recyclerView2 = recyclerView4;
        }
        recyclerView2.addItemDecoration(dividerItemDecoration);
        StateListAnimator stateListAnimator = this.OLrzqt;
        if (stateListAnimator != null) {
            stateListAnimator.OLrzqt(this.AEQbTJ);
        }
        StateListAnimator stateListAnimator2 = this.OLrzqt;
        if (stateListAnimator2 != null) {
            stateListAnimator2.copydefault(new AbstractC8041avJ.Activity() { // from class: o.mLs
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.AbstractC8041avJ.Activity
                public final void EZpvd(int i) {
                    ActivityC32000mLu.AEQbTJ(this.copydefault, i);
                }
            });
        }
    }

    /* JADX INFO: renamed from: o.mLu$ActionBar */
    public static final class ActionBar<T> implements java.util.Comparator {
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return yET.KWHzl(java.lang.Integer.valueOf(((mMP) t).getPriority()), java.lang.Integer.valueOf(((mMP) t2).getPriority()));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [148=9] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final void AEQbTJ(final ActivityC32000mLu activityC32000mLu, final int i) {
        Function2<android.content.Context, java.util.Map<java.lang.String, ? extends java.lang.Object>, Unit> function2OLrzqt;
        C32866mlf.onEvent$default("app_pandora_debug_click", "Click", "Block", null, new Function1() { // from class: o.mLB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC32000mLu.AEQbTJ(i, (EventParamsList) obj);
            }
        }, null, 20, null);
        mMS mms = activityC32000mLu.AEQbTJ.get(i);
        Intrinsics.checkNotNullExpressionValue(mms, "");
        mMS mms2 = mms;
        if (mms2.AEQbTJ() != null) {
            mms2.AEQbTJ().onClick();
            return;
        }
        if (activityC32000mLu.AEQbTJ.get(i).EZpvd() != null) {
            activityC32000mLu.startActivity(new android.content.Intent(activityC32000mLu, (java.lang.Class<?>) activityC32000mLu.AEQbTJ.get(i).EZpvd()));
            return;
        }
        java.lang.String strCopydefault = activityC32000mLu.AEQbTJ.get(i).copydefault();
        if (strCopydefault != null) {
            switch (strCopydefault.hashCode()) {
                case -1617328744:
                    if (strCopydefault.equals("Mock Crash (模拟崩溃)")) {
                        throw new java.lang.RuntimeException("Mock exception (模拟异常)");
                    }
                    return;
                case -1326462553:
                    if (strCopydefault.equals("Device Disk Usage Report (设备磁盘使用报告)")) {
                        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(activityC32000mLu), new Application(CoroutineExceptionHandler.Key), null, new DebugListActivity$initData$3$5(activityC32000mLu, null), 2, null);
                        return;
                    }
                    return;
                case -1175725728:
                    if (strCopydefault.equals("Debug Mode (Debug模式)")) {
                        boolean z = !SPUtils.getBoolean("BUGLY_DEV_DEVICE", false);
                        SPUtils.put("BUGLY_DEV_DEVICE", java.lang.Boolean.valueOf(z));
                        SPUtils.put("requests_dev_device", java.lang.Boolean.valueOf(z));
                        C33134mqi.AEQbTJ(java.lang.String.valueOf(z));
                        return;
                    }
                    return;
                case -1142702407:
                    if (strCopydefault.equals("Export Log (导出日志)")) {
                        try {
                            AbstractC58185ywX abstractC58185ywXAsyncGetLocalLogFiles$default = C6750aVK.asyncGetLocalLogFiles$default(C6750aVK.KWHzl, false, 1, null);
                            final Function1 function1 = new Function1() { // from class: o.mLx
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                @Override // kotlin.jvm.functions.Function1
                                public final java.lang.Object invoke(java.lang.Object obj) {
                                    return ActivityC32000mLu.KWHzl(this.EZpvd, (java.io.File) obj);
                                }
                            };
                            InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.mLA
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                @Override // o.InterfaceC58227yxM
                                public final void accept(java.lang.Object obj) {
                                    ActivityC32000mLu.AEQbTJ(function1, obj);
                                }
                            };
                            final Function1 function12 = new Function1() { // from class: o.mLy
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                @Override // kotlin.jvm.functions.Function1
                                public final java.lang.Object invoke(java.lang.Object obj) {
                                    return ActivityC32000mLu.KWHzl((java.lang.Throwable) obj);
                                }
                            };
                            abstractC58185ywXAsyncGetLocalLogFiles$default.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.mLE
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                @Override // o.InterfaceC58227yxM
                                public final void accept(java.lang.Object obj) {
                                    ActivityC32000mLu.EZpvd(function12, obj);
                                }
                            });
                            return;
                        } catch (java.lang.Exception e) {
                            C6777aVl.Companion.EZpvd(new UpLoadLogException("export log fail"));
                            C33134mqi.AEQbTJ("Export log fail (导出日志失败) [" + e.getMessage() + "]");
                            return;
                        }
                    }
                    return;
                case -1016489103:
                    if (strCopydefault.equals("Dashboard Monitor (大盘上报监控)")) {
                        if (activityC32000mLu.AhwBna == null) {
                            activityC32000mLu.AhwBna = new ReportMonitorManager(activityC32000mLu);
                        }
                        ReportMonitorManager reportMonitorManager = activityC32000mLu.AhwBna;
                        if (reportMonitorManager != null) {
                            reportMonitorManager.fetchVPNInfo();
                            return;
                        }
                        return;
                    }
                    return;
                case -500815658:
                    if (strCopydefault.equals("Fix for Android 14")) {
                        boolean z2 = SPUtils.getBoolean("FixAndroid14Switch", false);
                        SPUtils.put("FixAndroid14Switch", java.lang.Boolean.valueOf(!z2));
                        C33134mqi.AEQbTJ((!z2 ? "Enabled" : "Disabled") + ", please restart app");
                        return;
                    }
                    return;
                case 988259956:
                    if (strCopydefault.equals("Upload Log (上传日志)")) {
                        activityC32000mLu.showLoading();
                        C6750aVK.uploadLogs$default(C6750aVK.KWHzl, null, true, UploadLogTriggerMethodEnum.ACTIVE_UPLOAD, false, new Function2() { // from class: o.mLz
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function2
                            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                return ActivityC32000mLu.EZpvd(this.AEQbTJ, ((java.lang.Boolean) obj).booleanValue(), (java.lang.String) obj2);
                            }
                        }, 9, null);
                        return;
                    }
                    return;
                case 1426446297:
                    if (strCopydefault.equals("Mini Program (小程序)") && (function2OLrzqt = C43047rhs.AEQbTJ.OLrzqt().OLrzqt()) != null) {
                        function2OLrzqt.invoke(activityC32000mLu, C56424yEw.KWHzl());
                        return;
                    }
                    return;
                case 1661399163:
                    if (strCopydefault.equals("Change Currency Symbol (切换法币格式化符号)")) {
                        boolean z3 = SPUtils.getBoolean("CURRENCY_SYMBOL_FROM_ICU", false);
                        SPUtils.put("CURRENCY_SYMBOL_FROM_ICU", java.lang.Boolean.valueOf(!z3));
                        C33134mqi.AEQbTJ(!z3 ? "Currency symbol switched to ICU format. Please restart app (货币符号已切换到ICU格式，请重启应用)" : "Currency symbol switched to server format. Please restart app (货币符号已切换到服务器格式，请重启应用)");
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }

    public static final Unit AEQbTJ(int i, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("position", java.lang.String.valueOf(i), true);
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(ActivityC32000mLu activityC32000mLu, boolean z, java.lang.String str) {
        java.lang.String str2;
        if (z) {
            str2 = "Upload log success (上传日志成功)";
        } else {
            str2 = "Upload log failed (上传日志失败): " + str;
        }
        activityC32000mLu.dismissLoading();
        C33134mqi.AEQbTJ(str2);
        return Unit.INSTANCE;
    }

    public static final void AEQbTJ(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit KWHzl(ActivityC32000mLu activityC32000mLu, java.io.File file) {
        activityC32000mLu.KWHzl((android.content.Context) activityC32000mLu, file);
        return Unit.INSTANCE;
    }

    public static final void EZpvd(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit KWHzl(java.lang.Throwable th) {
        C33134mqi.AEQbTJ("Export log fail (导出日志失败) [" + th + "]");
        return Unit.INSTANCE;
    }

    public final void KWHzl(@NotNull android.content.Context context, java.io.File file) {
        Intrinsics.checkNotNullParameter(context, "");
        if (file != null && file.exists()) {
            android.content.Intent intent = new android.content.Intent("android.intent.action.SEND");
            android.net.Uri uriForFile = FileProvider.getUriForFile(context, getApplication().getPackageName() + ".share.logFileProvider", file);
            Intrinsics.checkNotNullExpressionValue(uriForFile, "");
            intent.putExtra("android.intent.extra.STREAM", uriForFile);
            intent.addFlags(1);
            intent.setType("application/x-zip-compressed");
            intent.setFlags(268435456);
            intent.addFlags(1);
            context.startActivity(android.content.Intent.createChooser(intent, "Share File (分享文件)"));
            return;
        }
        C33134mqi.AEQbTJ("Log file does not exist (日志文件不存在)");
    }

    public final void EZpvd(java.lang.String str) {
        this.AEQbTJ.clear();
        if (str.length() == 0) {
            this.AEQbTJ.addAll(this.KWHzl);
        } else {
            java.lang.String lowerCase = str.toLowerCase(java.util.Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "");
            for (mMS mms : this.KWHzl) {
                java.lang.String strCopydefault = mms.copydefault();
                Intrinsics.checkNotNullExpressionValue(strCopydefault, "");
                java.lang.String lowerCase2 = strCopydefault.toLowerCase(java.util.Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase2, "");
                if (StringsKt__StringsKt.contains$default((java.lang.CharSequence) lowerCase2, (java.lang.CharSequence) lowerCase, false, 2, (java.lang.Object) null)) {
                    this.AEQbTJ.add(mms);
                }
            }
        }
        StateListAnimator stateListAnimator = this.OLrzqt;
        if (stateListAnimator != null) {
            stateListAnimator.OLrzqt();
        }
        StateListAnimator stateListAnimator2 = this.OLrzqt;
        if (stateListAnimator2 != null) {
            stateListAnimator2.OLrzqt(this.AEQbTJ);
        }
    }

    /* JADX INFO: renamed from: o.mLu$StateListAnimator */
    /* JADX INFO: loaded from: classes15.dex */
    public static final class StateListAnimator extends AbstractC8041avJ<mMS> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(@NotNull android.content.Context context) {
            super(context);
            Intrinsics.checkNotNullParameter(context, "");
        }

        @Override // o.AbstractC8041avJ
        public AbstractC8033avB<?> KWHzl(@NotNull android.view.ViewGroup viewGroup, int i) {
            Intrinsics.checkNotNullParameter(viewGroup, "");
            return new Application(this, viewGroup);
        }

        /* JADX INFO: renamed from: o.mLu$StateListAnimator$Application */
        /* JADX INFO: loaded from: classes18.dex */
        public final class Application extends AbstractC8033avB<mMS> {
            public OKRegularCell KWHzl;
            public final /* synthetic */ StateListAnimator copydefault;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Application(@NotNull StateListAnimator stateListAnimator, android.view.ViewGroup viewGroup) {
                super(viewGroup, C31976mKx.Application.uzCIH);
                Intrinsics.checkNotNullParameter(viewGroup, "");
                this.copydefault = stateListAnimator;
                android.view.View viewAEQbTJ = AEQbTJ(C31976mKx.Activity.OHqIaq);
                Intrinsics.checkNotNullExpressionValue(viewAEQbTJ, "");
                this.KWHzl = (OKRegularCell) viewAEQbTJ;
            }

            /* JADX DEBUG: Method merged with bridge method: OLrzqt(Ljava/lang/Object;)V */
            @Override // o.AbstractC8033avB
            /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
            public void OLrzqt(mMS mms) {
                super.OLrzqt(mms);
                if (mms != null) {
                    OKRegularCell oKRegularCell = this.KWHzl;
                    java.lang.String strCopydefault = mms.copydefault();
                    Intrinsics.checkNotNullExpressionValue(strCopydefault, "");
                    oKRegularCell.setTitle(strCopydefault);
                    this.KWHzl.setContentDescription(mms.OLrzqt());
                }
            }
        }
    }

    /* JADX INFO: renamed from: o.mLu$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.mLu.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    @Override // o.mKV, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.mKV, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.mKV, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // o.mKV, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }

    @Override // o.mKV, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
    }
}
