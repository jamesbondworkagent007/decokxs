package o;

import com.fasterxml.jackson.core.JsonPointer;
import kotlin.LazyThreadSafetyMode;
import kotlin.Triple;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.jvm.internal.KDeclarationContainerImpl;
import kotlin.reflect.jvm.internal.KPackageImpl$getLocalProperty$1$1$1;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import o.InterfaceC59098zad;
import o.yLN;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yLh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C56598yLh extends KDeclarationContainerImpl {
    public final InterfaceC56387yDm<ActionBar> EZpvd;
    public final java.lang.Class<?> OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC56513yId
    public java.lang.Class<?> OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX INFO: renamed from: o.yLh$ActionBar */
    public final class ActionBar extends KDeclarationContainerImpl.TaskDescription {
        public static final /* synthetic */ yJA<java.lang.Object>[] EZpvd = {C56524yIo.copydefault(new PropertyReference1Impl(ActionBar.class, "kotlinClass", "getKotlinClass()Lorg/jetbrains/kotlin/descriptors/runtime/components/ReflectKotlinClass;", 0)), C56524yIo.copydefault(new PropertyReference1Impl(ActionBar.class, "scope", "getScope()Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;", 0)), C56524yIo.copydefault(new PropertyReference1Impl(ActionBar.class, "members", "getMembers()Ljava/util/Collection;", 0))};
        public final yLN.ActionBar AEQbTJ;
        public final InterfaceC56387yDm KWHzl;
        public final InterfaceC56387yDm OLrzqt;
        public final yLN.ActionBar copydefault;
        public final yLN.ActionBar valueOf;

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public ActionBar() {
            super();
            this.copydefault = yLN.copydefault(new C56599yLi(C56598yLh.this));
            this.valueOf = yLN.copydefault(new C56601yLk(this));
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
            this.KWHzl = C56392yDr.EZpvd(lazyThreadSafetyMode, new C56602yLl(this, C56598yLh.this));
            this.OLrzqt = C56392yDr.EZpvd(lazyThreadSafetyMode, new C56600yLj(this));
            this.AEQbTJ = yLN.copydefault(new C56603yLm(C56598yLh.this, this));
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        public final C56726yQa copydefault() {
            return (C56726yQa) this.copydefault.KWHzl(this, EZpvd[0]);
        }

        public static final C56726yQa EZpvd(C56598yLh c56598yLh) {
            return C56726yQa.KWHzl.OLrzqt(c56598yLh.OLrzqt());
        }

        public final InterfaceC59098zad OLrzqt() {
            T tKWHzl = this.valueOf.KWHzl(this, EZpvd[1]);
            Intrinsics.checkNotNullExpressionValue(tKWHzl, "");
            return (InterfaceC59098zad) tKWHzl;
        }

        public static final InterfaceC59098zad EZpvd(ActionBar actionBar) {
            C56726yQa c56726yQaCopydefault = actionBar.copydefault();
            if (c56726yQaCopydefault != null) {
                return actionBar.fARcdN().copydefault().EZpvd(c56726yQaCopydefault);
            }
            return InterfaceC59098zad.ActionBar.copydefault;
        }

        public final java.lang.Class<?> KWHzl() {
            return (java.lang.Class) this.KWHzl.getValue();
        }

        public static final java.lang.Class OLrzqt(ActionBar actionBar, C56598yLh c56598yLh) {
            KotlinClassHeader kotlinClassHeaderEZpvd;
            C56726yQa c56726yQaCopydefault = actionBar.copydefault();
            java.lang.String strAEQbTJ = (c56726yQaCopydefault == null || (kotlinClassHeaderEZpvd = c56726yQaCopydefault.EZpvd()) == null) ? null : kotlinClassHeaderEZpvd.AEQbTJ();
            if (strAEQbTJ == null || strAEQbTJ.length() <= 0) {
                return null;
            }
            return c56598yLh.OLrzqt().getClassLoader().loadClass(C59449zhJ.replace$default(strAEQbTJ, JsonPointer.SEPARATOR, '.', false, 4, (java.lang.Object) null));
        }

        public final Triple<C56926yXl, ProtoBuf.Package, C56921yXg> EZpvd() {
            return (Triple) this.OLrzqt.getValue();
        }

        public static final Triple AEQbTJ(ActionBar actionBar) {
            KotlinClassHeader kotlinClassHeaderEZpvd;
            C56726yQa c56726yQaCopydefault = actionBar.copydefault();
            if (c56726yQaCopydefault != null && (kotlinClassHeaderEZpvd = c56726yQaCopydefault.EZpvd()) != null) {
                java.lang.String[] strArrCopydefault = kotlinClassHeaderEZpvd.copydefault();
                java.lang.String[] strArrAhwBna = kotlinClassHeaderEZpvd.AhwBna();
                if (strArrCopydefault != null && strArrAhwBna != null) {
                    kotlin.Pair<C56926yXl, ProtoBuf.Package> pairCopydefault = C56928yXn.copydefault(strArrCopydefault, strArrAhwBna);
                    return new Triple(pairCopydefault.component1(), pairCopydefault.component2(), kotlinClassHeaderEZpvd.EZpvd());
                }
            }
            return null;
        }

        public static final java.util.Collection KWHzl(C56598yLh c56598yLh, ActionBar actionBar) {
            return c56598yLh.KWHzl(actionBar.OLrzqt(), KDeclarationContainerImpl.MemberBelonginess.DECLARED);
        }
    }

    public C56598yLh(@NotNull java.lang.Class<?> cls) {
        Intrinsics.checkNotNullParameter(cls, "");
        this.OLrzqt = cls;
        this.EZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.PUBLICATION, new C56594yLd(this));
    }

    public static final ActionBar EZpvd(C56598yLh c56598yLh) {
        return c56598yLh.new ActionBar();
    }

    @Override // kotlin.reflect.jvm.internal.KDeclarationContainerImpl
    public java.lang.Class<?> fARcdN() {
        java.lang.Class<?> clsKWHzl = this.EZpvd.getValue().KWHzl();
        return clsKWHzl == null ? OLrzqt() : clsKWHzl;
    }

    public final InterfaceC59098zad AEQbTJ() {
        return this.EZpvd.getValue().OLrzqt();
    }

    @Override // kotlin.reflect.jvm.internal.KDeclarationContainerImpl
    public java.util.Collection<InterfaceC56660yNp> EZpvd() {
        return yDY.AhwBna();
    }

    /* JADX DEBUG: Type inference failed for r3v1. Raw type applied. Possible types: java.util.Collection<? extends o.yOe>, java.util.Collection<o.yOe> */
    @Override // kotlin.reflect.jvm.internal.KDeclarationContainerImpl
    public java.util.Collection<InterfaceC56676yOe> AEQbTJ(@NotNull C56935yXu c56935yXu) {
        Intrinsics.checkNotNullParameter(c56935yXu, "");
        return AEQbTJ().copydefault(c56935yXu, NoLookupLocation.FROM_REFLECTION);
    }

    /* JADX DEBUG: Type inference failed for r3v1. Raw type applied. Possible types: java.util.Collection<? extends o.yOp>, java.util.Collection<o.yNG> */
    @Override // kotlin.reflect.jvm.internal.KDeclarationContainerImpl
    public java.util.Collection<yNG> KWHzl(@NotNull C56935yXu c56935yXu) {
        Intrinsics.checkNotNullParameter(c56935yXu, "");
        return AEQbTJ().AEQbTJ(c56935yXu, NoLookupLocation.FROM_REFLECTION);
    }

    @Override // kotlin.reflect.jvm.internal.KDeclarationContainerImpl
    public InterfaceC56676yOe copydefault(int i) {
        Triple<C56926yXl, ProtoBuf.Package, C56921yXg> tripleEZpvd = this.EZpvd.getValue().EZpvd();
        if (tripleEZpvd != null) {
            C56926yXl c56926yXlComponent1 = tripleEZpvd.component1();
            ProtoBuf.Package packageComponent2 = tripleEZpvd.component2();
            C56921yXg c56921yXgComponent3 = tripleEZpvd.component3();
            GeneratedMessageLite.Activity<ProtoBuf.Package, java.util.List<ProtoBuf.Property>> activity = JvmProtoBuf.valueOf;
            Intrinsics.checkNotNullExpressionValue(activity, "");
            ProtoBuf.Property property = (ProtoBuf.Property) yWY.OLrzqt(packageComponent2, activity, i);
            if (property != null) {
                java.lang.Class<?> clsOLrzqt = OLrzqt();
                ProtoBuf.TypeTable typeTable = packageComponent2.getTypeTable();
                Intrinsics.checkNotNullExpressionValue(typeTable, "");
                return (InterfaceC56676yOe) yLX.EZpvd(clsOLrzqt, property, c56926yXlComponent1, new yWW(typeTable), c56921yXgComponent3, KPackageImpl$getLocalProperty$1$1$1.INSTANCE);
            }
        }
        return null;
    }

    public boolean equals(java.lang.Object obj) {
        return (obj instanceof C56598yLh) && Intrinsics.EZpvd(OLrzqt(), ((C56598yLh) obj).OLrzqt());
    }

    public int hashCode() {
        return OLrzqt().hashCode();
    }

    public java.lang.String toString() {
        return "file class " + C56743yQr.AEQbTJ(OLrzqt()).AEQbTJ();
    }
}
