package o;

import android.view.View;
import com.okinc.okex.common.actions.CommonEmailHandler$invoke$2$1;
import com.okinc.okex.common.model.SupportServiceData;
import java.lang.ref.WeakReference;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.C45242smB;
import o.C47315tni;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.smB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C45242smB implements InterfaceC45302snI {
    public final CoroutineDispatcher OLrzqt;
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int copydefault = 8;
    public static WeakReference<ViewOnClickListenerC54939xaY> AEQbTJ = new WeakReference<>(null);

    @yCM
    public C45242smB(@NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.OLrzqt = coroutineDispatcher;
    }

    /* JADX INFO: renamed from: o.smB$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.smB.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final ViewOnClickListenerC54939xaY OLrzqt(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            android.app.Activity activityKWHzl = C45357soK.KWHzl.KWHzl();
            if (activityKWHzl == null) {
                C44760scx.log$default("CommonEmailHandler: Could not find suitable context for displaying the email fallback popup", null, 2, null);
                return null;
            }
            ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = (ViewOnClickListenerC54939xaY) C45242smB.AEQbTJ.get();
            if (viewOnClickListenerC54939xaY != null) {
                viewOnClickListenerC54939xaY.dismiss();
            }
            final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY2 = new ViewOnClickListenerC54939xaY(activityKWHzl);
            viewOnClickListenerC54939xaY2.AEQbTJ(C47315tni.PendingIntent.DPhTBN, C47315tni.PendingIntent.DrNnAm);
            viewOnClickListenerC54939xaY2.EZpvd(C47315tni.PendingIntent.copydefault, new View.OnClickListener() { // from class: o.smE
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C45242smB.TaskDescription.KWHzl(viewOnClickListenerC54939xaY2, view);
                }
            });
            AbstractC47465tqZ abstractC47465tqZCopydefault = AbstractC47465tqZ.copydefault(viewOnClickListenerC54939xaY2.getLayoutInflater());
            Intrinsics.checkNotNullExpressionValue(abstractC47465tqZCopydefault, "");
            abstractC47465tqZCopydefault.OLrzqt.setText(str);
            android.widget.FrameLayout frameLayout = abstractC47465tqZCopydefault.AEQbTJ;
            frameLayout.setOnClickListener(new ActionBar(frameLayout, 1000L, viewOnClickListenerC54939xaY2, activityKWHzl, str));
            android.view.View root = abstractC47465tqZCopydefault.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "");
            viewOnClickListenerC54939xaY2.OLrzqt(root, C33070mpX.OLrzqt(C52761wXj.StateListAnimator.ODWQjV));
            viewOnClickListenerC54939xaY2.setCancelable(false);
            viewOnClickListenerC54939xaY2.setCanceledOnTouchOutside(false);
            C45242smB.AEQbTJ = new WeakReference(viewOnClickListenerC54939xaY2);
            return viewOnClickListenerC54939xaY2;
        }

        public static final void KWHzl(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
            viewOnClickListenerC54939xaY.dismiss();
        }

        /* JADX INFO: renamed from: o.smB$TaskDescription$ActionBar */
        public static final class ActionBar implements View.OnClickListener {
            public final /* synthetic */ android.view.View AEQbTJ;
            public final /* synthetic */ java.lang.String EZpvd;
            public final /* synthetic */ long KWHzl;
            public final /* synthetic */ android.app.Activity OLrzqt;
            public final /* synthetic */ ViewOnClickListenerC54939xaY copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public ActionBar(android.view.View view, long j, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.app.Activity activity, java.lang.String str) {
                this.AEQbTJ = view;
                this.KWHzl = j;
                this.copydefault = viewOnClickListenerC54939xaY;
                this.OLrzqt = activity;
                this.EZpvd = str;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.KWHzl || (this.AEQbTJ instanceof android.widget.Checkable)) {
                    C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                    try {
                        Result.Application application = Result.Companion;
                        java.lang.Object systemService = this.OLrzqt.getSystemService("clipboard");
                        Intrinsics.copydefault(systemService, "");
                        java.lang.String str = this.EZpvd;
                        ((android.content.ClipboardManager) systemService).setPrimaryClip(android.content.ClipData.newPlainText(str, str));
                        C55326xho.toast$default(C47315tni.PendingIntent.valueOf, (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
                        Result.m7377constructorimpl(Unit.INSTANCE);
                    } catch (java.lang.Throwable th) {
                        Result.Application application2 = Result.Companion;
                        Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                    }
                }
            }
        }
    }

    @Override // o.InterfaceC45302snI
    public java.lang.Object EZpvd(@NotNull android.content.Context context, java.lang.Object obj, @NotNull Continuation<? super Unit> continuation) {
        java.lang.Object objWithContext;
        C44760scx.log$default("CommonEmailHandler: invoke > data type: " + (obj != null ? C56524yIo.AEQbTJ(obj.getClass()).gEmmrt() : AbstractJsonLexerKt.NULL), null, 2, null);
        return ((obj instanceof SupportServiceData.EmailData ? (SupportServiceData.EmailData) obj : null) == null || C33058mpL.email$default(context, ((SupportServiceData.EmailData) obj).getEmail(), (java.lang.String) null, (java.lang.String) null, 6, (java.lang.Object) null) || (objWithContext = BuildersKt.withContext(this.OLrzqt, new CommonEmailHandler$invoke$2$1(obj, null), continuation)) != C56442yFn.copydefault()) ? Unit.INSTANCE : objWithContext;
    }
}
