package o;

import com.okinc.network.okg.response.OKServerException;
import com.okinc.okimcore.channel.inhouse.impl.InHouseIMSendImpl$sendMediaMessageOnChannel$1;
import com.okinc.okimcore.channel.inhouse.impl.InHouseIMSendImpl$sendNormalMessageOnChannel$1;
import com.okinc.okimcore.channel.inhouse.impl.InHouseIMSendImpl$sendReactionMessage$1;
import com.okinc.okimcore.channel.inhouse.impl.InHouseIMSendImpl$withBroadcastResult$1;
import com.okinc.okimcore.channel.inhouse.impl.InHouseIMSendImpl$withBroadcastResult$2;
import com.okinc.okimcore.model.exception.ChannelErrorCode;
import com.okinc.okimcore.model.im.OKMediaMessageContent;
import com.okinc.okimcore.model.im.OKMessage;
import com.okinc.okimcore.model.im.inhouseim.ws.WSSendReactionData;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import o.C44138sEs;
import o.C44502sSe;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.sEs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C44138sEs implements InterfaceC44285sKd {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int KWHzl = 8;
    public final sFQ AEQbTJ;
    public final InterfaceC44505sSh AYXKKw;
    public final CopyOnWriteArrayList<InterfaceC44294sKm> AhwBna;
    public final sHU EZpvd;
    public final CoroutineScope OLrzqt;
    public final CoroutineDispatcher copydefault;
    public final InterfaceC44293sKl djBIcL;
    public final ConcurrentHashMap<java.lang.String, Application> valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InterfaceC44293sKl EZpvd() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final sFQ KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InterfaceC44505sSh OLrzqt() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ConcurrentHashMap<java.lang.String, Application> copydefault() {
        return this.valueOf;
    }

    public C44138sEs(@NotNull sHU shu, @NotNull sFQ sfq, @NotNull InterfaceC44293sKl interfaceC44293sKl, @NotNull InterfaceC44505sSh interfaceC44505sSh, @NotNull CoroutineDispatcher coroutineDispatcher, @NotNull CoroutineScope coroutineScope) {
        Intrinsics.checkNotNullParameter(shu, "");
        Intrinsics.checkNotNullParameter(sfq, "");
        Intrinsics.checkNotNullParameter(interfaceC44293sKl, "");
        Intrinsics.checkNotNullParameter(interfaceC44505sSh, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(coroutineScope, "");
        this.EZpvd = shu;
        this.AEQbTJ = sfq;
        this.djBIcL = interfaceC44293sKl;
        this.AYXKKw = interfaceC44505sSh;
        this.copydefault = coroutineDispatcher;
        this.OLrzqt = coroutineScope;
        this.AhwBna = new CopyOnWriteArrayList<>();
        this.valueOf = new ConcurrentHashMap<>();
    }

    /* JADX INFO: renamed from: o.sEs$Application */
    /* JADX INFO: loaded from: classes16.dex */
    public static final class Application {
        public final InterfaceC44290sKi AEQbTJ;
        public final Job OLrzqt;
        public final OKMessage copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Application copy$default(Application application, Job job, OKMessage oKMessage, InterfaceC44290sKi interfaceC44290sKi, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                job = application.OLrzqt;
            }
            if ((i & 2) != 0) {
                oKMessage = application.copydefault;
            }
            if ((i & 4) != 0) {
                interfaceC44290sKi = application.AEQbTJ;
            }
            return application.AEQbTJ(job, oKMessage, interfaceC44290sKi);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Application AEQbTJ(@NotNull Job job, @NotNull OKMessage oKMessage, @NotNull InterfaceC44290sKi interfaceC44290sKi) {
            Intrinsics.checkNotNullParameter(job, "");
            Intrinsics.checkNotNullParameter(oKMessage, "");
            Intrinsics.checkNotNullParameter(interfaceC44290sKi, "");
            return new Application(job, oKMessage, interfaceC44290sKi);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final OKMessage EZpvd() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Job KWHzl() {
            return this.OLrzqt;
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
            return Intrinsics.EZpvd(this.OLrzqt, application.OLrzqt) && Intrinsics.EZpvd(this.copydefault, application.copydefault) && Intrinsics.EZpvd(this.AEQbTJ, application.AEQbTJ);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((this.OLrzqt.hashCode() * 31) + this.copydefault.hashCode()) * 31) + this.AEQbTJ.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "MediaUploadEntry(job=" + this.OLrzqt + ", message=" + this.copydefault + ", callback=" + this.AEQbTJ + ")";
        }

        public Application(@NotNull Job job, @NotNull OKMessage oKMessage, @NotNull InterfaceC44290sKi interfaceC44290sKi) {
            Intrinsics.checkNotNullParameter(job, "");
            Intrinsics.checkNotNullParameter(oKMessage, "");
            Intrinsics.checkNotNullParameter(interfaceC44290sKi, "");
            this.OLrzqt = job;
            this.copydefault = oKMessage;
            this.AEQbTJ = interfaceC44290sKi;
        }
    }

    @Override // o.InterfaceC44285sKd
    public void copydefault(@NotNull InterfaceC44294sKm interfaceC44294sKm) {
        Intrinsics.checkNotNullParameter(interfaceC44294sKm, "");
        this.AhwBna.add(interfaceC44294sKm);
    }

    @Override // o.InterfaceC44285sKd
    public void EZpvd(@NotNull InterfaceC44294sKm interfaceC44294sKm) {
        Intrinsics.checkNotNullParameter(interfaceC44294sKm, "");
        this.AhwBna.remove(interfaceC44294sKm);
    }

    public final boolean copydefault(@NotNull OKMessage oKMessage) {
        Intrinsics.checkNotNullParameter(oKMessage, "");
        if (!C33129mqd.KWHzl((java.util.Collection) this.AhwBna)) {
            return false;
        }
        java.util.Iterator<T> it = this.AhwBna.iterator();
        while (it.hasNext()) {
            if (((InterfaceC44294sKm) it.next()).KWHzl(oKMessage)) {
                return true;
            }
        }
        return false;
    }

    @Override // o.InterfaceC44285sKd
    public void AEQbTJ(@NotNull OKMessage oKMessage, InterfaceC44289sKh interfaceC44289sKh) {
        Intrinsics.checkNotNullParameter(oKMessage, "");
        if (copydefault(oKMessage)) {
            return;
        }
        if ((oKMessage.getContent() instanceof OKMediaMessageContent) && (interfaceC44289sKh instanceof InterfaceC44290sKi)) {
            KWHzl(oKMessage, EZpvd((InterfaceC44290sKi) interfaceC44289sKh));
        } else {
            copydefault(oKMessage, EZpvd(interfaceC44289sKh));
        }
    }

    @Override // o.InterfaceC44285sKd
    public void OLrzqt(@NotNull OKMessage oKMessage, InterfaceC44290sKi interfaceC44290sKi) {
        Intrinsics.checkNotNullParameter(oKMessage, "");
        if (copydefault(oKMessage)) {
            return;
        }
        KWHzl(oKMessage, EZpvd(interfaceC44290sKi));
    }

    @Override // o.InterfaceC44285sKd
    public void KWHzl(@NotNull OKMessage oKMessage) {
        Intrinsics.checkNotNullParameter(oKMessage, "");
        if (oKMessage.getContent() instanceof OKMediaMessageContent) {
            OLrzqt(oKMessage, (InterfaceC44290sKi) null);
        } else {
            AEQbTJ(oKMessage, null);
        }
    }

    @Override // o.InterfaceC44285sKd
    public void OLrzqt(@NotNull WSSendReactionData wSSendReactionData, InterfaceC44295sKn interfaceC44295sKn) {
        Intrinsics.checkNotNullParameter(wSSendReactionData, "");
        BuildersKt__Builders_commonKt.launch$default(this.OLrzqt, this.copydefault, null, new InHouseIMSendImpl$sendReactionMessage$1(this, wSSendReactionData, interfaceC44295sKn, null), 2, null);
    }

    public void copydefault(@NotNull OKMessage oKMessage, @NotNull InterfaceC44289sKh interfaceC44289sKh) {
        Intrinsics.checkNotNullParameter(oKMessage, "");
        Intrinsics.checkNotNullParameter(interfaceC44289sKh, "");
        BuildersKt__Builders_commonKt.launch$default(this.OLrzqt, this.copydefault, null, new InHouseIMSendImpl$sendNormalMessageOnChannel$1(this, oKMessage, interfaceC44289sKh, null), 2, null);
    }

    /* JADX WARN: Type inference failed for: r14v2, types: [T, kotlinx.coroutines.Job] */
    public void KWHzl(@NotNull OKMessage oKMessage, @NotNull InterfaceC44290sKi interfaceC44290sKi) {
        Intrinsics.checkNotNullParameter(oKMessage, "");
        Intrinsics.checkNotNullParameter(interfaceC44290sKi, "");
        pUU.EZpvd("FileUploadProgress", "sendMediaMessageOnChannel: launching upload job (OKMessage.clientMessageId=" + oKMessage.getClientMessageId() + ")");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
        objectRef2.element = BuildersKt__Builders_commonKt.launch$default(this.OLrzqt, this.copydefault, null, new InHouseIMSendImpl$sendMediaMessageOnChannel$1(this, oKMessage, interfaceC44290sKi, objectRef, objectRef2, null), 2, null);
    }

    @Override // o.InterfaceC44285sKd
    public boolean KWHzl(@NotNull final java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        Application applicationRemove = this.valueOf.remove(str);
        pUU.EZpvd("FileUploadProgress", "[" + C59454zhO.isConnected(str, 8) + "] cancelMediaUpload: jobFound=" + (applicationRemove != null));
        if (applicationRemove == null) {
            return false;
        }
        C44385sNw c44385sNw = C44385sNw.KWHzl;
        c44385sNw.copydefault(str);
        applicationRemove.KWHzl().cancel(new CancellationException("User cancelled upload"));
        c44385sNw.AhwBna(str);
        final OKMessage oKMessageEZpvd = applicationRemove.EZpvd();
        this.djBIcL.copydefault(new Function1() { // from class: o.sEu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C44138sEs.EZpvd(oKMessageEZpvd, str, (InterfaceC44291sKj) obj);
            }
        });
        return true;
    }

    public static final Unit EZpvd(OKMessage oKMessage, java.lang.String str, InterfaceC44291sKj interfaceC44291sKj) {
        Intrinsics.checkNotNullParameter(interfaceC44291sKj, "");
        interfaceC44291sKj.OLrzqt(new C44454sQk(oKMessage.getTargetId(), C56402yEa.EZpvd(str), oKMessage.getConversationType()));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.sEs$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.sEs.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    public final Flow<C44502sSe.StateListAnimator> AEQbTJ(@NotNull Flow<? extends C44502sSe.StateListAnimator> flow, @NotNull OKMessage oKMessage, @NotNull InterfaceC44289sKh interfaceC44289sKh) {
        Intrinsics.checkNotNullParameter(flow, "");
        Intrinsics.checkNotNullParameter(oKMessage, "");
        Intrinsics.checkNotNullParameter(interfaceC44289sKh, "");
        return FlowKt.m7441catch(FlowKt.onEach(flow, new InHouseIMSendImpl$withBroadcastResult$1(interfaceC44289sKh, this, null)), new InHouseIMSendImpl$withBroadcastResult$2(oKMessage, interfaceC44289sKh, null));
    }

    /* JADX INFO: renamed from: o.sEs$StateListAnimator */
    public static final class StateListAnimator implements InterfaceC44289sKh {
        public final /* synthetic */ InterfaceC44289sKh copydefault;

        public StateListAnimator(InterfaceC44289sKh interfaceC44289sKh) {
            this.copydefault = interfaceC44289sKh;
        }

        @Override // o.InterfaceC44289sKh
        public void copydefault(final OKMessage oKMessage) {
            Intrinsics.checkNotNullParameter(oKMessage, "");
            if (oKMessage.isVisible()) {
                C44138sEs.this.EZpvd().copydefault(new Function1() { // from class: o.sEw
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C44138sEs.StateListAnimator.AEQbTJ(oKMessage, (InterfaceC44291sKj) obj);
                    }
                });
            }
            InterfaceC44289sKh interfaceC44289sKh = this.copydefault;
            if (interfaceC44289sKh != null) {
                interfaceC44289sKh.copydefault(oKMessage);
            }
        }

        public static final Unit AEQbTJ(OKMessage oKMessage, InterfaceC44291sKj interfaceC44291sKj) {
            Intrinsics.checkNotNullParameter(interfaceC44291sKj, "");
            interfaceC44291sKj.EZpvd(new C44468sQy(0, oKMessage));
            return Unit.INSTANCE;
        }

        @Override // o.InterfaceC44289sKh
        public void AEQbTJ(final OKMessage oKMessage) {
            Intrinsics.checkNotNullParameter(oKMessage, "");
            if (oKMessage.isVisible()) {
                C44138sEs.this.EZpvd().copydefault(new Function1() { // from class: o.sEy
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C44138sEs.StateListAnimator.copydefault(oKMessage, (InterfaceC44291sKj) obj);
                    }
                });
            }
            InterfaceC44289sKh interfaceC44289sKh = this.copydefault;
            if (interfaceC44289sKh != null) {
                interfaceC44289sKh.AEQbTJ(oKMessage);
            }
        }

        public static final Unit copydefault(OKMessage oKMessage, InterfaceC44291sKj interfaceC44291sKj) {
            Intrinsics.checkNotNullParameter(interfaceC44291sKj, "");
            interfaceC44291sKj.EZpvd(new C44468sQy(1, oKMessage));
            return Unit.INSTANCE;
        }

        @Override // o.InterfaceC44289sKh
        public void OLrzqt(final OKMessage oKMessage, final java.lang.Throwable th) {
            Intrinsics.checkNotNullParameter(oKMessage, "");
            Intrinsics.checkNotNullParameter(th, "");
            if (th instanceof ChannelErrorCode) {
                C44138sEs.this.OLrzqt().AEQbTJ((ChannelErrorCode) th);
            }
            java.lang.String clientMessageId = oKMessage.getClientMessageId();
            if (clientMessageId != null) {
                C44138sEs.this.KWHzl().OLrzqt(clientMessageId, true);
            }
            if (oKMessage.isVisible()) {
                C44138sEs.this.EZpvd().copydefault(new Function1() { // from class: o.sEv
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C44138sEs.StateListAnimator.OLrzqt(th, oKMessage, (InterfaceC44291sKj) obj);
                    }
                });
            }
            InterfaceC44289sKh interfaceC44289sKh = this.copydefault;
            if (interfaceC44289sKh != null) {
                interfaceC44289sKh.OLrzqt(oKMessage, th);
            }
        }

        public static final Unit OLrzqt(java.lang.Throwable th, OKMessage oKMessage, InterfaceC44291sKj interfaceC44291sKj) {
            Intrinsics.checkNotNullParameter(interfaceC44291sKj, "");
            if (th instanceof OKServerException) {
                oKMessage.setError(java.lang.Integer.valueOf(((OKServerException) th).getCode()));
            }
            interfaceC44291sKj.EZpvd(new C44468sQy(2, oKMessage));
            return Unit.INSTANCE;
        }
    }

    public final InterfaceC44289sKh EZpvd(InterfaceC44289sKh interfaceC44289sKh) {
        return new StateListAnimator(interfaceC44289sKh);
    }

    /* JADX INFO: renamed from: o.sEs$Activity */
    public static final class Activity implements InterfaceC44290sKi {
        public final /* synthetic */ InterfaceC44290sKi KWHzl;

        public Activity(InterfaceC44290sKi interfaceC44290sKi) {
            this.KWHzl = interfaceC44290sKi;
        }

        @Override // o.InterfaceC44289sKh
        public void copydefault(final OKMessage oKMessage) {
            Intrinsics.checkNotNullParameter(oKMessage, "");
            java.lang.String clientMessageId = oKMessage.getClientMessageId();
            if (clientMessageId != null) {
                C44138sEs.this.KWHzl().OLrzqt(clientMessageId, false);
            }
            C44138sEs.this.EZpvd().copydefault(new Function1() { // from class: o.sEz
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C44138sEs.Activity.OLrzqt(oKMessage, (InterfaceC44291sKj) obj);
                }
            });
            InterfaceC44290sKi interfaceC44290sKi = this.KWHzl;
            if (interfaceC44290sKi != null) {
                interfaceC44290sKi.copydefault(oKMessage);
            }
        }

        public static final Unit OLrzqt(OKMessage oKMessage, InterfaceC44291sKj interfaceC44291sKj) {
            Intrinsics.checkNotNullParameter(interfaceC44291sKj, "");
            interfaceC44291sKj.KWHzl(new sQB(0, oKMessage, 0, 4, null));
            return Unit.INSTANCE;
        }

        @Override // o.InterfaceC44289sKh
        public void AEQbTJ(final OKMessage oKMessage) {
            Intrinsics.checkNotNullParameter(oKMessage, "");
            C44138sEs.this.EZpvd().copydefault(new Function1() { // from class: o.sEr
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C44138sEs.Activity.KWHzl(oKMessage, (InterfaceC44291sKj) obj);
                }
            });
            InterfaceC44290sKi interfaceC44290sKi = this.KWHzl;
            if (interfaceC44290sKi != null) {
                interfaceC44290sKi.AEQbTJ(oKMessage);
            }
        }

        public static final Unit KWHzl(OKMessage oKMessage, InterfaceC44291sKj interfaceC44291sKj) {
            Intrinsics.checkNotNullParameter(interfaceC44291sKj, "");
            interfaceC44291sKj.KWHzl(new sQB(1, oKMessage, 0, 4, null));
            return Unit.INSTANCE;
        }

        @Override // o.InterfaceC44289sKh
        public void OLrzqt(final OKMessage oKMessage, final java.lang.Throwable th) {
            Intrinsics.checkNotNullParameter(oKMessage, "");
            Intrinsics.checkNotNullParameter(th, "");
            C44138sEs.this.EZpvd().copydefault(new Function1() { // from class: o.sEx
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C44138sEs.Activity.copydefault(th, oKMessage, (InterfaceC44291sKj) obj);
                }
            });
            InterfaceC44290sKi interfaceC44290sKi = this.KWHzl;
            if (interfaceC44290sKi != null) {
                interfaceC44290sKi.OLrzqt(oKMessage, th);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit copydefault(java.lang.Throwable th, OKMessage oKMessage, InterfaceC44291sKj interfaceC44291sKj) {
            Intrinsics.checkNotNullParameter(interfaceC44291sKj, "");
            if (th instanceof OKServerException) {
                oKMessage.setError(java.lang.Integer.valueOf(((OKServerException) th).getCode()));
            }
            interfaceC44291sKj.KWHzl(new sQB(3, oKMessage, 0, 4, null));
            return Unit.INSTANCE;
        }
    }

    public final InterfaceC44290sKi EZpvd(InterfaceC44290sKi interfaceC44290sKi) {
        return new Activity(interfaceC44290sKi);
    }
}
