package o;

import com.okinc.im.imui.managerV2.DownloadAudioManager$download$1;
import com.okinc.okimcore.model.im.OKHQVoiceMessage;
import com.okinc.okimcore.model.im.OKMessage;
import com.okinc.okimcore.model.im.OKMessageContent;
import com.okinc.okimcore.model.im.OKReferenceMessage;
import java.util.LinkedHashSet;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ocU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
@yCR
public final class C36517ocU {
    public final java.util.HashMap<java.lang.String, StateListAnimator> AEQbTJ;
    public final java.util.Set<InterfaceC36522ocZ> EZpvd;
    public final CoroutineScope KWHzl;
    public final android.os.Handler OLrzqt;
    public final CoroutineDispatcher copydefault;

    @yCM
    public C36517ocU(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull CoroutineScope coroutineScope) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(coroutineScope, "");
        this.KWHzl = coroutineScope;
        this.AEQbTJ = new java.util.HashMap<>();
        this.EZpvd = new LinkedHashSet();
        this.copydefault = CoroutineDispatcher.limitedParallelism$default(coroutineDispatcher, 1, null, 2, null);
        this.OLrzqt = new android.os.Handler(android.os.Looper.getMainLooper());
    }

    /* JADX INFO: renamed from: o.ocU$StateListAnimator */
    public static final class StateListAnimator {
        public static final ActionBar Companion = new ActionBar(null);
        public static final int copydefault = 8;
        public final int AEQbTJ;
        public final float EZpvd;
        public final android.net.Uri KWHzl;
        public final android.net.Uri OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ StateListAnimator copy$default(StateListAnimator stateListAnimator, int i, float f, android.net.Uri uri, android.net.Uri uri2, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                i = stateListAnimator.AEQbTJ;
            }
            if ((i2 & 2) != 0) {
                f = stateListAnimator.EZpvd;
            }
            if ((i2 & 4) != 0) {
                uri = stateListAnimator.KWHzl;
            }
            if ((i2 & 8) != 0) {
                uri2 = stateListAnimator.OLrzqt;
            }
            return stateListAnimator.EZpvd(i, f, uri, uri2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StateListAnimator EZpvd(int i, float f, android.net.Uri uri, android.net.Uri uri2) {
            return new StateListAnimator(i, f, uri, uri2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.net.Uri KWHzl() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int OLrzqt() {
            return this.AEQbTJ;
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
            return this.AEQbTJ == stateListAnimator.AEQbTJ && java.lang.Float.compare(this.EZpvd, stateListAnimator.EZpvd) == 0 && Intrinsics.EZpvd(this.KWHzl, stateListAnimator.KWHzl) && Intrinsics.EZpvd(this.OLrzqt, stateListAnimator.OLrzqt);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = java.lang.Integer.hashCode(this.AEQbTJ);
            int iHashCode2 = java.lang.Float.hashCode(this.EZpvd);
            android.net.Uri uri = this.KWHzl;
            int iHashCode3 = uri == null ? 0 : uri.hashCode();
            android.net.Uri uri2 = this.OLrzqt;
            return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (uri2 != null ? uri2.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "DownloadState(state=" + this.AEQbTJ + ", progress=" + this.EZpvd + ", localUri=" + this.KWHzl + ", remoteUri=" + this.OLrzqt + ")";
        }

        public StateListAnimator(int i, float f, android.net.Uri uri, android.net.Uri uri2) {
            this.AEQbTJ = i;
            this.EZpvd = f;
            this.KWHzl = uri;
            this.OLrzqt = uri2;
        }

        /* JADX INFO: renamed from: o.ocU$StateListAnimator$ActionBar */
        public static final class ActionBar {
            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.ocU.StateListAnimator.ActionBar.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private ActionBar() {
            }

            public final StateListAnimator AEQbTJ() {
                return new StateListAnimator(1, 0.0f, null, null);
            }
        }
    }

    public final java.lang.String AEQbTJ(OKMessage oKMessage) {
        return oKMessage.getTargetId() + oKMessage.getSeq();
    }

    public final void OLrzqt(final OKMessage oKMessage) {
        for (final InterfaceC36522ocZ interfaceC36522ocZ : this.EZpvd) {
            final StateListAnimator stateListAnimator = this.AEQbTJ.get(AEQbTJ(oKMessage));
            if (stateListAnimator != null) {
                this.OLrzqt.post(new java.lang.Runnable() { // from class: o.ocS
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // java.lang.Runnable
                    public final void run() {
                        C36517ocU.EZpvd(interfaceC36522ocZ, oKMessage, stateListAnimator);
                    }
                });
            }
        }
    }

    public static final void EZpvd(InterfaceC36522ocZ interfaceC36522ocZ, OKMessage oKMessage, StateListAnimator stateListAnimator) {
        interfaceC36522ocZ.EZpvd(oKMessage, stateListAnimator);
    }

    public final void AEQbTJ(OKMessage oKMessage, Function1<? super StateListAnimator, StateListAnimator> function1) {
        StateListAnimator stateListAnimator = this.AEQbTJ.get(AEQbTJ(oKMessage));
        if (stateListAnimator != null) {
            this.AEQbTJ.put(AEQbTJ(oKMessage), function1.invoke(stateListAnimator));
            OLrzqt(oKMessage);
        }
    }

    public final OKHQVoiceMessage KWHzl(OKMessage oKMessage) {
        OKMessageContent content = oKMessage.getContent();
        if (content instanceof OKReferenceMessage) {
            OKMessageContent originalOKMessageContent = ((OKReferenceMessage) content).getOriginalOKMessageContent();
            if (originalOKMessageContent instanceof OKHQVoiceMessage) {
                return (OKHQVoiceMessage) originalOKMessageContent;
            }
        } else if (content instanceof OKHQVoiceMessage) {
            return (OKHQVoiceMessage) content;
        }
        return null;
    }

    public final void AEQbTJ(@NotNull InterfaceC36522ocZ interfaceC36522ocZ) {
        Intrinsics.checkNotNullParameter(interfaceC36522ocZ, "");
        this.EZpvd.add(interfaceC36522ocZ);
    }

    public final void EZpvd(@NotNull InterfaceC36522ocZ interfaceC36522ocZ) {
        Intrinsics.checkNotNullParameter(interfaceC36522ocZ, "");
        this.EZpvd.remove(interfaceC36522ocZ);
    }

    public final StateListAnimator copydefault(@NotNull OKMessage oKMessage) {
        Intrinsics.checkNotNullParameter(oKMessage, "");
        return this.AEQbTJ.get(AEQbTJ(oKMessage));
    }

    public final Job EZpvd(@NotNull OKMessage oKMessage) {
        Intrinsics.checkNotNullParameter(oKMessage, "");
        return BuildersKt__Builders_commonKt.launch$default(this.KWHzl, this.copydefault, null, new DownloadAudioManager$download$1(this, oKMessage, null), 2, null);
    }

    public final void KWHzl() {
        this.AEQbTJ.clear();
    }
}
