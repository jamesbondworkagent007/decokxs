package o;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind;
import o.AbstractC59164zbq;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.zaF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public abstract class AbstractC59074zaF<A> implements InterfaceC59079zaK<A> {
    public final C59072zaD copydefault;

    /* JADX INFO: renamed from: o.zaF$TaskDescription */
    public final /* synthetic */ class TaskDescription {
        public static final /* synthetic */ int[] OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[AnnotatedCallableKind.values().length];
            try {
                iArr[AnnotatedCallableKind.PROPERTY.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[AnnotatedCallableKind.PROPERTY_GETTER.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[AnnotatedCallableKind.PROPERTY_SETTER.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            OLrzqt = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C59072zaD EZpvd() {
        return this.copydefault;
    }

    public AbstractC59074zaF(@NotNull C59072zaD c59072zaD) {
        Intrinsics.checkNotNullParameter(c59072zaD, "");
        this.copydefault = c59072zaD;
    }

    @Override // o.InterfaceC59079zaK
    public java.util.List<A> EZpvd(@NotNull AbstractC59164zbq.StateListAnimator stateListAnimator) {
        Intrinsics.checkNotNullParameter(stateListAnimator, "");
        java.util.List listAhwBna = (java.util.List) stateListAnimator.djBIcL().getExtension(this.copydefault.AEQbTJ());
        if (listAhwBna == null) {
            listAhwBna = yDY.AhwBna();
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listAhwBna, 10));
        java.util.Iterator it = listAhwBna.iterator();
        while (it.hasNext()) {
            arrayList.add(KWHzl((ProtoBuf.Annotation) it.next(), stateListAnimator.OLrzqt()));
        }
        return arrayList;
    }

    @Override // o.InterfaceC59079zaK
    public java.util.List<A> AEQbTJ(@NotNull AbstractC59164zbq abstractC59164zbq, @NotNull yXQ yxq, @NotNull AnnotatedCallableKind annotatedCallableKind) {
        java.util.List listAhwBna;
        Intrinsics.checkNotNullParameter(abstractC59164zbq, "");
        Intrinsics.checkNotNullParameter(yxq, "");
        Intrinsics.checkNotNullParameter(annotatedCallableKind, "");
        if (yxq instanceof ProtoBuf.Constructor) {
            listAhwBna = (java.util.List) ((ProtoBuf.Constructor) yxq).getExtension(this.copydefault.KWHzl());
        } else if (yxq instanceof ProtoBuf.Function) {
            listAhwBna = (java.util.List) ((ProtoBuf.Function) yxq).getExtension(this.copydefault.valueOf());
        } else {
            if (!(yxq instanceof ProtoBuf.Property)) {
                throw new java.lang.IllegalStateException(("Unknown message: " + yxq).toString());
            }
            int i = TaskDescription.OLrzqt[annotatedCallableKind.ordinal()];
            if (i == 1) {
                listAhwBna = (java.util.List) ((ProtoBuf.Property) yxq).getExtension(this.copydefault.AhwBna());
            } else if (i == 2) {
                listAhwBna = (java.util.List) ((ProtoBuf.Property) yxq).getExtension(this.copydefault.fetchVPNInfo());
            } else if (i == 3) {
                listAhwBna = (java.util.List) ((ProtoBuf.Property) yxq).getExtension(this.copydefault.AkhnZx());
            } else {
                throw new java.lang.IllegalStateException("Unsupported callable kind with property proto".toString());
            }
        }
        if (listAhwBna == null) {
            listAhwBna = yDY.AhwBna();
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listAhwBna, 10));
        java.util.Iterator it = listAhwBna.iterator();
        while (it.hasNext()) {
            arrayList.add(KWHzl((ProtoBuf.Annotation) it.next(), abstractC59164zbq.OLrzqt()));
        }
        return arrayList;
    }

    @Override // o.InterfaceC59079zaK
    public java.util.List<A> AEQbTJ(@NotNull AbstractC59164zbq abstractC59164zbq, @NotNull ProtoBuf.Property property) {
        Intrinsics.checkNotNullParameter(abstractC59164zbq, "");
        Intrinsics.checkNotNullParameter(property, "");
        GeneratedMessageLite.Activity<ProtoBuf.Property, java.util.List<ProtoBuf.Annotation>> activityGEmmrt = this.copydefault.gEmmrt();
        java.util.List listAhwBna = activityGEmmrt != null ? (java.util.List) property.getExtension(activityGEmmrt) : null;
        if (listAhwBna == null) {
            listAhwBna = yDY.AhwBna();
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listAhwBna, 10));
        java.util.Iterator it = listAhwBna.iterator();
        while (it.hasNext()) {
            arrayList.add(KWHzl((ProtoBuf.Annotation) it.next(), abstractC59164zbq.OLrzqt()));
        }
        return arrayList;
    }

    @Override // o.InterfaceC59079zaK
    public java.util.List<A> EZpvd(@NotNull AbstractC59164zbq abstractC59164zbq, @NotNull ProtoBuf.Property property) {
        Intrinsics.checkNotNullParameter(abstractC59164zbq, "");
        Intrinsics.checkNotNullParameter(property, "");
        GeneratedMessageLite.Activity<ProtoBuf.Property, java.util.List<ProtoBuf.Annotation>> activityDbNXlk = this.copydefault.DbNXlk();
        java.util.List listAhwBna = activityDbNXlk != null ? (java.util.List) property.getExtension(activityDbNXlk) : null;
        if (listAhwBna == null) {
            listAhwBna = yDY.AhwBna();
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listAhwBna, 10));
        java.util.Iterator it = listAhwBna.iterator();
        while (it.hasNext()) {
            arrayList.add(KWHzl((ProtoBuf.Annotation) it.next(), abstractC59164zbq.OLrzqt()));
        }
        return arrayList;
    }

    @Override // o.InterfaceC59079zaK
    public java.util.List<A> KWHzl(@NotNull AbstractC59164zbq abstractC59164zbq, @NotNull ProtoBuf.EnumEntry enumEntry) {
        Intrinsics.checkNotNullParameter(abstractC59164zbq, "");
        Intrinsics.checkNotNullParameter(enumEntry, "");
        java.util.List listAhwBna = (java.util.List) enumEntry.getExtension(this.copydefault.OLrzqt());
        if (listAhwBna == null) {
            listAhwBna = yDY.AhwBna();
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listAhwBna, 10));
        java.util.Iterator it = listAhwBna.iterator();
        while (it.hasNext()) {
            arrayList.add(KWHzl((ProtoBuf.Annotation) it.next(), abstractC59164zbq.OLrzqt()));
        }
        return arrayList;
    }

    @Override // o.InterfaceC59079zaK
    public java.util.List<A> AEQbTJ(@NotNull AbstractC59164zbq abstractC59164zbq, @NotNull yXQ yxq, @NotNull AnnotatedCallableKind annotatedCallableKind, int i, @NotNull ProtoBuf.ValueParameter valueParameter) {
        Intrinsics.checkNotNullParameter(abstractC59164zbq, "");
        Intrinsics.checkNotNullParameter(yxq, "");
        Intrinsics.checkNotNullParameter(annotatedCallableKind, "");
        Intrinsics.checkNotNullParameter(valueParameter, "");
        java.util.List listAhwBna = (java.util.List) valueParameter.getExtension(this.copydefault.djBIcL());
        if (listAhwBna == null) {
            listAhwBna = yDY.AhwBna();
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listAhwBna, 10));
        java.util.Iterator it = listAhwBna.iterator();
        while (it.hasNext()) {
            arrayList.add(KWHzl((ProtoBuf.Annotation) it.next(), abstractC59164zbq.OLrzqt()));
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0062  */
    @Override // o.InterfaceC59079zaK
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.util.List<A> OLrzqt(@NotNull AbstractC59164zbq abstractC59164zbq, @NotNull yXQ yxq, @NotNull AnnotatedCallableKind annotatedCallableKind) {
        java.util.List listAhwBna;
        Intrinsics.checkNotNullParameter(abstractC59164zbq, "");
        Intrinsics.checkNotNullParameter(yxq, "");
        Intrinsics.checkNotNullParameter(annotatedCallableKind, "");
        if (yxq instanceof ProtoBuf.Function) {
            GeneratedMessageLite.Activity<ProtoBuf.Function, java.util.List<ProtoBuf.Annotation>> activityAYXKKw = this.copydefault.AYXKKw();
            listAhwBna = activityAYXKKw != null ? (java.util.List) ((ProtoBuf.Function) yxq).getExtension(activityAYXKKw) : null;
        } else {
            if (!(yxq instanceof ProtoBuf.Property)) {
                throw new java.lang.IllegalStateException(("Unknown message: " + yxq).toString());
            }
            int i = TaskDescription.OLrzqt[annotatedCallableKind.ordinal()];
            if (i == 1 || i == 2 || i == 3) {
                GeneratedMessageLite.Activity<ProtoBuf.Property, java.util.List<ProtoBuf.Annotation>> activityValues = this.copydefault.values();
                if (activityValues != null) {
                    listAhwBna = (java.util.List) ((ProtoBuf.Property) yxq).getExtension(activityValues);
                }
            } else {
                throw new java.lang.IllegalStateException(("Unsupported callable kind with property proto for receiver annotations: " + annotatedCallableKind).toString());
            }
        }
        if (listAhwBna == null) {
            listAhwBna = yDY.AhwBna();
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listAhwBna, 10));
        java.util.Iterator it = listAhwBna.iterator();
        while (it.hasNext()) {
            arrayList.add(KWHzl((ProtoBuf.Annotation) it.next(), abstractC59164zbq.OLrzqt()));
        }
        return arrayList;
    }

    @Override // o.InterfaceC59079zaK
    public java.util.List<A> EZpvd(@NotNull ProtoBuf.Type type, @NotNull yWS yws) {
        Intrinsics.checkNotNullParameter(type, "");
        Intrinsics.checkNotNullParameter(yws, "");
        java.util.List listAhwBna = (java.util.List) type.getExtension(this.copydefault.isConnected());
        if (listAhwBna == null) {
            listAhwBna = yDY.AhwBna();
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listAhwBna, 10));
        java.util.Iterator it = listAhwBna.iterator();
        while (it.hasNext()) {
            arrayList.add(KWHzl((ProtoBuf.Annotation) it.next(), yws));
        }
        return arrayList;
    }

    @Override // o.InterfaceC59079zaK
    public java.util.List<A> EZpvd(@NotNull ProtoBuf.TypeParameter typeParameter, @NotNull yWS yws) {
        Intrinsics.checkNotNullParameter(typeParameter, "");
        Intrinsics.checkNotNullParameter(yws, "");
        java.util.List listAhwBna = (java.util.List) typeParameter.getExtension(this.copydefault.AuCTel());
        if (listAhwBna == null) {
            listAhwBna = yDY.AhwBna();
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listAhwBna, 10));
        java.util.Iterator it = listAhwBna.iterator();
        while (it.hasNext()) {
            arrayList.add(KWHzl((ProtoBuf.Annotation) it.next(), yws));
        }
        return arrayList;
    }
}
