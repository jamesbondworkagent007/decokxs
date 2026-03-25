package o;

import aws.smithy.kotlin.runtime.serde.DeserializationException;
import aws.smithy.kotlin.runtime.serde.xml.XmlStreamReader;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringNumberConversionsKt;
import o.AbstractC5109Fb;
import o.C59443zhD;
import o.FA;
import o.InterfaceC5095En;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.Fx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5131Fx implements InterfaceC5095En.StateListAnimator {
    public final FA.ActionBar AEQbTJ;
    public boolean AYXKKw;
    public final XmlStreamReader EZpvd;
    public final C5098Eq KWHzl;
    public final java.util.List<AbstractC5109Fb> copydefault;
    public final boolean gEmmrt;

    /* JADX INFO: renamed from: o.Fx$Application */
    public static final class Application<T> implements java.util.Comparator {
        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return yET.KWHzl(java.lang.Boolean.valueOf(((AbstractC5109Fb) t) instanceof AbstractC5109Fb.TaskDescription), java.lang.Boolean.valueOf(((AbstractC5109Fb) t2) instanceof AbstractC5109Fb.TaskDescription));
        }
    }

    public C5131Fx(@NotNull C5098Eq c5098Eq, @NotNull XmlStreamReader xmlStreamReader, @NotNull FA.ActionBar actionBar, @NotNull java.util.List<AbstractC5109Fb> list, boolean z) {
        Intrinsics.checkNotNullParameter(c5098Eq, "");
        Intrinsics.checkNotNullParameter(xmlStreamReader, "");
        Intrinsics.checkNotNullParameter(actionBar, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.KWHzl = c5098Eq;
        this.AEQbTJ = actionBar;
        this.copydefault = list;
        this.gEmmrt = z;
        this.EZpvd = z ? xmlStreamReader : xmlStreamReader.EZpvd(XmlStreamReader.SubtreeStartDepth.CHILD);
    }

    @Override // o.InterfaceC5095En.StateListAnimator
    public java.lang.Integer OLrzqt() {
        if (this.gEmmrt) {
            return XmlStreamReader.StateListAnimator.peek$default(this.EZpvd, 0, 1, null) instanceof FA.Dialog ? 0 : null;
        }
        if (KWHzl()) {
            this.copydefault.clear();
        }
        if (this.copydefault.isEmpty()) {
            FA faAEQbTJ = this.EZpvd.AEQbTJ();
            if (faAEQbTJ == null || (faAEQbTJ instanceof FA.Activity)) {
                return null;
            }
            if (faAEQbTJ instanceof FA.StateListAnimator) {
                return OLrzqt();
            }
            if (faAEQbTJ instanceof FA.ActionBar) {
                FA faPeek$default = XmlStreamReader.StateListAnimator.peek$default(this.EZpvd, 0, 1, null);
                if (faPeek$default == null) {
                    return null;
                }
                java.util.List<C5101Et> listOLrzqt = this.KWHzl.OLrzqt();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (java.lang.Object obj : listOLrzqt) {
                    if (C5118Fk.copydefault(this.KWHzl, (C5101Et) obj, (FA.ActionBar) faAEQbTJ)) {
                        arrayList.add(obj);
                    }
                }
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.util.Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    AbstractC5109Fb abstractC5109FbKWHzl = C5118Fk.KWHzl((C5101Et) it.next(), (FA.ActionBar) faAEQbTJ, faPeek$default);
                    if (abstractC5109FbKWHzl != null) {
                        arrayList2.add(abstractC5109FbKWHzl);
                    }
                }
                this.copydefault.addAll(CollectionsKt___CollectionsKt.EZpvd(arrayList2, new Application()));
            } else {
                return OLrzqt();
            }
        }
        AbstractC5109Fb abstractC5109Fb = (AbstractC5109Fb) CollectionsKt___CollectionsKt.firstOrNull(this.copydefault);
        return java.lang.Integer.valueOf(abstractC5109Fb != null ? abstractC5109Fb.OLrzqt() : -1);
    }

    @Override // o.InterfaceC5095En.StateListAnimator
    public void copydefault() {
        this.EZpvd.EZpvd();
    }

    @Override // o.InterfaceC5100Es
    public int djBIcL() {
        return ((java.lang.Number) copydefault(new Function1<java.lang.String, java.lang.Integer>() { // from class: aws.smithy.kotlin.runtime.serde.xml.XmlStructDeserializer$deserializeInt$1
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function1
            public final Integer invoke(@NotNull String str) {
                Intrinsics.checkNotNullParameter(str, "");
                Integer intOrNull = StringsKt__StringNumberConversionsKt.toIntOrNull(str);
                if (intOrNull != null) {
                    return Integer.valueOf(intOrNull.intValue());
                }
                throw new DeserializationException("Unable to deserialize " + str);
            }
        })).intValue();
    }

    @Override // o.InterfaceC5100Es
    public long AYXKKw() {
        return ((java.lang.Number) copydefault(new Function1<java.lang.String, java.lang.Long>() { // from class: aws.smithy.kotlin.runtime.serde.xml.XmlStructDeserializer$deserializeLong$1
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function1
            public final Long invoke(@NotNull String str) {
                Intrinsics.checkNotNullParameter(str, "");
                Long fieldNames = StringsKt__StringNumberConversionsKt.getFieldNames(str);
                if (fieldNames != null) {
                    return Long.valueOf(fieldNames.longValue());
                }
                throw new DeserializationException("Unable to deserialize " + str);
            }
        })).longValue();
    }

    @Override // o.InterfaceC5100Es
    public float valueOf() {
        return ((java.lang.Number) copydefault(new Function1<java.lang.String, java.lang.Float>() { // from class: aws.smithy.kotlin.runtime.serde.xml.XmlStructDeserializer$deserializeFloat$1
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function1
            public final Float invoke(@NotNull String str) {
                Intrinsics.checkNotNullParameter(str, "");
                Float fFIwbmz = C59443zhD.fIwbmz(str);
                if (fFIwbmz != null) {
                    return Float.valueOf(fFIwbmz.floatValue());
                }
                throw new DeserializationException("Unable to deserialize " + str);
            }
        })).floatValue();
    }

    @Override // o.InterfaceC5100Es
    public double AhwBna() {
        return ((java.lang.Number) copydefault(new Function1<java.lang.String, java.lang.Double>() { // from class: aws.smithy.kotlin.runtime.serde.xml.XmlStructDeserializer$deserializeDouble$1
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function1
            public final Double invoke(@NotNull String str) {
                Intrinsics.checkNotNullParameter(str, "");
                Double dAuCTel = C59443zhD.AuCTel(str);
                if (dAuCTel != null) {
                    return Double.valueOf(dAuCTel.doubleValue());
                }
                throw new DeserializationException("Unable to deserialize " + str);
            }
        })).doubleValue();
    }

    @Override // o.InterfaceC5100Es
    public java.lang.String fetchVPNInfo() {
        return (java.lang.String) copydefault(new Function1<java.lang.String, java.lang.String>() { // from class: aws.smithy.kotlin.runtime.serde.xml.XmlStructDeserializer$deserializeString$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function1
            public final String invoke(@NotNull String str) {
                Intrinsics.checkNotNullParameter(str, "");
                return str;
            }
        });
    }

    @Override // o.InterfaceC5100Es
    public boolean AEQbTJ() {
        return ((java.lang.Boolean) copydefault(new Function1<java.lang.String, java.lang.Boolean>() { // from class: aws.smithy.kotlin.runtime.serde.xml.XmlStructDeserializer$deserializeBoolean$1
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(@NotNull String str) {
                Intrinsics.checkNotNullParameter(str, "");
                return Boolean.valueOf(Boolean.parseBoolean(str));
            }
        })).booleanValue();
    }

    public final boolean KWHzl() {
        boolean z = this.AYXKKw;
        if (z) {
            return true;
        }
        if (z) {
            throw new NoWhenBranchMatchedException();
        }
        this.AYXKKw = true;
        return false;
    }

    public final <T> T copydefault(Function1<? super java.lang.String, ? extends T> function1) {
        java.lang.String str;
        str = "";
        if (!this.gEmmrt) {
            this.AYXKKw = false;
            if (this.copydefault.isEmpty()) {
                throw new DeserializationException("matchedFields is empty, was findNextFieldIndex() called?");
            }
            AbstractC5109Fb abstractC5109Fb = (AbstractC5109Fb) C56406yEe.getNewProxyInstance(this.copydefault);
            if (abstractC5109Fb instanceof AbstractC5109Fb.TaskDescription) {
                FA faPeek$default = XmlStreamReader.StateListAnimator.peek$default(this.EZpvd, 0, 1, null);
                if (!(faPeek$default instanceof FA.Dialog)) {
                    if (!(faPeek$default instanceof FA.StateListAnimator)) {
                        throw new DeserializationException("Unexpected token " + faPeek$default);
                    }
                } else {
                    FA faAEQbTJ = this.EZpvd.AEQbTJ();
                    if (faAEQbTJ == null) {
                        throw new DeserializationException("Expected " + C56524yIo.AEQbTJ(FA.Dialog.class) + " but instead found null");
                    }
                    if (faAEQbTJ.getClass() == FA.Dialog.class) {
                        java.lang.String strOLrzqt = ((FA.Dialog) faAEQbTJ).OLrzqt();
                        if (strOLrzqt != null) {
                            str = strOLrzqt;
                        }
                    } else {
                        throw new DeserializationException("Expected " + C56524yIo.AEQbTJ(FA.Dialog.class) + "; found " + C56524yIo.AEQbTJ(faAEQbTJ.getClass()) + " (" + faAEQbTJ + ')');
                    }
                }
                return function1.invoke(str);
            }
            if (!(abstractC5109Fb instanceof AbstractC5109Fb.ActionBar)) {
                throw new NoWhenBranchMatchedException();
            }
            AbstractC5109Fb.ActionBar actionBar = (AbstractC5109Fb.ActionBar) abstractC5109Fb;
            java.util.Set<FA.Application> setKWHzl = actionBar.KWHzl();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator<T> it = setKWHzl.iterator();
            while (it.hasNext()) {
                java.lang.String str2 = this.AEQbTJ.EZpvd().get((FA.Application) it.next());
                if (str2 != null) {
                    arrayList.add(str2);
                }
            }
            java.lang.String str3 = (java.lang.String) CollectionsKt___CollectionsKt.firstOrNull(arrayList);
            if (str3 != null) {
                return function1.invoke(str3);
            }
            throw new DeserializationException("Expected attrib value " + CollectionsKt___CollectionsKt.dNCPSb(actionBar.KWHzl()) + " not found in " + this.AEQbTJ.OLrzqt());
        }
        FA faAEQbTJ2 = this.EZpvd.AEQbTJ();
        if (faAEQbTJ2 == null) {
            throw new DeserializationException("Expected " + C56524yIo.AEQbTJ(FA.Dialog.class) + " but instead found null");
        }
        if (faAEQbTJ2.getClass() == FA.Dialog.class) {
            java.lang.String strOLrzqt2 = ((FA.Dialog) faAEQbTJ2).OLrzqt();
            return function1.invoke(strOLrzqt2 != null ? strOLrzqt2 : "");
        }
        throw new DeserializationException("Expected " + C56524yIo.AEQbTJ(FA.Dialog.class) + "; found " + C56524yIo.AEQbTJ(faAEQbTJ2.getClass()) + " (" + faAEQbTJ2 + ')');
    }

    @Override // o.InterfaceC5100Es
    public java.lang.Void gEmmrt() {
        FA faAEQbTJ = this.EZpvd.AEQbTJ();
        if (faAEQbTJ == null) {
            throw new DeserializationException("Expected " + C56524yIo.AEQbTJ(FA.StateListAnimator.class) + " but instead found null");
        }
        if (faAEQbTJ.getClass() == FA.StateListAnimator.class) {
            return null;
        }
        throw new DeserializationException("Expected " + C56524yIo.AEQbTJ(FA.StateListAnimator.class) + "; found " + C56524yIo.AEQbTJ(faAEQbTJ.getClass()) + " (" + faAEQbTJ + ')');
    }
}
