package com.okinc.im.imui.group.announcement;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Checkable;
import androidx.appcompat.widget.Toolbar;
import androidx.core.os.BundleKt;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.im.imui.group.announcement.CreateEditNoticeActivity;
import com.okinc.im.imui.group.announcement.viewmodel.CreateEditNoticeViewModel;
import com.okinc.okimcore.model.other.GroupInfo;
import com.okinc.okimcore.model.utility.GroupAnnouncementInfo;
import com.okinc.p2p.api.OtcExtraKeys;
import com.okinc.uilab.edit.OKEditText;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.FlowKt;
import o.AbstractActivityC34066nQd;
import o.C33129mqd;
import o.C33516mxt;
import o.C33570myu;
import o.C35399nuc;
import o.C52794wYp;
import o.C55296xhK;
import o.C56390yDp;
import o.C56444yFp;
import o.C56524yIo;
import o.InterfaceC56387yDm;
import o.InterfaceC56445yFq;
import o.nHV;
import o.pTB;
import o.rVN;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final class CreateEditNoticeActivity extends AbstractActivityC34066nQd<nHV> {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int EZpvd = 8;
    public GroupAnnouncementInfo KWHzl;
    public final InterfaceC56387yDm gEmmrt;
    public final int OLrzqt = C35399nuc.Dialog.AhwBna;
    public Mode AEQbTJ = Mode.CREATE;

    /* JADX INFO: loaded from: classes18.dex */
    public final /* synthetic */ class Activity {
        public static final /* synthetic */ int[] EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[Mode.values().length];
            try {
                iArr[Mode.CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Mode.EDIT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            EZpvd = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractActivityC33044moy
    public int AEQbTJ() {
        return this.OLrzqt;
    }

    public CreateEditNoticeActivity() {
        final Function0 function0 = null;
        this.gEmmrt = new ViewModelLazy(C56524yIo.AEQbTJ(CreateEditNoticeViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.im.imui.group.announcement.CreateEditNoticeActivity$special$$inlined$viewModels$default$2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore = this.getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "");
                return viewModelStore;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.im.imui.group.announcement.CreateEditNoticeActivity$special$$inlined$viewModels$default$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory = this.getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "");
                return defaultViewModelProviderFactory;
            }
        }, new Function0<CreationExtras>() { // from class: com.okinc.im.imui.group.announcement.CreateEditNoticeActivity$special$$inlined$viewModels$default$3
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function02 = function0;
                if (function02 != null && (creationExtras = (CreationExtras) function02.invoke()) != null) {
                    return creationExtras;
                }
                CreationExtras defaultViewModelCreationExtras = this.getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "");
                return defaultViewModelCreationExtras;
            }
        });
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: classes18.dex */
    public static final class Mode {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ Mode[] $VALUES;
        public static final Mode CREATE = new Mode("CREATE", 0);
        public static final Mode EDIT = new Mode("EDIT", 1);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ Mode[] $values() {
            return new Mode[]{CREATE, EDIT};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<Mode> getEntries() {
            return $ENTRIES;
        }

        private Mode(String str, int i) {
        }

        static {
            Mode[] modeArr$values = $values();
            $VALUES = modeArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(modeArr$values);
        }

        public static Mode valueOf(String str) {
            return (Mode) Enum.valueOf(Mode.class, str);
        }

        public static Mode[] values() {
            return (Mode[]) $VALUES.clone();
        }
    }

    /* JADX DEBUG: Possible override for method o.nQd.OLrzqt()V */
    public final CreateEditNoticeViewModel OLrzqt() {
        return (CreateEditNoticeViewModel) this.gEmmrt.getValue();
    }

    @Override // o.AbstractActivityC34066nQd, o.AbstractActivityC33044moy, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        AYXKKw();
        AhwBna();
        C33516mxt.EZpvd(this);
        getWindow().getDecorView().post(new Runnable() { // from class: o.nQa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                CreateEditNoticeActivity.AYXKKw(this.OLrzqt);
            }
        });
    }

    public static final void AYXKKw(CreateEditNoticeActivity createEditNoticeActivity) {
        rVN.reportFullyDrawn$default((android.app.Activity) createEditNoticeActivity, true, (String) null, 2, (Object) null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r1v10, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    private final boolean AYXKKw() {
        String string;
        nHV nhv = (nHV) KWHzl();
        String stringExtra = getIntent().getStringExtra("info");
        String str = stringExtra == null ? "" : stringExtra;
        String stringExtra2 = getIntent().getStringExtra(OtcExtraKeys.MODE);
        if (stringExtra2 == null) {
            stringExtra2 = "CREATE";
        }
        this.AEQbTJ = Mode.valueOf(stringExtra2);
        Parcelable parcelableExtra = getIntent().getParcelableExtra("EXTRA_ANNOUNCEMENT");
        this.KWHzl = parcelableExtra instanceof GroupAnnouncementInfo ? (GroupAnnouncementInfo) parcelableExtra : null;
        nHV nhv2 = (nHV) KWHzl();
        Mode mode = this.AEQbTJ;
        int[] iArr = Activity.EZpvd;
        int i = iArr[mode.ordinal()];
        if (i == 1) {
            string = getString(C35399nuc.LoaderManager.HJWChPiaHEvk);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            string = getString(C35399nuc.LoaderManager.gLWkOL);
        }
        Intrinsics.copydefault((Object) string);
        Toolbar toolbar = nhv2.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(toolbar, "");
        setupActionBarTitle(toolbar, nhv2.KWHzl, string);
        OKEditText oKEditText = nhv.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(oKEditText, "");
        oKEditText.addTextChangedListener(new TaskDescription(nhv));
        C52794wYp c52794wYp = nhv.copydefault;
        c52794wYp.setOnClickListener(new Application(c52794wYp, 1000L, this, nhv, str));
        nhv.OLrzqt.setNavigationOnClickListener(new View.OnClickListener() { // from class: o.nPX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                CreateEditNoticeActivity.copydefault(this.KWHzl, view);
            }
        });
        int i2 = iArr[this.AEQbTJ.ordinal()];
        if (i2 == 1) {
            AEQbTJ(0);
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            OKEditText oKEditText2 = nhv.AEQbTJ;
            GroupAnnouncementInfo groupAnnouncementInfo = this.KWHzl;
            oKEditText2.setText(groupAnnouncementInfo != null ? groupAnnouncementInfo.getContent() : null);
        }
        return nhv.AEQbTJ.requestFocus();
    }

    public static final class TaskDescription implements TextWatcher {
        public final /* synthetic */ nHV AEQbTJ;

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public TaskDescription(nHV nhv) {
            this.AEQbTJ = nhv;
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            String strGEmmrt = C33129mqd.gEmmrt(charSequence);
            boolean z = false;
            int iCodePointCount = strGEmmrt.codePointCount(0, strGEmmrt.length());
            CreateEditNoticeActivity.this.AEQbTJ(iCodePointCount);
            C52794wYp c52794wYp = this.AEQbTJ.copydefault;
            if (iCodePointCount > 0 && !CreateEditNoticeActivity.this.OLrzqt().AYXKKw().getValue().booleanValue()) {
                z = true;
            }
            c52794wYp.setEnabled(z);
        }
    }

    public static final void copydefault(CreateEditNoticeActivity createEditNoticeActivity, View view) {
        createEditNoticeActivity.finish();
    }

    private final void AhwBna() {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new CreateEditNoticeActivity$observeData$1(this, null), 3, null);
        FlowKt.launchIn(FlowKt.onEach(OLrzqt().KWHzl(), new CreateEditNoticeActivity$observeData$2(null)), LifecycleOwnerKt.getLifecycleScope(this));
        FlowKt.launchIn(FlowKt.onEach(OLrzqt().OLrzqt(), new CreateEditNoticeActivity$observeData$3(this, null)), LifecycleOwnerKt.getLifecycleScope(this));
        FlowKt.launchIn(FlowKt.onEach(OLrzqt().copydefault(), new CreateEditNoticeActivity$observeData$4(this, null)), LifecycleOwnerKt.getLifecycleScope(this));
        FlowKt.launchIn(FlowKt.onEach(OLrzqt().AEQbTJ(), new CreateEditNoticeActivity$observeData$5(this, null)), LifecycleOwnerKt.getLifecycleScope(this));
        FlowKt.launchIn(FlowKt.onEach(OLrzqt().EZpvd(), new CreateEditNoticeActivity$observeData$6(this, null)), LifecycleOwnerKt.getLifecycleScope(this));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public final void AEQbTJ(int i) {
        ((nHV) KWHzl()).EZpvd.setText(pTB.formatLocalized$default(C33129mqd.gEmmrt(Integer.valueOf(i)), null, 1, null) + "/" + pTB.formatLocalized$default(C33129mqd.gEmmrt(2000), null, 1, null));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void gEmmrt() {
        C33570myu.AEQbTJ((Context) this, (View) ((nHV) KWHzl()).AEQbTJ);
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.im.imui.group.announcement.CreateEditNoticeActivity.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final Intent KWHzl(@NotNull Context context, @NotNull GroupInfo groupInfo) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(groupInfo, "");
            Intent intent = new Intent(context, (Class<?>) CreateEditNoticeActivity.class);
            intent.putExtras(BundleKt.bundleOf(C56390yDp.OLrzqt("info", groupInfo.getGroupId()), C56390yDp.OLrzqt(OtcExtraKeys.MODE, "CREATE")));
            return intent;
        }

        public final Intent AEQbTJ(@NotNull Context context, @NotNull GroupAnnouncementInfo groupAnnouncementInfo) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(groupAnnouncementInfo, "");
            Intent intent = new Intent(context, (Class<?>) CreateEditNoticeActivity.class);
            intent.putExtras(BundleKt.bundleOf(C56390yDp.OLrzqt("info", groupAnnouncementInfo.getGroupId()), C56390yDp.OLrzqt("EXTRA_ANNOUNCEMENT", groupAnnouncementInfo), C56390yDp.OLrzqt(OtcExtraKeys.MODE, "EDIT")));
            return intent;
        }
    }

    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ View AEQbTJ;
        public final /* synthetic */ CreateEditNoticeActivity EZpvd;
        public final /* synthetic */ nHV KWHzl;
        public final /* synthetic */ String OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(View view, long j, CreateEditNoticeActivity createEditNoticeActivity, nHV nhv, String str) {
            this.AEQbTJ = view;
            this.copydefault = j;
            this.EZpvd = createEditNoticeActivity;
            this.KWHzl = nhv;
            this.OLrzqt = str;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.copydefault || (this.AEQbTJ instanceof Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                this.EZpvd.gEmmrt();
                String string = StringsKt__StringsKt.hDKMBd((CharSequence) String.valueOf(this.KWHzl.AEQbTJ.getText())).toString();
                if (this.EZpvd.AEQbTJ != Mode.CREATE || !C33129mqd.OLrzqt((CharSequence) string)) {
                    if (this.EZpvd.AEQbTJ == Mode.EDIT && C33129mqd.OLrzqt((CharSequence) string)) {
                        CreateEditNoticeViewModel createEditNoticeViewModelOLrzqt = this.EZpvd.OLrzqt();
                        String str = this.OLrzqt;
                        GroupAnnouncementInfo groupAnnouncementInfo = this.EZpvd.KWHzl;
                        createEditNoticeViewModelOLrzqt.copydefault(str, groupAnnouncementInfo != null ? groupAnnouncementInfo.getAnnounceId() : -1L, string);
                        return;
                    }
                    return;
                }
                this.EZpvd.OLrzqt().AEQbTJ(this.OLrzqt);
            }
        }
    }

    @Override // o.AbstractActivityC34066nQd, o.AbstractActivityC33044moy, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.AbstractActivityC34066nQd, o.AbstractActivityC33044moy, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.AbstractActivityC34066nQd, o.AbstractActivityC33044moy, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // o.AbstractActivityC34066nQd, o.AbstractActivityC33044moy, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
