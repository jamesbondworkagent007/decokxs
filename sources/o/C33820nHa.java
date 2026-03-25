package o;

import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.okinc.im.imui.conversationlist.provider.NormalConversationProvider$BaseUiConversationViewHolder$bind$1$1;
import com.okinc.im.imui.conversationlist.provider.NormalConversationProvider$launchAsync$job$1;
import com.okinc.okimcore.model.im.OKMessage;
import com.okinc.okimcore.model.room.inhouseim.DraftMessageModel;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import o.C33820nHa;
import o.C35399nuc;
import o.C44105sDn;
import o.C52761wXj;
import o.nGR;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nHa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public class C33820nHa extends nGR {
    public final java.lang.String AEQbTJ;
    public final LifecycleOwner KWHzl;
    public java.util.HashMap<java.lang.String, Job> OLrzqt;

    public C33820nHa(@NotNull LifecycleOwner lifecycleOwner) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        this.KWHzl = lifecycleOwner;
        this.AEQbTJ = getClass().getSimpleName();
        this.OLrzqt = new java.util.HashMap<>();
    }

    public Job OLrzqt(@NotNull java.lang.String str, @NotNull Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends java.lang.Object> function2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(function2, "");
        Job jobLaunch$default = BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this.KWHzl), sDN.copydefault.copydefault(), null, new NormalConversationProvider$launchAsync$job$1(function2, null), 2, null);
        Job job = this.OLrzqt.get(str);
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (java.lang.Object) null);
        }
        this.OLrzqt.remove(str);
        this.OLrzqt.put(str, jobLaunch$default);
        return jobLaunch$default;
    }

    @Override // o.InterfaceC35897oHt
    public void copydefault(@NotNull C35895oHr c35895oHr, @NotNull java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(c35895oHr, "");
        Intrinsics.checkNotNullParameter(obj, "");
        if (obj instanceof nGE) {
            java.lang.String targetId = ((nGE) obj).AEQbTJ().getTargetId();
            Job job = this.OLrzqt.get(targetId);
            if (job != null) {
                Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (java.lang.Object) null);
            }
            this.OLrzqt.remove(targetId);
        }
    }

    @Override // o.InterfaceC35897oHt
    public C35895oHr AEQbTJ(@NotNull android.view.ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        nOL nolOLrzqt = nOL.OLrzqt(android.view.LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(nolOLrzqt, "");
        return new Activity(this, nolOLrzqt);
    }

    @Override // o.InterfaceC35897oHt
    public boolean AEQbTJ(@NotNull java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (!(obj instanceof nGE) || (obj instanceof nGF) || (obj instanceof nGM)) ? false : true;
    }

    @Override // o.nGR, o.InterfaceC35897oHt
    public void AEQbTJ(@NotNull C35895oHr c35895oHr, @NotNull java.lang.Object obj, int i) {
        Intrinsics.checkNotNullParameter(c35895oHr, "");
        Intrinsics.checkNotNullParameter(obj, "");
        super.AEQbTJ(c35895oHr, obj, i);
        if ((obj instanceof nGE) && (c35895oHr instanceof Activity)) {
            ((Activity) c35895oHr).copydefault((nGE) obj);
        }
    }

    /* JADX INFO: renamed from: o.nHa$Activity */
    public final class Activity extends C35895oHr {
        public final nOL OLrzqt;
        public final /* synthetic */ C33820nHa copydefault;

        /* JADX INFO: renamed from: o.nHa$Activity$Application */
        public final /* synthetic */ class Application {
            public static final /* synthetic */ int[] KWHzl;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            static {
                int[] iArr = new int[OKMessage.SentStatus.values().length];
                try {
                    iArr[OKMessage.SentStatus.FAILED.ordinal()] = 1;
                } catch (java.lang.NoSuchFieldError unused) {
                }
                try {
                    iArr[OKMessage.SentStatus.SENDING.ordinal()] = 2;
                } catch (java.lang.NoSuchFieldError unused2) {
                }
                try {
                    iArr[OKMessage.SentStatus.SENT.ordinal()] = 3;
                } catch (java.lang.NoSuchFieldError unused3) {
                }
                try {
                    iArr[OKMessage.SentStatus.RECEIVED.ordinal()] = 4;
                } catch (java.lang.NoSuchFieldError unused4) {
                }
                try {
                    iArr[OKMessage.SentStatus.READ.ordinal()] = 5;
                } catch (java.lang.NoSuchFieldError unused5) {
                }
                try {
                    iArr[OKMessage.SentStatus.DESTROYED.ordinal()] = 6;
                } catch (java.lang.NoSuchFieldError unused6) {
                }
                try {
                    iArr[OKMessage.SentStatus.CANCELED.ordinal()] = 7;
                } catch (java.lang.NoSuchFieldError unused7) {
                }
                KWHzl = iArr;
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final nOL EZpvd() {
            return this.OLrzqt;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Activity(@NotNull C33820nHa c33820nHa, nOL nol) {
            super(nol.getRoot().getContext(), nol.getRoot());
            Intrinsics.checkNotNullParameter(nol, "");
            this.copydefault = c33820nHa;
            this.OLrzqt = nol;
        }

        public final void copydefault(@NotNull final nGE nge) {
            Intrinsics.checkNotNullParameter(nge, "");
            nOL nol = this.OLrzqt;
            final C33820nHa c33820nHa = this.copydefault;
            nol.AhwBna.setImageDrawable(null);
            nol.AYXKKw.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.QwvEab));
            android.widget.TextView textView = nol.fARcdN;
            Intrinsics.checkNotNullExpressionValue(textView, "");
            textView.setVisibility(8);
            android.widget.ImageView imageView = nol.gEmmrt;
            Intrinsics.checkNotNullExpressionValue(imageView, "");
            imageView.setVisibility(8);
            nol.AEQbTJ.setText("");
            AppCompatImageView appCompatImageView = nol.EZpvd;
            Intrinsics.checkNotNullExpressionValue(appCompatImageView, "");
            appCompatImageView.setVisibility(8);
            nol.EZpvd.setImageDrawable(null);
            nol.AYXKKw.setText("");
            nol.DbNXlk.copydefault();
            c33820nHa.OLrzqt(nge.AEQbTJ().getTargetId(), new NormalConversationProvider$BaseUiConversationViewHolder$bind$1$1(nge, nol, this, null));
            android.view.View view = this.itemView;
            view.setOnTouchListener(new View.OnTouchListener() { // from class: o.nHi
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(android.view.View view2, android.view.MotionEvent motionEvent) {
                    return C33820nHa.Activity.copydefault(c33820nHa, view2, motionEvent);
                }
            });
            view.setOnClickListener(new View.OnClickListener() { // from class: o.nHh
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view2) {
                    C33820nHa.Activity.EZpvd(c33820nHa, nge, view2);
                }
            });
            view.setOnLongClickListener(new View.OnLongClickListener() { // from class: o.nHf
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(android.view.View view2) {
                    return C33820nHa.Activity.KWHzl(c33820nHa, nge, this, view2);
                }
            });
        }

        public static final boolean copydefault(C33820nHa c33820nHa, android.view.View view, android.view.MotionEvent motionEvent) {
            Intrinsics.checkNotNullParameter(motionEvent, "");
            c33820nHa.EZpvd(C56390yDp.OLrzqt(java.lang.Float.valueOf((int) motionEvent.getX()), java.lang.Float.valueOf((int) motionEvent.getY())));
            return false;
        }

        public static final void EZpvd(C33820nHa c33820nHa, nGE nge, android.view.View view) {
            nGR.ActionBar actionBarCopydefault = c33820nHa.copydefault();
            if (actionBarCopydefault != null) {
                actionBarCopydefault.copydefault(nge);
            }
        }

        public static final boolean KWHzl(C33820nHa c33820nHa, nGE nge, Activity activity, android.view.View view) {
            nGR.ActionBar actionBarCopydefault;
            kotlin.Pair<java.lang.Float, java.lang.Float> pairOLrzqt = c33820nHa.OLrzqt();
            if (pairOLrzqt == null || (actionBarCopydefault = c33820nHa.copydefault()) == null) {
                return true;
            }
            android.view.View view2 = activity.itemView;
            Intrinsics.checkNotNullExpressionValue(view2, "");
            actionBarCopydefault.KWHzl(nge, view2, pairOLrzqt);
            return true;
        }

        public final void KWHzl(nOL nol, boolean z, int i) {
            C33820nHa c33820nHa = this.copydefault;
            if (z) {
                android.widget.TextView textView = nol.fARcdN;
                textView.setBackgroundResource(C35399nuc.ActionBar.values);
                textView.setTextColor(C33070mpX.copydefault(C35399nuc.Application.AEQbTJ));
            } else {
                android.widget.TextView textView2 = nol.fARcdN;
                textView2.setBackgroundResource(C44105sDn.Application.AkhnZx);
                textView2.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.htlTjW));
            }
            android.content.Context context = nol.getRoot().getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            nol.fARcdN.setText(c33820nHa.OLrzqt(context, i));
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x005f  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void EZpvd(nOL nol, nGE nge) {
            android.graphics.drawable.Drawable drawableKWHzl;
            int i;
            if (nge.KWHzl() != null) {
                nol.AEQbTJ.setText(nge.KWHzl(), TextView.BufferType.SPANNABLE);
                OKMessage.SentStatus sentStatus = nge.AEQbTJ().getSentStatus();
                if (sentStatus == null) {
                    sentStatus = OKMessage.SentStatus.SENT;
                }
                switch (Application.KWHzl[sentStatus.ordinal()]) {
                    case 1:
                        drawableKWHzl = C33070mpX.KWHzl(C52761wXj.TaskDescription.FdcJU);
                        break;
                    case 2:
                        drawableKWHzl = C33070mpX.KWHzl(C52761wXj.TaskDescription.hfdhUn);
                        break;
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                        drawableKWHzl = null;
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
                AppCompatImageView appCompatImageView = nol.EZpvd;
                Intrinsics.checkNotNullExpressionValue(appCompatImageView, "");
                if (drawableKWHzl == null) {
                    i = 8;
                } else {
                    DraftMessageModel draftMessageModel = nge.AEQbTJ().getDraftMessageModel();
                    java.lang.String message = draftMessageModel != null ? draftMessageModel.getMessage() : null;
                    if (message == null || message.length() == 0) {
                        i = 0;
                    }
                }
                appCompatImageView.setVisibility(i);
                nol.EZpvd.setImageDrawable(drawableKWHzl);
            }
        }

        public final void KWHzl(nOL nol, nGE nge) {
            android.widget.ImageView imageView = nol.AkhnZx;
            Intrinsics.checkNotNullExpressionValue(imageView, "");
            imageView.setVisibility(nge.AEQbTJ().isTop() ? 0 : 8);
        }

        public final void copydefault(nOL nol, nGE nge) {
            android.widget.ImageView imageView = nol.values;
            Intrinsics.checkNotNullExpressionValue(imageView, "");
            imageView.setVisibility(nge.AEQbTJ().isFlagged() ? 0 : 8);
        }
    }
}
