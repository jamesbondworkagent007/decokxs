package o;

import android.text.InputFilter;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.LifecycleOwnerKt;
import com.okinc.business.defi.biz.core.customchain.meta.CustomChainCoinMeta;
import com.okinc.business.defi.biz.core.customchain.meta.CustomChainMeta;
import com.okinc.business.defi.wallet.custom.AddCustomNetworkActivity$hideDeleteButtonIfNeeded$1$1;
import com.okinc.business.defi.wallet.custom.AddCustomNetworkActivity$showDeleteDialog$1$1$1;
import com.okinc.wallet.api.bean.EnterWalletMainBean;
import java.net.MalformedURLException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.C10614brl;
import o.C12827cuN;
import o.C13754dXa;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.edd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class ActivityC16104edd extends AbstractActivityC33013moT {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int KWHzl = 8;
    public CustomChainMeta AEQbTJ;
    public boolean AYXKKw;
    public AbstractC16283egx EZpvd;
    public boolean gEmmrt;
    public final int copydefault = 50;
    public final java.util.List<CustomChainMeta> OLrzqt = new java.util.ArrayList();
    public final InterfaceC56387yDm djBIcL = C56392yDr.copydefault(new Function0() { // from class: o.edg
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return ActivityC16104edd.valueOf(this.OLrzqt);
        }
    });

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final java.lang.Boolean KWHzl(java.lang.Boolean bool, Unit unit) {
        Intrinsics.checkNotNullParameter(unit, "");
        return bool;
    }

    /* JADX INFO: renamed from: o.edd$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.edd.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public static /* synthetic */ void start$default(TaskDescription taskDescription, android.content.Context context, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 2) != 0) {
                str = "-9223372036854775808";
            }
            if ((i & 4) != 0) {
                str2 = "";
            }
            taskDescription.KWHzl(context, str, str2);
        }

        public final void KWHzl(@NotNull android.content.Context context, @NotNull java.lang.String str, @NotNull java.lang.String str2) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            context.startActivity(EZpvd(context, str, str2));
        }

        public static /* synthetic */ android.content.Intent getIntent$default(TaskDescription taskDescription, android.content.Context context, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 2) != 0) {
                str = "-9223372036854775808";
            }
            if ((i & 4) != 0) {
                str2 = "";
            }
            return taskDescription.EZpvd(context, str, str2);
        }

        public final android.content.Intent EZpvd(@NotNull android.content.Context context, @NotNull java.lang.String str, @NotNull java.lang.String str2) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) ActivityC16104edd.class);
            intent.putExtra("chain_id", str);
            intent.putExtra("rpc_url", str2);
            return intent;
        }
    }

    /* JADX INFO: renamed from: o.edd$TaskStackBuilder */
    public static final class TaskStackBuilder implements android.text.TextWatcher {
        @Override // android.text.TextWatcher
        public void beforeTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        public TaskStackBuilder() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(android.text.Editable editable) {
            AbstractC16283egx abstractC16283egx = null;
            if (editable != null && java.lang.Integer.valueOf(editable.length()).equals(4)) {
                if (Intrinsics.EZpvd((java.lang.Object) editable.toString(), (java.lang.Object) "http")) {
                    return;
                }
                AbstractC16283egx abstractC16283egx2 = ActivityC16104edd.this.EZpvd;
                if (abstractC16283egx2 == null) {
                    Intrinsics.gEmmrt("");
                } else {
                    abstractC16283egx = abstractC16283egx2;
                }
                abstractC16283egx.valueOf.copydefault(C33070mpX.AYXKKw(C13754dXa.FragmentManager.QfJbVf));
                return;
            }
            if (editable != null && java.lang.Integer.valueOf(editable.length()).equals(5)) {
                if (Intrinsics.EZpvd((java.lang.Object) editable.toString(), (java.lang.Object) "https")) {
                    return;
                }
                AbstractC16283egx abstractC16283egx3 = ActivityC16104edd.this.EZpvd;
                if (abstractC16283egx3 == null) {
                    Intrinsics.gEmmrt("");
                } else {
                    abstractC16283egx = abstractC16283egx3;
                }
                abstractC16283egx.valueOf.copydefault(C33070mpX.AYXKKw(C13754dXa.FragmentManager.QfJbVf));
                return;
            }
            if (editable == null || editable.length() < 4) {
                AbstractC16283egx abstractC16283egx4 = ActivityC16104edd.this.EZpvd;
                if (abstractC16283egx4 == null) {
                    Intrinsics.gEmmrt("");
                    abstractC16283egx4 = null;
                }
                abstractC16283egx4.valueOf.copydefault(null);
            }
        }
    }

    /* JADX INFO: renamed from: o.edd$SharedElementCallback */
    public static final class SharedElementCallback implements android.text.TextWatcher {
        @Override // android.text.TextWatcher
        public void beforeTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        public SharedElementCallback() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(android.text.Editable editable) {
            ActivityC16104edd.this.EZpvd();
        }
    }

    public final SharedElementCallback AEQbTJ() {
        return (SharedElementCallback) this.djBIcL.getValue();
    }

    public static final SharedElementCallback valueOf(ActivityC16104edd activityC16104edd) {
        return activityC16104edd.new SharedElementCallback();
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.EZpvd = (AbstractC16283egx) DataBindingUtil.setContentView(this, C13754dXa.TaskDescription.copydefault);
        C33516mxt.EZpvd(this);
        djBIcL();
        values();
        DbNXlk();
        getWindow().getDecorView().post(new java.lang.Runnable() { // from class: o.edh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                ActivityC16104edd.AhwBna(this.KWHzl);
            }
        });
    }

    public static final void AhwBna(ActivityC16104edd activityC16104edd) {
        rVN.reportFullyDrawn$default((android.app.Activity) activityC16104edd, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    private final void DbNXlk() {
        AbstractC16283egx abstractC16283egx = this.EZpvd;
        AbstractC16283egx abstractC16283egx2 = null;
        if (abstractC16283egx == null) {
            Intrinsics.gEmmrt("");
            abstractC16283egx = null;
        }
        abstractC16283egx.EZpvd.setType(5);
        AbstractC16283egx abstractC16283egx3 = this.EZpvd;
        if (abstractC16283egx3 == null) {
            Intrinsics.gEmmrt("");
            abstractC16283egx3 = null;
        }
        abstractC16283egx3.EZpvd.setPrimaryText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.DXXBbs));
        AbstractC16283egx abstractC16283egx4 = this.EZpvd;
        if (abstractC16283egx4 == null) {
            Intrinsics.gEmmrt("");
            abstractC16283egx4 = null;
        }
        C52794wYp c52794wYpCopydefault = abstractC16283egx4.EZpvd.copydefault();
        if (c52794wYpCopydefault != null) {
            c52794wYpCopydefault.setOKDSType(257);
        }
        AbstractC16283egx abstractC16283egx5 = this.EZpvd;
        if (abstractC16283egx5 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC16283egx2 = abstractC16283egx5;
        }
        C52794wYp c52794wYpCopydefault2 = abstractC16283egx2.EZpvd.copydefault();
        if (c52794wYpCopydefault2 != null) {
            c52794wYpCopydefault2.setOnClickListener(new ActionBar(c52794wYpCopydefault2, 1000L, this));
        }
    }

    /* JADX INFO: renamed from: o.edd$Activity */
    public static final class Activity implements Function1<java.lang.Throwable, Unit> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(java.lang.Throwable th) {
            copydefault(th);
            return Unit.INSTANCE;
        }

        public final void copydefault(java.lang.Throwable th) {
            if (C59449zhJ.AEQbTJ((java.lang.CharSequence) th.getMessage(), (java.lang.CharSequence) C33070mpX.AYXKKw(C13754dXa.FragmentManager.DzkRMH))) {
                C55326xho.toast$default(th.getMessage(), (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
            }
            pUU.copydefault(ActivityC16104edd.this.getTAG(), "updateCustomChain error message :" + th.getMessage());
        }
    }

    /* JADX INFO: renamed from: o.edd$Application */
    public static final class Application implements Function1<StateListAnimator, Unit> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(StateListAnimator stateListAnimator) {
            copydefault(stateListAnimator);
            return Unit.INSTANCE;
        }

        public final void copydefault(StateListAnimator stateListAnimator) {
            C55326xho.toast$default(C13754dXa.FragmentManager.DcMfJKsuEgdN, (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
            ActivityC16104edd.this.finish();
        }
    }

    /* JADX INFO: renamed from: o.edd$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ ActivityC16104edd copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, ActivityC16104edd activityC16104edd) {
            this.OLrzqt = view;
            this.KWHzl = j;
            this.copydefault = activityC16104edd;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.KWHzl || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                AbstractC16283egx abstractC16283egx = this.copydefault.EZpvd;
                if (abstractC16283egx == null) {
                    Intrinsics.gEmmrt("");
                    abstractC16283egx = null;
                }
                android.widget.EditText editTextCopydefault = abstractC16283egx.djBIcL.copydefault();
                java.lang.String strValueOf = java.lang.String.valueOf(editTextCopydefault != null ? editTextCopydefault.getText() : null);
                if (strValueOf.length() == 0) {
                    return;
                }
                AbstractC16283egx abstractC16283egx2 = this.copydefault.EZpvd;
                if (abstractC16283egx2 == null) {
                    Intrinsics.gEmmrt("");
                    abstractC16283egx2 = null;
                }
                android.widget.EditText editTextCopydefault2 = abstractC16283egx2.valueOf.copydefault();
                java.lang.String string = StringsKt__StringsKt.hDKMBd((java.lang.CharSequence) java.lang.String.valueOf(editTextCopydefault2 != null ? editTextCopydefault2.getText() : null)).toString();
                if (string.length() == 0) {
                    return;
                }
                AbstractC16283egx abstractC16283egx3 = this.copydefault.EZpvd;
                if (abstractC16283egx3 == null) {
                    Intrinsics.gEmmrt("");
                    abstractC16283egx3 = null;
                }
                android.widget.EditText editTextCopydefault3 = abstractC16283egx3.KWHzl.copydefault();
                java.lang.String strValueOf2 = java.lang.String.valueOf(editTextCopydefault3 != null ? editTextCopydefault3.getText() : null);
                if (strValueOf2.length() == 0) {
                    return;
                }
                AbstractC16283egx abstractC16283egx4 = this.copydefault.EZpvd;
                if (abstractC16283egx4 == null) {
                    Intrinsics.gEmmrt("");
                    abstractC16283egx4 = null;
                }
                android.widget.EditText editTextCopydefault4 = abstractC16283egx4.copydefault.copydefault();
                java.lang.String strValueOf3 = java.lang.String.valueOf(editTextCopydefault4 != null ? editTextCopydefault4.getText() : null);
                if (strValueOf3.length() == 0) {
                    return;
                }
                AbstractC16283egx abstractC16283egx5 = this.copydefault.EZpvd;
                if (abstractC16283egx5 == null) {
                    Intrinsics.gEmmrt("");
                    abstractC16283egx5 = null;
                }
                android.widget.EditText editTextCopydefault5 = abstractC16283egx5.OLrzqt.copydefault();
                java.lang.String string2 = StringsKt__StringsKt.hDKMBd((java.lang.CharSequence) java.lang.String.valueOf(editTextCopydefault5 != null ? editTextCopydefault5.getText() : null)).toString();
                if (this.copydefault.AEQbTJ != null) {
                    CustomChainMeta customChainMeta = this.copydefault.AEQbTJ;
                    java.lang.String strValueOf4 = java.lang.String.valueOf(customChainMeta != null ? java.lang.Long.valueOf(customChainMeta.EZpvd()) : null);
                    CustomChainMeta customChainMeta2 = this.copydefault.AEQbTJ;
                    java.lang.String strValueOf5 = java.lang.String.valueOf(customChainMeta2 != null ? customChainMeta2.isConnected() : null);
                    if (Intrinsics.EZpvd((java.lang.Object) ("-" + strValueOf2), (java.lang.Object) strValueOf4) && Intrinsics.EZpvd((java.lang.Object) string, (java.lang.Object) strValueOf5)) {
                        C58156yvv.EZpvd(this.copydefault.KWHzl(strValueOf, strValueOf2, string, string2, strValueOf3), this.copydefault).AEQbTJ(new InterfaceC58227yxM(this.copydefault.new Application()) { // from class: o.edd.VoiceInteractor
                            public final /* synthetic */ Function1 KWHzl;

                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            {
                                Intrinsics.checkNotNullParameter(function1, "");
                                this.KWHzl = function1;
                            }

                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // o.InterfaceC58227yxM
                            public final /* synthetic */ void accept(java.lang.Object obj) {
                                this.KWHzl.invoke(obj);
                            }
                        }, new InterfaceC58227yxM(this.copydefault.new Activity()) { // from class: o.edd.VoiceInteractor
                            public final /* synthetic */ Function1 KWHzl;

                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            {
                                Intrinsics.checkNotNullParameter(function1, "");
                                this.KWHzl = function1;
                            }

                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // o.InterfaceC58227yxM
                            public final /* synthetic */ void accept(java.lang.Object obj) {
                                this.KWHzl.invoke(obj);
                            }
                        });
                        return;
                    }
                    if (strValueOf5.length() > 0 && strValueOf4.length() > 0) {
                        C10639bsJ c10639bsJ = C10639bsJ.EZpvd;
                        CustomChainMeta customChainMeta3 = this.copydefault.AEQbTJ;
                        long jEZpvd = customChainMeta3 != null ? customChainMeta3.EZpvd() : 0L;
                        CustomChainMeta customChainMeta4 = this.copydefault.AEQbTJ;
                        AbstractC58185ywX<R> abstractC58185ywXKWHzl = c10639bsJ.EZpvd(jEZpvd, java.lang.String.valueOf(customChainMeta4 != null ? customChainMeta4.isConnected() : null)).KWHzl(new InterfaceC58229yxO(this.copydefault.new LoaderManager(strValueOf, strValueOf2, string, string2, strValueOf3)) { // from class: o.edd.PictureInPictureParams
                            public final /* synthetic */ Function1 OLrzqt;

                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            {
                                Intrinsics.checkNotNullParameter(function1, "");
                                this.OLrzqt = function1;
                            }

                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // o.InterfaceC58229yxO
                            public final /* synthetic */ java.lang.Object apply(java.lang.Object obj) {
                                return this.OLrzqt.invoke(obj);
                            }
                        });
                        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
                        C58156yvv.EZpvd(abstractC58185ywXKWHzl, this.copydefault).AEQbTJ(new InterfaceC58227yxM(this.copydefault.new FragmentManager()) { // from class: o.edd.VoiceInteractor
                            public final /* synthetic */ Function1 KWHzl;

                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            {
                                Intrinsics.checkNotNullParameter(function1, "");
                                this.KWHzl = function1;
                            }

                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // o.InterfaceC58227yxM
                            public final /* synthetic */ void accept(java.lang.Object obj) {
                                this.KWHzl.invoke(obj);
                            }
                        }, new InterfaceC58227yxM(this.copydefault.new Dialog()) { // from class: o.edd.VoiceInteractor
                            public final /* synthetic */ Function1 KWHzl;

                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            {
                                Intrinsics.checkNotNullParameter(function1, "");
                                this.KWHzl = function1;
                            }

                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // o.InterfaceC58227yxM
                            public final /* synthetic */ void accept(java.lang.Object obj) {
                                this.KWHzl.invoke(obj);
                            }
                        });
                    }
                    Unit unit = Unit.INSTANCE;
                    return;
                }
                C58156yvv.EZpvd(this.copydefault.EZpvd(strValueOf, strValueOf2, string, string2, strValueOf3, true), this.copydefault).AEQbTJ(new InterfaceC58227yxM(this.copydefault.new Fragment()) { // from class: o.edd.VoiceInteractor
                    public final /* synthetic */ Function1 KWHzl;

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    {
                        Intrinsics.checkNotNullParameter(function1, "");
                        this.KWHzl = function1;
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58227yxM
                    public final /* synthetic */ void accept(java.lang.Object obj) {
                        this.KWHzl.invoke(obj);
                    }
                }, new InterfaceC58227yxM(this.copydefault.new PendingIntent()) { // from class: o.edd.VoiceInteractor
                    public final /* synthetic */ Function1 KWHzl;

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    {
                        Intrinsics.checkNotNullParameter(function1, "");
                        this.KWHzl = function1;
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58227yxM
                    public final /* synthetic */ void accept(java.lang.Object obj) {
                        this.KWHzl.invoke(obj);
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: o.edd$AssistContent */
    public static final class AssistContent implements View.OnClickListener {
        public final /* synthetic */ ActivityC16104edd AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ android.view.View KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AssistContent(android.view.View view, long j, ActivityC16104edd activityC16104edd) {
            this.KWHzl = view;
            this.EZpvd = j;
            this.AEQbTJ = activityC16104edd;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.EZpvd || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                this.AEQbTJ.AYXKKw();
            }
        }
    }

    /* JADX INFO: renamed from: o.edd$LoaderManager */
    public static final class LoaderManager implements Function1<java.lang.Boolean, InterfaceC60096zvd<? extends StateListAnimator>> {
        public final /* synthetic */ java.lang.String AEQbTJ;
        public final /* synthetic */ java.lang.String EZpvd;
        public final /* synthetic */ java.lang.String KWHzl;
        public final /* synthetic */ java.lang.String OLrzqt;
        public final /* synthetic */ java.lang.String copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public LoaderManager(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
            this.copydefault = str;
            this.AEQbTJ = str2;
            this.OLrzqt = str3;
            this.EZpvd = str4;
            this.KWHzl = str5;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public final InterfaceC60096zvd<? extends StateListAnimator> invoke(java.lang.Boolean bool) {
            Intrinsics.checkNotNullParameter(bool, "");
            return ActivityC16104edd.this.EZpvd(this.copydefault, this.AEQbTJ, this.OLrzqt, this.EZpvd, this.KWHzl, false);
        }
    }

    /* JADX INFO: renamed from: o.edd$Dialog */
    public static final class Dialog implements Function1<java.lang.Throwable, Unit> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Dialog() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(java.lang.Throwable th) {
            OLrzqt(th);
            return Unit.INSTANCE;
        }

        public final void OLrzqt(java.lang.Throwable th) {
            if (C59449zhJ.AEQbTJ((java.lang.CharSequence) th.getMessage(), (java.lang.CharSequence) C33070mpX.AYXKKw(C13754dXa.FragmentManager.DzkRMH))) {
                C55326xho.toast$default(th.getMessage(), (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
            }
            pUU.copydefault(ActivityC16104edd.this.getTAG(), "updateCustomChain error message :" + th.getMessage());
        }
    }

    /* JADX INFO: renamed from: o.edd$FragmentManager */
    public static final class FragmentManager implements Function1<StateListAnimator, Unit> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public FragmentManager() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(StateListAnimator stateListAnimator) {
            KWHzl(stateListAnimator);
            return Unit.INSTANCE;
        }

        public final void KWHzl(StateListAnimator stateListAnimator) {
            C55326xho.toast$default(C13754dXa.FragmentManager.DcMfJKsuEgdN, (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
            ActivityC16104edd.this.finish();
        }
    }

    /* JADX INFO: renamed from: o.edd$Fragment */
    public static final class Fragment implements Function1<StateListAnimator, Unit> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Fragment() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(StateListAnimator stateListAnimator) {
            KWHzl(stateListAnimator);
            return Unit.INSTANCE;
        }

        public final void KWHzl(StateListAnimator stateListAnimator) {
            C55326xho.toast$default(C13754dXa.FragmentManager.XW, (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
            ActivityC16104edd.this.gEmmrt();
        }
    }

    /* JADX INFO: renamed from: o.edd$PendingIntent */
    public static final class PendingIntent implements Function1<java.lang.Throwable, Unit> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public PendingIntent() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(java.lang.Throwable th) {
            KWHzl(th);
            return Unit.INSTANCE;
        }

        public final void KWHzl(java.lang.Throwable th) {
            if (C59449zhJ.AEQbTJ((java.lang.CharSequence) th.getMessage(), (java.lang.CharSequence) C33070mpX.AYXKKw(C13754dXa.FragmentManager.DzkRMH))) {
                C55326xho.toast$default(th.getMessage(), (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
            }
            pUU.copydefault(ActivityC16104edd.this.getTAG(), "addCustomCoin error message :" + th.getMessage());
        }
    }

    public final void gEmmrt() {
        dZK.AEQbTJ.AEQbTJ(this, new EnterWalletMainBean((java.lang.Boolean) null, (java.lang.String) null, (java.lang.Integer) null, (java.lang.String) null, false, false, (com.okinc.wallet.api.bean.ScanResult) null, 127, (DefaultConstructorMarker) null));
        finish();
    }

    /* JADX DEBUG: Type inference failed for r11v4. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<o.edd$StateListAnimator> */
    public final AbstractC58185ywX<StateListAnimator> KWHzl(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        try {
            if (C9700baY.EZpvd(str2)) {
                str2 = C33491mxU.OLrzqt(str2);
            }
            final long j = -C33129mqd.valueOf(str2);
            AbstractC58185ywX<java.lang.Boolean> abstractC58185ywXOLrzqt = C10639bsJ.EZpvd.OLrzqt(j, str, str5, str3, str4);
            final Function1 function1 = new Function1() { // from class: o.edA
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return ActivityC16104edd.OLrzqt(j, (java.lang.Boolean) obj);
                }
            };
            AbstractC58185ywX abstractC58185ywXAEQbTJ = abstractC58185ywXOLrzqt.AEQbTJ(new InterfaceC58229yxO() { // from class: o.edy
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj) {
                    return ActivityC16104edd.fIwbmz(function1, obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
            return abstractC58185ywXAEQbTJ;
        } catch (java.lang.Exception unused) {
            AbstractC58185ywX<StateListAnimator> abstractC58185ywXAEQbTJ2 = AbstractC58185ywX.AEQbTJ((java.lang.Throwable) new java.lang.Exception(C33070mpX.AYXKKw(C13754dXa.FragmentManager.DzkRMH)));
            Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ2, "");
            return abstractC58185ywXAEQbTJ2;
        }
    }

    public static final StateListAnimator OLrzqt(long j, java.lang.Boolean bool) {
        Intrinsics.checkNotNullParameter(bool, "");
        return new StateListAnimator(bool.booleanValue(), j);
    }

    public static final StateListAnimator fIwbmz(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (StateListAnimator) function1.invoke(obj);
    }

    public final AbstractC58185ywX<StateListAnimator> EZpvd(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, final boolean z) {
        try {
            long jValueOf = C9700baY.EZpvd(str2) ? C33129mqd.valueOf(C33491mxU.OLrzqt(str2)) : C33129mqd.valueOf(str2);
            final CustomChainMeta customChainMeta = new CustomChainMeta(-jValueOf, jValueOf, str, C9700baY.OLrzqt(C33129mqd.gEmmrt(C59454zhO.wlaJM(str))), true, 0, str3, "", str4, 0L, 0L, null, null, 7680, null);
            customChainMeta.AEQbTJ(customChainMeta.AEQbTJ(str5, str));
            AbstractC58185ywX<java.lang.Boolean> abstractC58185ywXEZpvd = C10639bsJ.EZpvd.EZpvd(customChainMeta);
            final Function1 function1 = new Function1() { // from class: o.edn
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return ActivityC16104edd.EZpvd(z, customChainMeta, (java.lang.Boolean) obj);
                }
            };
            AbstractC58185ywX<R> abstractC58185ywXKWHzl = abstractC58185ywXEZpvd.KWHzl(new InterfaceC58229yxO() { // from class: o.edp
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj) {
                    return ActivityC16104edd.AkhnZx(function1, obj);
                }
            });
            final Function1 function12 = new Function1() { // from class: o.edq
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return ActivityC16104edd.KWHzl(customChainMeta, (java.lang.Boolean) obj);
                }
            };
            AbstractC58185ywX<StateListAnimator> abstractC58185ywXAEQbTJ = abstractC58185ywXKWHzl.AEQbTJ((InterfaceC58229yxO<? super R, ? extends R>) new InterfaceC58229yxO() { // from class: o.edu
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj) {
                    return ActivityC16104edd.fetchVPNInfo(function12, obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
            return abstractC58185ywXAEQbTJ;
        } catch (java.lang.Exception unused) {
            AbstractC58185ywX<StateListAnimator> abstractC58185ywXAEQbTJ2 = AbstractC58185ywX.AEQbTJ((java.lang.Throwable) new java.lang.Exception(C33070mpX.AYXKKw(C13754dXa.FragmentManager.DzkRMH)));
            Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ2, "");
            return abstractC58185ywXAEQbTJ2;
        }
    }

    public static final InterfaceC60096zvd AkhnZx(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd EZpvd(boolean z, final CustomChainMeta customChainMeta, final java.lang.Boolean bool) {
        AbstractC58260yxt abstractC58260yxtCopydefault;
        Intrinsics.checkNotNullParameter(bool, "");
        if (z) {
            C12827cuN.Application application = C12827cuN.Companion;
            java.util.List<AbstractC12782ctV> listCopydefault = C12827cuN.Application.getInstance$default(application, null, 1, null).copydefault();
            if (listCopydefault.isEmpty()) {
                AbstractC58260yxt<AbstractC12782ctV> abstractC58260yxtCopydefault2 = C12827cuN.Application.getInstance$default(application, null, 1, null).copydefault(false);
                final Function1 function1 = new Function1() { // from class: o.eds
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return ActivityC16104edd.EZpvd(customChainMeta, (AbstractC12782ctV) obj);
                    }
                };
                AbstractC58260yxt<R> abstractC58260yxtCopydefault3 = abstractC58260yxtCopydefault2.copydefault(new InterfaceC58229yxO() { // from class: o.edt
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58229yxO
                    public final java.lang.Object apply(java.lang.Object obj) {
                        return ActivityC16104edd.AhwBna(function1, obj);
                    }
                });
                final Function1 function12 = new Function1() { // from class: o.edw
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return ActivityC16104edd.KWHzl(bool, (Unit) obj);
                    }
                };
                abstractC58260yxtCopydefault = abstractC58260yxtCopydefault3.copydefault((InterfaceC58229yxO<? super R, ? extends R>) new InterfaceC58229yxO() { // from class: o.edv
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58229yxO
                    public final java.lang.Object apply(java.lang.Object obj) {
                        return ActivityC16104edd.DbNXlk(function12, obj);
                    }
                });
            } else {
                AbstractC12782ctV abstractC12782ctV = (AbstractC12782ctV) CollectionsKt___CollectionsKt.AuCTelauCTel(listCopydefault);
                C10614brl instance$default = C10614brl.TaskDescription.getInstance$default(C10614brl.Companion, null, 1, null);
                java.lang.String strDbNXlk = abstractC12782ctV.DbNXlk();
                long jEZpvd = customChainMeta.EZpvd();
                long jFetchVPNInfo = customChainMeta.fetchVPNInfo();
                instance$default.KWHzl(strDbNXlk, java.lang.String.valueOf(jEZpvd), java.lang.String.valueOf(jFetchVPNInfo), customChainMeta.isConnected(), customChainMeta.OLrzqt(), customChainMeta.valueOf());
                abstractC58260yxtCopydefault = AbstractC58260yxt.copydefault(bool);
            }
            return abstractC58260yxtCopydefault.EZpvd();
        }
        return AbstractC58185ywX.KWHzl(bool);
    }

    public static final Unit AhwBna(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (Unit) function1.invoke(obj);
    }

    public static final Unit EZpvd(CustomChainMeta customChainMeta, AbstractC12782ctV abstractC12782ctV) {
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        C10614brl instance$default = C10614brl.TaskDescription.getInstance$default(C10614brl.Companion, null, 1, null);
        java.lang.String strDbNXlk = abstractC12782ctV.DbNXlk();
        long jEZpvd = customChainMeta.EZpvd();
        long jFetchVPNInfo = customChainMeta.fetchVPNInfo();
        instance$default.KWHzl(strDbNXlk, java.lang.String.valueOf(jEZpvd), java.lang.String.valueOf(jFetchVPNInfo), customChainMeta.isConnected(), customChainMeta.OLrzqt(), customChainMeta.valueOf());
        return Unit.INSTANCE;
    }

    public static final java.lang.Boolean DbNXlk(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.lang.Boolean) function1.invoke(obj);
    }

    public static final StateListAnimator KWHzl(CustomChainMeta customChainMeta, java.lang.Boolean bool) {
        Intrinsics.checkNotNullParameter(bool, "");
        return new StateListAnimator(bool.booleanValue(), customChainMeta.EZpvd());
    }

    public static final StateListAnimator fetchVPNInfo(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (StateListAnimator) function1.invoke(obj);
    }

    public final void AEQbTJ(CustomChainMeta customChainMeta) {
        AbstractC16283egx abstractC16283egx = null;
        if (customChainMeta != null) {
            pUU.OLrzqt(">>>rawCustomChainMeta id:" + customChainMeta.EZpvd() + " - name:" + customChainMeta.OLrzqt() + " - forceUpdateType:" + customChainMeta.gEmmrt());
            if (customChainMeta.gEmmrt() == 1 || !customChainMeta.AhwBna()) {
                AbstractC16283egx abstractC16283egx2 = this.EZpvd;
                if (abstractC16283egx2 == null) {
                    Intrinsics.gEmmrt("");
                    abstractC16283egx2 = null;
                }
                abstractC16283egx2.AEQbTJ.setVisibility(8);
                AbstractC16283egx abstractC16283egx3 = this.EZpvd;
                if (abstractC16283egx3 == null) {
                    Intrinsics.gEmmrt("");
                    abstractC16283egx3 = null;
                }
                abstractC16283egx3.AhwBna.setVisibility(8);
                AbstractC16283egx abstractC16283egx4 = this.EZpvd;
                if (abstractC16283egx4 == null) {
                    Intrinsics.gEmmrt("");
                    abstractC16283egx4 = null;
                }
                abstractC16283egx4.EZpvd.setVisibility(8);
            } else {
                AhwBna();
                AbstractC16283egx abstractC16283egx5 = this.EZpvd;
                if (abstractC16283egx5 == null) {
                    Intrinsics.gEmmrt("");
                    abstractC16283egx5 = null;
                }
                abstractC16283egx5.EZpvd.setVisibility(0);
                BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new AddCustomNetworkActivity$hideDeleteButtonIfNeeded$1$1(this, customChainMeta, null), 3, null);
            }
        }
        if (customChainMeta == null) {
            AhwBna();
            AbstractC16283egx abstractC16283egx6 = this.EZpvd;
            if (abstractC16283egx6 == null) {
                Intrinsics.gEmmrt("");
            } else {
                abstractC16283egx = abstractC16283egx6;
            }
            abstractC16283egx.AEQbTJ.setVisibility(8);
        }
    }

    private final void djBIcL() {
        java.lang.String strAYXKKw;
        CustomChainMeta customChainMeta;
        java.lang.Object next;
        AbstractC16283egx abstractC16283egx = null;
        if (getIntent().hasExtra("chain_id")) {
            java.lang.String stringExtra = getIntent().getStringExtra("chain_id");
            if (stringExtra == null) {
                stringExtra = "-9223372036854775808";
            }
            java.lang.String stringExtra2 = getIntent().getStringExtra("rpc_url");
            if (stringExtra2 == null) {
                stringExtra2 = "";
            }
            if (Intrinsics.EZpvd((java.lang.Object) stringExtra, (java.lang.Object) "-9223372036854775808")) {
                customChainMeta = null;
            } else {
                java.util.Iterator<T> it = C10598brV.AEQbTJ.fetchVPNInfo().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    CustomChainMeta customChainMeta2 = (CustomChainMeta) next;
                    if (Intrinsics.EZpvd((java.lang.Object) customChainMeta2.isConnected(), (java.lang.Object) stringExtra2) && Intrinsics.EZpvd((java.lang.Object) java.lang.String.valueOf(customChainMeta2.EZpvd()), (java.lang.Object) stringExtra)) {
                        break;
                    }
                }
                customChainMeta = (CustomChainMeta) next;
            }
            this.AEQbTJ = customChainMeta;
        }
        AEQbTJ(this.AEQbTJ);
        this.AYXKKw = this.AEQbTJ != null;
        AbstractC16283egx abstractC16283egx2 = this.EZpvd;
        if (abstractC16283egx2 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC16283egx = abstractC16283egx2;
        }
        android.widget.TextView textView = abstractC16283egx.values;
        CustomChainMeta customChainMeta3 = this.AEQbTJ;
        if (customChainMeta3 != null) {
            Intrinsics.copydefault(customChainMeta3);
            if (customChainMeta3.AhwBna()) {
                strAYXKKw = C33070mpX.AYXKKw(C13754dXa.FragmentManager.bindToGooglePlayService);
            } else {
                CustomChainMeta customChainMeta4 = this.AEQbTJ;
                Intrinsics.copydefault(customChainMeta4);
                strAYXKKw = customChainMeta4.OLrzqt();
            }
        } else {
            strAYXKKw = C33070mpX.AYXKKw(C13754dXa.FragmentManager.geLlBI);
        }
        textView.setText(strAYXKKw);
        AbstractC58260yxt abstractC58260yxtKWHzl = C58156yvv.KWHzl(C10639bsJ.EZpvd.OLrzqt(), this);
        final Function1 function1 = new Function1() { // from class: o.edr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC16104edd.EZpvd(this.copydefault, (java.util.List) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.edx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                ActivityC16104edd.ejfBZ(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.edz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC16104edd.OLrzqt((java.lang.Throwable) obj);
            }
        };
        addDisposable(abstractC58260yxtKWHzl.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.edB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                ActivityC16104edd.fJNWhG(function12, obj);
            }
        }));
    }

    public static final void ejfBZ(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit EZpvd(ActivityC16104edd activityC16104edd, java.util.List list) {
        java.util.List<CustomChainMeta> list2 = activityC16104edd.OLrzqt;
        Intrinsics.copydefault(list);
        list2.addAll(list);
        return Unit.INSTANCE;
    }

    public static final void fJNWhG(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit OLrzqt(java.lang.Throwable th) {
        return Unit.INSTANCE;
    }

    private final void values() {
        AbstractC16283egx abstractC16283egx = this.EZpvd;
        AbstractC16283egx abstractC16283egx2 = null;
        if (abstractC16283egx == null) {
            Intrinsics.gEmmrt("");
            abstractC16283egx = null;
        }
        abstractC16283egx.djBIcL.setHitText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.zzQwtT));
        abstractC16283egx.valueOf.setHitText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.gwwfep));
        abstractC16283egx.KWHzl.setHitText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.cBPFI));
        abstractC16283egx.copydefault.setHitText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.iKEqwx));
        abstractC16283egx.OLrzqt.setHitText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.DKtBnz));
        AbstractC16283egx abstractC16283egx3 = this.EZpvd;
        if (abstractC16283egx3 == null) {
            Intrinsics.gEmmrt("");
            abstractC16283egx3 = null;
        }
        abstractC16283egx3.gEmmrt.setOnClickListener(new View.OnClickListener() { // from class: o.edG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                ActivityC16104edd.OLrzqt(this.EZpvd, view);
            }
        });
        AbstractC16283egx abstractC16283egx4 = this.EZpvd;
        if (abstractC16283egx4 == null) {
            Intrinsics.gEmmrt("");
            abstractC16283egx4 = null;
        }
        ViewGroup.LayoutParams layoutParams = abstractC16283egx4.AkhnZx.getLayoutParams();
        layoutParams.height += C33570myu.AEQbTJ((android.content.Context) this);
        AbstractC16283egx abstractC16283egx5 = this.EZpvd;
        if (abstractC16283egx5 == null) {
            Intrinsics.gEmmrt("");
            abstractC16283egx5 = null;
        }
        abstractC16283egx5.AkhnZx.setLayoutParams(layoutParams);
        AbstractC16283egx abstractC16283egx6 = this.EZpvd;
        if (abstractC16283egx6 == null) {
            Intrinsics.gEmmrt("");
            abstractC16283egx6 = null;
        }
        abstractC16283egx6.AkhnZx.setPaddingRelative(0, C33570myu.AEQbTJ((android.content.Context) this), 0, 0);
        AbstractC16283egx abstractC16283egx7 = this.EZpvd;
        if (abstractC16283egx7 == null) {
            Intrinsics.gEmmrt("");
            abstractC16283egx7 = null;
        }
        abstractC16283egx7.KWHzl.setTipClick(new Function1() { // from class: o.edC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC16104edd.KWHzl(this.copydefault, (android.view.View) obj);
            }
        });
        if (this.AEQbTJ == null) {
            KWHzl();
        } else {
            AbstractC16283egx abstractC16283egx8 = this.EZpvd;
            if (abstractC16283egx8 == null) {
                Intrinsics.gEmmrt("");
                abstractC16283egx8 = null;
            }
            android.widget.ImageView imageView = abstractC16283egx8.AEQbTJ;
            imageView.setOnClickListener(new AssistContent(imageView, 1000L, this));
            CustomChainMeta customChainMeta = this.AEQbTJ;
            if (customChainMeta != null && customChainMeta.AhwBna()) {
                KWHzl();
            } else {
                OLrzqt();
            }
            CustomChainMeta customChainMeta2 = this.AEQbTJ;
            if (customChainMeta2 != null) {
                copydefault(customChainMeta2);
            }
        }
        AbstractC16283egx abstractC16283egx9 = this.EZpvd;
        if (abstractC16283egx9 == null) {
            Intrinsics.gEmmrt("");
            abstractC16283egx9 = null;
        }
        android.widget.EditText editTextCopydefault = abstractC16283egx9.djBIcL.copydefault();
        if (editTextCopydefault != null) {
            editTextCopydefault.addTextChangedListener(AEQbTJ());
            editTextCopydefault.setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(this.copydefault)});
        }
        AbstractC16283egx abstractC16283egx10 = this.EZpvd;
        if (abstractC16283egx10 == null) {
            Intrinsics.gEmmrt("");
            abstractC16283egx10 = null;
        }
        android.widget.EditText editTextCopydefault2 = abstractC16283egx10.valueOf.copydefault();
        if (editTextCopydefault2 != null) {
            editTextCopydefault2.addTextChangedListener(new TaskStackBuilder());
            editTextCopydefault2.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: o.edD
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnFocusChangeListener
                public final void onFocusChange(android.view.View view, boolean z) {
                    ActivityC16104edd.EZpvd(this.EZpvd, view, z);
                }
            });
        }
        AbstractC16283egx abstractC16283egx11 = this.EZpvd;
        if (abstractC16283egx11 == null) {
            Intrinsics.gEmmrt("");
            abstractC16283egx11 = null;
        }
        final android.widget.EditText editTextCopydefault3 = abstractC16283egx11.OLrzqt.copydefault();
        if (editTextCopydefault3 != null) {
            editTextCopydefault3.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: o.ede
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnFocusChangeListener
                public final void onFocusChange(android.view.View view, boolean z) {
                    ActivityC16104edd.OLrzqt(editTextCopydefault3, this, view, z);
                }
            });
        }
        AbstractC16283egx abstractC16283egx12 = this.EZpvd;
        if (abstractC16283egx12 == null) {
            Intrinsics.gEmmrt("");
            abstractC16283egx12 = null;
        }
        android.widget.EditText editTextCopydefault4 = abstractC16283egx12.djBIcL.copydefault();
        if (editTextCopydefault4 != null) {
            editTextCopydefault4.addTextChangedListener(AEQbTJ());
            editTextCopydefault4.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: o.edf
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnFocusChangeListener
                public final void onFocusChange(android.view.View view, boolean z) {
                    ActivityC16104edd.AEQbTJ(this.copydefault, view, z);
                }
            });
        }
        AbstractC16283egx abstractC16283egx13 = this.EZpvd;
        if (abstractC16283egx13 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC16283egx2 = abstractC16283egx13;
        }
        android.widget.EditText editTextCopydefault5 = abstractC16283egx2.copydefault.copydefault();
        if (editTextCopydefault5 != null) {
            editTextCopydefault5.addTextChangedListener(AEQbTJ());
            editTextCopydefault5.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: o.edl
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnFocusChangeListener
                public final void onFocusChange(android.view.View view, boolean z) {
                    ActivityC16104edd.djBIcL(this.EZpvd, view, z);
                }
            });
        }
        EZpvd();
    }

    public static final void OLrzqt(ActivityC16104edd activityC16104edd, android.view.View view) {
        activityC16104edd.finish();
    }

    public static final Unit KWHzl(ActivityC16104edd activityC16104edd, android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        activityC16104edd.valueOf();
        return Unit.INSTANCE;
    }

    public static final void EZpvd(ActivityC16104edd activityC16104edd, android.view.View view, boolean z) {
        android.text.Editable text;
        java.lang.String string;
        java.lang.String string2;
        if (!z) {
            AbstractC16283egx abstractC16283egx = activityC16104edd.EZpvd;
            AbstractC16283egx abstractC16283egx2 = null;
            if (abstractC16283egx == null) {
                Intrinsics.gEmmrt("");
                abstractC16283egx = null;
            }
            android.widget.EditText editTextCopydefault = abstractC16283egx.valueOf.copydefault();
            if (editTextCopydefault == null || (text = editTextCopydefault.getText()) == null || (string = text.toString()) == null || (string2 = StringsKt__StringsKt.hDKMBd((java.lang.CharSequence) string).toString()) == null) {
                return;
            }
            if (activityC16104edd.KWHzl(string2)) {
                activityC16104edd.OLrzqt(string2);
            } else {
                activityC16104edd.AYXKKw = false;
                if (C33129mqd.OLrzqt((java.lang.CharSequence) string2)) {
                    AbstractC16283egx abstractC16283egx3 = activityC16104edd.EZpvd;
                    if (abstractC16283egx3 == null) {
                        Intrinsics.gEmmrt("");
                        abstractC16283egx3 = null;
                    }
                    abstractC16283egx3.valueOf.copydefault(C33070mpX.AYXKKw(C13754dXa.FragmentManager.dzCpvv));
                }
                activityC16104edd.EZpvd();
            }
            if (string2.length() == 0) {
                AbstractC16283egx abstractC16283egx4 = activityC16104edd.EZpvd;
                if (abstractC16283egx4 == null) {
                    Intrinsics.gEmmrt("");
                } else {
                    abstractC16283egx2 = abstractC16283egx4;
                }
                android.widget.EditText editTextCopydefault2 = abstractC16283egx2.KWHzl.copydefault();
                if (editTextCopydefault2 != null) {
                    editTextCopydefault2.setText("");
                    return;
                }
                return;
            }
            return;
        }
        activityC16104edd.EZpvd();
    }

    public static final void OLrzqt(android.widget.EditText editText, ActivityC16104edd activityC16104edd, android.view.View view, boolean z) {
        if (!z) {
            android.text.Editable editableText = editText.getEditableText();
            Intrinsics.checkNotNullExpressionValue(editableText, "");
            AbstractC16283egx abstractC16283egx = null;
            if (editableText.length() > 0 && !activityC16104edd.KWHzl(StringsKt__StringsKt.hDKMBd((java.lang.CharSequence) editText.getEditableText().toString()).toString())) {
                AbstractC16283egx abstractC16283egx2 = activityC16104edd.EZpvd;
                if (abstractC16283egx2 == null) {
                    Intrinsics.gEmmrt("");
                } else {
                    abstractC16283egx = abstractC16283egx2;
                }
                abstractC16283egx.OLrzqt.copydefault(C33070mpX.AYXKKw(C13754dXa.FragmentManager.frkDMe));
                return;
            }
            AbstractC16283egx abstractC16283egx3 = activityC16104edd.EZpvd;
            if (abstractC16283egx3 == null) {
                Intrinsics.gEmmrt("");
                abstractC16283egx3 = null;
            }
            abstractC16283egx3.OLrzqt.copydefault(null);
            return;
        }
        activityC16104edd.copydefault();
    }

    public static final void AEQbTJ(ActivityC16104edd activityC16104edd, android.view.View view, boolean z) {
        android.text.Editable text;
        AbstractC16283egx abstractC16283egx = null;
        if (!z) {
            AbstractC16283egx abstractC16283egx2 = activityC16104edd.EZpvd;
            if (abstractC16283egx2 == null) {
                Intrinsics.gEmmrt("");
                abstractC16283egx2 = null;
            }
            android.widget.EditText editTextCopydefault = abstractC16283egx2.djBIcL.copydefault();
            if (java.lang.String.valueOf((editTextCopydefault == null || (text = editTextCopydefault.getText()) == null) ? null : StringsKt__StringsKt.hDKMBd(text)).length() == 0) {
                AbstractC16283egx abstractC16283egx3 = activityC16104edd.EZpvd;
                if (abstractC16283egx3 == null) {
                    Intrinsics.gEmmrt("");
                } else {
                    abstractC16283egx = abstractC16283egx3;
                }
                abstractC16283egx.djBIcL.copydefault(C33070mpX.AYXKKw(C13754dXa.FragmentManager.awiJhF));
            }
        } else {
            AbstractC16283egx abstractC16283egx4 = activityC16104edd.EZpvd;
            if (abstractC16283egx4 == null) {
                Intrinsics.gEmmrt("");
                abstractC16283egx4 = null;
            }
            abstractC16283egx4.djBIcL.copydefault(null);
        }
        activityC16104edd.EZpvd();
    }

    public static final void djBIcL(ActivityC16104edd activityC16104edd, android.view.View view, boolean z) {
        android.text.Editable text;
        AbstractC16283egx abstractC16283egx = null;
        if (!z) {
            AbstractC16283egx abstractC16283egx2 = activityC16104edd.EZpvd;
            if (abstractC16283egx2 == null) {
                Intrinsics.gEmmrt("");
                abstractC16283egx2 = null;
            }
            android.widget.EditText editTextCopydefault = abstractC16283egx2.copydefault.copydefault();
            if (java.lang.String.valueOf((editTextCopydefault == null || (text = editTextCopydefault.getText()) == null) ? null : StringsKt__StringsKt.hDKMBd(text)).length() == 0) {
                AbstractC16283egx abstractC16283egx3 = activityC16104edd.EZpvd;
                if (abstractC16283egx3 == null) {
                    Intrinsics.gEmmrt("");
                } else {
                    abstractC16283egx = abstractC16283egx3;
                }
                abstractC16283egx.copydefault.copydefault(C33070mpX.AYXKKw(C13754dXa.FragmentManager.awiJhF));
            }
        } else {
            AbstractC16283egx abstractC16283egx4 = activityC16104edd.EZpvd;
            if (abstractC16283egx4 == null) {
                Intrinsics.gEmmrt("");
                abstractC16283egx4 = null;
            }
            abstractC16283egx4.copydefault.copydefault(null);
            activityC16104edd.copydefault();
        }
        activityC16104edd.EZpvd();
    }

    public final void copydefault() {
        AbstractC16283egx abstractC16283egx = this.EZpvd;
        if (abstractC16283egx == null) {
            Intrinsics.gEmmrt("");
            abstractC16283egx = null;
        }
        final NestedScrollView nestedScrollView = abstractC16283egx.AYXKKw;
        nestedScrollView.postDelayed(new java.lang.Runnable() { // from class: o.edj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                ActivityC16104edd.EZpvd(nestedScrollView, this);
            }
        }, 500L);
    }

    public static final void EZpvd(NestedScrollView nestedScrollView, ActivityC16104edd activityC16104edd) {
        AbstractC16283egx abstractC16283egx = activityC16104edd.EZpvd;
        if (abstractC16283egx == null) {
            Intrinsics.gEmmrt("");
            abstractC16283egx = null;
        }
        nestedScrollView.scrollTo(0, abstractC16283egx.AYXKKw.getHeight());
    }

    public static final void values(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AEQbTJ(ActivityC16104edd activityC16104edd, java.lang.Long l) {
        activityC16104edd.dismissLoading();
        AbstractC16283egx abstractC16283egx = activityC16104edd.EZpvd;
        if (abstractC16283egx == null) {
            Intrinsics.gEmmrt("");
            abstractC16283egx = null;
        }
        abstractC16283egx.KWHzl.setChainIdTxt(l.toString());
        activityC16104edd.AYXKKw = true;
        activityC16104edd.EZpvd();
        return Unit.INSTANCE;
    }

    public static final void isConnected(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit copydefault(ActivityC16104edd activityC16104edd, java.lang.Throwable th) {
        AbstractC16283egx abstractC16283egx = activityC16104edd.EZpvd;
        if (abstractC16283egx == null) {
            Intrinsics.gEmmrt("");
            abstractC16283egx = null;
        }
        abstractC16283egx.valueOf.copydefault(C33070mpX.AYXKKw(C13754dXa.FragmentManager.YqksP));
        activityC16104edd.AYXKKw = false;
        activityC16104edd.EZpvd();
        return Unit.INSTANCE;
    }

    public final void EZpvd() {
        AbstractC16283egx abstractC16283egx = null;
        if (!this.AYXKKw || this.gEmmrt) {
            AbstractC16283egx abstractC16283egx2 = this.EZpvd;
            if (abstractC16283egx2 == null) {
                Intrinsics.gEmmrt("");
            } else {
                abstractC16283egx = abstractC16283egx2;
            }
            C52794wYp c52794wYpCopydefault = abstractC16283egx.EZpvd.copydefault();
            if (c52794wYpCopydefault != null) {
                c52794wYpCopydefault.setEnabled(false);
                return;
            }
            return;
        }
        AbstractC16283egx abstractC16283egx3 = this.EZpvd;
        if (abstractC16283egx3 == null) {
            Intrinsics.gEmmrt("");
            abstractC16283egx3 = null;
        }
        android.widget.EditText editTextCopydefault = abstractC16283egx3.djBIcL.copydefault();
        if (java.lang.String.valueOf(editTextCopydefault != null ? editTextCopydefault.getText() : null).length() == 0) {
            AbstractC16283egx abstractC16283egx4 = this.EZpvd;
            if (abstractC16283egx4 == null) {
                Intrinsics.gEmmrt("");
            } else {
                abstractC16283egx = abstractC16283egx4;
            }
            C52794wYp c52794wYpCopydefault2 = abstractC16283egx.EZpvd.copydefault();
            if (c52794wYpCopydefault2 != null) {
                c52794wYpCopydefault2.setEnabled(false);
                return;
            }
            return;
        }
        AbstractC16283egx abstractC16283egx5 = this.EZpvd;
        if (abstractC16283egx5 == null) {
            Intrinsics.gEmmrt("");
            abstractC16283egx5 = null;
        }
        android.widget.EditText editTextCopydefault2 = abstractC16283egx5.valueOf.copydefault();
        if (java.lang.String.valueOf(editTextCopydefault2 != null ? editTextCopydefault2.getText() : null).length() == 0) {
            AbstractC16283egx abstractC16283egx6 = this.EZpvd;
            if (abstractC16283egx6 == null) {
                Intrinsics.gEmmrt("");
            } else {
                abstractC16283egx = abstractC16283egx6;
            }
            C52794wYp c52794wYpCopydefault3 = abstractC16283egx.EZpvd.copydefault();
            if (c52794wYpCopydefault3 != null) {
                c52794wYpCopydefault3.setEnabled(false);
                return;
            }
            return;
        }
        AbstractC16283egx abstractC16283egx7 = this.EZpvd;
        if (abstractC16283egx7 == null) {
            Intrinsics.gEmmrt("");
            abstractC16283egx7 = null;
        }
        android.widget.EditText editTextCopydefault3 = abstractC16283egx7.KWHzl.copydefault();
        if (java.lang.String.valueOf(editTextCopydefault3 != null ? editTextCopydefault3.getText() : null).length() == 0) {
            AbstractC16283egx abstractC16283egx8 = this.EZpvd;
            if (abstractC16283egx8 == null) {
                Intrinsics.gEmmrt("");
            } else {
                abstractC16283egx = abstractC16283egx8;
            }
            C52794wYp c52794wYpCopydefault4 = abstractC16283egx.EZpvd.copydefault();
            if (c52794wYpCopydefault4 != null) {
                c52794wYpCopydefault4.setEnabled(false);
                return;
            }
            return;
        }
        AbstractC16283egx abstractC16283egx9 = this.EZpvd;
        if (abstractC16283egx9 == null) {
            Intrinsics.gEmmrt("");
            abstractC16283egx9 = null;
        }
        android.widget.EditText editTextCopydefault4 = abstractC16283egx9.copydefault.copydefault();
        if (java.lang.String.valueOf(editTextCopydefault4 != null ? editTextCopydefault4.getText() : null).length() == 0) {
            AbstractC16283egx abstractC16283egx10 = this.EZpvd;
            if (abstractC16283egx10 == null) {
                Intrinsics.gEmmrt("");
            } else {
                abstractC16283egx = abstractC16283egx10;
            }
            C52794wYp c52794wYpCopydefault5 = abstractC16283egx.EZpvd.copydefault();
            if (c52794wYpCopydefault5 != null) {
                c52794wYpCopydefault5.setEnabled(false);
                return;
            }
            return;
        }
        AbstractC16283egx abstractC16283egx11 = this.EZpvd;
        if (abstractC16283egx11 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC16283egx = abstractC16283egx11;
        }
        C52794wYp c52794wYpCopydefault6 = abstractC16283egx.EZpvd.copydefault();
        if (c52794wYpCopydefault6 != null) {
            c52794wYpCopydefault6.setEnabled(true);
        }
    }

    public final void KWHzl() {
        AbstractC16283egx abstractC16283egx = this.EZpvd;
        AbstractC16283egx abstractC16283egx2 = null;
        if (abstractC16283egx == null) {
            Intrinsics.gEmmrt("");
            abstractC16283egx = null;
        }
        abstractC16283egx.djBIcL.EZpvd();
        AbstractC16283egx abstractC16283egx3 = this.EZpvd;
        if (abstractC16283egx3 == null) {
            Intrinsics.gEmmrt("");
            abstractC16283egx3 = null;
        }
        abstractC16283egx3.valueOf.EZpvd();
        AbstractC16283egx abstractC16283egx4 = this.EZpvd;
        if (abstractC16283egx4 == null) {
            Intrinsics.gEmmrt("");
            abstractC16283egx4 = null;
        }
        abstractC16283egx4.KWHzl.OLrzqt();
        AbstractC16283egx abstractC16283egx5 = this.EZpvd;
        if (abstractC16283egx5 == null) {
            Intrinsics.gEmmrt("");
            abstractC16283egx5 = null;
        }
        abstractC16283egx5.copydefault.EZpvd();
        AbstractC16283egx abstractC16283egx6 = this.EZpvd;
        if (abstractC16283egx6 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC16283egx2 = abstractC16283egx6;
        }
        abstractC16283egx2.OLrzqt.EZpvd();
    }

    public final void OLrzqt() {
        AbstractC16283egx abstractC16283egx = this.EZpvd;
        AbstractC16283egx abstractC16283egx2 = null;
        if (abstractC16283egx == null) {
            Intrinsics.gEmmrt("");
            abstractC16283egx = null;
        }
        abstractC16283egx.djBIcL.OLrzqt();
        AbstractC16283egx abstractC16283egx3 = this.EZpvd;
        if (abstractC16283egx3 == null) {
            Intrinsics.gEmmrt("");
            abstractC16283egx3 = null;
        }
        abstractC16283egx3.valueOf.OLrzqt();
        AbstractC16283egx abstractC16283egx4 = this.EZpvd;
        if (abstractC16283egx4 == null) {
            Intrinsics.gEmmrt("");
            abstractC16283egx4 = null;
        }
        abstractC16283egx4.KWHzl.OLrzqt();
        AbstractC16283egx abstractC16283egx5 = this.EZpvd;
        if (abstractC16283egx5 == null) {
            Intrinsics.gEmmrt("");
            abstractC16283egx5 = null;
        }
        abstractC16283egx5.copydefault.OLrzqt();
        AbstractC16283egx abstractC16283egx6 = this.EZpvd;
        if (abstractC16283egx6 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC16283egx2 = abstractC16283egx6;
        }
        abstractC16283egx2.OLrzqt.OLrzqt();
    }

    public final void AhwBna() {
        AbstractC16283egx abstractC16283egx = this.EZpvd;
        AbstractC16283egx abstractC16283egx2 = null;
        if (abstractC16283egx == null) {
            Intrinsics.gEmmrt("");
            abstractC16283egx = null;
        }
        abstractC16283egx.AhwBna.setVisibility(0);
        AbstractC16283egx abstractC16283egx3 = this.EZpvd;
        if (abstractC16283egx3 == null) {
            Intrinsics.gEmmrt("");
            abstractC16283egx3 = null;
        }
        abstractC16283egx3.AhwBna.setStyle(0);
        AbstractC16283egx abstractC16283egx4 = this.EZpvd;
        if (abstractC16283egx4 == null) {
            Intrinsics.gEmmrt("");
            abstractC16283egx4 = null;
        }
        abstractC16283egx4.AhwBna.setCloseIconVisibility(false);
        AbstractC16283egx abstractC16283egx5 = this.EZpvd;
        if (abstractC16283egx5 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC16283egx2 = abstractC16283egx5;
        }
        abstractC16283egx2.AhwBna.setMessage(C33070mpX.AYXKKw(C13754dXa.FragmentManager.hrjNmC));
    }

    public final void copydefault(CustomChainMeta customChainMeta) {
        AbstractC16283egx abstractC16283egx = this.EZpvd;
        if (abstractC16283egx == null) {
            Intrinsics.gEmmrt("");
            abstractC16283egx = null;
        }
        android.widget.EditText editTextCopydefault = abstractC16283egx.djBIcL.copydefault();
        if (editTextCopydefault != null) {
            editTextCopydefault.setText(customChainMeta.OLrzqt());
        }
        android.widget.EditText editTextCopydefault2 = abstractC16283egx.valueOf.copydefault();
        if (editTextCopydefault2 != null) {
            editTextCopydefault2.setText(customChainMeta.isConnected());
        }
        android.widget.EditText editTextCopydefault3 = abstractC16283egx.KWHzl.copydefault();
        if (editTextCopydefault3 != null) {
            editTextCopydefault3.setText(java.lang.String.valueOf(customChainMeta.fetchVPNInfo()));
        }
        android.widget.EditText editTextCopydefault4 = abstractC16283egx.copydefault.copydefault();
        if (editTextCopydefault4 != null) {
            CustomChainCoinMeta customChainCoinMetaDjBIcL = customChainMeta.djBIcL();
            editTextCopydefault4.setText(customChainCoinMetaDjBIcL != null ? customChainCoinMetaDjBIcL.ejfBZ() : null);
        }
        android.widget.EditText editTextCopydefault5 = abstractC16283egx.OLrzqt.copydefault();
        if (editTextCopydefault5 != null) {
            editTextCopydefault5.setText(customChainMeta.AEQbTJ());
        }
    }

    private final AbstractC58260yxt<java.lang.Long> copydefault(java.lang.String str) {
        return C58156yvv.KWHzl(C10734btz.KWHzl.uzCIH(str), this);
    }

    public final boolean KWHzl(java.lang.String str) {
        try {
            new java.net.URL(str);
            return true;
        } catch (MalformedURLException unused) {
            return false;
        }
    }

    public final void AYXKKw() {
        if (this.AEQbTJ == null) {
            return;
        }
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(this);
        viewOnClickListenerC54939xaY.OLrzqt(C33070mpX.copydefault(C52761wXj.Activity.fdOvFl));
        int i = C13754dXa.FragmentManager.DcMfJKfwDlxl;
        CustomChainMeta customChainMeta = this.AEQbTJ;
        Intrinsics.copydefault(customChainMeta);
        viewOnClickListenerC54939xaY.setTitle(C33069mpW.copydefault(i, C56423yEv.EZpvd(C56390yDp.OLrzqt("network", customChainMeta.OLrzqt()))));
        viewOnClickListenerC54939xaY.EZpvd(C33070mpX.AYXKKw(C13754dXa.FragmentManager.DcMfJKsgNvtZ));
        ViewOnClickListenerC54939xaY.setSecondaryButton$default(viewOnClickListenerC54939xaY, C33070mpX.AYXKKw(C13754dXa.FragmentManager.getSessionToken), (View.OnClickListener) null, 2, (java.lang.Object) null);
        viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) C33070mpX.AYXKKw(C13754dXa.FragmentManager.DcMfJKsfEqpH), new View.OnClickListener() { // from class: o.edF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                ActivityC16104edd.OLrzqt(viewOnClickListenerC54939xaY, this, view);
            }
        });
        viewOnClickListenerC54939xaY.show();
    }

    public static final void OLrzqt(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, ActivityC16104edd activityC16104edd, android.view.View view) {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewOnClickListenerC54939xaY), null, null, new AddCustomNetworkActivity$showDeleteDialog$1$1$1(activityC16104edd, viewOnClickListenerC54939xaY, null), 3, null);
    }

    public final void valueOf() {
        ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(this);
        viewOnClickListenerC54939xaY.setTitle(C33070mpX.AYXKKw(C13754dXa.FragmentManager.iCPUKe));
        viewOnClickListenerC54939xaY.EZpvd(C33070mpX.AYXKKw(C13754dXa.FragmentManager.fGQ));
        ViewOnClickListenerC54939xaY.addPrimaryButton$default(viewOnClickListenerC54939xaY, C33070mpX.AYXKKw(C13754dXa.FragmentManager.getNotifyChildrenChangedOptions), (View.OnClickListener) null, 2, (java.lang.Object) null);
        viewOnClickListenerC54939xaY.show();
    }

    /* JADX INFO: renamed from: o.edd$StateListAnimator */
    /* JADX INFO: loaded from: classes14.dex */
    public static final class StateListAnimator {
        public final long KWHzl;
        public final boolean OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ StateListAnimator copy$default(StateListAnimator stateListAnimator, boolean z, long j, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                z = stateListAnimator.OLrzqt;
            }
            if ((i & 2) != 0) {
                j = stateListAnimator.KWHzl;
            }
            return stateListAnimator.OLrzqt(z, j);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StateListAnimator OLrzqt(boolean z, long j) {
            return new StateListAnimator(z, j);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StateListAnimator)) {
                return false;
            }
            StateListAnimator stateListAnimator = (StateListAnimator) obj;
            return this.OLrzqt == stateListAnimator.OLrzqt && this.KWHzl == stateListAnimator.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (java.lang.Boolean.hashCode(this.OLrzqt) * 31) + java.lang.Long.hashCode(this.KWHzl);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "CustomCoinAddOrUpdateResult(success=" + this.OLrzqt + ", chainId=" + this.KWHzl + ")";
        }

        public StateListAnimator(boolean z, long j) {
            this.OLrzqt = z;
            this.KWHzl = j;
        }
    }

    public final void OLrzqt(java.lang.String str) {
        java.lang.Object next;
        java.lang.Object next2;
        AbstractC16283egx abstractC16283egx = null;
        if (this.AEQbTJ != null) {
            java.util.Iterator<T> it = this.OLrzqt.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next2 = null;
                    break;
                } else {
                    next2 = it.next();
                    if (Intrinsics.EZpvd((java.lang.Object) ((CustomChainMeta) next2).isConnected(), (java.lang.Object) str)) {
                        break;
                    }
                }
            }
            CustomChainMeta customChainMeta = (CustomChainMeta) next2;
            if (customChainMeta != null) {
                CustomChainMeta customChainMeta2 = this.AEQbTJ;
                if (!Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) (customChainMeta2 != null ? customChainMeta2.isConnected() : null))) {
                    this.gEmmrt = true;
                    AbstractC16283egx abstractC16283egx2 = this.EZpvd;
                    if (abstractC16283egx2 == null) {
                        Intrinsics.gEmmrt("");
                    } else {
                        abstractC16283egx = abstractC16283egx2;
                    }
                    abstractC16283egx.valueOf.copydefault(C33069mpW.copydefault(C13754dXa.FragmentManager.gtdfxv, C56423yEv.EZpvd(C56390yDp.OLrzqt("network", customChainMeta.OLrzqt()))));
                }
            }
            EZpvd();
            return;
        }
        java.util.Iterator<T> it2 = this.OLrzqt.iterator();
        while (true) {
            if (!it2.hasNext()) {
                next = null;
                break;
            } else {
                next = it2.next();
                if (Intrinsics.EZpvd((java.lang.Object) ((CustomChainMeta) next).isConnected(), (java.lang.Object) str)) {
                    break;
                }
            }
        }
        CustomChainMeta customChainMeta3 = (CustomChainMeta) next;
        if (customChainMeta3 != null) {
            this.gEmmrt = true;
            AbstractC16283egx abstractC16283egx3 = this.EZpvd;
            if (abstractC16283egx3 == null) {
                Intrinsics.gEmmrt("");
            } else {
                abstractC16283egx = abstractC16283egx3;
            }
            abstractC16283egx.valueOf.copydefault(C33069mpW.copydefault(C13754dXa.FragmentManager.gtdfxv, C56423yEv.EZpvd(C56390yDp.OLrzqt("network", customChainMeta3.OLrzqt()))));
            EZpvd();
            return;
        }
        this.gEmmrt = false;
        AbstractC16283egx abstractC16283egx4 = this.EZpvd;
        if (abstractC16283egx4 == null) {
            Intrinsics.gEmmrt("");
            abstractC16283egx4 = null;
        }
        abstractC16283egx4.valueOf.copydefault(null);
        showLoading();
        AbstractC58260yxt<java.lang.Long> abstractC58260yxtCopydefault = copydefault(str);
        final Function1 function1 = new Function1() { // from class: o.edm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC16104edd.AEQbTJ(this.OLrzqt, (java.lang.Long) obj);
            }
        };
        InterfaceC58227yxM<? super java.lang.Long> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.edk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                ActivityC16104edd.values(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.edi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC16104edd.copydefault(this.AEQbTJ, (java.lang.Throwable) obj);
            }
        };
        addDisposable(abstractC58260yxtCopydefault.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.edo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                ActivityC16104edd.isConnected(function12, obj);
            }
        }));
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
