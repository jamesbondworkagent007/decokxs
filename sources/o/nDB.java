package o;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.ViewStubProxy;
import com.airbnb.lottie.LottieAnimationView;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.GlideException;
import com.google.android.material.imageview.ShapeableImageView;
import com.okinc.crcore.coreapi.service.IMarketApiService;
import com.okinc.im.bean.IMUserInfo;
import com.okinc.im.imui.conversation.message.utils.ReferenceMessageBindHelper$startFileDownload$1;
import com.okinc.im.imui.conversation.message.viewmodel.tracker.IMEventTracker;
import com.okinc.im.imui.glide.model.IMImageModel;
import com.okinc.im.imui.utils.IMImageHelper;
import com.okinc.im.imui.widgets.FileMessageState;
import com.okinc.okimcore.model.im.OKConversation;
import com.okinc.okimcore.model.im.OKEmojiMessage;
import com.okinc.okimcore.model.im.OKFileMessage;
import com.okinc.okimcore.model.im.OKGIFMessage;
import com.okinc.okimcore.model.im.OKHQVoiceMessage;
import com.okinc.okimcore.model.im.OKImageMessage;
import com.okinc.okimcore.model.im.OKMessage;
import com.okinc.okimcore.model.im.OKMessageContent;
import com.okinc.okimcore.model.im.OKReferenceMessage;
import com.okinc.okimcore.model.im.OKSightMessage;
import com.okinc.okimcore.model.im.OKStickerMessage;
import com.okinc.okimcore.model.im.OKTextMessage;
import com.okinc.okimcore.model.im.inhouseim.ws.InHouseIMContentType;
import com.okinc.okimcore.model.im.inhouseim.ws.MediaUrlPaths;
import com.okinc.okimcore.model.im.inhouseim.ws.ReactionDisplay;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import o.C32113mPz;
import o.C35254nrp;
import o.C35399nuc;
import o.C44105sDn;
import o.C52761wXj;
import o.nDB;
import o.sIS;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final class nDB {
    public static boolean DbNXlk;
    public static final nDB copydefault = new nDB();
    public static final int AEQbTJ = C35399nuc.StateListAnimator.gwwzsY;
    public static final int KWHzl = C35399nuc.StateListAnimator.iMXFZQ;
    public static final int OLrzqt = C35399nuc.StateListAnimator.apLTlu;
    public static final java.util.Set<java.lang.String> valueOf = new LinkedHashSet();
    public static final java.util.Set<java.lang.String> gEmmrt = new LinkedHashSet();
    public static final android.os.Handler fetchVPNInfo = new android.os.Handler(android.os.Looper.getMainLooper());
    public static final java.util.Set<java.lang.String> values = new LinkedHashSet();
    public static final java.util.Map<java.lang.String, FileMessageState> isConnected = new LinkedHashMap();
    public static final java.util.Map<java.lang.String, java.lang.Integer> AYXKKw = new LinkedHashMap();
    public static final java.util.Map<java.lang.String, Job> AhwBna = new LinkedHashMap();
    public static final java.util.Map<java.lang.String, Function1<sIS, Unit>> AkhnZx = new LinkedHashMap();
    public static final CoroutineScope djBIcL = CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default((Job) null, 1, (java.lang.Object) null).plus(sDN.copydefault.AEQbTJ()));
    public static final int EZpvd = 8;

    /* JADX INFO: loaded from: classes18.dex */
    public final /* synthetic */ class StateListAnimator {
        public static final /* synthetic */ int[] AEQbTJ;
        public static final /* synthetic */ int[] KWHzl;
        public static final /* synthetic */ int[] copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[InHouseIMContentType.values().length];
            try {
                iArr[InHouseIMContentType.Video.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[InHouseIMContentType.Image.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            AEQbTJ = iArr;
            int[] iArr2 = new int[OKMessage.MessageDirection.values().length];
            try {
                iArr2[OKMessage.MessageDirection.RECEIVE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr2[OKMessage.MessageDirection.SEND.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            copydefault = iArr2;
            int[] iArr3 = new int[FileMessageState.values().length];
            try {
                iArr3[FileMessageState.PENDING_DOWNLOAD.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr3[FileMessageState.DOWNLOAD_FAILED.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr3[FileMessageState.DOWNLOADING.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                iArr3[FileMessageState.DOWNLOADED.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                iArr3[FileMessageState.SENT.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            KWHzl = iArr3;
        }
    }

    private nDB() {
    }

    public final C35777oDh valueOf() {
        return ((InterfaceC35331ntM) C58113yvE.copydefault(C32979mnm.EZpvd.OLrzqt(), InterfaceC35331ntM.class)).OuxcSI();
    }

    public static final class TaskDescription {
        public static final StateListAnimator Companion = new StateListAnimator(null);
        public static final int KWHzl = 8;
        public final C37728ozM AEQbTJ;
        public final android.view.View AYXKKw;
        public final C55113xdn AhwBna;
        public final android.widget.ImageView AkhnZx;
        public final oHK AuCTel;
        public final android.widget.FrameLayout DbNXlk;
        public final ViewStubProxy EZpvd;
        public final android.widget.FrameLayout OLrzqt;
        public final android.view.View copydefault;
        public final android.widget.ImageView djBIcL;
        public final nMT ejfBZ;
        public final LinearLayoutCompat fARcdN;
        public final android.view.View fIwbmz;
        public final ViewStubProxy fJNWhG;
        public final android.widget.TextView fetchVPNInfo;
        public final sDA gEmmrt;
        public final CardView getNewProxyInstance;
        public final android.widget.TextView hDKMBd;
        public final android.widget.ImageView isConnected;
        public final android.widget.TextView iwGUEr;
        public final LinearLayoutCompat valueOf;
        public final ViewStubProxy values;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TaskDescription AEQbTJ(@NotNull ViewStubProxy viewStubProxy, @NotNull android.widget.TextView textView, @NotNull oHK ohk, @NotNull android.widget.FrameLayout frameLayout, @NotNull android.widget.FrameLayout frameLayout2, @NotNull android.widget.ImageView imageView, android.view.View view, android.view.View view2, C55113xdn c55113xdn, @NotNull CardView cardView, @NotNull android.widget.TextView textView2, @NotNull android.widget.ImageView imageView2, @NotNull android.widget.TextView textView3, @NotNull android.widget.ImageView imageView3, @NotNull android.view.View view3, @NotNull nMT nmt, @NotNull sDA sda, @NotNull LinearLayoutCompat linearLayoutCompat, @NotNull LinearLayoutCompat linearLayoutCompat2, @NotNull ViewStubProxy viewStubProxy2, @NotNull ViewStubProxy viewStubProxy3, C37728ozM c37728ozM) {
            Intrinsics.checkNotNullParameter(viewStubProxy, "");
            Intrinsics.checkNotNullParameter(textView, "");
            Intrinsics.checkNotNullParameter(ohk, "");
            Intrinsics.checkNotNullParameter(frameLayout, "");
            Intrinsics.checkNotNullParameter(frameLayout2, "");
            Intrinsics.checkNotNullParameter(imageView, "");
            Intrinsics.checkNotNullParameter(cardView, "");
            Intrinsics.checkNotNullParameter(textView2, "");
            Intrinsics.checkNotNullParameter(imageView2, "");
            Intrinsics.checkNotNullParameter(textView3, "");
            Intrinsics.checkNotNullParameter(imageView3, "");
            Intrinsics.checkNotNullParameter(view3, "");
            Intrinsics.checkNotNullParameter(nmt, "");
            Intrinsics.checkNotNullParameter(sda, "");
            Intrinsics.checkNotNullParameter(linearLayoutCompat, "");
            Intrinsics.checkNotNullParameter(linearLayoutCompat2, "");
            Intrinsics.checkNotNullParameter(viewStubProxy2, "");
            Intrinsics.checkNotNullParameter(viewStubProxy3, "");
            return new TaskDescription(viewStubProxy, textView, ohk, frameLayout, frameLayout2, imageView, view, view2, c55113xdn, cardView, textView2, imageView2, textView3, imageView3, view3, nmt, sda, linearLayoutCompat, linearLayoutCompat2, viewStubProxy2, viewStubProxy3, c37728ozM);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C37728ozM AEQbTJ() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C55113xdn AYXKKw() {
            return this.AhwBna;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final LinearLayoutCompat AhwBna() {
            return this.valueOf;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ViewStubProxy AkhnZx() {
            return this.fJNWhG;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final nMT AuCTel() {
            return this.ejfBZ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.widget.FrameLayout DbNXlk() {
            return this.DbNXlk;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.widget.FrameLayout EZpvd() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ViewStubProxy KWHzl() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.view.View OLrzqt() {
            return this.AYXKKw;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.view.View copydefault() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.widget.ImageView djBIcL() {
            return this.djBIcL;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final LinearLayoutCompat ejfBZ() {
            return this.fARcdN;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TaskDescription)) {
                return false;
            }
            TaskDescription taskDescription = (TaskDescription) obj;
            return Intrinsics.EZpvd(this.fJNWhG, taskDescription.fJNWhG) && Intrinsics.EZpvd(this.iwGUEr, taskDescription.iwGUEr) && Intrinsics.EZpvd(this.AuCTel, taskDescription.AuCTel) && Intrinsics.EZpvd(this.OLrzqt, taskDescription.OLrzqt) && Intrinsics.EZpvd(this.DbNXlk, taskDescription.DbNXlk) && Intrinsics.EZpvd(this.djBIcL, taskDescription.djBIcL) && Intrinsics.EZpvd(this.AYXKKw, taskDescription.AYXKKw) && Intrinsics.EZpvd(this.copydefault, taskDescription.copydefault) && Intrinsics.EZpvd(this.AhwBna, taskDescription.AhwBna) && Intrinsics.EZpvd(this.getNewProxyInstance, taskDescription.getNewProxyInstance) && Intrinsics.EZpvd(this.hDKMBd, taskDescription.hDKMBd) && Intrinsics.EZpvd(this.AkhnZx, taskDescription.AkhnZx) && Intrinsics.EZpvd(this.fetchVPNInfo, taskDescription.fetchVPNInfo) && Intrinsics.EZpvd(this.isConnected, taskDescription.isConnected) && Intrinsics.EZpvd(this.fIwbmz, taskDescription.fIwbmz) && Intrinsics.EZpvd(this.ejfBZ, taskDescription.ejfBZ) && Intrinsics.EZpvd(this.gEmmrt, taskDescription.gEmmrt) && Intrinsics.EZpvd(this.valueOf, taskDescription.valueOf) && Intrinsics.EZpvd(this.fARcdN, taskDescription.fARcdN) && Intrinsics.EZpvd(this.EZpvd, taskDescription.EZpvd) && Intrinsics.EZpvd(this.values, taskDescription.values) && Intrinsics.EZpvd(this.AEQbTJ, taskDescription.AEQbTJ);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final oHK fARcdN() {
            return this.AuCTel;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.view.View fIwbmz() {
            return this.fIwbmz;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.widget.TextView fJNWhG() {
            return this.hDKMBd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.widget.TextView fetchVPNInfo() {
            return this.fetchVPNInfo;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final sDA gEmmrt() {
            return this.gEmmrt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final CardView getNewProxyInstance() {
            return this.getNewProxyInstance;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.widget.TextView hDKMBd() {
            return this.iwGUEr;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = this.fJNWhG.hashCode();
            int iHashCode2 = this.iwGUEr.hashCode();
            int iHashCode3 = this.AuCTel.hashCode();
            int iHashCode4 = this.OLrzqt.hashCode();
            int iHashCode5 = this.DbNXlk.hashCode();
            int iHashCode6 = this.djBIcL.hashCode();
            android.view.View view = this.AYXKKw;
            int iHashCode7 = view == null ? 0 : view.hashCode();
            android.view.View view2 = this.copydefault;
            int iHashCode8 = view2 == null ? 0 : view2.hashCode();
            C55113xdn c55113xdn = this.AhwBna;
            int iHashCode9 = c55113xdn == null ? 0 : c55113xdn.hashCode();
            int iHashCode10 = this.getNewProxyInstance.hashCode();
            int iHashCode11 = this.hDKMBd.hashCode();
            int iHashCode12 = this.AkhnZx.hashCode();
            int iHashCode13 = this.fetchVPNInfo.hashCode();
            int iHashCode14 = this.isConnected.hashCode();
            int iHashCode15 = this.fIwbmz.hashCode();
            int iHashCode16 = this.ejfBZ.hashCode();
            int iHashCode17 = this.gEmmrt.hashCode();
            int iHashCode18 = this.valueOf.hashCode();
            int iHashCode19 = this.fARcdN.hashCode();
            int iHashCode20 = this.EZpvd.hashCode();
            int iHashCode21 = this.values.hashCode();
            C37728ozM c37728ozM = this.AEQbTJ;
            return (((((((((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode19) * 31) + iHashCode20) * 31) + iHashCode21) * 31) + (c37728ozM == null ? 0 : c37728ozM.hashCode());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.widget.ImageView isConnected() {
            return this.isConnected;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "UiElementContainer(referenceContainer=" + this.fJNWhG + ", tvEmoji=" + this.iwGUEr + ", tvContent=" + this.AuCTel + ", cardView=" + this.OLrzqt + ", rcMessage=" + this.DbNXlk + ", ivImage=" + this.djBIcL + ", ivDownloadIcon=" + this.AYXKKw + ", ivCloseIcon=" + this.copydefault + ", loadingView=" + this.AhwBna + ", voiceMessageLayout=" + this.getNewProxyInstance + ", tvDuration=" + this.hDKMBd + ", rcSightThumb=" + this.AkhnZx + ", rcSightDuration=" + this.fetchVPNInfo + ", rcSightTag=" + this.isConnected + ", rootView=" + this.fIwbmz + ", stickerLayout=" + this.ejfBZ + ", ogWebUrlLayout=" + this.gEmmrt + ", mainMessageContainer=" + this.valueOf + ", subMessageContainer=" + this.fARcdN + ", innerReactionViewStub=" + this.EZpvd + ", outerReactionViewStub=" + this.values + ", fileBubbleView=" + this.AEQbTJ + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ViewStubProxy valueOf() {
            return this.values;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.widget.ImageView values() {
            return this.AkhnZx;
        }

        public TaskDescription(@NotNull ViewStubProxy viewStubProxy, @NotNull android.widget.TextView textView, @NotNull oHK ohk, @NotNull android.widget.FrameLayout frameLayout, @NotNull android.widget.FrameLayout frameLayout2, @NotNull android.widget.ImageView imageView, android.view.View view, android.view.View view2, C55113xdn c55113xdn, @NotNull CardView cardView, @NotNull android.widget.TextView textView2, @NotNull android.widget.ImageView imageView2, @NotNull android.widget.TextView textView3, @NotNull android.widget.ImageView imageView3, @NotNull android.view.View view3, @NotNull nMT nmt, @NotNull sDA sda, @NotNull LinearLayoutCompat linearLayoutCompat, @NotNull LinearLayoutCompat linearLayoutCompat2, @NotNull ViewStubProxy viewStubProxy2, @NotNull ViewStubProxy viewStubProxy3, C37728ozM c37728ozM) {
            Intrinsics.checkNotNullParameter(viewStubProxy, "");
            Intrinsics.checkNotNullParameter(textView, "");
            Intrinsics.checkNotNullParameter(ohk, "");
            Intrinsics.checkNotNullParameter(frameLayout, "");
            Intrinsics.checkNotNullParameter(frameLayout2, "");
            Intrinsics.checkNotNullParameter(imageView, "");
            Intrinsics.checkNotNullParameter(cardView, "");
            Intrinsics.checkNotNullParameter(textView2, "");
            Intrinsics.checkNotNullParameter(imageView2, "");
            Intrinsics.checkNotNullParameter(textView3, "");
            Intrinsics.checkNotNullParameter(imageView3, "");
            Intrinsics.checkNotNullParameter(view3, "");
            Intrinsics.checkNotNullParameter(nmt, "");
            Intrinsics.checkNotNullParameter(sda, "");
            Intrinsics.checkNotNullParameter(linearLayoutCompat, "");
            Intrinsics.checkNotNullParameter(linearLayoutCompat2, "");
            Intrinsics.checkNotNullParameter(viewStubProxy2, "");
            Intrinsics.checkNotNullParameter(viewStubProxy3, "");
            this.fJNWhG = viewStubProxy;
            this.iwGUEr = textView;
            this.AuCTel = ohk;
            this.OLrzqt = frameLayout;
            this.DbNXlk = frameLayout2;
            this.djBIcL = imageView;
            this.AYXKKw = view;
            this.copydefault = view2;
            this.AhwBna = c55113xdn;
            this.getNewProxyInstance = cardView;
            this.hDKMBd = textView2;
            this.AkhnZx = imageView2;
            this.fetchVPNInfo = textView3;
            this.isConnected = imageView3;
            this.fIwbmz = view3;
            this.ejfBZ = nmt;
            this.gEmmrt = sda;
            this.valueOf = linearLayoutCompat;
            this.fARcdN = linearLayoutCompat2;
            this.EZpvd = viewStubProxy2;
            this.values = viewStubProxy3;
            this.AEQbTJ = c37728ozM;
        }

        public static final class StateListAnimator {
            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.nDB.TaskDescription.StateListAnimator.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private StateListAnimator() {
            }

            public final TaskDescription KWHzl(@NotNull nMO nmo, @NotNull AbstractC44111sDt abstractC44111sDt) {
                Intrinsics.checkNotNullParameter(nmo, "");
                Intrinsics.checkNotNullParameter(abstractC44111sDt, "");
                ViewStubProxy viewStubProxy = abstractC44111sDt.copydefault;
                Intrinsics.checkNotNullExpressionValue(viewStubProxy, "");
                android.widget.TextView textView = nmo.fJNWhG;
                Intrinsics.checkNotNullExpressionValue(textView, "");
                oHK ohk = nmo.DbNXlk;
                Intrinsics.checkNotNullExpressionValue(ohk, "");
                android.widget.FrameLayout frameLayout = nmo.copydefault;
                Intrinsics.checkNotNullExpressionValue(frameLayout, "");
                android.widget.FrameLayout frameLayout2 = nmo.AhwBna;
                Intrinsics.checkNotNullExpressionValue(frameLayout2, "");
                ShapeableImageView shapeableImageView = nmo.KWHzl;
                Intrinsics.checkNotNullExpressionValue(shapeableImageView, "");
                android.widget.ImageView imageView = nmo.AEQbTJ;
                android.widget.ImageView imageView2 = nmo.OLrzqt;
                C55113xdn c55113xdn = nmo.gEmmrt;
                CardView cardView = nmo.ejfBZ;
                Intrinsics.checkNotNullExpressionValue(cardView, "");
                android.widget.TextView textView2 = nmo.fARcdN;
                Intrinsics.checkNotNullExpressionValue(textView2, "");
                ShapeableImageView shapeableImageView2 = nmo.AkhnZx;
                Intrinsics.checkNotNullExpressionValue(shapeableImageView2, "");
                android.widget.TextView textView3 = nmo.AYXKKw;
                Intrinsics.checkNotNullExpressionValue(textView3, "");
                android.widget.ImageView imageView3 = nmo.fetchVPNInfo;
                Intrinsics.checkNotNullExpressionValue(imageView3, "");
                android.view.View root = nmo.getRoot();
                Intrinsics.checkNotNullExpressionValue(root, "");
                nMT nmt = nmo.values;
                Intrinsics.checkNotNullExpressionValue(nmt, "");
                sDA sda = nmo.djBIcL;
                Intrinsics.checkNotNullExpressionValue(sda, "");
                LinearLayoutCompat linearLayoutCompat = abstractC44111sDt.AhwBna;
                Intrinsics.checkNotNullExpressionValue(linearLayoutCompat, "");
                C35888oHk c35888oHk = abstractC44111sDt.fJNWhG;
                Intrinsics.checkNotNullExpressionValue(c35888oHk, "");
                ViewStubProxy viewStubProxy2 = abstractC44111sDt.EZpvd;
                Intrinsics.checkNotNullExpressionValue(viewStubProxy2, "");
                ViewStubProxy viewStubProxy3 = abstractC44111sDt.fetchVPNInfo;
                Intrinsics.checkNotNullExpressionValue(viewStubProxy3, "");
                return new TaskDescription(viewStubProxy, textView, ohk, frameLayout, frameLayout2, shapeableImageView, imageView, imageView2, c55113xdn, cardView, textView2, shapeableImageView2, textView3, imageView3, root, nmt, sda, linearLayoutCompat, c35888oHk, viewStubProxy2, viewStubProxy3, nmo.EZpvd);
            }

            public final TaskDescription AEQbTJ(@NotNull nMS nms, @NotNull AbstractC44112sDu abstractC44112sDu) {
                Intrinsics.checkNotNullParameter(nms, "");
                Intrinsics.checkNotNullParameter(abstractC44112sDu, "");
                ViewStubProxy viewStubProxy = abstractC44112sDu.gEmmrt;
                Intrinsics.checkNotNullExpressionValue(viewStubProxy, "");
                android.widget.TextView textView = nms.fJNWhG;
                Intrinsics.checkNotNullExpressionValue(textView, "");
                oHK ohk = nms.isConnected;
                Intrinsics.checkNotNullExpressionValue(ohk, "");
                android.widget.FrameLayout frameLayout = nms.OLrzqt;
                Intrinsics.checkNotNullExpressionValue(frameLayout, "");
                android.widget.FrameLayout frameLayout2 = nms.AhwBna;
                Intrinsics.checkNotNullExpressionValue(frameLayout2, "");
                ShapeableImageView shapeableImageView = nms.EZpvd;
                Intrinsics.checkNotNullExpressionValue(shapeableImageView, "");
                android.widget.ImageView imageView = nms.KWHzl;
                android.widget.ImageView imageView2 = nms.AEQbTJ;
                C55113xdn c55113xdn = nms.AYXKKw;
                CardView cardView = nms.fIwbmz;
                Intrinsics.checkNotNullExpressionValue(cardView, "");
                android.widget.TextView textView2 = nms.AuCTel;
                Intrinsics.checkNotNullExpressionValue(textView2, "");
                ShapeableImageView shapeableImageView2 = nms.AkhnZx;
                Intrinsics.checkNotNullExpressionValue(shapeableImageView2, "");
                android.widget.TextView textView3 = nms.gEmmrt;
                Intrinsics.checkNotNullExpressionValue(textView3, "");
                android.widget.ImageView imageView3 = nms.DbNXlk;
                Intrinsics.checkNotNullExpressionValue(imageView3, "");
                android.view.View root = nms.getRoot();
                Intrinsics.checkNotNullExpressionValue(root, "");
                nMT nmt = nms.values;
                Intrinsics.checkNotNullExpressionValue(nmt, "");
                sDA sda = nms.valueOf;
                Intrinsics.checkNotNullExpressionValue(sda, "");
                LinearLayoutCompat linearLayoutCompat = abstractC44112sDu.AhwBna;
                Intrinsics.checkNotNullExpressionValue(linearLayoutCompat, "");
                C35888oHk c35888oHk = abstractC44112sDu.fetchVPNInfo;
                Intrinsics.checkNotNullExpressionValue(c35888oHk, "");
                ViewStubProxy viewStubProxy2 = abstractC44112sDu.AEQbTJ;
                Intrinsics.checkNotNullExpressionValue(viewStubProxy2, "");
                ViewStubProxy viewStubProxy3 = abstractC44112sDu.values;
                Intrinsics.checkNotNullExpressionValue(viewStubProxy3, "");
                return new TaskDescription(viewStubProxy, textView, ohk, frameLayout, frameLayout2, shapeableImageView, imageView, imageView2, c55113xdn, cardView, textView2, shapeableImageView2, textView3, imageView3, root, nmt, sda, linearLayoutCompat, c35888oHk, viewStubProxy2, viewStubProxy3, nms.copydefault);
            }
        }
    }

    public static final class Dialog implements View.OnClickListener {
        public final /* synthetic */ IMImageModel AEQbTJ;
        public final /* synthetic */ android.widget.ImageView AYXKKw;
        public final /* synthetic */ C55113xdn AhwBna;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ java.lang.String KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ Application copydefault;
        public final /* synthetic */ long djBIcL;
        public final /* synthetic */ android.view.View gEmmrt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Dialog(android.view.View view, long j, android.widget.ImageView imageView, IMImageModel iMImageModel, java.lang.String str, android.view.View view2, android.view.View view3, C55113xdn c55113xdn, Application application) {
            this.gEmmrt = view;
            this.djBIcL = j;
            this.AYXKKw = imageView;
            this.AEQbTJ = iMImageModel;
            this.KWHzl = str;
            this.OLrzqt = view2;
            this.EZpvd = view3;
            this.AhwBna = c55113xdn;
            this.copydefault = application;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.gEmmrt) > this.djBIcL || (this.gEmmrt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.gEmmrt, jCurrentTimeMillis);
                nDB.copydefault.OLrzqt(this.AYXKKw, this.AEQbTJ, this.KWHzl, this.OLrzqt, this.EZpvd, this.AhwBna, this.copydefault);
            }
        }
    }

    public static final class FragmentManager implements View.OnClickListener {
        public final /* synthetic */ IMImageModel AEQbTJ;
        public final /* synthetic */ android.widget.ImageView AYXKKw;
        public final /* synthetic */ C55113xdn AhwBna;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ java.lang.String OLrzqt;
        public final /* synthetic */ Application copydefault;
        public final /* synthetic */ android.view.View djBIcL;
        public final /* synthetic */ long gEmmrt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public FragmentManager(android.view.View view, long j, android.widget.ImageView imageView, java.lang.String str, Application application, IMImageModel iMImageModel, android.view.View view2, android.view.View view3, C55113xdn c55113xdn) {
            this.djBIcL = view;
            this.gEmmrt = j;
            this.AYXKKw = imageView;
            this.OLrzqt = str;
            this.copydefault = application;
            this.AEQbTJ = iMImageModel;
            this.KWHzl = view2;
            this.EZpvd = view3;
            this.AhwBna = c55113xdn;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.djBIcL) > this.gEmmrt || (this.djBIcL instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.djBIcL, jCurrentTimeMillis);
                android.widget.ImageView imageView = (android.widget.ImageView) this.djBIcL;
                java.lang.Object tag = this.AYXKKw.getTag(nDB.AEQbTJ);
                java.lang.Boolean bool = tag instanceof java.lang.Boolean ? (java.lang.Boolean) tag : null;
                boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
                boolean zContains = nDB.gEmmrt.contains(this.OLrzqt);
                boolean z = this.AYXKKw.getTag(nDB.KWHzl) != null;
                if (!zBooleanValue) {
                    if (zContains || z) {
                        return;
                    }
                    nDB.copydefault.OLrzqt(this.AYXKKw, this.AEQbTJ, this.OLrzqt, this.KWHzl, this.EZpvd, this.AhwBna, this.copydefault);
                    return;
                }
                if (nDB.DbNXlk) {
                    return;
                }
                nDB ndb = nDB.copydefault;
                nDB.DbNXlk = true;
                this.copydefault.EZpvd().invoke(imageView);
                nDB.fetchVPNInfo.postDelayed(ActionBar.AEQbTJ, 1000L);
            }
        }
    }

    public static final class LoaderManager implements View.OnClickListener {
        public final /* synthetic */ java.lang.String AEQbTJ;
        public final /* synthetic */ android.view.View AYXKKw;
        public final /* synthetic */ long AhwBna;
        public final /* synthetic */ android.widget.ImageView EZpvd;
        public final /* synthetic */ IMImageModel KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ android.view.View copydefault;
        public final /* synthetic */ C55113xdn valueOf;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public LoaderManager(android.view.View view, long j, android.widget.ImageView imageView, android.view.View view2, C55113xdn c55113xdn, java.lang.String str, IMImageModel iMImageModel, android.view.View view3) {
            this.AYXKKw = view;
            this.AhwBna = j;
            this.EZpvd = imageView;
            this.copydefault = view2;
            this.valueOf = c55113xdn;
            this.AEQbTJ = str;
            this.KWHzl = iMImageModel;
            this.OLrzqt = view3;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AYXKKw) > this.AhwBna || (this.AYXKKw instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AYXKKw, jCurrentTimeMillis);
                nDB.copydefault.copydefault(this.EZpvd, this.copydefault, this.valueOf, this.AEQbTJ);
                IMImageHelper iMImageHelper = IMImageHelper.OLrzqt;
                iMImageHelper.KWHzl(this.EZpvd, this.KWHzl, iMImageHelper.fetchVPNInfo(), true);
                this.OLrzqt.setVisibility(0);
                this.EZpvd.setTag(nDB.AEQbTJ, java.lang.Boolean.FALSE);
            }
        }
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Activity {
        public static final int OLrzqt = (OKReferenceMessage.$stable | IMUserInfo.$stable) | C35254nrp.EZpvd;
        public final C35254nrp AEQbTJ;
        public final OKReferenceMessage EZpvd;
        public final IMUserInfo KWHzl;
        public final OKMessage.MessageDirection copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Activity copy$default(Activity activity, C35254nrp c35254nrp, IMUserInfo iMUserInfo, OKReferenceMessage oKReferenceMessage, OKMessage.MessageDirection messageDirection, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                c35254nrp = activity.AEQbTJ;
            }
            if ((i & 2) != 0) {
                iMUserInfo = activity.KWHzl;
            }
            if ((i & 4) != 0) {
                oKReferenceMessage = activity.EZpvd;
            }
            if ((i & 8) != 0) {
                messageDirection = activity.copydefault;
            }
            return activity.OLrzqt(c35254nrp, iMUserInfo, oKReferenceMessage, messageDirection);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final OKReferenceMessage AEQbTJ() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C35254nrp KWHzl() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final OKMessage.MessageDirection OLrzqt() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Activity OLrzqt(@NotNull C35254nrp c35254nrp, IMUserInfo iMUserInfo, @NotNull OKReferenceMessage oKReferenceMessage, @NotNull OKMessage.MessageDirection messageDirection) {
            Intrinsics.checkNotNullParameter(c35254nrp, "");
            Intrinsics.checkNotNullParameter(oKReferenceMessage, "");
            Intrinsics.checkNotNullParameter(messageDirection, "");
            return new Activity(c35254nrp, iMUserInfo, oKReferenceMessage, messageDirection);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final IMUserInfo copydefault() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Activity)) {
                return false;
            }
            Activity activity = (Activity) obj;
            return Intrinsics.EZpvd(this.AEQbTJ, activity.AEQbTJ) && Intrinsics.EZpvd(this.KWHzl, activity.KWHzl) && Intrinsics.EZpvd(this.EZpvd, activity.EZpvd) && this.copydefault == activity.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = this.AEQbTJ.hashCode();
            IMUserInfo iMUserInfo = this.KWHzl;
            return (((((iHashCode * 31) + (iMUserInfo == null ? 0 : iMUserInfo.hashCode())) * 31) + this.EZpvd.hashCode()) * 31) + this.copydefault.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Data(message=" + this.AEQbTJ + ", imUserInfo=" + this.KWHzl + ", referenceMessage=" + this.EZpvd + ", direction=" + this.copydefault + ")";
        }

        public Activity(@NotNull C35254nrp c35254nrp, IMUserInfo iMUserInfo, @NotNull OKReferenceMessage oKReferenceMessage, @NotNull OKMessage.MessageDirection messageDirection) {
            Intrinsics.checkNotNullParameter(c35254nrp, "");
            Intrinsics.checkNotNullParameter(oKReferenceMessage, "");
            Intrinsics.checkNotNullParameter(messageDirection, "");
            this.AEQbTJ = c35254nrp;
            this.KWHzl = iMUserInfo;
            this.EZpvd = oKReferenceMessage;
            this.copydefault = messageDirection;
        }
    }

    public static final class Application {
        public static final StateListAnimator Companion = new StateListAnimator(null);
        public final Function1<android.view.View, Unit> AEQbTJ;
        public final Function1<android.view.View, Unit> AYXKKw;
        public final Function1<android.view.View, java.lang.Boolean> AhwBna;
        public final Function1<android.view.View, Unit> AkhnZx;
        public final Function1<android.view.View, Unit> EZpvd;
        public final Function1<android.view.View, java.lang.Boolean> KWHzl;
        public final Function1<android.view.View, java.lang.Boolean> OLrzqt;
        public final Function1<android.view.View, Unit> copydefault;
        public final Function1<android.view.View, java.lang.Boolean> djBIcL;
        public final Function1<android.view.View, java.lang.Boolean> fetchVPNInfo;
        public final Function1<android.view.View, Unit> gEmmrt;
        public final Function1<android.view.View, Unit> valueOf;
        public final Function1<android.view.View, java.lang.Boolean> values;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Function1<android.view.View, java.lang.Boolean> AEQbTJ() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Function1<android.view.View, Unit> AYXKKw() {
            return this.gEmmrt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Function1<android.view.View, java.lang.Boolean> AhwBna() {
            return this.djBIcL;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Function1<android.view.View, Unit> DbNXlk() {
            return this.AkhnZx;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Function1<android.view.View, Unit> EZpvd() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Application EZpvd(@NotNull Function1<? super android.view.View, Unit> function1, @NotNull Function1<? super android.view.View, java.lang.Boolean> function12, @NotNull Function1<? super android.view.View, Unit> function13, @NotNull Function1<? super android.view.View, java.lang.Boolean> function14, @NotNull Function1<? super android.view.View, Unit> function15, @NotNull Function1<? super android.view.View, java.lang.Boolean> function16, @NotNull Function1<? super android.view.View, Unit> function17, @NotNull Function1<? super android.view.View, java.lang.Boolean> function18, @NotNull Function1<? super android.view.View, Unit> function19, @NotNull Function1<? super android.view.View, java.lang.Boolean> function110, @NotNull Function1<? super android.view.View, Unit> function111, @NotNull Function1<? super android.view.View, java.lang.Boolean> function112, @NotNull Function1<? super android.view.View, Unit> function113) {
            Intrinsics.checkNotNullParameter(function1, "");
            Intrinsics.checkNotNullParameter(function12, "");
            Intrinsics.checkNotNullParameter(function13, "");
            Intrinsics.checkNotNullParameter(function14, "");
            Intrinsics.checkNotNullParameter(function15, "");
            Intrinsics.checkNotNullParameter(function16, "");
            Intrinsics.checkNotNullParameter(function17, "");
            Intrinsics.checkNotNullParameter(function18, "");
            Intrinsics.checkNotNullParameter(function19, "");
            Intrinsics.checkNotNullParameter(function110, "");
            Intrinsics.checkNotNullParameter(function111, "");
            Intrinsics.checkNotNullParameter(function112, "");
            Intrinsics.checkNotNullParameter(function113, "");
            return new Application(function1, function12, function13, function14, function15, function16, function17, function18, function19, function110, function111, function112, function113);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Function1<android.view.View, java.lang.Boolean> KWHzl() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Function1<android.view.View, Unit> OLrzqt() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Function1<android.view.View, Unit> copydefault() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Function1<android.view.View, java.lang.Boolean> djBIcL() {
            return this.AhwBna;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Application)) {
                return false;
            }
            Application application = (Application) obj;
            return Intrinsics.EZpvd(this.copydefault, application.copydefault) && Intrinsics.EZpvd(this.djBIcL, application.djBIcL) && Intrinsics.EZpvd(this.gEmmrt, application.gEmmrt) && Intrinsics.EZpvd(this.AhwBna, application.AhwBna) && Intrinsics.EZpvd(this.EZpvd, application.EZpvd) && Intrinsics.EZpvd(this.OLrzqt, application.OLrzqt) && Intrinsics.EZpvd(this.AEQbTJ, application.AEQbTJ) && Intrinsics.EZpvd(this.KWHzl, application.KWHzl) && Intrinsics.EZpvd(this.valueOf, application.valueOf) && Intrinsics.EZpvd(this.values, application.values) && Intrinsics.EZpvd(this.AkhnZx, application.AkhnZx) && Intrinsics.EZpvd(this.fetchVPNInfo, application.fetchVPNInfo) && Intrinsics.EZpvd(this.AYXKKw, application.AYXKKw);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Function1<android.view.View, java.lang.Boolean> fetchVPNInfo() {
            return this.fetchVPNInfo;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Function1<android.view.View, Unit> gEmmrt() {
            return this.AYXKKw;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((((((((((((((((((((((this.copydefault.hashCode() * 31) + this.djBIcL.hashCode()) * 31) + this.gEmmrt.hashCode()) * 31) + this.AhwBna.hashCode()) * 31) + this.EZpvd.hashCode()) * 31) + this.OLrzqt.hashCode()) * 31) + this.AEQbTJ.hashCode()) * 31) + this.KWHzl.hashCode()) * 31) + this.valueOf.hashCode()) * 31) + this.values.hashCode()) * 31) + this.AkhnZx.hashCode()) * 31) + this.fetchVPNInfo.hashCode()) * 31) + this.AYXKKw.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Function1<android.view.View, java.lang.Boolean> isConnected() {
            return this.values;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Callbacks(onQuoteMessageClick=" + this.copydefault + ", onQuoteMessageLongClick=" + this.djBIcL + ", onTextMessageContentClick=" + this.gEmmrt + ", onTextMessageContentLongClick=" + this.AhwBna + ", onImageMessageClick=" + this.EZpvd + ", onImageMessageLongClick=" + this.OLrzqt + ", onGifMessageClick=" + this.AEQbTJ + ", onGifMessageLongClick=" + this.KWHzl + ", onVideoMessageClick=" + this.valueOf + ", onVideoMessageLongClick=" + this.values + ", onVoiceMessageClick=" + this.AkhnZx + ", onVoiceMessageLongClick=" + this.fetchVPNInfo + ", onStickerMessageClick=" + this.AYXKKw + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Function1<android.view.View, Unit> valueOf() {
            return this.valueOf;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r10v0, resolved type: kotlin.jvm.functions.Function1<? super android.view.View, kotlin.Unit> */
        /* JADX DEBUG: Multi-variable search result rejected for r11v0, resolved type: kotlin.jvm.functions.Function1<? super android.view.View, java.lang.Boolean> */
        /* JADX DEBUG: Multi-variable search result rejected for r12v0, resolved type: kotlin.jvm.functions.Function1<? super android.view.View, kotlin.Unit> */
        /* JADX DEBUG: Multi-variable search result rejected for r13v0, resolved type: kotlin.jvm.functions.Function1<? super android.view.View, java.lang.Boolean> */
        /* JADX DEBUG: Multi-variable search result rejected for r14v0, resolved type: kotlin.jvm.functions.Function1<? super android.view.View, kotlin.Unit> */
        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super android.view.View, kotlin.Unit> */
        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super android.view.View, java.lang.Boolean> */
        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: kotlin.jvm.functions.Function1<? super android.view.View, kotlin.Unit> */
        /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: kotlin.jvm.functions.Function1<? super android.view.View, java.lang.Boolean> */
        /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: kotlin.jvm.functions.Function1<? super android.view.View, kotlin.Unit> */
        /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: kotlin.jvm.functions.Function1<? super android.view.View, java.lang.Boolean> */
        /* JADX DEBUG: Multi-variable search result rejected for r8v0, resolved type: kotlin.jvm.functions.Function1<? super android.view.View, kotlin.Unit> */
        /* JADX DEBUG: Multi-variable search result rejected for r9v0, resolved type: kotlin.jvm.functions.Function1<? super android.view.View, java.lang.Boolean> */
        /* JADX WARN: Multi-variable type inference failed */
        public Application(@NotNull Function1<? super android.view.View, Unit> function1, @NotNull Function1<? super android.view.View, java.lang.Boolean> function12, @NotNull Function1<? super android.view.View, Unit> function13, @NotNull Function1<? super android.view.View, java.lang.Boolean> function14, @NotNull Function1<? super android.view.View, Unit> function15, @NotNull Function1<? super android.view.View, java.lang.Boolean> function16, @NotNull Function1<? super android.view.View, Unit> function17, @NotNull Function1<? super android.view.View, java.lang.Boolean> function18, @NotNull Function1<? super android.view.View, Unit> function19, @NotNull Function1<? super android.view.View, java.lang.Boolean> function110, @NotNull Function1<? super android.view.View, Unit> function111, @NotNull Function1<? super android.view.View, java.lang.Boolean> function112, @NotNull Function1<? super android.view.View, Unit> function113) {
            Intrinsics.checkNotNullParameter(function1, "");
            Intrinsics.checkNotNullParameter(function12, "");
            Intrinsics.checkNotNullParameter(function13, "");
            Intrinsics.checkNotNullParameter(function14, "");
            Intrinsics.checkNotNullParameter(function15, "");
            Intrinsics.checkNotNullParameter(function16, "");
            Intrinsics.checkNotNullParameter(function17, "");
            Intrinsics.checkNotNullParameter(function18, "");
            Intrinsics.checkNotNullParameter(function19, "");
            Intrinsics.checkNotNullParameter(function110, "");
            Intrinsics.checkNotNullParameter(function111, "");
            Intrinsics.checkNotNullParameter(function112, "");
            Intrinsics.checkNotNullParameter(function113, "");
            this.copydefault = function1;
            this.djBIcL = function12;
            this.gEmmrt = function13;
            this.AhwBna = function14;
            this.EZpvd = function15;
            this.OLrzqt = function16;
            this.AEQbTJ = function17;
            this.KWHzl = function18;
            this.valueOf = function19;
            this.values = function110;
            this.AkhnZx = function111;
            this.fetchVPNInfo = function112;
            this.AYXKKw = function113;
        }

        public static final class StateListAnimator {
            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.nDB.Application.StateListAnimator.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static final boolean fIwbmz(android.view.View view) {
                Intrinsics.checkNotNullParameter(view, "");
                return false;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static final boolean fJNWhG(android.view.View view) {
                Intrinsics.checkNotNullParameter(view, "");
                return false;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static final boolean getNewProxyInstance(android.view.View view) {
                Intrinsics.checkNotNullParameter(view, "");
                return false;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static final boolean isConnected(android.view.View view) {
                Intrinsics.checkNotNullParameter(view, "");
                return false;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static final boolean uzCIH(android.view.View view) {
                Intrinsics.checkNotNullParameter(view, "");
                return false;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static final boolean zLjUOn(android.view.View view) {
                Intrinsics.checkNotNullParameter(view, "");
                return false;
            }

            private StateListAnimator() {
            }

            public final Application copydefault() {
                return new Application(new Function1() { // from class: o.nEf
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return nDB.Application.StateListAnimator.DbNXlk((android.view.View) obj);
                    }
                }, new Function1() { // from class: o.nEl
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return java.lang.Boolean.valueOf(nDB.Application.StateListAnimator.isConnected((android.view.View) obj));
                    }
                }, new Function1() { // from class: o.nEm
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return nDB.Application.StateListAnimator.fARcdN((android.view.View) obj);
                    }
                }, new Function1() { // from class: o.nEk
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return java.lang.Boolean.valueOf(nDB.Application.StateListAnimator.fIwbmz((android.view.View) obj));
                    }
                }, new Function1() { // from class: o.nEp
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return nDB.Application.StateListAnimator.hDKMBd((android.view.View) obj);
                    }
                }, new Function1() { // from class: o.nEq
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return java.lang.Boolean.valueOf(nDB.Application.StateListAnimator.getNewProxyInstance((android.view.View) obj));
                    }
                }, new Function1() { // from class: o.nEr
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return nDB.Application.StateListAnimator.iwGUEr((android.view.View) obj);
                    }
                }, new Function1() { // from class: o.nEh
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return java.lang.Boolean.valueOf(nDB.Application.StateListAnimator.uzCIH((android.view.View) obj));
                    }
                }, new Function1() { // from class: o.nEj
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return nDB.Application.StateListAnimator.getFieldNames((android.view.View) obj);
                    }
                }, new Function1() { // from class: o.nEg
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return java.lang.Boolean.valueOf(nDB.Application.StateListAnimator.zLjUOn((android.view.View) obj));
                    }
                }, new Function1() { // from class: o.nEi
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return nDB.Application.StateListAnimator.AuCTel((android.view.View) obj);
                    }
                }, new Function1() { // from class: o.nEo
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return java.lang.Boolean.valueOf(nDB.Application.StateListAnimator.fJNWhG((android.view.View) obj));
                    }
                }, new Function1() { // from class: o.nEn
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return nDB.Application.StateListAnimator.ejfBZ((android.view.View) obj);
                    }
                });
            }

            public static final Unit DbNXlk(android.view.View view) {
                Intrinsics.checkNotNullParameter(view, "");
                return Unit.INSTANCE;
            }

            public static final Unit fARcdN(android.view.View view) {
                Intrinsics.checkNotNullParameter(view, "");
                return Unit.INSTANCE;
            }

            public static final Unit hDKMBd(android.view.View view) {
                Intrinsics.checkNotNullParameter(view, "");
                return Unit.INSTANCE;
            }

            public static final Unit iwGUEr(android.view.View view) {
                Intrinsics.checkNotNullParameter(view, "");
                return Unit.INSTANCE;
            }

            public static final Unit getFieldNames(android.view.View view) {
                Intrinsics.checkNotNullParameter(view, "");
                return Unit.INSTANCE;
            }

            public static final Unit AuCTel(android.view.View view) {
                Intrinsics.checkNotNullParameter(view, "");
                return Unit.INSTANCE;
            }

            public static final Unit ejfBZ(android.view.View view) {
                Intrinsics.checkNotNullParameter(view, "");
                return Unit.INSTANCE;
            }
        }
    }

    public final java.lang.String copydefault(int i) {
        if (i <= 0) {
            return "00:00";
        }
        int i2 = i / 60;
        if (i2 < 60) {
            return EZpvd(i2) + ":" + EZpvd(i % 60);
        }
        int i3 = i2 / 60;
        if (i3 > 99) {
            return "99:59:59";
        }
        int i4 = i2 % 60;
        return EZpvd(i3) + ":" + EZpvd(i4) + ":" + EZpvd((i - (i3 * IMarketApiService.SIXTY_MINUTES)) - (i4 * 60));
    }

    public final java.lang.String EZpvd(int i) {
        java.lang.StringBuilder sb;
        if (i < 0 || i >= 10) {
            sb = new java.lang.StringBuilder();
        } else {
            sb = new java.lang.StringBuilder();
            sb.append("0");
        }
        sb.append(i);
        return sb.toString();
    }

    public final boolean copydefault(Activity activity) {
        return (activity == null || (KWHzl(activity) == null && EZpvd(activity) == null)) ? false : true;
    }

    public final OKImageMessage KWHzl(Activity activity) {
        OKReferenceMessage oKReferenceMessageAEQbTJ;
        OKMessageContent originalOKMessageContent = (activity == null || (oKReferenceMessageAEQbTJ = activity.AEQbTJ()) == null) ? null : oKReferenceMessageAEQbTJ.getOriginalOKMessageContent();
        if (originalOKMessageContent instanceof OKImageMessage) {
            return (OKImageMessage) originalOKMessageContent;
        }
        return null;
    }

    public final OKGIFMessage EZpvd(Activity activity) {
        OKReferenceMessage oKReferenceMessageAEQbTJ;
        OKMessageContent originalOKMessageContent = (activity == null || (oKReferenceMessageAEQbTJ = activity.AEQbTJ()) == null) ? null : oKReferenceMessageAEQbTJ.getOriginalOKMessageContent();
        if (originalOKMessageContent instanceof OKGIFMessage) {
            return (OKGIFMessage) originalOKMessageContent;
        }
        return null;
    }

    public final OKMessage AEQbTJ(@NotNull OKMessage oKMessage, @NotNull OKReferenceMessage oKReferenceMessage) {
        OKMessage.MessageDirection messageDirection;
        Intrinsics.checkNotNullParameter(oKMessage, "");
        Intrinsics.checkNotNullParameter(oKReferenceMessage, "");
        OKMessageContent referMsg = oKReferenceMessage.getReferMsg();
        if (referMsg == null) {
            return null;
        }
        OKMessage oKMessageAEQbTJ = OKMessage.Companion.AEQbTJ(oKMessage.getTargetId(), oKMessage.getConversationType(), referMsg);
        oKMessageAEQbTJ.setSenderUserId(oKReferenceMessage.getReferMsgUserId());
        if (android.text.TextUtils.equals(oKReferenceMessage.getReferMsgUserId(), C44157sFk.KWHzl())) {
            messageDirection = OKMessage.MessageDirection.SEND;
        } else {
            messageDirection = OKMessage.MessageDirection.RECEIVE;
        }
        oKMessageAEQbTJ.setMessageDirection(messageDirection);
        return oKMessageAEQbTJ;
    }

    public final OKMessage EZpvd(@NotNull OKMessage oKMessage, @NotNull OKReferenceMessage oKReferenceMessage) {
        Intrinsics.checkNotNullParameter(oKMessage, "");
        Intrinsics.checkNotNullParameter(oKReferenceMessage, "");
        OKMessageContent originalOKMessageContent = oKReferenceMessage.getOriginalOKMessageContent();
        if (originalOKMessageContent == null) {
            return null;
        }
        OKMessage oKMessageAEQbTJ = OKMessage.Companion.AEQbTJ(oKMessage.getTargetId(), oKMessage.getConversationType(), originalOKMessageContent);
        oKMessageAEQbTJ.setSeq(oKMessage.getSeq());
        return oKMessageAEQbTJ;
    }

    public static /* synthetic */ void bind$default(nDB ndb, TaskDescription taskDescription, Application application, Activity activity, OKConversation oKConversation, com.okinc.okimcore.model.remote.UserInfo userInfo, CoroutineScope coroutineScope, int i, java.lang.Object obj) {
        if ((i & 32) != 0) {
            coroutineScope = null;
        }
        ndb.KWHzl(taskDescription, application, activity, oKConversation, userInfo, coroutineScope);
    }

    public final void KWHzl(@NotNull TaskDescription taskDescription, @NotNull Application application, Activity activity, OKConversation oKConversation, com.okinc.okimcore.model.remote.UserInfo userInfo, CoroutineScope coroutineScope) {
        Intrinsics.checkNotNullParameter(taskDescription, "");
        Intrinsics.checkNotNullParameter(application, "");
        copydefault(taskDescription, activity);
        EZpvd(taskDescription, activity, application);
        OLrzqt(taskDescription, activity, application);
        KWHzl(taskDescription, activity, application, coroutineScope);
        KWHzl(taskDescription, activity, application);
        copydefault(taskDescription, activity, application);
        djBIcL(taskDescription, activity, application);
        AhwBna(taskDescription, activity, application);
        AEQbTJ(taskDescription, activity, application);
        EZpvd(taskDescription, activity);
        AEQbTJ(taskDescription, activity, oKConversation, userInfo);
    }

    public static /* synthetic */ void applyReferenceMaxWidthIfNeeded$default(nDB ndb, TaskDescription taskDescription, OKReferenceMessage oKReferenceMessage, float f, boolean z, int i, java.lang.Object obj) {
        if ((i & 8) != 0) {
            z = true;
        }
        ndb.AEQbTJ(taskDescription, oKReferenceMessage, f, z);
    }

    public final void AEQbTJ(@NotNull TaskDescription taskDescription, @NotNull OKReferenceMessage oKReferenceMessage, float f, boolean z) {
        Intrinsics.checkNotNullParameter(taskDescription, "");
        Intrinsics.checkNotNullParameter(oKReferenceMessage, "");
        OKMessageContent originalOKMessageContent = oKReferenceMessage.getOriginalOKMessageContent();
        boolean z2 = originalOKMessageContent instanceof OKTextMessage;
        boolean z3 = originalOKMessageContent instanceof OKFileMessage;
        if (z2 || z3) {
            android.content.Context context = taskDescription.fIwbmz().getContext();
            int iDp2px$default = C55298xhM.dp2px$default(32.0f, null, 1, null);
            Intrinsics.checkNotNullExpressionValue(context.getResources(), "");
            int iEZpvd = yII.EZpvd((C55302xhQ.EZpvd(r3) - iDp2px$default) * f);
            if (!z) {
                android.content.res.Resources resources = context.getResources();
                Intrinsics.checkNotNullExpressionValue(resources, "");
                iEZpvd = java.lang.Math.min(iEZpvd, C55302xhQ.EZpvd(resources) - (iDp2px$default * 2));
            }
            if (z2) {
                taskDescription.fARcdN().setMaxWidth(iEZpvd);
                android.view.View root = taskDescription.gEmmrt().getRoot();
                ConstraintLayout constraintLayout = root instanceof ConstraintLayout ? (ConstraintLayout) root : null;
                if (constraintLayout != null) {
                    constraintLayout.setMaxWidth(iEZpvd);
                }
            }
            LinearLayoutCompat linearLayoutCompatAhwBna = taskDescription.AhwBna();
            ViewGroup.LayoutParams layoutParams = linearLayoutCompatAhwBna.getLayoutParams();
            ConstraintLayout.LayoutParams layoutParams2 = layoutParams instanceof ConstraintLayout.LayoutParams ? (ConstraintLayout.LayoutParams) layoutParams : null;
            if (layoutParams2 == null) {
                return;
            }
            layoutParams2.matchConstraintMaxWidth = iEZpvd;
            linearLayoutCompatAhwBna.setLayoutParams(layoutParams2);
            LinearLayoutCompat linearLayoutCompatEjfBZ = taskDescription.ejfBZ();
            C35888oHk c35888oHk = linearLayoutCompatEjfBZ instanceof C35888oHk ? (C35888oHk) linearLayoutCompatEjfBZ : null;
            if (c35888oHk != null) {
                c35888oHk.setMaxWidthPercent(f);
                c35888oHk.setMaxWidthDp(iEZpvd / context.getResources().getDisplayMetrics().density);
            }
            android.view.View viewFIwbmz = taskDescription.fIwbmz();
            C35888oHk c35888oHk2 = viewFIwbmz instanceof C35888oHk ? (C35888oHk) viewFIwbmz : null;
            if (c35888oHk2 != null) {
                c35888oHk2.setMaxWidthPercent(f);
                c35888oHk2.setMaxWidthDp(iEZpvd / context.getResources().getDisplayMetrics().density);
            }
        }
    }

    public final void copydefault(TaskDescription taskDescription, Activity activity) {
        android.graphics.drawable.Drawable drawableAEQbTJ = null;
        if (activity == null) {
            taskDescription.fIwbmz().setBackground(null);
            return;
        }
        AEQbTJ(taskDescription, activity);
        InHouseIMContentType contentType = activity.AEQbTJ().getContentType();
        int i = contentType == null ? -1 : StateListAnimator.AEQbTJ[contentType.ordinal()];
        if (i == 1) {
            android.widget.ImageView imageViewValues = taskDescription.values();
            Intrinsics.copydefault(imageViewValues, "");
            drawableAEQbTJ = AEQbTJ(taskDescription, activity, (ShapeableImageView) imageViewValues);
        } else if (i == 2) {
            android.widget.ImageView imageViewDjBIcL = taskDescription.djBIcL();
            Intrinsics.copydefault(imageViewDjBIcL, "");
            drawableAEQbTJ = AEQbTJ(taskDescription, activity, (ShapeableImageView) imageViewDjBIcL);
        }
        taskDescription.fIwbmz().setBackground(drawableAEQbTJ);
    }

    public final android.graphics.drawable.Drawable AEQbTJ(TaskDescription taskDescription, Activity activity, ShapeableImageView shapeableImageView) {
        C35254nrp c35254nrpKWHzl;
        java.lang.Integer numValueOf = (activity == null || (c35254nrpKWHzl = activity.KWHzl()) == null) ? null : java.lang.Integer.valueOf(C35254nrp.Companion.KWHzl(c35254nrpKWHzl));
        if (numValueOf != null) {
            C35254nrp.Companion.copydefault(shapeableImageView, numValueOf.intValue(), true);
        }
        C35254nrp.Application application = C35254nrp.Companion;
        android.content.Context context = taskDescription.fIwbmz().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        return application.KWHzl(context, activity != null ? activity.KWHzl() : null);
    }

    public final void EZpvd(TaskDescription taskDescription, Activity activity, final Application application) {
        ViewDataBinding viewDataBindingOLrzqt;
        C35886oHi c35886oHi;
        IMUserInfo iMUserInfoCopydefault;
        OKMessageContent referMsg;
        java.lang.String username = null;
        C35254nrp c35254nrpKWHzl = activity != null ? activity.KWHzl() : null;
        OKReferenceMessage oKReferenceMessageAEQbTJ = activity != null ? activity.AEQbTJ() : null;
        if (oKReferenceMessageAEQbTJ != null && (referMsg = oKReferenceMessageAEQbTJ.getReferMsg()) != null && C44169sFw.KWHzl(referMsg)) {
            C33131mqf.EZpvd(taskDescription.AkhnZx());
            return;
        }
        OKMessage oKMessageAEQbTJ = (c35254nrpKWHzl == null || oKReferenceMessageAEQbTJ == null) ? null : AEQbTJ(c35254nrpKWHzl.OLrzqt(), oKReferenceMessageAEQbTJ);
        if (oKMessageAEQbTJ != null) {
            OKMessage.MessageDirection messageDirectionOLrzqt = activity != null ? activity.OLrzqt() : null;
            if (messageDirectionOLrzqt != null && StateListAnimator.copydefault[messageDirectionOLrzqt.ordinal()] == 1) {
                viewDataBindingOLrzqt = C33131mqf.OLrzqt(taskDescription.AkhnZx());
                C33131mqf.KWHzl(taskDescription.AkhnZx());
                c35886oHi = ((sDE) viewDataBindingOLrzqt).KWHzl;
            } else {
                viewDataBindingOLrzqt = C33131mqf.OLrzqt(taskDescription.AkhnZx());
                C33131mqf.KWHzl(taskDescription.AkhnZx());
                c35886oHi = ((sDD) viewDataBindingOLrzqt).copydefault;
            }
            OKMessage.MessageDirection messageDirectionOLrzqt2 = activity != null ? activity.OLrzqt() : null;
            c35886oHi.setBackground(C33070mpX.KWHzl((messageDirectionOLrzqt2 != null && StateListAnimator.copydefault[messageDirectionOLrzqt2.ordinal()] == 1) ? C44105sDn.Application.KWHzl : C44105sDn.Application.EZpvd));
            OKMessage.MessageDirection messageDirectionOLrzqt3 = activity != null ? activity.OLrzqt() : null;
            int i = (messageDirectionOLrzqt3 != null && StateListAnimator.copydefault[messageDirectionOLrzqt3.ordinal()] == 2) ? C52761wXj.Activity.WS : C52761wXj.Activity.DCUTEIddSDPG;
            OKMessage.MessageDirection messageDirectionOLrzqt4 = activity != null ? activity.OLrzqt() : null;
            c35886oHi.setTextColor(i, (messageDirectionOLrzqt4 != null && StateListAnimator.copydefault[messageDirectionOLrzqt4.ordinal()] == 2) ? C52761wXj.Activity.WS : C52761wXj.Activity.DCUTEIddSDPG);
            if (activity != null && (iMUserInfoCopydefault = activity.copydefault()) != null) {
                username = iMUserInfoCopydefault.getUsername();
            }
            c35886oHi.setViewAndData(oKMessageAEQbTJ, username);
            android.view.View root = viewDataBindingOLrzqt.getRoot();
            root.setOnClickListener(new View.OnClickListener() { // from class: o.nDN
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    nDB.getNewProxyInstance(application, view);
                }
            });
            root.setOnLongClickListener(new View.OnLongClickListener() { // from class: o.nDP
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(android.view.View view) {
                    return nDB.wlaJM(application, view);
                }
            });
            return;
        }
        C33131mqf.EZpvd(taskDescription.AkhnZx());
    }

    public static final void getNewProxyInstance(Application application, android.view.View view) {
        Function1<android.view.View, Unit> function1Copydefault = application.copydefault();
        Intrinsics.copydefault(view);
        function1Copydefault.invoke(view);
    }

    public static final boolean wlaJM(Application application, android.view.View view) {
        Function1<android.view.View, java.lang.Boolean> function1AhwBna = application.AhwBna();
        Intrinsics.copydefault(view);
        return function1AhwBna.invoke(view).booleanValue();
    }

    public final void OLrzqt(TaskDescription taskDescription, Activity activity, final Application application) {
        OKReferenceMessage oKReferenceMessageAEQbTJ;
        OKMessageContent originalOKMessageContent = (activity == null || (oKReferenceMessageAEQbTJ = activity.AEQbTJ()) == null) ? null : oKReferenceMessageAEQbTJ.getOriginalOKMessageContent();
        if (originalOKMessageContent instanceof OKEmojiMessage) {
            android.widget.TextView textViewHDKMBd = taskDescription.hDKMBd();
            textViewHDKMBd.setVisibility(0);
            OKEmojiMessage oKEmojiMessage = (OKEmojiMessage) originalOKMessageContent;
            textViewHDKMBd.setTextSize(1, oKEmojiMessage.getTotalEmoji() == 1 ? 72.0f : 48.0f);
            java.lang.String content = oKEmojiMessage.getContent();
            if (content == null) {
                content = null;
            } else if (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) content)) {
                content = "";
            }
            textViewHDKMBd.setText(content);
            textViewHDKMBd.setPadding(0, C55298xhM.dp2px$default(4.0f, null, 1, null), 0, C55298xhM.dp2px$default(4.0f, null, 1, null));
            textViewHDKMBd.setOnClickListener(new View.OnClickListener() { // from class: o.nDT
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    nDB.fARcdN(application, view);
                }
            });
            textViewHDKMBd.setOnLongClickListener(new View.OnLongClickListener() { // from class: o.nDU
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(android.view.View view) {
                    return nDB.fJNWhG(application, view);
                }
            });
            return;
        }
        taskDescription.hDKMBd().setVisibility(8);
    }

    public static final void fARcdN(Application application, android.view.View view) {
        Function1<android.view.View, Unit> function1AYXKKw = application.AYXKKw();
        Intrinsics.copydefault(view);
        function1AYXKKw.invoke(view);
    }

    public static final boolean fJNWhG(Application application, android.view.View view) {
        Function1<android.view.View, java.lang.Boolean> function1DjBIcL = application.djBIcL();
        Intrinsics.copydefault(view);
        return function1DjBIcL.invoke(view).booleanValue();
    }

    public final void KWHzl(TaskDescription taskDescription, final Activity activity, final Application application, final CoroutineScope coroutineScope) {
        int color;
        java.lang.CharSequence charSequenceOLrzqt;
        OKReferenceMessage oKReferenceMessageAEQbTJ;
        OKReferenceMessage oKReferenceMessageAEQbTJ2;
        C35254nrp c35254nrpKWHzl;
        OKReferenceMessage oKReferenceMessageAEQbTJ3;
        if (!(((activity == null || (oKReferenceMessageAEQbTJ3 = activity.AEQbTJ()) == null) ? null : oKReferenceMessageAEQbTJ3.getOriginalOKMessageContent()) instanceof OKEmojiMessage)) {
            final oHK ohkFARcdN = taskDescription.fARcdN();
            OKMessage.MessageDirection messageDirectionOLrzqt = activity != null ? activity.OLrzqt() : null;
            if (messageDirectionOLrzqt != null && StateListAnimator.copydefault[messageDirectionOLrzqt.ordinal()] == 1) {
                color = ContextCompat.getColor(ohkFARcdN.getContext(), C52761wXj.Activity.fdOvFl);
            } else {
                color = ContextCompat.getColor(ohkFARcdN.getContext(), C52761wXj.Activity.zblBkD);
            }
            ohkFARcdN.setNormalTextColor(color);
            ohkFARcdN.setIMStyle(new Function1() { // from class: o.nDH
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return nDB.OLrzqt(activity, ohkFARcdN, coroutineScope, (java.lang.String) obj);
                }
            });
            java.lang.String strEZpvd = (activity == null || (c35254nrpKWHzl = activity.KWHzl()) == null) ? null : c35254nrpKWHzl.EZpvd();
            OKMessageContent originalOKMessageContent = (activity == null || (oKReferenceMessageAEQbTJ2 = activity.AEQbTJ()) == null) ? null : oKReferenceMessageAEQbTJ2.getOriginalOKMessageContent();
            OKTextMessage oKTextMessage = originalOKMessageContent instanceof OKTextMessage ? (OKTextMessage) originalOKMessageContent : null;
            java.lang.String aliasedContent = oKTextMessage != null ? oKTextMessage.getAliasedContent() : null;
            java.lang.CharSequence charSequence = "";
            if (aliasedContent == null) {
                charSequenceOLrzqt = null;
            } else if (C33129mqd.OLrzqt((java.lang.CharSequence) strEZpvd)) {
                android.text.SpannableString spannableStringOLrzqt = ohkFARcdN.OLrzqt(aliasedContent);
                android.content.Context context = ohkFARcdN.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                charSequenceOLrzqt = C37683oyU.setupHighlightBgSpanStyle$default(spannableStringOLrzqt, context, strEZpvd, C33070mpX.copydefault(C32113mPz.ActionBar.iwGUEr), null, 8, null);
            } else {
                charSequenceOLrzqt = ohkFARcdN.OLrzqt(aliasedContent);
            }
            if (charSequenceOLrzqt == null) {
                charSequence = null;
            } else if (!StringsKt__StringsKt.fARcdN(charSequenceOLrzqt)) {
                charSequence = charSequenceOLrzqt;
            }
            ohkFARcdN.setText(charSequence);
            ohkFARcdN.setTextSize(2, 18.0f);
            if (((activity == null || (oKReferenceMessageAEQbTJ = activity.AEQbTJ()) == null) ? null : oKReferenceMessageAEQbTJ.getOriginalOKMessageContent()) instanceof OKEmojiMessage) {
                ohkFARcdN.setPadding(0, C55298xhM.dp2px$default(4.0f, null, 1, null), 0, C55298xhM.dp2px$default(4.0f, null, 1, null));
            } else {
                ohkFARcdN.setPadding(4, 0, 4, 0);
            }
            ohkFARcdN.setGravity(8388611);
            ohkFARcdN.setVisibility(charSequenceOLrzqt != null ? 0 : 8);
            ohkFARcdN.setOnClickListener(new View.OnClickListener() { // from class: o.nDJ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    nDB.AubY(application, view);
                }
            });
            ohkFARcdN.setOnLongClickListener(new View.OnLongClickListener() { // from class: o.nDK
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(android.view.View view) {
                    return nDB.zLjUOn(application, view);
                }
            });
            return;
        }
        taskDescription.fARcdN().setVisibility(8);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit OLrzqt(Activity activity, oHK ohk, CoroutineScope coroutineScope, java.lang.String str) {
        C35254nrp c35254nrpKWHzl;
        OKMessage oKMessageOLrzqt;
        Unit unit;
        Intrinsics.checkNotNullParameter(str, "");
        if (activity == null || (c35254nrpKWHzl = activity.KWHzl()) == null || (oKMessageOLrzqt = c35254nrpKWHzl.OLrzqt()) == null) {
            pUU.KWHzl("ReferenceMessageBindHelper", "postAutoLinkClicked->message is null");
        } else {
            if (coroutineScope != null) {
                new IMEventTracker().OLrzqt(coroutineScope, oKMessageOLrzqt.getTargetId(), str, IMEventTracker.LinkLocation.Message, oKMessageOLrzqt.getSenderUserId());
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            if (unit == null) {
            }
        }
        return Unit.INSTANCE;
    }

    public static final void AubY(Application application, android.view.View view) {
        Function1<android.view.View, Unit> function1AYXKKw = application.AYXKKw();
        Intrinsics.copydefault(view);
        function1AYXKKw.invoke(view);
    }

    public static final boolean zLjUOn(Application application, android.view.View view) {
        Function1<android.view.View, java.lang.Boolean> function1DjBIcL = application.djBIcL();
        Intrinsics.copydefault(view);
        return function1DjBIcL.invoke(view).booleanValue();
    }

    public final void KWHzl(TaskDescription taskDescription, Activity activity, final Application application) {
        OKReferenceMessage oKReferenceMessageAEQbTJ;
        android.view.View root = taskDescription.gEmmrt().getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        root.setVisibility(8);
        OKMessageContent originalOKMessageContent = (activity == null || (oKReferenceMessageAEQbTJ = activity.AEQbTJ()) == null) ? null : oKReferenceMessageAEQbTJ.getOriginalOKMessageContent();
        OKTextMessage oKTextMessage = originalOKMessageContent instanceof OKTextMessage ? (OKTextMessage) originalOKMessageContent : null;
        if ((oKTextMessage != null ? oKTextMessage.getSiteMeta() : null) != null) {
            nDC.AEQbTJ.AEQbTJ(taskDescription.gEmmrt(), oKTextMessage, activity.OLrzqt() == OKMessage.MessageDirection.RECEIVE);
            taskDescription.gEmmrt().getRoot().setOnLongClickListener(new View.OnLongClickListener() { // from class: o.nDI
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(android.view.View view) {
                    return nDB.zsXlph(application, view);
                }
            });
        }
    }

    public static final boolean zsXlph(Application application, android.view.View view) {
        Function1<android.view.View, java.lang.Boolean> function1DjBIcL = application.djBIcL();
        Intrinsics.copydefault(view);
        return function1DjBIcL.invoke(view).booleanValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x015f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void copydefault(TaskDescription taskDescription, Activity activity, final Application application) {
        java.lang.Object objM7377constructorimpl;
        java.lang.Runnable runnable;
        OKReferenceMessage oKReferenceMessageAEQbTJ = activity != null ? activity.AEQbTJ() : null;
        OKImageMessage oKImageMessageKWHzl = KWHzl(activity);
        OKGIFMessage oKGIFMessageEZpvd = EZpvd(activity);
        android.widget.FrameLayout frameLayoutEZpvd = taskDescription.EZpvd();
        nDB ndb = copydefault;
        frameLayoutEZpvd.setVisibility(ndb.copydefault(activity) ? 0 : 8);
        final android.widget.ImageView imageViewDjBIcL = taskDescription.djBIcL();
        final android.view.View viewOLrzqt = taskDescription.OLrzqt();
        android.view.View viewCopydefault = taskDescription.copydefault();
        C55113xdn c55113xdnAYXKKw = taskDescription.AYXKKw();
        if (viewCopydefault != null) {
            viewCopydefault.setVisibility(8);
        }
        if (oKReferenceMessageAEQbTJ == null || oKImageMessageKWHzl == null || activity.OLrzqt() != OKMessage.MessageDirection.RECEIVE || viewOLrzqt == null || viewCopydefault == null || c55113xdnAYXKKw == null) {
            if (oKReferenceMessageAEQbTJ != null && oKImageMessageKWHzl != null) {
                C43453rpa c43453rpa = C43453rpa.AEQbTJ;
                android.content.Context context = frameLayoutEZpvd.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                if (c43453rpa.KWHzl(context)) {
                    IMImageHelper iMImageHelper = IMImageHelper.OLrzqt;
                    IMImageHelper.loadCacheOnlyImageWithThumbnail$default(iMImageHelper, imageViewDjBIcL, nPA.AEQbTJ(oKImageMessageKWHzl), iMImageHelper.fetchVPNInfo(), false, 8, null);
                } else {
                    IMImageHelper iMImageHelper2 = IMImageHelper.OLrzqt;
                    IMImageHelper.loadCacheOnlyImageWithThumbnail$default(iMImageHelper2, imageViewDjBIcL, nPA.AEQbTJ(oKImageMessageKWHzl), iMImageHelper2.fetchVPNInfo(), false, 8, null);
                }
                imageViewDjBIcL.setOnClickListener(new View.OnClickListener() { // from class: o.nEa
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(android.view.View view) {
                        nDB.getFieldNames(application, view);
                    }
                });
                imageViewDjBIcL.setOnLongClickListener(new View.OnLongClickListener() { // from class: o.nEd
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.view.View.OnLongClickListener
                    public final boolean onLongClick(android.view.View view) {
                        return nDB.uzCIH(application, view);
                    }
                });
                return;
            }
            if (oKReferenceMessageAEQbTJ != null && oKGIFMessageEZpvd != null) {
                android.net.Uri uriKWHzl = C37683oyU.KWHzl(oKGIFMessageEZpvd);
                if (uriKWHzl == null) {
                    uriKWHzl = android.net.Uri.EMPTY;
                }
                IMImageHelper iMImageHelper3 = IMImageHelper.OLrzqt;
                iMImageHelper3.KWHzl(imageViewDjBIcL, uriKWHzl, (20 & 4) != 0 ? null : java.lang.Integer.valueOf(C35399nuc.ActionBar.finit), (20 & 8) != 0 ? null : null, (20 & 16) != 0 ? null : new nPF(imageViewDjBIcL, iMImageHelper3.fetchVPNInfo()));
                imageViewDjBIcL.setOnClickListener(new View.OnClickListener() { // from class: o.nEb
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(android.view.View view) {
                        nDB.iwGUEr(application, view);
                    }
                });
                imageViewDjBIcL.setOnLongClickListener(new View.OnLongClickListener() { // from class: o.nEe
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.view.View.OnLongClickListener
                    public final boolean onLongClick(android.view.View view) {
                        return nDB.hDKMBd(application, view);
                    }
                });
                return;
            }
            imageViewDjBIcL.setImageResource(0);
            try {
                Result.Application application2 = Result.Companion;
                Glide.KWHzl(imageViewDjBIcL).AEQbTJ(imageViewDjBIcL);
                objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
            } catch (java.lang.Throwable th) {
                Result.Application application3 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
            Result.m7376boximpl(objM7377constructorimpl);
            return;
        }
        final IMImageModel iMImageModelAEQbTJ = nPA.AEQbTJ(oKImageMessageKWHzl);
        final java.lang.String str = "ref_" + activity.KWHzl().OLrzqt().getSeq() + "_" + activity.KWHzl().OLrzqt().getSentTime();
        java.lang.Object tag = imageViewDjBIcL.getTag();
        java.lang.String str2 = tag instanceof java.lang.String ? (java.lang.String) tag : null;
        java.util.Set<java.lang.String> set = valueOf;
        boolean zContains = set.contains(str);
        boolean zContains2 = gEmmrt.contains(str);
        if (str2 == null || Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) str)) {
            runnable = null;
        } else {
            int i = KWHzl;
            java.lang.Object tag2 = imageViewDjBIcL.getTag(i);
            java.lang.Runnable runnable2 = tag2 instanceof java.lang.Runnable ? (java.lang.Runnable) tag2 : null;
            if (runnable2 != null) {
                imageViewDjBIcL.removeCallbacks(runnable2);
                imageViewDjBIcL.setTag(i, null);
            }
            int i2 = OLrzqt;
            java.lang.Object tag3 = imageViewDjBIcL.getTag(i2);
            java.lang.Runnable runnable3 = tag3 instanceof java.lang.Runnable ? (java.lang.Runnable) tag3 : null;
            if (runnable3 != null) {
                imageViewDjBIcL.removeCallbacks(runnable3);
                runnable = null;
                imageViewDjBIcL.setTag(i2, null);
            } else {
                runnable = null;
            }
            imageViewDjBIcL.setTag(AEQbTJ, java.lang.Boolean.FALSE);
        }
        imageViewDjBIcL.setTag(str);
        c55113xdnAYXKKw.copydefault();
        viewOLrzqt.setVisibility(8);
        viewCopydefault.setVisibility(8);
        if (zContains2) {
            viewCopydefault.setVisibility(0);
            c55113xdnAYXKKw.KWHzl(0L);
            imageViewDjBIcL.setTag(AEQbTJ, java.lang.Boolean.FALSE);
            IMImageHelper iMImageHelper4 = IMImageHelper.OLrzqt;
            iMImageHelper4.KWHzl(imageViewDjBIcL, iMImageModelAEQbTJ, iMImageHelper4.fetchVPNInfo(), true);
            java.lang.Object tag4 = imageViewDjBIcL.getTag(OLrzqt);
            if ((tag4 instanceof java.lang.Runnable ? (java.lang.Runnable) tag4 : runnable) == null) {
                ndb.EZpvd(iMImageModelAEQbTJ, str, imageViewDjBIcL, viewOLrzqt, viewCopydefault, c55113xdnAYXKKw);
            }
        } else if (!zContains) {
            IMImageHelper iMImageHelper5 = IMImageHelper.OLrzqt;
            android.content.Context context2 = imageViewDjBIcL.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            if (iMImageHelper5.EZpvd(context2)) {
                IMImageHelper iMImageHelper6 = IMImageHelper.OLrzqt;
                iMImageHelper6.AEQbTJ(imageViewDjBIcL, iMImageModelAEQbTJ, iMImageHelper6.fetchVPNInfo());
                imageViewDjBIcL.setTag(AEQbTJ, java.lang.Boolean.TRUE);
                set.add(str);
            } else {
                viewOLrzqt.setVisibility(0);
                imageViewDjBIcL.setTag(AEQbTJ, java.lang.Boolean.FALSE);
                iMImageHelper5.KWHzl(imageViewDjBIcL, iMImageModelAEQbTJ, iMImageHelper5.fetchVPNInfo(), true);
                android.content.Context context3 = imageViewDjBIcL.getContext();
                Intrinsics.checkNotNullExpressionValue(context3, "");
                iMImageHelper5.EZpvd(context3, iMImageModelAEQbTJ, new Function1() { // from class: o.nDX
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return nDB.copydefault(imageViewDjBIcL, str, viewOLrzqt, iMImageModelAEQbTJ, ((java.lang.Boolean) obj).booleanValue());
                    }
                });
            }
        }
        viewOLrzqt.setOnClickListener(new Dialog(viewOLrzqt, 1000L, imageViewDjBIcL, iMImageModelAEQbTJ, str, viewOLrzqt, viewCopydefault, c55113xdnAYXKKw, application));
        viewCopydefault.setOnClickListener(new LoaderManager(viewCopydefault, 1000L, imageViewDjBIcL, viewCopydefault, c55113xdnAYXKKw, str, iMImageModelAEQbTJ, viewOLrzqt));
        imageViewDjBIcL.setOnClickListener(new FragmentManager(imageViewDjBIcL, 1000L, imageViewDjBIcL, str, application, iMImageModelAEQbTJ, viewOLrzqt, viewCopydefault, c55113xdnAYXKKw));
        imageViewDjBIcL.setOnLongClickListener(new View.OnLongClickListener() { // from class: o.nEc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(android.view.View view) {
                return nDB.AuCTel(application, view);
            }
        });
    }

    public static final Unit copydefault(android.widget.ImageView imageView, java.lang.String str, android.view.View view, IMImageModel iMImageModel, boolean z) {
        java.lang.Object tag = imageView.getTag();
        if (!Intrinsics.EZpvd((java.lang.Object) (tag instanceof java.lang.String ? (java.lang.String) tag : null), (java.lang.Object) str)) {
            return Unit.INSTANCE;
        }
        if (z) {
            view.setVisibility(8);
            IMImageHelper iMImageHelper = IMImageHelper.OLrzqt;
            iMImageHelper.AEQbTJ(imageView, iMImageModel, iMImageHelper.fetchVPNInfo());
            imageView.setTag(AEQbTJ, java.lang.Boolean.TRUE);
            valueOf.add(str);
        }
        return Unit.INSTANCE;
    }

    public static final class ActionBar implements java.lang.Runnable {
        public static final ActionBar AEQbTJ = new ActionBar();

        @Override // java.lang.Runnable
        public final void run() {
            nDB ndb = nDB.copydefault;
            nDB.DbNXlk = false;
        }
    }

    public static final boolean AuCTel(Application application, android.view.View view) {
        Function1<android.view.View, java.lang.Boolean> function1KWHzl = application.KWHzl();
        Intrinsics.copydefault(view);
        return function1KWHzl.invoke(view).booleanValue();
    }

    public static final void getFieldNames(Application application, android.view.View view) {
        Function1<android.view.View, Unit> function1EZpvd = application.EZpvd();
        Intrinsics.copydefault(view);
        function1EZpvd.invoke(view);
    }

    public static final boolean uzCIH(Application application, android.view.View view) {
        Function1<android.view.View, java.lang.Boolean> function1KWHzl = application.KWHzl();
        Intrinsics.copydefault(view);
        return function1KWHzl.invoke(view).booleanValue();
    }

    public static final void iwGUEr(Application application, android.view.View view) {
        Function1<android.view.View, Unit> function1OLrzqt = application.OLrzqt();
        Intrinsics.copydefault(view);
        function1OLrzqt.invoke(view);
    }

    public static final boolean hDKMBd(Application application, android.view.View view) {
        Function1<android.view.View, java.lang.Boolean> function1AEQbTJ = application.AEQbTJ();
        Intrinsics.copydefault(view);
        return function1AEQbTJ.invoke(view).booleanValue();
    }

    public final void OLrzqt(final android.widget.ImageView imageView, final IMImageModel iMImageModel, final java.lang.String str, final android.view.View view, final android.view.View view2, final C55113xdn c55113xdn, Application application) {
        java.lang.Object tag = imageView.getTag(AEQbTJ);
        java.lang.Boolean bool = tag instanceof java.lang.Boolean ? (java.lang.Boolean) tag : null;
        if (bool != null && bool.booleanValue()) {
            application.EZpvd().invoke(imageView);
            return;
        }
        IMImageHelper iMImageHelper = IMImageHelper.OLrzqt;
        android.content.Context context = imageView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        iMImageHelper.EZpvd(context, iMImageModel, new Function1() { // from class: o.nDR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return nDB.OLrzqt(imageView, str, view, iMImageModel, view2, c55113xdn, ((java.lang.Boolean) obj).booleanValue());
            }
        });
    }

    public static final Unit OLrzqt(android.widget.ImageView imageView, java.lang.String str, android.view.View view, IMImageModel iMImageModel, android.view.View view2, C55113xdn c55113xdn, boolean z) {
        java.lang.Object tag = imageView.getTag();
        if (!Intrinsics.EZpvd((java.lang.Object) (tag instanceof java.lang.String ? (java.lang.String) tag : null), (java.lang.Object) str)) {
            return Unit.INSTANCE;
        }
        if (!z) {
            C43453rpa c43453rpa = C43453rpa.AEQbTJ;
            android.content.Context context = imageView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            if (!c43453rpa.KWHzl(context)) {
                int i = KWHzl;
                if (imageView.getTag(i) != null) {
                    return Unit.INSTANCE;
                }
                imageView.setTag(i, IMImageHelper.OLrzqt.copydefault(c55113xdn, view2, view, imageView, str, (32 & 32) != 0 ? 5000L : 0L));
            } else {
                view.setVisibility(8);
                copydefault.EZpvd(iMImageModel, str, imageView, view, view2, c55113xdn);
            }
        } else {
            view.setVisibility(8);
            IMImageHelper iMImageHelper = IMImageHelper.OLrzqt;
            iMImageHelper.KWHzl(imageView, iMImageModel, iMImageHelper.fetchVPNInfo(), false);
            imageView.setTag(AEQbTJ, java.lang.Boolean.TRUE);
            valueOf.add(str);
        }
        return Unit.INSTANCE;
    }

    public final void copydefault(android.widget.ImageView imageView, android.view.View view, android.view.View view2, java.lang.String str) {
        android.content.Context context;
        int i = KWHzl;
        java.lang.Object tag = imageView.getTag(i);
        java.lang.Runnable runnable = tag instanceof java.lang.Runnable ? (java.lang.Runnable) tag : null;
        if (runnable != null) {
            imageView.removeCallbacks(runnable);
            imageView.setTag(i, null);
        }
        int i2 = OLrzqt;
        java.lang.Object tag2 = imageView.getTag(i2);
        java.lang.Runnable runnable2 = tag2 instanceof java.lang.Runnable ? (java.lang.Runnable) tag2 : null;
        if (runnable2 != null) {
            imageView.removeCallbacks(runnable2);
            imageView.setTag(i2, null);
        }
        if (gEmmrt.contains(str) && (context = imageView.getContext()) != null && !EZpvd(context)) {
            try {
                Glide.KWHzl(imageView).AEQbTJ(imageView);
            } catch (java.lang.IllegalArgumentException unused) {
            }
        }
        gEmmrt.remove(str);
        if (view2 instanceof C55113xdn) {
            ((C55113xdn) view2).copydefault();
        }
        if (view2 != null) {
            view2.setVisibility(8);
        }
        view.setVisibility(8);
    }

    public final boolean EZpvd(android.content.Context context) {
        if (context instanceof android.app.Activity) {
            android.app.Activity activity = (android.app.Activity) context;
            if (activity.isDestroyed() || activity.isFinishing()) {
                return true;
            }
        } else if (context instanceof android.content.ContextWrapper) {
            android.content.Context baseContext = ((android.content.ContextWrapper) context).getBaseContext();
            Intrinsics.checkNotNullExpressionValue(baseContext, "");
            return EZpvd(baseContext);
        }
        return false;
    }

    public final void EZpvd(final IMImageModel iMImageModel, final java.lang.String str, final android.widget.ImageView imageView, final android.view.View view, final android.view.View view2, final C55113xdn c55113xdn) {
        gEmmrt.add(str);
        view2.setVisibility(0);
        c55113xdn.setVisibility(0);
        c55113xdn.KWHzl(0L);
        java.lang.Runnable runnable = new java.lang.Runnable() { // from class: o.nDQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                nDB.copydefault(str, imageView, iMImageModel, c55113xdn, view, view2);
            }
        };
        imageView.setTag(OLrzqt, runnable);
        imageView.postDelayed(runnable, 100L);
    }

    public static final void copydefault(final java.lang.String str, final android.widget.ImageView imageView, IMImageModel iMImageModel, final C55113xdn c55113xdn, final android.view.View view, final android.view.View view2) {
        if (gEmmrt.contains(str)) {
            IMImageHelper iMImageHelper = IMImageHelper.OLrzqt;
            iMImageHelper.AEQbTJ(imageView, iMImageModel, iMImageHelper.fetchVPNInfo(), new Function0() { // from class: o.nDO
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return nDB.KWHzl(str, c55113xdn, view, view2, imageView);
                }
            }, new Function1() { // from class: o.nDM
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return nDB.AEQbTJ(str, c55113xdn, view2, imageView, view, ((java.lang.Boolean) obj).booleanValue());
                }
            });
        }
    }

    public static final Unit KWHzl(java.lang.String str, C55113xdn c55113xdn, android.view.View view, android.view.View view2, android.widget.ImageView imageView) {
        java.util.Set<java.lang.String> set = gEmmrt;
        if (set.contains(str)) {
            set.remove(str);
            c55113xdn.copydefault();
            valueOf.add(str);
            view.setVisibility(8);
            view2.setVisibility(8);
            imageView.setTag(AEQbTJ, java.lang.Boolean.TRUE);
            imageView.setTag(OLrzqt, null);
        }
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(java.lang.String str, C55113xdn c55113xdn, android.view.View view, android.widget.ImageView imageView, android.view.View view2, boolean z) {
        java.util.Set<java.lang.String> set = gEmmrt;
        if (set.contains(str)) {
            set.remove(str);
            c55113xdn.copydefault();
            view.setVisibility(8);
            imageView.setTag(OLrzqt, null);
            if (!z) {
                valueOf.add(str);
                view2.setVisibility(8);
                imageView.setTag(AEQbTJ, java.lang.Boolean.TRUE);
            } else {
                view2.setVisibility(0);
                imageView.setTag(AEQbTJ, java.lang.Boolean.FALSE);
                IMImageHelper iMImageHelper = IMImageHelper.OLrzqt;
                android.content.Context context = imageView.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                iMImageHelper.copydefault(context);
            }
        }
        return Unit.INSTANCE;
    }

    public final void djBIcL(TaskDescription taskDescription, Activity activity, final Application application) {
        C35254nrp c35254nrpKWHzl;
        OKMessage oKMessageOLrzqt;
        java.lang.String strCopydefault = null;
        OKReferenceMessage oKReferenceMessageAEQbTJ = activity != null ? activity.AEQbTJ() : null;
        OKMessageContent originalOKMessageContent = oKReferenceMessageAEQbTJ != null ? oKReferenceMessageAEQbTJ.getOriginalOKMessageContent() : null;
        OKSightMessage oKSightMessage = originalOKMessageContent instanceof OKSightMessage ? (OKSightMessage) originalOKMessageContent : null;
        OKMessage.SentStatus sentStatus = (activity == null || (c35254nrpKWHzl = activity.KWHzl()) == null || (oKMessageOLrzqt = c35254nrpKWHzl.OLrzqt()) == null) ? null : oKMessageOLrzqt.getSentStatus();
        android.widget.FrameLayout frameLayoutDbNXlk = taskDescription.DbNXlk();
        boolean z = (activity == null || oKSightMessage == null || sentStatus == null) ? false : true;
        frameLayoutDbNXlk.setVisibility(z ? 0 : 8);
        if (!z) {
            frameLayoutDbNXlk.setOnClickListener(null);
            frameLayoutDbNXlk.setOnLongClickListener(null);
        } else {
            frameLayoutDbNXlk.setOnClickListener(new View.OnClickListener() { // from class: o.nDZ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    nDB.gHZMYf(application, view);
                }
            });
            frameLayoutDbNXlk.setOnLongClickListener(new View.OnLongClickListener() { // from class: o.nDY
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(android.view.View view) {
                    return nDB.AwvSrB(application, view);
                }
            });
        }
        android.widget.TextView textViewFetchVPNInfo = taskDescription.fetchVPNInfo();
        if (activity != null && oKSightMessage != null && sentStatus != null) {
            strCopydefault = copydefault.copydefault(oKSightMessage.getDuration());
        }
        textViewFetchVPNInfo.setText(strCopydefault);
        taskDescription.isConnected().setVisibility((sentStatus == OKMessage.SentStatus.SENDING || sentStatus == OKMessage.SentStatus.FAILED) ? 8 : 0);
        taskDescription.values().setVisibility(oKSightMessage == null ? 8 : 0);
        if (activity == null || oKSightMessage == null) {
            try {
                Result.Application application2 = Result.Companion;
                Glide.KWHzl(taskDescription.values()).AEQbTJ(taskDescription.values());
                Result.m7377constructorimpl(Unit.INSTANCE);
            } catch (java.lang.Throwable th) {
                Result.Application application3 = Result.Companion;
                Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
            taskDescription.values().setImageResource(C35399nuc.ActionBar.fZBcTu);
            return;
        }
        IMImageHelper iMImageHelper = IMImageHelper.OLrzqt;
        IMImageHelper.loadCacheOnlyImageWithThumbnail$default(iMImageHelper, taskDescription.values(), nPA.AEQbTJ(oKSightMessage), iMImageHelper.fetchVPNInfo(), false, 8, null);
    }

    public static final void gHZMYf(Application application, android.view.View view) {
        Function1<android.view.View, Unit> function1ValueOf = application.valueOf();
        Intrinsics.copydefault(view);
        function1ValueOf.invoke(view);
    }

    public static final boolean AwvSrB(Application application, android.view.View view) {
        Function1<android.view.View, java.lang.Boolean> function1IsConnected = application.isConnected();
        Intrinsics.copydefault(view);
        return function1IsConnected.invoke(view).booleanValue();
    }

    public final void AhwBna(TaskDescription taskDescription, Activity activity, final Application application) {
        C35254nrp c35254nrpKWHzl;
        C35254nrp c35254nrpKWHzl2;
        C35254nrp c35254nrpKWHzl3;
        C35254nrp c35254nrpKWHzl4;
        java.lang.Integer numDjBIcL;
        java.lang.Integer numValueOf = null;
        OKReferenceMessage oKReferenceMessageAEQbTJ = activity != null ? activity.AEQbTJ() : null;
        OKMessageContent originalOKMessageContent = oKReferenceMessageAEQbTJ != null ? oKReferenceMessageAEQbTJ.getOriginalOKMessageContent() : null;
        OKHQVoiceMessage oKHQVoiceMessage = originalOKMessageContent instanceof OKHQVoiceMessage ? (OKHQVoiceMessage) originalOKMessageContent : null;
        CardView newProxyInstance = taskDescription.getNewProxyInstance();
        newProxyInstance.setVisibility((activity == null || oKHQVoiceMessage == null) ? 8 : 0);
        if (activity == null || oKHQVoiceMessage == null) {
            newProxyInstance.setOnClickListener(null);
            newProxyInstance.setOnLongClickListener(null);
        } else {
            newProxyInstance.setOnClickListener(new View.OnClickListener() { // from class: o.nDG
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    nDB.AxsJAY(application, view);
                }
            });
            newProxyInstance.setOnLongClickListener(new View.OnLongClickListener() { // from class: o.nDS
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(android.view.View view) {
                    return nDB.sSMYrx(application, view);
                }
            });
        }
        android.graphics.drawable.Drawable drawable = (activity == null || (c35254nrpKWHzl4 = activity.KWHzl()) == null || (numDjBIcL = c35254nrpKWHzl4.djBIcL()) == null) ? null : ContextCompat.getDrawable(newProxyInstance.getRootView().getContext(), numDjBIcL.intValue());
        android.widget.TextView textViewFJNWhG = taskDescription.fJNWhG();
        textViewFJNWhG.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, (android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null);
        textViewFJNWhG.setCompoundDrawablePadding(C55298xhM.dp2px$default(6.0f, null, 1, null));
        taskDescription.fJNWhG().setText((activity == null || (c35254nrpKWHzl3 = activity.KWHzl()) == null) ? null : c35254nrpKWHzl3.AYXKKw());
        java.lang.String strAhwBna = (activity == null || (c35254nrpKWHzl2 = activity.KWHzl()) == null) ? null : c35254nrpKWHzl2.AhwBna();
        if (activity != null && (c35254nrpKWHzl = activity.KWHzl()) != null) {
            numValueOf = c35254nrpKWHzl.valueOf();
        }
        pUU.KWHzl("VoiceMessage", "onBindSendMessage->duration:" + strAhwBna + " progress:" + numValueOf);
    }

    public static final void AxsJAY(Application application, android.view.View view) {
        Function1<android.view.View, Unit> function1DbNXlk = application.DbNXlk();
        Intrinsics.copydefault(view);
        function1DbNXlk.invoke(view);
    }

    public static final boolean sSMYrx(Application application, android.view.View view) {
        Function1<android.view.View, java.lang.Boolean> function1FetchVPNInfo = application.fetchVPNInfo();
        Intrinsics.copydefault(view);
        return function1FetchVPNInfo.invoke(view).booleanValue();
    }

    public final void AEQbTJ(TaskDescription taskDescription, Activity activity, final Application application) {
        OKReferenceMessage oKReferenceMessageAEQbTJ;
        ViewGroup.LayoutParams layoutParams = null;
        OKMessageContent originalOKMessageContent = (activity == null || (oKReferenceMessageAEQbTJ = activity.AEQbTJ()) == null) ? null : oKReferenceMessageAEQbTJ.getOriginalOKMessageContent();
        OKStickerMessage oKStickerMessage = originalOKMessageContent instanceof OKStickerMessage ? (OKStickerMessage) originalOKMessageContent : null;
        android.widget.FrameLayout root = taskDescription.AuCTel().getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        root.setVisibility(oKStickerMessage != null ? 0 : 8);
        if (oKStickerMessage != null) {
            nMT nmtAuCTel = taskDescription.AuCTel();
            android.widget.FrameLayout root2 = nmtAuCTel.getRoot();
            Intrinsics.checkNotNullExpressionValue(root2, "");
            root2.setVisibility(0);
            ViewGroup.LayoutParams layoutParams2 = nmtAuCTel.KWHzl.getLayoutParams();
            Intrinsics.copydefault(layoutParams2, "");
            FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) layoutParams2;
            if (StateListAnimator.copydefault[activity.OLrzqt().ordinal()] == 1) {
                layoutParams3.gravity = 8388611;
            } else {
                layoutParams3.gravity = 8388613;
            }
            nmtAuCTel.KWHzl.setLayoutParams(layoutParams3);
            C37658oxw c37658oxw = C37658oxw.EZpvd;
            android.content.Context context = nmtAuCTel.getRoot().getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            int iCopydefault = c37658oxw.copydefault(context);
            ShapeableImageView shapeableImageView = nmtAuCTel.EZpvd;
            ViewGroup.LayoutParams layoutParams4 = shapeableImageView.getLayoutParams();
            if (layoutParams4 != null) {
                layoutParams4.width = iCopydefault;
                layoutParams4.height = iCopydefault;
                layoutParams = layoutParams4;
            }
            shapeableImageView.setLayoutParams(layoutParams);
            ViewGroup.LayoutParams layoutParams5 = nmtAuCTel.EZpvd.getLayoutParams();
            layoutParams5.width = iCopydefault;
            layoutParams5.height = iCopydefault;
            nmtAuCTel.EZpvd.setLayoutParams(layoutParams5);
            nmtAuCTel.AEQbTJ.setLayoutParams(layoutParams5);
            nmtAuCTel.EZpvd.setScaleType(ImageView.ScaleType.FIT_CENTER);
            LottieAnimationView lottieAnimationView = nmtAuCTel.AEQbTJ;
            android.content.Context context2 = lottieAnimationView.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            lottieAnimationView.setAnimationFromUrl(C7827arF.EZpvd("lottie/im/sticker_placeholder.lottie", context2, true));
            nmtAuCTel.AEQbTJ.setVisibility(0);
            Glide.AEQbTJ(nmtAuCTel.EZpvd.getContext()).EZpvd(oKStickerMessage.getIconUrl()).OLrzqt((RY<android.graphics.drawable.Drawable>) new Fragment(nmtAuCTel)).EZpvd((android.widget.ImageView) nmtAuCTel.EZpvd);
            nmtAuCTel.EZpvd.setOnLongClickListener(new View.OnLongClickListener() { // from class: o.nDL
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(android.view.View view) {
                    return nDB.AuCTelauCTel(application, view);
                }
            });
        }
    }

    public static final class Fragment implements RY<android.graphics.drawable.Drawable> {
        public final /* synthetic */ nMT OLrzqt;

        public Fragment(nMT nmt) {
            this.OLrzqt = nmt;
        }

        /* JADX DEBUG: Method merged with bridge method: copydefault(Ljava/lang/Object;Ljava/lang/Object;Lo/Sq;Lcom/bumptech/glide/load/DataSource;Z)Z */
        @Override // o.RY
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public boolean copydefault(android.graphics.drawable.Drawable drawable, java.lang.Object obj, InterfaceC5462Sq<android.graphics.drawable.Drawable> interfaceC5462Sq, com.bumptech.glide.load.DataSource dataSource, boolean z) {
            this.OLrzqt.AEQbTJ.setVisibility(8);
            this.OLrzqt.EZpvd.setVisibility(0);
            return false;
        }

        @Override // o.RY
        public boolean OLrzqt(GlideException glideException, java.lang.Object obj, InterfaceC5462Sq<android.graphics.drawable.Drawable> interfaceC5462Sq, boolean z) {
            this.OLrzqt.AEQbTJ.setVisibility(0);
            this.OLrzqt.EZpvd.setVisibility(8);
            return false;
        }
    }

    public static final boolean AuCTelauCTel(Application application, android.view.View view) {
        Function1<android.view.View, Unit> function1GEmmrt = application.gEmmrt();
        Intrinsics.copydefault(view);
        function1GEmmrt.invoke(view);
        return true;
    }

    public final void EZpvd(TaskDescription taskDescription, Activity activity) {
        OKReferenceMessage oKReferenceMessageAEQbTJ;
        OKMessageContent originalOKMessageContent = (activity == null || (oKReferenceMessageAEQbTJ = activity.AEQbTJ()) == null) ? null : oKReferenceMessageAEQbTJ.getOriginalOKMessageContent();
        OKFileMessage oKFileMessage = originalOKMessageContent instanceof OKFileMessage ? (OKFileMessage) originalOKMessageContent : null;
        C37728ozM c37728ozMAEQbTJ = taskDescription.AEQbTJ();
        if (c37728ozMAEQbTJ == null) {
            return;
        }
        c37728ozMAEQbTJ.setVisibility(oKFileMessage != null ? 0 : 8);
        if (oKFileMessage == null) {
            return;
        }
        boolean z = activity.OLrzqt() == OKMessage.MessageDirection.SEND;
        java.lang.String strAEQbTJ = AEQbTJ(activity);
        FileMessageState fileMessageStateAEQbTJ = AEQbTJ(strAEQbTJ, activity);
        pUU.EZpvd("RefFileInteraction", "[" + strAEQbTJ + "] bindFileMessage: isSender=" + z + ", state=" + fileMessageStateAEQbTJ + ", fileName=" + oKFileMessage.getFileName());
        ViewGroup.LayoutParams layoutParams = taskDescription.fIwbmz().getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = -1;
            taskDescription.fIwbmz().setLayoutParams(layoutParams);
        }
        c37728ozMAEQbTJ.setFillWidth();
        c37728ozMAEQbTJ.AEQbTJ(z);
        c37728ozMAEQbTJ.AEQbTJ(oKFileMessage, fileMessageStateAEQbTJ);
        if (fileMessageStateAEQbTJ == FileMessageState.DOWNLOADING) {
            OLrzqt(c37728ozMAEQbTJ, strAEQbTJ, oKFileMessage);
        }
        copydefault(c37728ozMAEQbTJ, strAEQbTJ, activity, oKFileMessage);
    }

    public final java.lang.String AEQbTJ(Activity activity) {
        java.lang.String clientMessageId = activity.KWHzl().OLrzqt().getClientMessageId();
        return clientMessageId == null ? java.lang.String.valueOf(activity.KWHzl().OLrzqt().getSeq()) : clientMessageId;
    }

    public final FileMessageState AEQbTJ(java.lang.String str, Activity activity) {
        FileMessageState fileMessageState;
        FileMessageState fileMessageState2;
        if (activity.OLrzqt() == OKMessage.MessageDirection.SEND) {
            int iKWHzl = activity.KWHzl().KWHzl();
            if (iKWHzl == 1) {
                fileMessageState = FileMessageState.UPLOAD_FAILED;
            } else if (iKWHzl == 2) {
                fileMessageState = FileMessageState.UPLOADING;
            } else {
                fileMessageState = FileMessageState.SENT;
            }
            pUU.EZpvd("RefFileInteraction", "[" + str + "] resolveFileState: SEND uiState=" + activity.KWHzl().KWHzl() + " -> " + fileMessageState);
        } else {
            fileMessageState = isConnected.get(str);
            if (fileMessageState != null) {
                pUU.EZpvd("RefFileInteraction", "[" + str + "] resolveFileState: RECEIVE cached=" + fileMessageState);
            } else {
                OKMessageContent originalOKMessageContent = activity.AEQbTJ().getOriginalOKMessageContent();
                OKFileMessage oKFileMessage = originalOKMessageContent instanceof OKFileMessage ? (OKFileMessage) originalOKMessageContent : null;
                java.util.Set<java.lang.String> set = values;
                if (set.contains(str)) {
                    fileMessageState2 = FileMessageState.DOWNLOADED;
                } else if (oKFileMessage != null && OLrzqt(oKFileMessage)) {
                    set.add(str);
                    fileMessageState2 = FileMessageState.DOWNLOADED;
                } else {
                    fileMessageState2 = FileMessageState.PENDING_DOWNLOAD;
                }
                fileMessageState = fileMessageState2;
                pUU.EZpvd("RefFileInteraction", "[" + str + "] resolveFileState: RECEIVE resolved=" + fileMessageState);
            }
        }
        isConnected.put(str, fileMessageState);
        return fileMessageState;
    }

    public final boolean OLrzqt(OKFileMessage oKFileMessage) {
        java.lang.String path;
        android.net.Uri localUri = oKFileMessage.getLocalUri();
        if (localUri == null) {
            return false;
        }
        return !Intrinsics.EZpvd((java.lang.Object) localUri.getScheme(), (java.lang.Object) "file") || ((path = localUri.getPath()) != null && new java.io.File(path).exists());
    }

    public final void OLrzqt(C37728ozM c37728ozM, java.lang.String str, OKFileMessage oKFileMessage) {
        java.lang.Integer num = AYXKKw.get(str);
        int iIntValue = num != null ? num.intValue() : 0;
        java.lang.Long fileSize = oKFileMessage.getFileSize();
        long jLongValue = fileSize != null ? fileSize.longValue() : 0L;
        c37728ozM.setTransferProgress((((long) iIntValue) * jLongValue) / 100, jLongValue);
        AEQbTJ(c37728ozM, str, oKFileMessage);
    }

    public final void AEQbTJ(final C37728ozM c37728ozM, java.lang.String str, final OKFileMessage oKFileMessage) {
        AkhnZx.put(str, new Function1() { // from class: o.nDW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return nDB.KWHzl(c37728ozM, oKFileMessage, (sIS) obj);
            }
        });
    }

    public static final Unit KWHzl(C37728ozM c37728ozM, OKFileMessage oKFileMessage, sIS sis) {
        Intrinsics.checkNotNullParameter(sis, "");
        copydefault.AEQbTJ(sis, c37728ozM, oKFileMessage);
        return Unit.INSTANCE;
    }

    public final void copydefault(final C37728ozM c37728ozM, final java.lang.String str, final Activity activity, final OKFileMessage oKFileMessage) {
        c37728ozM.setOnActionClickListener(new Function0() { // from class: o.nDV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return nDB.copydefault(str, c37728ozM, activity, oKFileMessage);
            }
        });
    }

    public static final Unit copydefault(java.lang.String str, C37728ozM c37728ozM, Activity activity, OKFileMessage oKFileMessage) {
        FileMessageState fileMessageState = isConnected.get(str);
        pUU.EZpvd("RefFileInteraction", "[" + str + "] actionClick: state=" + fileMessageState);
        int i = fileMessageState == null ? -1 : StateListAnimator.KWHzl[fileMessageState.ordinal()];
        if (i == 1 || i == 2) {
            copydefault.KWHzl(c37728ozM, str, activity, oKFileMessage);
        } else if (i == 3) {
            copydefault.EZpvd(c37728ozM, str, oKFileMessage);
        } else if (i == 4 || i == 5) {
            copydefault.OLrzqt(c37728ozM, str, activity, oKFileMessage);
        }
        return Unit.INSTANCE;
    }

    public final void KWHzl(C37728ozM c37728ozM, java.lang.String str, Activity activity, OKFileMessage oKFileMessage) {
        pUU.EZpvd("RefFileInteraction", "[" + str + "] startFileDownload: fileName=" + oKFileMessage.getFileName() + ", localUri=" + oKFileMessage.getLocalUri() + ", remoteUri=" + oKFileMessage.getRemoteUri());
        java.util.Map<java.lang.String, Job> map = AhwBna;
        Job job = map.get(str);
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (java.lang.Object) null);
        }
        java.util.Map<java.lang.String, FileMessageState> map2 = isConnected;
        FileMessageState fileMessageState = FileMessageState.DOWNLOADING;
        map2.put(str, fileMessageState);
        AYXKKw.put(str, 0);
        c37728ozM.AEQbTJ(oKFileMessage, fileMessageState);
        AEQbTJ(c37728ozM, str, oKFileMessage);
        C35777oDh c35777oDhValueOf = valueOf();
        OKMessage oKMessageEZpvd = EZpvd(activity.KWHzl().OLrzqt(), activity.AEQbTJ());
        if (oKMessageEZpvd != null) {
            map.put(str, BuildersKt__Builders_commonKt.launch$default(djBIcL, null, null, new ReferenceMessageBindHelper$startFileDownload$1(c35777oDhValueOf, oKMessageEZpvd, str, null), 3, null));
            return;
        }
        pUU.copydefault("RefFileInteraction", "[" + str + "] startFileDownload: failed to unwrap original message, aborting");
        FileMessageState fileMessageState2 = FileMessageState.DOWNLOAD_FAILED;
        map2.put(str, fileMessageState2);
        c37728ozM.AEQbTJ(oKFileMessage, fileMessageState2);
    }

    public final void AEQbTJ(sIS sis, java.lang.String str) {
        if (sis instanceof sIS.StateListAnimator) {
            sIS.StateListAnimator stateListAnimator = (sIS.StateListAnimator) sis;
            AYXKKw.put(str, java.lang.Integer.valueOf(stateListAnimator.KWHzl()));
            pUU.EZpvd("RefFileInteraction", "[" + str + "] downloadProgress: " + stateListAnimator.KWHzl() + "%");
            Unit unit = Unit.INSTANCE;
            return;
        }
        if (sis instanceof sIS.Activity) {
            pUU.EZpvd("RefFileInteraction", "[" + str + "] downloadSuccess");
            values.add(str);
            isConnected.put(str, FileMessageState.DOWNLOADED);
            AhwBna.remove(str);
            AkhnZx.remove(str);
            return;
        }
        if (sis instanceof sIS.Application) {
            pUU.copydefault("RefFileInteraction", "[" + str + "] downloadError: " + ((sIS.Application) sis).copydefault());
            isConnected.put(str, FileMessageState.DOWNLOAD_FAILED);
            AhwBna.remove(str);
            AkhnZx.remove(str);
            return;
        }
        if (!(sis instanceof sIS.TaskDescription)) {
            throw new NoWhenBranchMatchedException();
        }
        pUU.copydefault("RefFileInteraction", "[" + str + "] downloadExpired");
        isConnected.put(str, FileMessageState.DOWNLOAD_FAILED);
        AhwBna.remove(str);
        AkhnZx.remove(str);
    }

    public final void AEQbTJ(sIS sis, C37728ozM c37728ozM, OKFileMessage oKFileMessage) {
        if (sis instanceof sIS.StateListAnimator) {
            java.lang.Long fileSize = oKFileMessage.getFileSize();
            long jLongValue = fileSize != null ? fileSize.longValue() : 0L;
            c37728ozM.setTransferProgress((((long) ((sIS.StateListAnimator) sis).KWHzl()) * jLongValue) / 100, jLongValue);
        } else if (sis instanceof sIS.Activity) {
            pUU.EZpvd("RefFileInteraction", "handleFileDownloadResult: UI updated to DOWNLOADED");
            c37728ozM.AEQbTJ(oKFileMessage, FileMessageState.DOWNLOADED);
        } else {
            if (!(sis instanceof sIS.Application) && !(sis instanceof sIS.TaskDescription)) {
                throw new NoWhenBranchMatchedException();
            }
            pUU.copydefault("RefFileInteraction", "handleFileDownloadResult: UI updated to DOWNLOAD_FAILED, showing snackbar");
            c37728ozM.AEQbTJ(oKFileMessage, FileMessageState.DOWNLOAD_FAILED);
            OLrzqt(c37728ozM);
        }
    }

    public final void EZpvd(C37728ozM c37728ozM, java.lang.String str, OKFileMessage oKFileMessage) {
        pUU.EZpvd("RefFileInteraction", "[" + str + "] cancelFileDownload: cancelling active download");
        java.util.Map<java.lang.String, Job> map = AhwBna;
        Job job = map.get(str);
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (java.lang.Object) null);
        }
        map.remove(str);
        AkhnZx.remove(str);
        AYXKKw.remove(str);
        java.util.Map<java.lang.String, FileMessageState> map2 = isConnected;
        FileMessageState fileMessageState = FileMessageState.PENDING_DOWNLOAD;
        map2.put(str, fileMessageState);
        c37728ozM.AEQbTJ(oKFileMessage, fileMessageState);
    }

    public final void OLrzqt(C37728ozM c37728ozM, java.lang.String str, Activity activity, OKFileMessage oKFileMessage) {
        if (OLrzqt(oKFileMessage)) {
            pUU.EZpvd("RefFileInteraction", "[" + str + "] openOrReDownloadFile: file available locally, opening");
            OLrzqt(c37728ozM, oKFileMessage);
            return;
        }
        pUU.EZpvd("RefFileInteraction", "[" + str + "] openOrReDownloadFile: file not local, re-downloading");
        values.remove(str);
        KWHzl(c37728ozM, str, activity, oKFileMessage);
    }

    public final void OLrzqt(android.view.View view, OKFileMessage oKFileMessage) {
        java.lang.String cdn;
        android.net.Uri localUri = oKFileMessage.getLocalUri();
        if (localUri == null && (localUri = oKFileMessage.getRemoteUri()) == null) {
            MediaUrlPaths urlPaths = oKFileMessage.getUrlPaths();
            if (urlPaths == null || (cdn = urlPaths.getDefault()) == null) {
                MediaUrlPaths urlPaths2 = oKFileMessage.getUrlPaths();
                cdn = urlPaths2 != null ? urlPaths2.getCdn() : null;
            }
            if (cdn != null) {
                localUri = android.net.Uri.parse(cdn);
                Intrinsics.checkNotNullExpressionValue(localUri, "");
            } else {
                localUri = null;
            }
        }
        if (localUri == null) {
            pUU.copydefault("RefFileInteraction", "openFile: no URI available for " + oKFileMessage.getFileName() + ", showing error");
            OLrzqt(view);
            return;
        }
        C37669oyG c37669oyG = C37669oyG.AEQbTJ;
        java.lang.String strCopydefault = c37669oyG.copydefault(oKFileMessage.getFileExtension());
        pUU.EZpvd("RefFileInteraction", "openFile: opening " + oKFileMessage.getFileName() + ", mimeType=" + strCopydefault + ", uri=" + localUri);
        android.content.Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        c37669oyG.AEQbTJ(context, localUri, strCopydefault);
    }

    public final void OLrzqt(android.view.View view) {
        android.view.View rootView = view.getRootView();
        android.view.ViewGroup viewGroup = rootView instanceof android.view.ViewGroup ? (android.view.ViewGroup) rootView : null;
        if (viewGroup == null) {
            return;
        }
        java.lang.String string = viewGroup.getContext().getString(C35399nuc.LoaderManager.DDjfYY);
        Intrinsics.checkNotNullExpressionValue(string, "");
        C55284xgz c55284xgzKWHzl = C55284xgz.Companion.KWHzl(viewGroup, string);
        if (c55284xgzKWHzl != null) {
            c55284xgzKWHzl.isConnected(0);
            c55284xgzKWHzl.AEQbTJ(string);
            c55284xgzKWHzl.hDKMBd();
        }
    }

    public final void copydefault(java.lang.String str) {
        if (str != null) {
            pUU.EZpvd("RefFileInteraction", "[" + str + "] cleanupFileProgressCallback: view recycled");
            AkhnZx.remove(str);
        }
    }

    public final void AEQbTJ(TaskDescription taskDescription, Activity activity) {
        if (activity == null) {
            taskDescription.fIwbmz().setBackground(null);
            return;
        }
        OKMessageContent originalOKMessageContent = activity.AEQbTJ().getOriginalOKMessageContent();
        if ((originalOKMessageContent instanceof OKGIFMessage) || (originalOKMessageContent instanceof OKImageMessage) || (originalOKMessageContent instanceof OKSightMessage)) {
            taskDescription.AhwBna().setBackground(null);
            LinearLayoutCompat linearLayoutCompatEjfBZ = taskDescription.ejfBZ();
            C35254nrp.Application application = C35254nrp.Companion;
            android.content.Context context = taskDescription.fIwbmz().getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            linearLayoutCompatEjfBZ.setBackground(application.KWHzl(context, activity.KWHzl()));
            return;
        }
        LinearLayoutCompat linearLayoutCompatAhwBna = taskDescription.AhwBna();
        C35254nrp.Application application2 = C35254nrp.Companion;
        android.content.Context context2 = taskDescription.fIwbmz().getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        linearLayoutCompatAhwBna.setBackground(application2.KWHzl(context2, activity.KWHzl()));
        taskDescription.ejfBZ().setBackground(null);
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.oAy.bindUI$default(o.oAy, o.oHg, java.util.List, boolean, java.lang.String, long, com.okinc.okimcore.model.im.OKConversationType, com.okinc.okimcore.model.im.OKConversation, com.okinc.okimcore.model.remote.UserInfo, boolean, boolean, int, java.lang.Object):void */
    public final void AEQbTJ(TaskDescription taskDescription, Activity activity, OKConversation oKConversation, com.okinc.okimcore.model.remote.UserInfo userInfo) {
        java.util.List<ReactionDisplay> listAhwBna;
        C35254nrp c35254nrpKWHzl;
        OKMessage oKMessageOLrzqt;
        C35254nrp c35254nrpKWHzl2;
        OKMessage oKMessageOLrzqt2;
        C35254nrp c35254nrpKWHzl3;
        OKMessage oKMessageOLrzqt3;
        C35254nrp c35254nrpKWHzl4;
        OKMessage oKMessageOLrzqt4;
        C35254nrp c35254nrpKWHzl5;
        OKMessage oKMessageOLrzqt5;
        java.util.List<ReactionDisplay> reactionDisplay = (activity == null || (c35254nrpKWHzl5 = activity.KWHzl()) == null || (oKMessageOLrzqt5 = c35254nrpKWHzl5.OLrzqt()) == null) ? null : oKMessageOLrzqt5.getReactionDisplay();
        if (reactionDisplay == null || reactionDisplay.isEmpty()) {
            C33131mqf.EZpvd(taskDescription.KWHzl());
            C33131mqf.EZpvd(taskDescription.valueOf());
            return;
        }
        OKReferenceMessage oKReferenceMessageAEQbTJ = activity != null ? activity.AEQbTJ() : null;
        OKMessageContent originalOKMessageContent = oKReferenceMessageAEQbTJ != null ? oKReferenceMessageAEQbTJ.getOriginalOKMessageContent() : null;
        if ((originalOKMessageContent instanceof OKGIFMessage) || (originalOKMessageContent instanceof OKImageMessage) || (originalOKMessageContent instanceof OKSightMessage)) {
            sDK sdk = (sDK) C33131mqf.OLrzqt(taskDescription.valueOf());
            C33131mqf.KWHzl(taskDescription.valueOf());
            C35713oAy c35713oAy = C35713oAy.KWHzl;
            C35884oHg c35884oHg = sdk.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(c35884oHg, "");
            java.util.List<ReactionDisplay> reactionDisplay2 = activity.KWHzl().OLrzqt().getReactionDisplay();
            if (reactionDisplay2 == null) {
                reactionDisplay2 = yDY.AhwBna();
            }
            c35713oAy.EZpvd(c35884oHg, reactionDisplay2, activity.OLrzqt() == OKMessage.MessageDirection.RECEIVE, C33129mqd.gEmmrt(activity.KWHzl().OLrzqt().getTargetId()), C33129mqd.valueOf(java.lang.Long.valueOf(activity.KWHzl().OLrzqt().getSeq())), activity.KWHzl().OLrzqt().getConversationType(), oKConversation, userInfo, false, (512 & 512) != 0);
            C33131mqf.EZpvd(taskDescription.KWHzl());
            C35884oHg c35884oHg2 = sdk.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(c35884oHg2, "");
            c35713oAy.AEQbTJ(c35884oHg2);
            return;
        }
        sDK sdk2 = (sDK) C33131mqf.OLrzqt(taskDescription.KWHzl());
        C33131mqf.KWHzl(taskDescription.KWHzl());
        C35713oAy c35713oAy2 = C35713oAy.KWHzl;
        C35884oHg c35884oHg3 = sdk2.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(c35884oHg3, "");
        if (activity == null || (c35254nrpKWHzl4 = activity.KWHzl()) == null || (oKMessageOLrzqt4 = c35254nrpKWHzl4.OLrzqt()) == null || (listAhwBna = oKMessageOLrzqt4.getReactionDisplay()) == null) {
            listAhwBna = yDY.AhwBna();
        }
        c35713oAy2.EZpvd(c35884oHg3, listAhwBna, (activity != null ? activity.OLrzqt() : null) == OKMessage.MessageDirection.RECEIVE, C33129mqd.gEmmrt((activity == null || (c35254nrpKWHzl3 = activity.KWHzl()) == null || (oKMessageOLrzqt3 = c35254nrpKWHzl3.OLrzqt()) == null) ? null : oKMessageOLrzqt3.getTargetId()), C33129mqd.valueOf((activity == null || (c35254nrpKWHzl2 = activity.KWHzl()) == null || (oKMessageOLrzqt2 = c35254nrpKWHzl2.OLrzqt()) == null) ? null : java.lang.Long.valueOf(oKMessageOLrzqt2.getSeq())), (activity == null || (c35254nrpKWHzl = activity.KWHzl()) == null || (oKMessageOLrzqt = c35254nrpKWHzl.OLrzqt()) == null) ? null : oKMessageOLrzqt.getConversationType(), oKConversation, userInfo, (activity != null ? activity.OLrzqt() : null) != OKMessage.MessageDirection.SEND ? C33492mxV.OLrzqt() : true, (512 & 512) != 0);
        C33131mqf.EZpvd(taskDescription.valueOf());
        C35884oHg c35884oHg4 = sdk2.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(c35884oHg4, "");
        c35713oAy2.EZpvd(c35884oHg4);
    }
}
