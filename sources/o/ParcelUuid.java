package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.ParcelUuid;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class ParcelUuid {
    public static final StateListAnimator copydefault = new StateListAnimator(null);
    public final Messenger AEQbTJ;
    public final java.util.List<ProxyFileDescriptorCallback> AYXKKw;
    public final MemoryFile AhwBna;
    public final Message EZpvd;
    public final java.util.List<NetworkConfig> KWHzl;
    public final MessageQueue OLrzqt;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.ParcelUuid$Activity) A[MD:(o.ParcelUuid$Activity):void (m)] call: o.ParcelUuid.<init>(o.ParcelUuid$Activity):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ ParcelUuid(Activity activity, DefaultConstructorMarker defaultConstructorMarker) {
        this(activity);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MessageQueue AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<ProxyFileDescriptorCallback> AYXKKw() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MemoryFile EZpvd() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<NetworkConfig> KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Message OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Messenger copydefault() {
        return this.AEQbTJ;
    }

    public ParcelUuid(Activity activity) {
        this.EZpvd = activity.EZpvd();
        this.KWHzl = activity.AEQbTJ();
        this.AEQbTJ = activity.copydefault();
        this.OLrzqt = activity.valueOf();
        this.AhwBna = activity.AhwBna();
        java.util.List<ProxyFileDescriptorCallback> listGEmmrt = activity.gEmmrt();
        if (listGEmmrt == null) {
            throw new java.lang.IllegalArgumentException("A non-null value must be provided for entityTypes".toString());
        }
        this.AYXKKw = listGEmmrt;
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.ParcelUuid.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("EntityRecognizerInputDataConfig(");
        sb.append("annotations=" + this.EZpvd + AbstractJsonLexerKt.COMMA);
        sb.append("augmentedManifests=" + this.KWHzl + AbstractJsonLexerKt.COMMA);
        sb.append("dataFormat=" + this.AEQbTJ + AbstractJsonLexerKt.COMMA);
        sb.append("documents=" + this.OLrzqt + AbstractJsonLexerKt.COMMA);
        sb.append("entityList=" + this.AhwBna + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("entityTypes=");
        sb2.append(this.AYXKKw);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        Message message = this.EZpvd;
        int iHashCode = message != null ? message.hashCode() : 0;
        java.util.List<NetworkConfig> list = this.KWHzl;
        int iHashCode2 = list != null ? list.hashCode() : 0;
        Messenger messenger = this.AEQbTJ;
        int iHashCode3 = messenger != null ? messenger.hashCode() : 0;
        MessageQueue messageQueue = this.OLrzqt;
        int iHashCode4 = messageQueue != null ? messageQueue.hashCode() : 0;
        MemoryFile memoryFile = this.AhwBna;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (memoryFile != null ? memoryFile.hashCode() : 0)) * 31) + this.AYXKKw.hashCode();
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ParcelUuid.class != obj.getClass()) {
            return false;
        }
        ParcelUuid parcelUuid = (ParcelUuid) obj;
        return Intrinsics.EZpvd(this.EZpvd, parcelUuid.EZpvd) && Intrinsics.EZpvd(this.KWHzl, parcelUuid.KWHzl) && Intrinsics.EZpvd(this.AEQbTJ, parcelUuid.AEQbTJ) && Intrinsics.EZpvd(this.OLrzqt, parcelUuid.OLrzqt) && Intrinsics.EZpvd(this.AhwBna, parcelUuid.AhwBna) && Intrinsics.EZpvd(this.AYXKKw, parcelUuid.AYXKKw);
    }

    public static /* synthetic */ ParcelUuid copy$default(ParcelUuid parcelUuid, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<Activity, Unit>() { // from class: aws.sdk.kotlin.services.comprehend.model.EntityRecognizerInputDataConfig$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull ParcelUuid.Activity activity) {
                    Intrinsics.checkNotNullParameter(activity, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(ParcelUuid.Activity activity) {
                    invoke2(activity);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        Activity activity = new Activity(parcelUuid);
        function1.invoke(activity);
        return activity.KWHzl();
    }

    public static final class Activity {
        public MemoryFile AEQbTJ;
        public java.util.List<NetworkConfig> EZpvd;
        public Message KWHzl;
        public Messenger OLrzqt;
        public MessageQueue copydefault;
        public java.util.List<ProxyFileDescriptorCallback> valueOf;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<NetworkConfig> AEQbTJ() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(java.util.List<ProxyFileDescriptorCallback> list) {
            this.valueOf = list;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(MemoryFile memoryFile) {
            this.AEQbTJ = memoryFile;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(MessageQueue messageQueue) {
            this.copydefault = messageQueue;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final MemoryFile AhwBna() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Message EZpvd() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(Messenger messenger) {
            this.OLrzqt = messenger;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Messenger copydefault() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(java.util.List<NetworkConfig> list) {
            this.EZpvd = list;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(Message message) {
            this.KWHzl = message;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<ProxyFileDescriptorCallback> gEmmrt() {
            return this.valueOf;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final MessageQueue valueOf() {
            return this.copydefault;
        }

        public Activity() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Activity(@NotNull ParcelUuid parcelUuid) {
            this();
            Intrinsics.checkNotNullParameter(parcelUuid, "");
            this.KWHzl = parcelUuid.OLrzqt();
            this.EZpvd = parcelUuid.KWHzl();
            this.OLrzqt = parcelUuid.copydefault();
            this.copydefault = parcelUuid.AEQbTJ();
            this.AEQbTJ = parcelUuid.EZpvd();
            this.valueOf = parcelUuid.AYXKKw();
        }

        public final ParcelUuid KWHzl() {
            return new ParcelUuid(this, null);
        }

        public final Activity OLrzqt() {
            if (this.valueOf == null) {
                this.valueOf = yDY.AhwBna();
            }
            return this;
        }
    }
}
