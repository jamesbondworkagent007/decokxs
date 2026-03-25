package o;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.business.market.features.meme.data.model.XPostType;
import com.okinc.business.market.features.meme.domain.model.MemeCarSharingData;
import com.okinc.business.market.features.meme.domain.model.MemeCarSharingType;
import com.okinc.business.market.features.meme.domain.model.MemeProtocolUiData;
import com.okinc.business.market.features.meme.domain.model.MemeSocialMediaData;
import com.okinc.business.market.features.meme.domain.model.MemeTagsData;
import com.okinc.business.market.features.meme.domain.model.MemeUiModel;
import com.okinc.business.market.features.meme.token_detail_sheet.ui.TokenDetailTabType;
import com.okinc.business.market.features.meme.ui.MemeViewHolder$loadShimmerDetails$1$displayText$1$text$1;
import com.okinc.business.market.features.tag.domain.TagMeta;
import com.okinc.business.market.features.tag.domain.TagWrapper;
import java.math.RoundingMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.C23274hvD;
import o.C28848kiX;
import o.C28915kjl;
import o.C52761wXj;
import o.C57406yhn;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kjl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C28915kjl extends RecyclerView.ViewHolder {
    public final hCM AEQbTJ;
    public final Function1<MemeUiModel, Unit> AYXKKw;
    public final Function1<MemeUiModel, Unit> AhwBna;
    public MemeUiModel DbNXlk;
    public boolean EZpvd;
    public boolean KWHzl;
    public MemeUiModel OLrzqt;
    public final CoroutineScope copydefault;
    public final Function2<java.lang.Integer, java.lang.String, Unit> djBIcL;
    public final int fetchVPNInfo;
    public final yHO<kotlin.Pair<java.lang.Integer, java.lang.Integer>, MemeUiModel, java.lang.Integer, Unit> gEmmrt;
    public final Function1<MemeUiModel, Unit> isConnected;
    public final Function0<Unit> valueOf;
    public final Function2<MemeUiModel, TokenDetailTabType, Unit> values;

    /* JADX INFO: renamed from: o.kjl$Activity */
    public final /* synthetic */ class Activity {
        public static final /* synthetic */ int[] AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[MemeCarSharingType.values().length];
            try {
                iArr[MemeCarSharingType.SMART_MONEY.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[MemeCarSharingType.KOL.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[MemeCarSharingType.FOLLOWING.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            AEQbTJ = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ() {
        this.DbNXlk = null;
        this.KWHzl = false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd() {
        this.OLrzqt = null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(@NotNull MemeUiModel memeUiModel) {
        Intrinsics.checkNotNullParameter(memeUiModel, "");
        this.DbNXlk = memeUiModel;
        this.KWHzl = true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(@NotNull MemeUiModel memeUiModel) {
        Intrinsics.checkNotNullParameter(memeUiModel, "");
        this.OLrzqt = memeUiModel;
    }

    /* JADX INFO: renamed from: o.kjl$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ C28915kjl KWHzl;
        public final /* synthetic */ MemeUiModel OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, C28915kjl c28915kjl, MemeUiModel memeUiModel) {
            this.AEQbTJ = view;
            this.copydefault = j;
            this.KWHzl = c28915kjl;
            this.OLrzqt = memeUiModel;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.copydefault || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                C28840kiP.EZpvd("dev_migration");
                this.KWHzl.values.invoke(this.OLrzqt, TokenDetailTabType.DEV_TOKEN);
            }
        }
    }

    /* JADX INFO: renamed from: o.kjl$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ C28915kjl EZpvd;
        public final /* synthetic */ MemeUiModel KWHzl;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, C28915kjl c28915kjl, MemeUiModel memeUiModel) {
            this.copydefault = view;
            this.AEQbTJ = j;
            this.EZpvd = c28915kjl;
            this.KWHzl = memeUiModel;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.AEQbTJ || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                this.EZpvd.AYXKKw.invoke(this.KWHzl);
            }
        }
    }

    /* JADX INFO: renamed from: o.kjl$AssistContent */
    public static final class AssistContent implements View.OnClickListener {
        public final /* synthetic */ C28915kjl EZpvd;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ MemeUiModel OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AssistContent(android.view.View view, long j, C28915kjl c28915kjl, MemeUiModel memeUiModel) {
            this.copydefault = view;
            this.KWHzl = j;
            this.EZpvd = c28915kjl;
            this.OLrzqt = memeUiModel;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.KWHzl || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                this.EZpvd.AhwBna.invoke(this.OLrzqt);
            }
        }
    }

    /* JADX INFO: renamed from: o.kjl$Dialog */
    public static final class Dialog implements View.OnClickListener {
        public final /* synthetic */ TaskDescription AEQbTJ;
        public final /* synthetic */ C28915kjl EZpvd;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ MemeUiModel copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Dialog(android.view.View view, long j, TaskDescription taskDescription, C28915kjl c28915kjl, MemeUiModel memeUiModel) {
            this.KWHzl = view;
            this.OLrzqt = j;
            this.AEQbTJ = taskDescription;
            this.EZpvd = c28915kjl;
            this.copydefault = memeUiModel;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.OLrzqt || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                Function1<MemeUiModel, Unit> function1OLrzqt = this.AEQbTJ.OLrzqt();
                MemeUiModel memeUiModel = this.EZpvd.OLrzqt;
                if (memeUiModel == null) {
                    memeUiModel = this.copydefault;
                }
                function1OLrzqt.invoke(memeUiModel);
            }
        }
    }

    /* JADX INFO: renamed from: o.kjl$Fragment */
    public static final class Fragment implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ MemeUiModel EZpvd;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ C28915kjl OLrzqt;
        public final /* synthetic */ TaskDescription copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Fragment(android.view.View view, long j, TaskDescription taskDescription, C28915kjl c28915kjl, MemeUiModel memeUiModel) {
            this.KWHzl = view;
            this.AEQbTJ = j;
            this.copydefault = taskDescription;
            this.OLrzqt = c28915kjl;
            this.EZpvd = memeUiModel;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.AEQbTJ || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                Function1<MemeUiModel, Unit> function1OLrzqt = this.copydefault.OLrzqt();
                MemeUiModel memeUiModel = this.OLrzqt.OLrzqt;
                if (memeUiModel == null) {
                    memeUiModel = this.EZpvd;
                }
                function1OLrzqt.invoke(memeUiModel);
            }
        }
    }

    /* JADX INFO: renamed from: o.kjl$LoaderManager */
    public static final class LoaderManager implements View.OnClickListener {
        public final /* synthetic */ MemeUiModel AEQbTJ;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ C28915kjl copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public LoaderManager(android.view.View view, long j, C28915kjl c28915kjl, MemeUiModel memeUiModel) {
            this.OLrzqt = view;
            this.KWHzl = j;
            this.copydefault = c28915kjl;
            this.AEQbTJ = memeUiModel;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.KWHzl || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                this.copydefault.valueOf.invoke();
                this.copydefault.isConnected.invoke(this.AEQbTJ);
            }
        }
    }

    /* JADX INFO: renamed from: o.kjl$PictureInPictureParams */
    public static final class PictureInPictureParams implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ MemeUiModel EZpvd;
        public final /* synthetic */ C28915kjl KWHzl;
        public final /* synthetic */ long OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public PictureInPictureParams(android.view.View view, long j, C28915kjl c28915kjl, MemeUiModel memeUiModel) {
            this.AEQbTJ = view;
            this.OLrzqt = j;
            this.KWHzl = c28915kjl;
            this.EZpvd = memeUiModel;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.OLrzqt || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                Function2 function2 = this.KWHzl.values;
                MemeUiModel memeUiModel = this.KWHzl.OLrzqt;
                if (memeUiModel == null) {
                    memeUiModel = this.EZpvd;
                }
                function2.invoke(memeUiModel, TokenDetailTabType.TOKEN);
            }
        }
    }

    /* JADX INFO: renamed from: o.kjl$SharedElementCallback */
    public static final class SharedElementCallback implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ C28915kjl OLrzqt;
        public final /* synthetic */ MemeUiModel copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public SharedElementCallback(android.view.View view, long j, C28915kjl c28915kjl, MemeUiModel memeUiModel) {
            this.AEQbTJ = view;
            this.KWHzl = j;
            this.OLrzqt = c28915kjl;
            this.copydefault = memeUiModel;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.KWHzl || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                Function2 function2 = this.OLrzqt.values;
                MemeUiModel memeUiModel = this.OLrzqt.OLrzqt;
                if (memeUiModel == null) {
                    memeUiModel = this.copydefault;
                }
                function2.invoke(memeUiModel, TokenDetailTabType.SOCIAL);
            }
        }
    }

    /* JADX INFO: renamed from: o.kjl$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ MemeUiModel OLrzqt;
        public final /* synthetic */ C28915kjl copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, C28915kjl c28915kjl, MemeUiModel memeUiModel) {
            this.EZpvd = view;
            this.KWHzl = j;
            this.copydefault = c28915kjl;
            this.OLrzqt = memeUiModel;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.KWHzl || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                C28840kiP.EZpvd("dev_migration");
                this.copydefault.values.invoke(this.OLrzqt, TokenDetailTabType.DEV_TOKEN);
            }
        }
    }

    /* JADX INFO: renamed from: o.kjl$TaskStackBuilder */
    public static final class TaskStackBuilder implements View.OnClickListener {
        public final /* synthetic */ MemeUiModel AEQbTJ;
        public final /* synthetic */ C28915kjl EZpvd;
        public final /* synthetic */ java.lang.String KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskStackBuilder(android.view.View view, long j, C28915kjl c28915kjl, java.lang.String str, MemeUiModel memeUiModel) {
            this.OLrzqt = view;
            this.copydefault = j;
            this.EZpvd = c28915kjl;
            this.KWHzl = str;
            this.AEQbTJ = memeUiModel;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.copydefault || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                this.EZpvd.valueOf.invoke();
                this.EZpvd.AEQbTJ.gHZMYf.EZpvd(true);
                this.EZpvd.djBIcL.invoke(java.lang.Integer.valueOf(this.EZpvd.fetchVPNInfo), this.KWHzl);
                Function2 function2 = this.EZpvd.values;
                MemeUiModel memeUiModel = this.EZpvd.OLrzqt;
                if (memeUiModel == null) {
                    memeUiModel = this.AEQbTJ;
                }
                function2.invoke(memeUiModel, TokenDetailTabType.SOCIAL);
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r11v0, resolved type: kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super java.lang.String, kotlin.Unit> */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.business.market.features.meme.domain.model.MemeUiModel, kotlin.Unit> */
    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.business.market.features.meme.domain.model.MemeUiModel, kotlin.Unit> */
    /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: kotlin.jvm.functions.Function2<? super com.okinc.business.market.features.meme.domain.model.MemeUiModel, ? super com.okinc.business.market.features.meme.token_detail_sheet.ui.TokenDetailTabType, kotlin.Unit> */
    /* JADX DEBUG: Multi-variable search result rejected for r8v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.business.market.features.meme.domain.model.MemeUiModel, kotlin.Unit> */
    /* JADX DEBUG: Multi-variable search result rejected for r9v0, resolved type: o.yHO<? super kotlin.Pair<java.lang.Integer, java.lang.Integer>, ? super com.okinc.business.market.features.meme.domain.model.MemeUiModel, ? super java.lang.Integer, kotlin.Unit> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C28915kjl(@NotNull hCM hcm, int i, @NotNull CoroutineScope coroutineScope, @NotNull Function1<? super MemeUiModel, Unit> function1, @NotNull Function1<? super MemeUiModel, Unit> function12, @NotNull Function2<? super MemeUiModel, ? super TokenDetailTabType, Unit> function2, @NotNull Function1<? super MemeUiModel, Unit> function13, @NotNull yHO<? super kotlin.Pair<java.lang.Integer, java.lang.Integer>, ? super MemeUiModel, ? super java.lang.Integer, Unit> yho, @NotNull Function0<Unit> function0, @NotNull Function2<? super java.lang.Integer, ? super java.lang.String, Unit> function22) {
        super(hcm.getRoot());
        Intrinsics.checkNotNullParameter(hcm, "");
        Intrinsics.checkNotNullParameter(coroutineScope, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function12, "");
        Intrinsics.checkNotNullParameter(function2, "");
        Intrinsics.checkNotNullParameter(function13, "");
        Intrinsics.checkNotNullParameter(yho, "");
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(function22, "");
        this.AEQbTJ = hcm;
        this.fetchVPNInfo = i;
        this.copydefault = coroutineScope;
        this.AYXKKw = function1;
        this.AhwBna = function12;
        this.values = function2;
        this.isConnected = function13;
        this.gEmmrt = yho;
        this.valueOf = function0;
        this.djBIcL = function22;
    }

    public final void copydefault(@NotNull MemeUiModel memeUiModel, int i) {
        Intrinsics.checkNotNullParameter(memeUiModel, "");
        AEQbTJ();
        copydefault();
        copydefault(memeUiModel);
        KWHzl(memeUiModel, i);
        DbNXlk(memeUiModel);
        valueOf(memeUiModel);
        fetchVPNInfo(memeUiModel);
        AhwBna(memeUiModel);
        isConnected(memeUiModel);
        AYXKKw(memeUiModel);
        gEmmrt(memeUiModel);
        djBIcL(memeUiModel);
    }

    public final void KWHzl(@NotNull MemeUiModel memeUiModel, int i) {
        Intrinsics.checkNotNullParameter(memeUiModel, "");
        hCM hcm = this.AEQbTJ;
        ConstraintLayout constraintLayout = hcm.KWHzl;
        constraintLayout.setOnClickListener(new LoaderManager(constraintLayout, 1000L, this, memeUiModel));
        java.lang.String str = memeUiModel.KWHzl() + "_" + memeUiModel.AuCTel();
        hcm.gHZMYf.setTag(str);
        hcm.gHZMYf.setLockDrag(false);
        if (hcm.gHZMYf.AuCTel()) {
            hcm.gHZMYf.requestLayout();
        }
        hcm.gHZMYf.setSwipeListener(new PendingIntent(i, str, memeUiModel, hcm));
        android.widget.LinearLayout linearLayout = hcm.AuCTelauCTel;
        linearLayout.setOnClickListener(new TaskStackBuilder(linearLayout, 1000L, this, str, memeUiModel));
        hcm.gHZMYf.setOnLongClickListener(new FragmentManager(memeUiModel));
        hcm.KWHzl.setLongClickable(false);
    }

    /* JADX INFO: renamed from: o.kjl$PendingIntent */
    public static final class PendingIntent implements C28848kiX.Activity {
        public final /* synthetic */ MemeUiModel EZpvd;
        public final /* synthetic */ int KWHzl;
        public final /* synthetic */ java.lang.String OLrzqt;
        public final /* synthetic */ hCM copydefault;

        @Override // o.C28848kiX.Activity
        public void copydefault(C28848kiX c28848kiX, float f) {
        }

        public PendingIntent(int i, java.lang.String str, MemeUiModel memeUiModel, hCM hcm) {
            this.KWHzl = i;
            this.OLrzqt = str;
            this.EZpvd = memeUiModel;
            this.copydefault = hcm;
        }

        @Override // o.C28848kiX.Activity
        public void copydefault(C28848kiX c28848kiX) {
            if (C28915kjl.this.KWHzl) {
                MemeUiModel memeUiModel = C28915kjl.this.DbNXlk;
                if (memeUiModel != null) {
                    C28915kjl.this.copydefault(memeUiModel, this.KWHzl);
                }
                C28915kjl.this.KWHzl = false;
                C28915kjl.this.DbNXlk = null;
            }
        }

        @Override // o.C28848kiX.Activity
        public void EZpvd(C28848kiX c28848kiX) {
            C28915kjl.this.djBIcL.invoke(java.lang.Integer.valueOf(C28915kjl.this.fetchVPNInfo), this.OLrzqt);
        }

        @Override // o.C28848kiX.Activity
        public void AEQbTJ(C28848kiX c28848kiX) {
            Function2 function2 = C28915kjl.this.values;
            MemeUiModel memeUiModel = C28915kjl.this.OLrzqt;
            if (memeUiModel == null) {
                memeUiModel = this.EZpvd;
            }
            function2.invoke(memeUiModel, TokenDetailTabType.SOCIAL);
            C28915kjl.this.djBIcL.invoke(java.lang.Integer.valueOf(C28915kjl.this.fetchVPNInfo), this.OLrzqt);
            final hCM hcm = this.copydefault;
            hcm.gHZMYf.postDelayed(new java.lang.Runnable() { // from class: o.kjv
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    C28915kjl.PendingIntent.copydefault(hcm);
                }
            }, 100L);
        }

        public static final void copydefault(hCM hcm) {
            hcm.gHZMYf.EZpvd(true);
        }
    }

    /* JADX INFO: renamed from: o.kjl$FragmentManager */
    public static final class FragmentManager implements C28848kiX.Application {
        public final /* synthetic */ MemeUiModel OLrzqt;

        public FragmentManager(MemeUiModel memeUiModel) {
            this.OLrzqt = memeUiModel;
        }

        @Override // o.C28848kiX.Application
        public boolean KWHzl(C28848kiX c28848kiX) {
            Intrinsics.checkNotNullParameter(c28848kiX, "");
            int bindingAdapterPosition = C28915kjl.this.getBindingAdapterPosition();
            if (bindingAdapterPosition == -1) {
                return false;
            }
            int[] iArr = new int[2];
            c28848kiX.getLocationInWindow(iArr);
            C28915kjl.this.gEmmrt.invoke(C56390yDp.OLrzqt(java.lang.Integer.valueOf(iArr[0] + (c28848kiX.getWidth() / 2)), java.lang.Integer.valueOf(iArr[1])), this.OLrzqt, java.lang.Integer.valueOf(bindingAdapterPosition));
            return true;
        }
    }

    public final void djBIcL(@NotNull MemeUiModel memeUiModel) {
        java.lang.String strAhwBna;
        java.lang.Object next;
        TagMeta tagMetaAEQbTJ;
        java.lang.String string;
        int iKWHzl;
        TagMeta tagMetaAEQbTJ2;
        Intrinsics.checkNotNullParameter(memeUiModel, "");
        C28067kNr c28067kNr = this.AEQbTJ.AEQbTJ;
        java.util.List<TagWrapper> listAhwBna = memeUiModel.AhwBna();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : listAhwBna) {
            TagWrapper tagWrapper = (TagWrapper) obj;
            if (Intrinsics.EZpvd((java.lang.Object) tagWrapper.OLrzqt(), (java.lang.Object) "ds_paid") || Intrinsics.EZpvd((java.lang.Object) tagWrapper.OLrzqt(), (java.lang.Object) "dexScreener_tokenCommunityTakeOver")) {
                arrayList.add(obj);
            }
        }
        C28067kNr.setTags$default(c28067kNr, arrayList, false, false, null, null, 30, null);
        hCM hcm = this.AEQbTJ;
        java.util.Iterator<T> it = memeUiModel.AhwBna().iterator();
        while (true) {
            strAhwBna = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            TagWrapper tagWrapper2 = (TagWrapper) next;
            if (Intrinsics.EZpvd((java.lang.Object) tagWrapper2.OLrzqt(), (java.lang.Object) "live_open") || Intrinsics.EZpvd((java.lang.Object) tagWrapper2.OLrzqt(), (java.lang.Object) "live_closed")) {
                break;
            }
        }
        TagWrapper tagWrapper3 = (TagWrapper) next;
        boolean zEZpvd = Intrinsics.EZpvd((java.lang.Object) (tagWrapper3 != null ? tagWrapper3.OLrzqt() : null), (java.lang.Object) "live_closed");
        android.widget.LinearLayout linearLayout = hcm.getNewProxyInstance;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "");
        linearLayout.setVisibility(tagWrapper3 != null ? 0 : 8);
        if (C7911ask.AEQbTJ(hcm.getRoot().getContext())) {
            if (tagWrapper3 != null && (tagMetaAEQbTJ2 = tagWrapper3.AEQbTJ()) != null) {
                strAhwBna = tagMetaAEQbTJ2.KWHzl();
            }
        } else if (tagWrapper3 != null && (tagMetaAEQbTJ = tagWrapper3.AEQbTJ()) != null) {
            strAhwBna = tagMetaAEQbTJ.AhwBna();
        }
        java.lang.String str = strAhwBna;
        if (str != null) {
            android.widget.ImageView imageView = hcm.AuCTel;
            Intrinsics.checkNotNullExpressionValue(imageView, "");
            C33054mpH.loadUrl$default(imageView, str, null, 0, 0, 14, null);
        }
        android.widget.TextView textView = hcm.DTwDnp;
        if (zEZpvd) {
            string = hcm.getRoot().getContext().getString(C23274hvD.Fragment.validateCustomAction);
        } else {
            string = hcm.getRoot().getContext().getString(C23274hvD.Fragment.MediaControllerCompat);
        }
        textView.setText(string);
        android.widget.TextView textView2 = hcm.DTwDnp;
        if (zEZpvd) {
            iKWHzl = C25382ivf.KWHzl(C52761wXj.Activity.QwvEab);
        } else {
            iKWHzl = C25382ivf.KWHzl(C52761wXj.Activity.QVsKAR);
        }
        textView2.setTextColor(iKWHzl);
        hcm.getNewProxyInstance.setBackgroundTintList(android.content.res.ColorStateList.valueOf(C25382ivf.KWHzl(zEZpvd ? C52761wXj.Activity.invokespecialODCBUN : C52761wXj.Activity.fkESqH)));
    }

    public final kotlin.Pair<java.lang.Integer, java.lang.Integer> EZpvd(MemeProtocolUiData memeProtocolUiData) {
        int iKWHzl = C25382ivf.KWHzl(C52761wXj.ActionBar.DCUTEI);
        java.lang.Integer numOLrzqt = memeProtocolUiData.OLrzqt();
        int iIntValue = numOLrzqt != null ? numOLrzqt.intValue() : iKWHzl;
        java.lang.Integer numAEQbTJ = memeProtocolUiData.AEQbTJ();
        if (numAEQbTJ != null) {
            iKWHzl = numAEQbTJ.intValue();
        } else {
            java.lang.Integer numOLrzqt2 = memeProtocolUiData.OLrzqt();
            if (numOLrzqt2 != null) {
                iKWHzl = numOLrzqt2.intValue();
            }
        }
        return C56390yDp.OLrzqt(java.lang.Integer.valueOf(iIntValue), java.lang.Integer.valueOf(iKWHzl));
    }

    public final void gEmmrt(@NotNull MemeUiModel memeUiModel) {
        float fDjBIcL;
        Intrinsics.checkNotNullParameter(memeUiModel, "");
        kotlin.Pair<java.lang.Integer, java.lang.Integer> pairEZpvd = EZpvd(memeUiModel.DbNXlk());
        int iIntValue = pairEZpvd.component1().intValue();
        int iIntValue2 = pairEZpvd.component2().intValue();
        android.widget.ImageView imageView = this.AEQbTJ.ejfBZ;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        int iKWHzl = C25382ivf.KWHzl(C52761wXj.Activity.htlTjW);
        int iKWHzl2 = C25382ivf.KWHzl(C52761wXj.Activity.htlTjW);
        if (this.fetchVPNInfo == 2) {
            fDjBIcL = 1.0f;
        } else {
            java.lang.String strDivCheckS$default = C23313hvq.divCheckS$default(memeUiModel.values(), "100", null, null, null, 14, null);
            if (strDivCheckS$default.length() == 0) {
                strDivCheckS$default = "1";
            }
            fDjBIcL = C33129mqd.djBIcL(strDivCheckS$default);
        }
        C28884kjG.KWHzl(imageView, 8.0f, 1.5f, iIntValue, iIntValue2, fDjBIcL, (1248 & 32) != 0, (1248 & 64) != 0 ? 1000L : 0L, (1248 & 128) != 0 ? 200L : 0L, (1248 & 256) != 0 ? null : java.lang.Integer.valueOf(iKWHzl), (1248 & 512) != 0 ? null : java.lang.Integer.valueOf(iKWHzl2), (1248 & 1024) != 0 ? 1.0f : 0.0f);
        if (this.fetchVPNInfo == 2) {
            this.AEQbTJ.zuBGHE.setText("");
        } else {
            this.AEQbTJ.zuBGHE.setText((C23313hvq.OLrzqt(memeUiModel.values(), "99") && C23313hvq.KWHzl(memeUiModel.values(), "100")) ? "99%" : C23311hvo.formatPercent$default(memeUiModel.values(), false, 0, 0, RoundingMode.UP, null, 20, null));
        }
    }

    public final void DbNXlk(@NotNull MemeUiModel memeUiModel) {
        Intrinsics.checkNotNullParameter(memeUiModel, "");
        kotlin.Pair<java.lang.Integer, java.lang.Integer> pairEZpvd = EZpvd(memeUiModel.DbNXlk());
        int iIntValue = pairEZpvd.component1().intValue();
        int iIntValue2 = pairEZpvd.component2().intValue();
        hCM hcm = this.AEQbTJ;
        android.widget.ImageView imageView = hcm.ejfBZ;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        int iKWHzl = C25382ivf.KWHzl(C52761wXj.Activity.htlTjW);
        int iKWHzl2 = C25382ivf.KWHzl(C52761wXj.Activity.htlTjW);
        java.lang.String strDivCheckS$default = C23313hvq.divCheckS$default(memeUiModel.values(), "100", null, null, null, 14, null);
        if (strDivCheckS$default.length() == 0) {
            strDivCheckS$default = "1";
        }
        C28884kjG.KWHzl(imageView, 8.0f, 1.5f, iIntValue, iIntValue2, C33129mqd.djBIcL(strDivCheckS$default), (1248 & 32) != 0, (1248 & 64) != 0 ? 1000L : 0L, (1248 & 128) != 0 ? 200L : 0L, (1248 & 256) != 0 ? null : java.lang.Integer.valueOf(iKWHzl), (1248 & 512) != 0 ? null : java.lang.Integer.valueOf(iKWHzl2), (1248 & 1024) != 0 ? 1.0f : 0.0f);
        android.widget.ImageView imageView2 = hcm.fARcdN;
        Intrinsics.checkNotNullExpressionValue(imageView2, "");
        C28884kjG.KWHzl(imageView2, 4.0f, 1.0f, iIntValue, iIntValue2, C28884kjG.KWHzl(iIntValue, C25382ivf.KWHzl(C52761wXj.Activity.htlTjW), 0.65f), C28884kjG.KWHzl(iIntValue2, C25382ivf.KWHzl(C52761wXj.Activity.htlTjW), 0.65f));
        int iDp2px$default = C55298xhM.dp2px$default(6.0f, null, 1, null);
        if (memeUiModel.ejfBZ().length() > 0 && C59449zhJ.startsWith$default(memeUiModel.ejfBZ(), "data:image", false, 2, null)) {
            android.widget.ImageView imageView3 = hcm.iwGUEr;
            Intrinsics.checkNotNullExpressionValue(imageView3, "");
            C25386ivj.loadImageBase64$default(imageView3, memeUiModel.ejfBZ(), memeUiModel.iwGUEr(), null, 6.0f, 4, null);
        } else {
            android.widget.ImageView imageView4 = hcm.iwGUEr;
            Intrinsics.checkNotNullExpressionValue(imageView4, "");
            C25386ivj.loadSquareImage$default(imageView4, memeUiModel.iwGUEr(), iDp2px$default, null, 4, null);
        }
        android.widget.ImageView imageView5 = hcm.fIwbmz;
        Intrinsics.checkNotNullExpressionValue(imageView5, "");
        C25386ivj.loadSquareImage$default(imageView5, memeUiModel.DbNXlk().copydefault(), iDp2px$default, null, 4, null);
        android.widget.ImageView imageView6 = hcm.iwGUEr;
        imageView6.setOnClickListener(new PictureInPictureParams(imageView6, 1000L, this, memeUiModel));
    }

    public final void valueOf(@NotNull MemeUiModel memeUiModel) {
        Intrinsics.checkNotNullParameter(memeUiModel, "");
        MemeProtocolUiData memeProtocolUiDataDbNXlk = memeUiModel.DbNXlk();
        kotlin.Pair<java.lang.Integer, java.lang.Integer> pairEZpvd = EZpvd(memeProtocolUiDataDbNXlk);
        int iIntValue = pairEZpvd.component1().intValue();
        int iIntValue2 = pairEZpvd.component2().intValue();
        hCM hcm = this.AEQbTJ;
        C52794wYp c52794wYp = hcm.copydefault;
        Intrinsics.checkNotNullExpressionValue(c52794wYp, "");
        c52794wYp.setVisibility(memeUiModel.gHZMYf() ^ true ? 0 : 8);
        LinearLayoutCompat linearLayoutCompat = hcm.getFieldNames;
        Intrinsics.checkNotNullExpressionValue(linearLayoutCompat, "");
        linearLayoutCompat.setVisibility(memeUiModel.gHZMYf() ? 0 : 8);
        if (memeUiModel.gHZMYf()) {
            android.widget.ImageView imageView = hcm.AkhnZx;
            Intrinsics.checkNotNullExpressionValue(imageView, "");
            C28884kjG.EZpvd(imageView, memeProtocolUiDataDbNXlk.copydefault(), C55298xhM.dp2px$default(2.0f, null, 1, null), iIntValue, iIntValue2, C52761wXj.TaskDescription.dzCpvv, (32 & 32) != 0 ? 0 : 0, (32 & 64) != 0 ? null : java.lang.Integer.valueOf(C25382ivf.KWHzl(C52761wXj.Activity.EZpvd)));
            android.widget.ImageView imageView2 = hcm.fJNWhG;
            Intrinsics.checkNotNullExpressionValue(imageView2, "");
            C28884kjG.EZpvd(imageView2, memeProtocolUiDataDbNXlk.KWHzl(), C55298xhM.dp2px$default(2.0f, null, 1, null), iIntValue, iIntValue2, C52761wXj.TaskDescription.dzCpvv, (32 & 32) != 0 ? 0 : 0, (32 & 64) != 0 ? null : java.lang.Integer.valueOf(C25382ivf.KWHzl(C52761wXj.Activity.EZpvd)));
            return;
        }
        C52794wYp c52794wYp2 = hcm.copydefault;
        c52794wYp2.setOnClickListener(new AssistContent(c52794wYp2, 1000L, this, memeUiModel));
    }

    public final void fetchVPNInfo(@NotNull MemeUiModel memeUiModel) {
        android.widget.ImageView imageView;
        Intrinsics.checkNotNullParameter(memeUiModel, "");
        hCM hcm = this.AEQbTJ;
        java.util.List listAhwBna = CollectionsKt___CollectionsKt.AhwBna((java.lang.Iterable) memeUiModel.uzCIH(), 5);
        android.view.View view = hcm.AYXKKw;
        Intrinsics.checkNotNullExpressionValue(view, "");
        view.setVisibility(listAhwBna.isEmpty() ^ true ? 0 : 8);
        int childCount = hcm.zsXlph.getChildCount();
        int i = 0;
        for (java.lang.Object obj : listAhwBna) {
            if (i < 0) {
                yDY.AYXKKw();
            }
            MemeSocialMediaData memeSocialMediaData = (MemeSocialMediaData) obj;
            if (i < childCount) {
                android.view.View childAt = hcm.zsXlph.getChildAt(i);
                Intrinsics.copydefault(childAt, "");
                imageView = (android.widget.ImageView) childAt;
            } else {
                imageView = new android.widget.ImageView(hcm.zsXlph.getContext());
                imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                android.content.Context context = imageView.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                int iKWHzl = C55298xhM.KWHzl(16.0f, context);
                android.content.Context context2 = imageView.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "");
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(iKWHzl, C55298xhM.KWHzl(16.0f, context2));
                layoutParams.gravity = 16;
                imageView.setLayoutParams(layoutParams);
                hcm.zsXlph.addView(imageView);
            }
            android.content.Context context3 = hcm.zsXlph.getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "");
            EZpvd(imageView, memeSocialMediaData, context3);
            imageView.setVisibility(0);
            i++;
        }
        for (int size = listAhwBna.size(); size < childCount; size++) {
            android.view.View childAt2 = hcm.zsXlph.getChildAt(size);
            if (childAt2 != null) {
                childAt2.setVisibility(8);
            }
        }
        LinearLayoutCompat linearLayoutCompat = hcm.zsXlph;
        linearLayoutCompat.setOnClickListener(new SharedElementCallback(linearLayoutCompat, 1000L, this, memeUiModel));
    }

    public final void EZpvd(android.widget.ImageView imageView, MemeSocialMediaData memeSocialMediaData, android.content.Context context) {
        int iCopydefault;
        if (C33129mqd.OLrzqt((java.lang.CharSequence) memeSocialMediaData.KWHzl())) {
            C33054mpH.AEQbTJ(imageView, memeSocialMediaData.KWHzl());
            return;
        }
        if (memeSocialMediaData.gEmmrt() != null) {
            iCopydefault = memeSocialMediaData.gEmmrt().intValue();
        } else if (memeSocialMediaData.djBIcL() != XPostType.POST) {
            iCopydefault = C25382ivf.copydefault(C52761wXj.Activity.DCUTEIddSDPG, context);
        } else if (memeSocialMediaData.AhwBna() > 0) {
            iCopydefault = C25382ivf.copydefault(C28888kjK.KWHzl(java.lang.System.currentTimeMillis() - memeSocialMediaData.AhwBna()), context);
        } else {
            iCopydefault = C25382ivf.copydefault(C23274hvD.StateListAnimator.AEQbTJ, context);
        }
        android.graphics.drawable.Drawable drawableEZpvd = C33070mpX.EZpvd(memeSocialMediaData.AYXKKw(), context);
        if (drawableEZpvd != null) {
            C33057mpK.copydefault(drawableEZpvd, iCopydefault);
        } else {
            drawableEZpvd = null;
        }
        imageView.setImageDrawable(drawableEZpvd);
    }

    public final void AhwBna(@NotNull MemeUiModel memeUiModel) {
        Intrinsics.checkNotNullParameter(memeUiModel, "");
        KWHzl(memeUiModel);
    }

    public final void isConnected(@NotNull MemeUiModel memeUiModel) {
        Intrinsics.checkNotNullParameter(memeUiModel, "");
        AEQbTJ(memeUiModel);
    }

    public final void AYXKKw(@NotNull MemeUiModel memeUiModel) {
        Intrinsics.checkNotNullParameter(memeUiModel, "");
        EZpvd(memeUiModel);
    }

    public final void EZpvd(MemeUiModel memeUiModel) {
        java.lang.String str;
        java.lang.String string;
        java.lang.String strCopydefault;
        final hCM hcm = this.AEQbTJ;
        MemeCarSharingData memeCarSharingDataAEQbTJ = memeUiModel.AEQbTJ();
        long jCurrentTimeMillis = java.lang.System.currentTimeMillis() - (memeCarSharingDataAEQbTJ != null ? memeCarSharingDataAEQbTJ.KWHzl() : 0L);
        boolean z = jCurrentTimeMillis < 15000;
        if (memeCarSharingDataAEQbTJ != null) {
            java.lang.String str2 = C33069mpW.copydefault(C23274hvD.Fragment.hBORwR, C56423yEv.EZpvd(C56390yDp.OLrzqt("num", C23319hvw.getNumberICU$default(memeCarSharingDataAEQbTJ.AEQbTJ(), null, null, null, null, 15, null)))) + ": ";
            if (C33129mqd.AhwBna(memeCarSharingDataAEQbTJ.OLrzqt()) > 0) {
                string = C33069mpW.copydefault(C23274hvD.Fragment.ikcuIV, C56423yEv.EZpvd(C56390yDp.OLrzqt("num", C23319hvw.getNumberICU$default(memeCarSharingDataAEQbTJ.OLrzqt(), null, null, null, null, 15, null))));
            } else {
                string = this.AEQbTJ.getRoot().getContext().getString(C23274hvD.Fragment.hCiIDQ);
                Intrinsics.copydefault((java.lang.Object) string);
            }
            java.lang.String str3 = str2 + string;
            if (z) {
                C25389ivm.safeLaunch$default(this.copydefault, null, null, new MemeViewHolder$loadShimmerDetails$1$displayText$1$text$1(jCurrentTimeMillis, this, str3, memeCarSharingDataAEQbTJ, null), 3, null);
                int i = Activity.AEQbTJ[memeCarSharingDataAEQbTJ.copydefault().ordinal()];
                if (i == 1) {
                    strCopydefault = C33069mpW.copydefault(C23274hvD.Fragment.ScLVFT, C56423yEv.EZpvd(C56390yDp.OLrzqt("num", C23272hvB.formatScientificCurrency$default(C23272hvB.KWHzl, memeCarSharingDataAEQbTJ.EZpvd(), true, null, false, false, false, false, null, false, false, TypedValues.PositionType.TYPE_POSITION_TYPE, null))));
                } else if (i == 2) {
                    strCopydefault = C33069mpW.copydefault(C23274hvD.Fragment.haRtnV, C56423yEv.EZpvd(C56390yDp.OLrzqt("num", C23272hvB.formatScientificCurrency$default(C23272hvB.KWHzl, memeCarSharingDataAEQbTJ.EZpvd(), true, null, false, false, false, false, null, false, false, TypedValues.PositionType.TYPE_POSITION_TYPE, null))));
                } else {
                    if (i != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    strCopydefault = C33069mpW.copydefault(C23274hvD.Fragment.dXhJGx, C56423yEv.EZpvd(C56390yDp.OLrzqt("num", C23272hvB.formatScientificCurrency$default(C23272hvB.KWHzl, memeCarSharingDataAEQbTJ.EZpvd(), true, null, false, false, false, false, null, false, false, TypedValues.PositionType.TYPE_POSITION_TYPE, null))));
                }
                str3 = str2 + strCopydefault;
            }
            str = str3;
        } else {
            str = null;
        }
        boolean zOLrzqt = C23313hvq.OLrzqt(memeCarSharingDataAEQbTJ != null ? memeCarSharingDataAEQbTJ.AEQbTJ() : null, "0");
        C28891kjN c28891kjN = hcm.OLrzqt;
        Intrinsics.copydefault(c28891kjN);
        c28891kjN.setVisibility(zOLrzqt ? 0 : 8);
        if (zOLrzqt) {
            android.graphics.drawable.Drawable drawableKWHzl = C33070mpX.KWHzl(C23274hvD.ActionBar.getNewProxyInstance);
            C28891kjN.setContent$default(c28891kjN, str, drawableKWHzl != null ? C33057mpK.copydefault(drawableKWHzl, C25382ivf.KWHzl(C52761wXj.ActionBar.DCUTEI)) : null, null, z, 4, null);
            c28891kjN.setShimmerColor(C25382ivf.KWHzl(C52761wXj.ActionBar.DCUTEI), 0.3f);
            c28891kjN.setPillBackgroundColor(C25382ivf.KWHzl(C52761wXj.Activity.invokespecialDPHOMC));
            c28891kjN.setOnClickListener(new Application(c28891kjN, 1000L, this, memeUiModel));
            C28891kjN.setShimmerEnabled$default(c28891kjN, false, 0.0f, 2, null);
        }
        hcm.KWHzl.post(new java.lang.Runnable() { // from class: o.kjs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C28915kjl.copydefault(hcm);
            }
        });
    }

    public static final void copydefault(hCM hcm) {
        int measuredHeight = hcm.KWHzl.getMeasuredHeight();
        if (measuredHeight <= 0 || hcm.gEmmrt.getLayoutParams().height == measuredHeight) {
            return;
        }
        android.widget.FrameLayout frameLayout = hcm.gEmmrt;
        ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
        layoutParams.height = measuredHeight;
        frameLayout.setLayoutParams(layoutParams);
        hcm.gEmmrt.requestLayout();
    }

    public final void KWHzl(MemeUiModel memeUiModel) {
        int iKWHzl;
        hCM hcm = this.AEQbTJ;
        AEQbTJ(this.fetchVPNInfo == 2 ? memeUiModel.fetchVPNInfo() : memeUiModel.fJNWhG());
        hcm.AxsJAY.setText(memeUiModel.djBIcL());
        android.widget.TextView textView = hcm.AxsJAY;
        if (C23313hvq.KWHzl(memeUiModel.gEmmrt(), "100000")) {
            iKWHzl = C25382ivf.KWHzl(C52761wXj.Activity.fdOvFl);
        } else if (C23313hvq.KWHzl(memeUiModel.gEmmrt(), "200000")) {
            iKWHzl = C25382ivf.KWHzl(C52761wXj.Activity.gdmIOq);
        } else {
            iKWHzl = C25382ivf.KWHzl(C52761wXj.ActionBar.DCUTEI);
        }
        textView.setTextColor(iKWHzl);
        hcm.QfsBiF.setText(memeUiModel.sSMYrx());
        hcm.sSMYrx.setText(memeUiModel.EZpvd());
        hcm.QOLQEE.setText(memeUiModel.getFieldNames());
        hcm.QKVWgx.setText(memeUiModel.getNewProxyInstance());
        hcm.RJOkX.setText(memeUiModel.AuCTelauCTel());
        java.lang.String strCopydefault = memeUiModel.fIwbmz().copydefault();
        boolean z = strCopydefault.length() > 0 && C23313hvq.OLrzqt(strCopydefault, "0");
        android.view.View view = hcm.EZpvd;
        Intrinsics.checkNotNullExpressionValue(view, "");
        view.setVisibility(z ? 0 : 8);
        android.widget.ImageView imageView = hcm.fetchVPNInfo;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        imageView.setVisibility(z ? 0 : 8);
        android.widget.TextView textView2 = hcm.AwvSrB;
        Intrinsics.checkNotNullExpressionValue(textView2, "");
        textView2.setVisibility(z ? 0 : 8);
        if (z) {
            hcm.AwvSrB.setText(C23319hvw.getNumberICU$default(strCopydefault, null, null, null, null, 15, null));
        }
        android.widget.ImageView imageView2 = hcm.fetchVPNInfo;
        imageView2.setOnClickListener(new StateListAnimator(imageView2, 1000L, this, memeUiModel));
        android.widget.TextView textView3 = hcm.AwvSrB;
        textView3.setOnClickListener(new ActionBar(textView3, 1000L, this, memeUiModel));
    }

    public final void AEQbTJ(MemeUiModel memeUiModel) {
        hCM hcm = this.AEQbTJ;
        MemeTagsData memeTagsDataFIwbmz = memeUiModel.fIwbmz();
        android.content.Context context = hcm.getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        java.util.List<TaskDescription> listEZpvd = EZpvd(memeTagsDataFIwbmz, context);
        int childCount = hcm.uzCIH.getChildCount();
        int size = listEZpvd.size();
        for (int i = 0; i < size; i++) {
            TaskDescription taskDescription = listEZpvd.get(i);
            if (i < childCount) {
                android.view.View childAt = hcm.uzCIH.getChildAt(i);
                C28892kjO c28892kjO = childAt instanceof C28892kjO ? (C28892kjO) childAt : null;
                if (c28892kjO != null) {
                    c28892kjO.setData(taskDescription.AEQbTJ(), taskDescription.EZpvd(), taskDescription.copydefault());
                    c28892kjO.setOnClickListener(null);
                    c28892kjO.setOnClickListener(new Fragment(c28892kjO, 1000L, taskDescription, this, memeUiModel));
                    c28892kjO.setVisibility(0);
                }
            } else {
                LinearLayoutCompat linearLayoutCompat = hcm.uzCIH;
                android.content.Context context2 = hcm.uzCIH.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "");
                C28892kjO c28892kjO2 = new C28892kjO(context2, null, 0, 6, null);
                c28892kjO2.setData(taskDescription.AEQbTJ(), taskDescription.EZpvd(), taskDescription.copydefault());
                c28892kjO2.setOnClickListener(new Dialog(c28892kjO2, 1000L, taskDescription, this, memeUiModel));
                linearLayoutCompat.addView(c28892kjO2);
            }
        }
        for (int size2 = listEZpvd.size(); size2 < childCount; size2++) {
            android.view.View childAt2 = hcm.uzCIH.getChildAt(size2);
            if (childAt2 != null) {
                childAt2.setVisibility(8);
            }
        }
    }

    public final java.util.List<TaskDescription> EZpvd(MemeTagsData memeTagsData, android.content.Context context) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        kotlin.Pair<java.lang.String, java.lang.Integer> pairAhwBna = C28926kjw.AhwBna(memeTagsData.gEmmrt());
        kotlin.Pair<java.lang.String, java.lang.Integer> pairEZpvd = C28926kjw.EZpvd(memeTagsData.EZpvd(), memeTagsData.valueOf(), context);
        kotlin.Pair<java.lang.String, java.lang.Integer> pairCopydefault = C28926kjw.copydefault(memeTagsData.djBIcL());
        kotlin.Pair<java.lang.String, java.lang.Integer> pairOLrzqt = C28926kjw.OLrzqt(memeTagsData.AYXKKw());
        arrayList.add(new TaskDescription(pairAhwBna.getFirst(), C23274hvD.ActionBar.AwvSrB, C25382ivf.KWHzl(pairAhwBna.getSecond().intValue()), new Function1() { // from class: o.kjm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C28915kjl.gEmmrt(this.OLrzqt, (MemeUiModel) obj);
            }
        }));
        arrayList.add(new TaskDescription(pairEZpvd.getFirst(), C23274hvD.ActionBar.iwGUEr, C25382ivf.KWHzl(pairEZpvd.getSecond().intValue()), new Function1() { // from class: o.kjp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C28915kjl.AYXKKw(this.AEQbTJ, (MemeUiModel) obj);
            }
        }));
        if (C23313hvq.OLrzqt(memeTagsData.djBIcL(), "0")) {
            arrayList.add(new TaskDescription(pairCopydefault.getFirst(), C23274hvD.ActionBar.zuBGHE, C25382ivf.KWHzl(pairCopydefault.getSecond().intValue()), new Function1() { // from class: o.kjo
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C28915kjl.AkhnZx(this.copydefault, (MemeUiModel) obj);
                }
            }));
        }
        if (C23313hvq.OLrzqt(memeTagsData.AYXKKw(), "0")) {
            arrayList.add(new TaskDescription(pairOLrzqt.getFirst(), C23274hvD.ActionBar.wlaJM, C25382ivf.KWHzl(pairOLrzqt.getSecond().intValue()), new Function1() { // from class: o.kjn
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C28915kjl.values(this.copydefault, (MemeUiModel) obj);
                }
            }));
        }
        if (C23313hvq.OLrzqt(memeTagsData.AEQbTJ(), "0")) {
            kotlin.Pair<java.lang.String, java.lang.Integer> pairKWHzl = C28926kjw.KWHzl(memeTagsData.AEQbTJ());
            arrayList.add(new TaskDescription(pairKWHzl.getFirst(), C23274hvD.ActionBar.uzCIH, C25382ivf.KWHzl(pairKWHzl.getSecond().intValue()), new Function1() { // from class: o.kjq
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C28915kjl.isConnected(this.EZpvd, (MemeUiModel) obj);
                }
            }));
        }
        if (C23313hvq.OLrzqt(memeTagsData.OLrzqt(), "0")) {
            kotlin.Pair<java.lang.String, java.lang.Integer> pairEZpvd2 = C28926kjw.EZpvd(memeTagsData.OLrzqt());
            arrayList.add(new TaskDescription(pairEZpvd2.getFirst(), C57406yhn.Activity.fARcdN, C25382ivf.KWHzl(pairEZpvd2.getSecond().intValue()), new Function1() { // from class: o.kjt
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C28915kjl.DbNXlk(this.copydefault, (MemeUiModel) obj);
                }
            }));
        }
        if (C23313hvq.OLrzqt(memeTagsData.KWHzl(), "0")) {
            kotlin.Pair<java.lang.String, java.lang.Integer> pairAEQbTJ = C28926kjw.AEQbTJ(memeTagsData.KWHzl());
            arrayList.add(new TaskDescription(pairAEQbTJ.getFirst(), C57406yhn.Activity.getFieldNames, C25382ivf.KWHzl(pairAEQbTJ.getSecond().intValue()), new Function1() { // from class: o.kjr
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C28915kjl.fetchVPNInfo(this.OLrzqt, (MemeUiModel) obj);
                }
            }));
        }
        return arrayList;
    }

    public static final Unit gEmmrt(C28915kjl c28915kjl, MemeUiModel memeUiModel) {
        Intrinsics.checkNotNullParameter(memeUiModel, "");
        c28915kjl.values.invoke(memeUiModel, TokenDetailTabType.DATA);
        return Unit.INSTANCE;
    }

    public static final Unit AYXKKw(C28915kjl c28915kjl, MemeUiModel memeUiModel) {
        Intrinsics.checkNotNullParameter(memeUiModel, "");
        C28840kiP.EZpvd("dev_sell");
        c28915kjl.values.invoke(memeUiModel, TokenDetailTabType.DEV_TOKEN);
        return Unit.INSTANCE;
    }

    public static final Unit AkhnZx(C28915kjl c28915kjl, MemeUiModel memeUiModel) {
        Intrinsics.checkNotNullParameter(memeUiModel, "");
        c28915kjl.values.invoke(memeUiModel, TokenDetailTabType.DATA);
        return Unit.INSTANCE;
    }

    public static final Unit values(C28915kjl c28915kjl, MemeUiModel memeUiModel) {
        Intrinsics.checkNotNullParameter(memeUiModel, "");
        c28915kjl.values.invoke(memeUiModel, TokenDetailTabType.DATA);
        return Unit.INSTANCE;
    }

    public static final Unit isConnected(C28915kjl c28915kjl, MemeUiModel memeUiModel) {
        Intrinsics.checkNotNullParameter(memeUiModel, "");
        c28915kjl.values.invoke(memeUiModel, TokenDetailTabType.DATA);
        return Unit.INSTANCE;
    }

    public static final Unit DbNXlk(C28915kjl c28915kjl, MemeUiModel memeUiModel) {
        Intrinsics.checkNotNullParameter(memeUiModel, "");
        c28915kjl.values.invoke(memeUiModel, TokenDetailTabType.DATA);
        return Unit.INSTANCE;
    }

    public static final Unit fetchVPNInfo(C28915kjl c28915kjl, MemeUiModel memeUiModel) {
        Intrinsics.checkNotNullParameter(memeUiModel, "");
        c28915kjl.values.invoke(memeUiModel, TokenDetailTabType.DATA);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.kjl$TaskDescription */
    public static final class TaskDescription {
        public final int AEQbTJ;
        public final java.lang.String EZpvd;
        public final Function1<MemeUiModel, Unit> KWHzl;
        public final int OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AEQbTJ() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int EZpvd() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Function1<MemeUiModel, Unit> OLrzqt() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int copydefault() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.business.market.features.meme.domain.model.MemeUiModel, kotlin.Unit> */
        /* JADX WARN: Multi-variable type inference failed */
        public TaskDescription(@NotNull java.lang.String str, @androidx.annotation.DrawableRes int i, @androidx.annotation.ColorInt int i2, @NotNull Function1<? super MemeUiModel, Unit> function1) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(function1, "");
            this.EZpvd = str;
            this.OLrzqt = i;
            this.AEQbTJ = i2;
            this.KWHzl = function1;
        }
    }

    public final void AEQbTJ(@NotNull java.lang.String str) {
        int iKWHzl;
        Intrinsics.checkNotNullParameter(str, "");
        hCM hcm = this.AEQbTJ;
        long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
        long jValueOf = C33129mqd.valueOf(str);
        android.widget.TextView textView = hcm.OcIXYQ;
        if (jCurrentTimeMillis - jValueOf < java.util.concurrent.TimeUnit.HOURS.toMillis(1L) * ((long) 2)) {
            iKWHzl = C25382ivf.KWHzl(C52761wXj.ActionBar.DCUTEI);
        } else {
            iKWHzl = C25382ivf.KWHzl(C52761wXj.Activity.DCUTEIddSDPG);
        }
        textView.setTextColor(iKWHzl);
        hcm.OcIXYQ.setText(C25322iuY.OLrzqt.EZpvd(str));
    }

    public final void copydefault(boolean z) {
        if (this.EZpvd == z) {
            return;
        }
        this.EZpvd = z;
        ConstraintLayout constraintLayout = this.AEQbTJ.KWHzl;
        if (z) {
            constraintLayout.setBackgroundColor(C25382ivf.KWHzl(C52761wXj.Activity.invokespecialDPHOMC));
        } else {
            constraintLayout.setBackground(null);
        }
    }

    public final boolean KWHzl() {
        return this.AEQbTJ.gHZMYf.AkhnZx();
    }

    public final void copydefault() {
        if (this.AEQbTJ.gHZMYf.values()) {
            return;
        }
        this.AEQbTJ.gHZMYf.EZpvd(false);
    }
}
