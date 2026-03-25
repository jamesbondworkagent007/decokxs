package o;

import android.view.View;
import androidx.lifecycle.LifecycleOwnerKt;
import com.okinc.planet.biz_content.draft.DraftDataInfo;
import com.okinc.planet.biz_notifications.model.SystemSubType;
import com.okinc.planet.biz_notifications.ui.SystemNotificationFragment$onRegisterItemTemplates$1$jumpPublisher$2$1;
import com.okinc.planet.domain.remote.dto.DraftModel;
import com.okinc.planet.domain.remote.dto.UnreadMsg;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.C47501trL;
import o.C47952tzn;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tzn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C47952tzn extends AbstractC47868tyI {
    @Override // o.AbstractC47868tyI
    public void copydefault(C55173xeu c55173xeu) {
        super.copydefault(c55173xeu);
        java.lang.String string = getResources().getString(C47501trL.Fragment.DwQSDd);
        Intrinsics.checkNotNullExpressionValue(string, "");
        if (c55173xeu != null) {
            c55173xeu.setSubTitle((java.lang.CharSequence) string);
        }
    }

    /* JADX INFO: renamed from: o.tzn$Activity */
    public static final class Activity extends C47959tzu {

        /* JADX INFO: renamed from: o.tzn$Activity$Application */
        public final /* synthetic */ class Application {
            public static final /* synthetic */ int[] EZpvd;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            static {
                int[] iArr = new int[SystemSubType.values().length];
                try {
                    iArr[SystemSubType.Post_Removed.ordinal()] = 1;
                } catch (java.lang.NoSuchFieldError unused) {
                }
                try {
                    iArr[SystemSubType.Comments_Removed.ordinal()] = 2;
                } catch (java.lang.NoSuchFieldError unused2) {
                }
                try {
                    iArr[SystemSubType.Post_Review_Failed.ordinal()] = 3;
                } catch (java.lang.NoSuchFieldError unused3) {
                }
                try {
                    iArr[SystemSubType.Comments_Review_Failed.ordinal()] = 4;
                } catch (java.lang.NoSuchFieldError unused4) {
                }
                try {
                    iArr[SystemSubType.Content_Sync_Success.ordinal()] = 5;
                } catch (java.lang.NoSuchFieldError unused5) {
                }
                try {
                    iArr[SystemSubType.Content_Sync_Failed.ordinal()] = 6;
                } catch (java.lang.NoSuchFieldError unused6) {
                }
                try {
                    iArr[SystemSubType.Twitter_Sync_Failed.ordinal()] = 7;
                } catch (java.lang.NoSuchFieldError unused7) {
                }
                try {
                    iArr[SystemSubType.BIO_REVIEW_FAILS.ordinal()] = 8;
                } catch (java.lang.NoSuchFieldError unused8) {
                }
                EZpvd = iArr;
            }
        }

        public Activity(C47925tzM c47925tzM) {
            super(c47925tzM);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [o.rms, java.lang.Object] */
        @Override // o.C47959tzu, o.AbstractC43310rmq
        public /* synthetic */ void onBindViewHolder(C43312rms c43312rms, UnreadMsg unreadMsg) {
            onBindViewHolder((C43312rms<tMS>) c43312rms, unreadMsg);
        }

        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
        @Override // o.C47959tzu, o.AbstractC43310rmq, o.AbstractC59533zio
        /* JADX INFO: renamed from: EZpvd */
        public void onBindViewHolder(C43312rms<tMS> c43312rms, UnreadMsg unreadMsg) {
            Intrinsics.checkNotNullParameter(c43312rms, "");
            Intrinsics.checkNotNullParameter(unreadMsg, "");
            super.onBindViewHolder(c43312rms, unreadMsg);
            android.content.Context context = c43312rms.itemView.getContext();
            SystemSubType systemSubTypeOLrzqt = SystemSubType.Companion.OLrzqt(unreadMsg.getEventSubType());
            EZpvd(c43312rms, false, unreadMsg);
            switch (systemSubTypeOLrzqt == null ? -1 : Application.EZpvd[systemSubTypeOLrzqt.ordinal()]) {
                case 1:
                    java.lang.String string = context.getString(C47501trL.Fragment.QWpYiD);
                    Intrinsics.checkNotNullExpressionValue(string, "");
                    KWHzl(c43312rms, string);
                    java.lang.String msgText = unreadMsg.getMsgText();
                    EZpvd(c43312rms, msgText != null ? msgText : "");
                    KWHzl(c43312rms, C47501trL.ActionBar.AYXKKw);
                    android.view.View view = c43312rms.itemView;
                    view.setOnClickListener(new TaskDescription(view, 1000L, this, c43312rms, unreadMsg, C47952tzn.this, context));
                    break;
                case 2:
                    java.lang.String string2 = context.getString(C47501trL.Fragment.ExKek);
                    Intrinsics.checkNotNullExpressionValue(string2, "");
                    KWHzl(c43312rms, string2);
                    java.lang.String msgText2 = unreadMsg.getMsgText();
                    EZpvd(c43312rms, msgText2 != null ? msgText2 : "");
                    KWHzl(c43312rms, C47501trL.ActionBar.AYXKKw);
                    android.view.View view2 = c43312rms.itemView;
                    view2.setOnClickListener(new ViewOnClickListenerC0974Activity(view2, 1000L, this, c43312rms, unreadMsg, C47952tzn.this));
                    break;
                case 3:
                    java.lang.String string3 = context.getString(C47501trL.Fragment.jNexW);
                    Intrinsics.checkNotNullExpressionValue(string3, "");
                    KWHzl(c43312rms, string3);
                    java.lang.String msgText3 = unreadMsg.getMsgText();
                    EZpvd(c43312rms, msgText3 != null ? msgText3 : "");
                    KWHzl(c43312rms, C47501trL.ActionBar.AYXKKw);
                    android.view.View view3 = c43312rms.itemView;
                    view3.setOnClickListener(new StateListAnimator(view3, 1000L, this, c43312rms, unreadMsg, C47952tzn.this, context));
                    break;
                case 4:
                    java.lang.String string4 = context.getString(C47501trL.Fragment.QKDJJA);
                    Intrinsics.checkNotNullExpressionValue(string4, "");
                    KWHzl(c43312rms, string4);
                    java.lang.String msgText4 = unreadMsg.getMsgText();
                    EZpvd(c43312rms, msgText4 != null ? msgText4 : "");
                    KWHzl(c43312rms, C47501trL.ActionBar.AYXKKw);
                    android.view.View view4 = c43312rms.itemView;
                    view4.setOnClickListener(new ActionBar(view4, 1000L, this, c43312rms, unreadMsg, C47952tzn.this));
                    break;
                case 5:
                    java.lang.String string5 = context.getString(C47501trL.Fragment.dbwnZN);
                    Intrinsics.checkNotNullExpressionValue(string5, "");
                    KWHzl(c43312rms, string5);
                    java.lang.String string6 = context.getString(C47501trL.Fragment.fiXcQa);
                    Intrinsics.checkNotNullExpressionValue(string6, "");
                    EZpvd(c43312rms, string6);
                    KWHzl(c43312rms, C47501trL.ActionBar.AYXKKw);
                    android.view.View view5 = c43312rms.itemView;
                    view5.setOnClickListener(new FragmentManager(view5, 1000L, this, c43312rms, unreadMsg, string6, C47952tzn.this));
                    break;
                case 6:
                    java.lang.String string7 = context.getString(C47501trL.Fragment.QFTsTN);
                    Intrinsics.checkNotNullExpressionValue(string7, "");
                    KWHzl(c43312rms, string7);
                    java.lang.String string8 = context.getString(C47501trL.Fragment.iUnTnt);
                    Intrinsics.checkNotNullExpressionValue(string8, "");
                    EZpvd(c43312rms, string8);
                    KWHzl(c43312rms, C47501trL.ActionBar.AYXKKw);
                    android.view.View view6 = c43312rms.itemView;
                    view6.setOnClickListener(new LoaderManager(view6, 1000L, this, c43312rms, unreadMsg, string8, C47952tzn.this));
                    break;
                case 7:
                    java.lang.String string9 = context.getString(C47501trL.Fragment.QFTsTN);
                    Intrinsics.checkNotNullExpressionValue(string9, "");
                    KWHzl(c43312rms, string9);
                    java.lang.String string10 = context.getString(C47501trL.Fragment.DlmWDR);
                    Intrinsics.checkNotNullExpressionValue(string10, "");
                    EZpvd(c43312rms, string10);
                    KWHzl(c43312rms, C47501trL.ActionBar.AYXKKw);
                    android.view.View view7 = c43312rms.itemView;
                    view7.setOnClickListener(new Dialog(view7, 1000L, this, c43312rms, unreadMsg, string10, C47952tzn.this));
                    break;
                case 8:
                    java.lang.String string11 = context.getString(C47501trL.Fragment.fHqPtx);
                    Intrinsics.checkNotNullExpressionValue(string11, "");
                    KWHzl(c43312rms, string11);
                    EZpvd(c43312rms, C33129mqd.gEmmrt(unreadMsg.getMsgText()));
                    KWHzl(c43312rms, C47501trL.ActionBar.AYXKKw);
                    android.view.View view8 = c43312rms.itemView;
                    view8.setOnClickListener(new Fragment(view8, 1000L, this, c43312rms, unreadMsg, context, C47952tzn.this));
                    break;
                default:
                    java.lang.String string12 = context.getString(C47501trL.Fragment.DzkRMH);
                    Intrinsics.checkNotNullExpressionValue(string12, "");
                    KWHzl(c43312rms, string12);
                    java.lang.String string13 = context.getString(C47501trL.Fragment.DDjfYY);
                    Intrinsics.checkNotNullExpressionValue(string13, "");
                    EZpvd(c43312rms, string13);
                    KWHzl(c43312rms, C47501trL.ActionBar.AYXKKw);
                    android.view.View view9 = c43312rms.itemView;
                    view9.setOnClickListener(new PendingIntent(view9, 1000L, this, c43312rms, unreadMsg, C47952tzn.this));
                    break;
            }
        }

        public final void OLrzqt(UnreadMsg unreadMsg, final android.content.Context context, final C43312rms<tMS> c43312rms) {
            DraftModel draft = unreadMsg.getDraft();
            if (C33129mqd.OLrzqt((java.lang.CharSequence) (draft != null ? draft.getDraftId() : null))) {
                C47931tzS c47931tzSValueOf = C47952tzn.this.valueOf();
                DraftModel draft2 = unreadMsg.getDraft();
                java.lang.String draftId = draft2 != null ? draft2.getDraftId() : null;
                Intrinsics.copydefault((java.lang.Object) draftId);
                Function1<? super java.lang.String, Unit> function1 = new Function1() { // from class: o.tzt
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C47952tzn.Activity.KWHzl(this.EZpvd, c43312rms, (java.lang.String) obj);
                    }
                };
                final C47952tzn c47952tzn = C47952tzn.this;
                c47931tzSValueOf.EZpvd(draftId, function1, new Function1() { // from class: o.tzv
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C47952tzn.Activity.EZpvd(c47952tzn, context, (DraftDataInfo) obj);
                    }
                });
                return;
            }
            android.view.View view = c43312rms.itemView;
            Intrinsics.checkNotNullExpressionValue(view, "");
            KWHzl(view);
        }

        public static final Unit KWHzl(Activity activity, C43312rms c43312rms, java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            if (C33129mqd.OLrzqt((java.lang.CharSequence) str)) {
                C55326xho.toastWithFailedIcon$default(str, 0, 1, (java.lang.Object) null);
            } else {
                android.view.View view = c43312rms.itemView;
                Intrinsics.checkNotNullExpressionValue(view, "");
                activity.KWHzl(view);
            }
            return Unit.INSTANCE;
        }

        public static final Unit EZpvd(C47952tzn c47952tzn, android.content.Context context, DraftDataInfo draftDataInfo) {
            Intrinsics.checkNotNullParameter(draftDataInfo, "");
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(c47952tzn), null, null, new SystemNotificationFragment$onRegisterItemTemplates$1$jumpPublisher$2$1(context, draftDataInfo, null), 3, null);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: o.tzn$Activity$ActionBar */
        public static final class ActionBar implements View.OnClickListener {
            public final /* synthetic */ android.view.View AEQbTJ;
            public final /* synthetic */ C47952tzn AhwBna;
            public final /* synthetic */ Activity EZpvd;
            public final /* synthetic */ long KWHzl;
            public final /* synthetic */ C43312rms OLrzqt;
            public final /* synthetic */ UnreadMsg copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public ActionBar(android.view.View view, long j, Activity activity, C43312rms c43312rms, UnreadMsg unreadMsg, C47952tzn c47952tzn) {
                this.AEQbTJ = view;
                this.KWHzl = j;
                this.EZpvd = activity;
                this.OLrzqt = c43312rms;
                this.copydefault = unreadMsg;
                this.AhwBna = c47952tzn;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.KWHzl || (this.AEQbTJ instanceof android.widget.Checkable)) {
                    C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                    Activity.super.copydefault((C43312rms<tMS>) this.OLrzqt, false, this.copydefault);
                    Activity activity = this.EZpvd;
                    android.view.View view2 = this.OLrzqt.itemView;
                    Intrinsics.checkNotNullExpressionValue(view2, "");
                    activity.KWHzl(view2);
                    C47910tyy.copydefault.KWHzl(this.AhwBna.EZpvd(), this.copydefault);
                }
            }
        }

        /* JADX INFO: renamed from: o.tzn$Activity$Activity, reason: collision with other inner class name */
        public static final class ViewOnClickListenerC0974Activity implements View.OnClickListener {
            public final /* synthetic */ long AEQbTJ;
            public final /* synthetic */ C47952tzn AhwBna;
            public final /* synthetic */ UnreadMsg EZpvd;
            public final /* synthetic */ Activity KWHzl;
            public final /* synthetic */ C43312rms OLrzqt;
            public final /* synthetic */ android.view.View copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public ViewOnClickListenerC0974Activity(android.view.View view, long j, Activity activity, C43312rms c43312rms, UnreadMsg unreadMsg, C47952tzn c47952tzn) {
                this.copydefault = view;
                this.AEQbTJ = j;
                this.KWHzl = activity;
                this.OLrzqt = c43312rms;
                this.EZpvd = unreadMsg;
                this.AhwBna = c47952tzn;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.AEQbTJ || (this.copydefault instanceof android.widget.Checkable)) {
                    C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                    Activity.super.copydefault((C43312rms<tMS>) this.OLrzqt, false, this.EZpvd);
                    Activity activity = this.KWHzl;
                    android.view.View view2 = this.OLrzqt.itemView;
                    Intrinsics.checkNotNullExpressionValue(view2, "");
                    activity.KWHzl(view2);
                    C47910tyy.copydefault.KWHzl(this.AhwBna.EZpvd(), this.EZpvd);
                }
            }
        }

        /* JADX INFO: renamed from: o.tzn$Activity$Dialog */
        public static final class Dialog implements View.OnClickListener {
            public final /* synthetic */ UnreadMsg AEQbTJ;
            public final /* synthetic */ C43312rms EZpvd;
            public final /* synthetic */ java.lang.String KWHzl;
            public final /* synthetic */ android.view.View OLrzqt;
            public final /* synthetic */ long copydefault;
            public final /* synthetic */ Activity djBIcL;
            public final /* synthetic */ C47952tzn gEmmrt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public Dialog(android.view.View view, long j, Activity activity, C43312rms c43312rms, UnreadMsg unreadMsg, java.lang.String str, C47952tzn c47952tzn) {
                this.OLrzqt = view;
                this.copydefault = j;
                this.djBIcL = activity;
                this.EZpvd = c43312rms;
                this.AEQbTJ = unreadMsg;
                this.KWHzl = str;
                this.gEmmrt = c47952tzn;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.copydefault || (this.OLrzqt instanceof android.widget.Checkable)) {
                    C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                    Activity.super.copydefault((C43312rms<tMS>) this.EZpvd, false, this.AEQbTJ);
                    Activity activity = this.djBIcL;
                    android.view.View view2 = this.EZpvd.itemView;
                    Intrinsics.checkNotNullExpressionValue(view2, "");
                    activity.copydefault(view2, this.KWHzl);
                    C47910tyy.copydefault.KWHzl(this.gEmmrt.EZpvd(), this.AEQbTJ);
                }
            }
        }

        /* JADX INFO: renamed from: o.tzn$Activity$Fragment */
        public static final class Fragment implements View.OnClickListener {
            public final /* synthetic */ long AEQbTJ;
            public final /* synthetic */ C47952tzn AYXKKw;
            public final /* synthetic */ android.content.Context EZpvd;
            public final /* synthetic */ android.view.View KWHzl;
            public final /* synthetic */ UnreadMsg OLrzqt;
            public final /* synthetic */ C43312rms copydefault;
            public final /* synthetic */ Activity valueOf;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public Fragment(android.view.View view, long j, Activity activity, C43312rms c43312rms, UnreadMsg unreadMsg, android.content.Context context, C47952tzn c47952tzn) {
                this.KWHzl = view;
                this.AEQbTJ = j;
                this.valueOf = activity;
                this.copydefault = c43312rms;
                this.OLrzqt = unreadMsg;
                this.EZpvd = context;
                this.AYXKKw = c47952tzn;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.AEQbTJ || (this.KWHzl instanceof android.widget.Checkable)) {
                    C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                    Activity.super.copydefault((C43312rms<tMS>) this.copydefault, false, this.OLrzqt);
                    java.lang.String string = this.EZpvd.getString(C47501trL.Fragment.DWgRXt);
                    Intrinsics.checkNotNullExpressionValue(string, "");
                    Activity activity = this.valueOf;
                    android.view.View view2 = this.copydefault.itemView;
                    Intrinsics.checkNotNullExpressionValue(view2, "");
                    activity.copydefault(view2, string);
                    C47910tyy.copydefault.KWHzl(this.AYXKKw.EZpvd(), this.OLrzqt);
                }
            }
        }

        /* JADX INFO: renamed from: o.tzn$Activity$FragmentManager */
        public static final class FragmentManager implements View.OnClickListener {
            public final /* synthetic */ java.lang.String AEQbTJ;
            public final /* synthetic */ long EZpvd;
            public final /* synthetic */ android.view.View KWHzl;
            public final /* synthetic */ C43312rms OLrzqt;
            public final /* synthetic */ UnreadMsg copydefault;
            public final /* synthetic */ C47952tzn djBIcL;
            public final /* synthetic */ Activity valueOf;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public FragmentManager(android.view.View view, long j, Activity activity, C43312rms c43312rms, UnreadMsg unreadMsg, java.lang.String str, C47952tzn c47952tzn) {
                this.KWHzl = view;
                this.EZpvd = j;
                this.valueOf = activity;
                this.OLrzqt = c43312rms;
                this.copydefault = unreadMsg;
                this.AEQbTJ = str;
                this.djBIcL = c47952tzn;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.EZpvd || (this.KWHzl instanceof android.widget.Checkable)) {
                    C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                    Activity.super.copydefault((C43312rms<tMS>) this.OLrzqt, false, this.copydefault);
                    Activity activity = this.valueOf;
                    android.view.View view2 = this.OLrzqt.itemView;
                    Intrinsics.checkNotNullExpressionValue(view2, "");
                    activity.copydefault(view2, this.AEQbTJ);
                    C47910tyy.copydefault.KWHzl(this.djBIcL.EZpvd(), this.copydefault);
                }
            }
        }

        /* JADX INFO: renamed from: o.tzn$Activity$LoaderManager */
        public static final class LoaderManager implements View.OnClickListener {
            public final /* synthetic */ long AEQbTJ;
            public final /* synthetic */ Activity AhwBna;
            public final /* synthetic */ UnreadMsg EZpvd;
            public final /* synthetic */ android.view.View KWHzl;
            public final /* synthetic */ java.lang.String OLrzqt;
            public final /* synthetic */ C43312rms copydefault;
            public final /* synthetic */ C47952tzn gEmmrt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public LoaderManager(android.view.View view, long j, Activity activity, C43312rms c43312rms, UnreadMsg unreadMsg, java.lang.String str, C47952tzn c47952tzn) {
                this.KWHzl = view;
                this.AEQbTJ = j;
                this.AhwBna = activity;
                this.copydefault = c43312rms;
                this.EZpvd = unreadMsg;
                this.OLrzqt = str;
                this.gEmmrt = c47952tzn;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.AEQbTJ || (this.KWHzl instanceof android.widget.Checkable)) {
                    C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                    Activity.super.copydefault((C43312rms<tMS>) this.copydefault, false, this.EZpvd);
                    Activity activity = this.AhwBna;
                    android.view.View view2 = this.copydefault.itemView;
                    Intrinsics.checkNotNullExpressionValue(view2, "");
                    activity.copydefault(view2, this.OLrzqt);
                    C47910tyy.copydefault.KWHzl(this.gEmmrt.EZpvd(), this.EZpvd);
                }
            }
        }

        /* JADX INFO: renamed from: o.tzn$Activity$PendingIntent */
        public static final class PendingIntent implements View.OnClickListener {
            public final /* synthetic */ Activity AEQbTJ;
            public final /* synthetic */ long EZpvd;
            public final /* synthetic */ C43312rms KWHzl;
            public final /* synthetic */ UnreadMsg OLrzqt;
            public final /* synthetic */ android.view.View copydefault;
            public final /* synthetic */ C47952tzn djBIcL;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public PendingIntent(android.view.View view, long j, Activity activity, C43312rms c43312rms, UnreadMsg unreadMsg, C47952tzn c47952tzn) {
                this.copydefault = view;
                this.EZpvd = j;
                this.AEQbTJ = activity;
                this.KWHzl = c43312rms;
                this.OLrzqt = unreadMsg;
                this.djBIcL = c47952tzn;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.EZpvd || (this.copydefault instanceof android.widget.Checkable)) {
                    C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                    Activity.super.copydefault((C43312rms<tMS>) this.KWHzl, false, this.OLrzqt);
                    Activity activity = this.AEQbTJ;
                    android.view.View view2 = this.KWHzl.itemView;
                    Intrinsics.checkNotNullExpressionValue(view2, "");
                    activity.EZpvd(view2);
                    C47910tyy.copydefault.KWHzl(this.djBIcL.EZpvd(), this.OLrzqt);
                }
            }
        }

        /* JADX INFO: renamed from: o.tzn$Activity$StateListAnimator */
        public static final class StateListAnimator implements View.OnClickListener {
            public final /* synthetic */ UnreadMsg AEQbTJ;
            public final /* synthetic */ Activity AYXKKw;
            public final /* synthetic */ android.content.Context EZpvd;
            public final /* synthetic */ long KWHzl;
            public final /* synthetic */ C43312rms OLrzqt;
            public final /* synthetic */ android.view.View copydefault;
            public final /* synthetic */ C47952tzn djBIcL;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public StateListAnimator(android.view.View view, long j, Activity activity, C43312rms c43312rms, UnreadMsg unreadMsg, C47952tzn c47952tzn, android.content.Context context) {
                this.copydefault = view;
                this.KWHzl = j;
                this.AYXKKw = activity;
                this.OLrzqt = c43312rms;
                this.AEQbTJ = unreadMsg;
                this.djBIcL = c47952tzn;
                this.EZpvd = context;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.KWHzl || (this.copydefault instanceof android.widget.Checkable)) {
                    C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                    Activity.super.copydefault((C43312rms<tMS>) this.OLrzqt, false, this.AEQbTJ);
                    Activity activity = this.AYXKKw;
                    android.view.View view2 = this.OLrzqt.itemView;
                    Intrinsics.checkNotNullExpressionValue(view2, "");
                    activity.KWHzl(view2);
                    C47910tyy.copydefault.KWHzl(this.djBIcL.EZpvd(), this.AEQbTJ);
                    Activity activity2 = this.AYXKKw;
                    UnreadMsg unreadMsg = this.AEQbTJ;
                    Intrinsics.copydefault(this.EZpvd);
                    activity2.OLrzqt(unreadMsg, this.EZpvd, this.OLrzqt);
                }
            }
        }

        /* JADX INFO: renamed from: o.tzn$Activity$TaskDescription */
        public static final class TaskDescription implements View.OnClickListener {
            public final /* synthetic */ UnreadMsg AEQbTJ;
            public final /* synthetic */ Activity AYXKKw;
            public final /* synthetic */ C47952tzn AhwBna;
            public final /* synthetic */ android.content.Context EZpvd;
            public final /* synthetic */ android.view.View KWHzl;
            public final /* synthetic */ C43312rms OLrzqt;
            public final /* synthetic */ long copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public TaskDescription(android.view.View view, long j, Activity activity, C43312rms c43312rms, UnreadMsg unreadMsg, C47952tzn c47952tzn, android.content.Context context) {
                this.KWHzl = view;
                this.copydefault = j;
                this.AYXKKw = activity;
                this.OLrzqt = c43312rms;
                this.AEQbTJ = unreadMsg;
                this.AhwBna = c47952tzn;
                this.EZpvd = context;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.copydefault || (this.KWHzl instanceof android.widget.Checkable)) {
                    C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                    Activity.super.copydefault((C43312rms<tMS>) this.OLrzqt, false, this.AEQbTJ);
                    C47910tyy.copydefault.KWHzl(this.AhwBna.EZpvd(), this.AEQbTJ);
                    Activity activity = this.AYXKKw;
                    UnreadMsg unreadMsg = this.AEQbTJ;
                    Intrinsics.copydefault(this.EZpvd);
                    activity.OLrzqt(unreadMsg, this.EZpvd, this.OLrzqt);
                }
            }
        }
    }

    @Override // o.AbstractC47868tyI
    public void copydefault(@NotNull C59534zip c59534zip) {
        Intrinsics.checkNotNullParameter(c59534zip, "");
        super.copydefault(c59534zip);
        c59534zip.register(UnreadMsg.class, new Activity(gEmmrt()));
    }
}
