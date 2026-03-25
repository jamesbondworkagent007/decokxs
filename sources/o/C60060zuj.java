package o;

import androidx.exifinterface.media.ExifInterface;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC59982ztK;
import o.C56524yIo;
import o.C59977ztF;
import o.C59978ztG;
import o.C59989ztR;
import o.C60053zuc;
import o.C60056zuf;
import o.C60060zuj;
import o.InterfaceC56551yJo;
import o.InterfaceC59997ztZ;
import o.InterfaceC60062zul;
import org.jetbrains.annotations.NotNull;
import org.koin.core.definition.Kind;
import org.koin.core.error.ClosedScopeException;
import org.koin.core.error.NoBeanDefFoundException;
import org.koin.core.logger.Level;

/* JADX INFO: renamed from: o.zuj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C60060zuj {
    public final java.util.ArrayList<InterfaceC60062zul> AEQbTJ;
    public final boolean AYXKKw;
    public final java.util.ArrayList<C60060zuj> AhwBna;
    public boolean EZpvd;
    public final java.lang.ThreadLocal<yDQ<C60053zuc>> KWHzl;
    public java.lang.Object OLrzqt;
    public final C60022zty copydefault;
    public final InterfaceC59997ztZ djBIcL;
    public final java.lang.String gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(java.lang.Object obj) {
        this.OLrzqt = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InterfaceC59997ztZ copydefault() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C60022zty valueOf() {
        return this.copydefault;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 o.ztZ)
  (r2v0 java.lang.String)
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? false : (r3v0 boolean))
  (r4v0 o.zty)
 A[MD:(o.ztZ, java.lang.String, boolean, o.zty):void (m)] (LINE:42) call: o.zuj.<init>(o.ztZ, java.lang.String, boolean, o.zty):void type: THIS */
    public /* synthetic */ C60060zuj(InterfaceC59997ztZ interfaceC59997ztZ, java.lang.String str, boolean z, C60022zty c60022zty, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC59997ztZ, str, (i & 4) != 0 ? false : z, c60022zty);
    }

    public C60060zuj(@NotNull InterfaceC59997ztZ interfaceC59997ztZ, @NotNull java.lang.String str, boolean z, @NotNull C60022zty c60022zty) {
        Intrinsics.checkNotNullParameter(interfaceC59997ztZ, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(c60022zty, "");
        this.djBIcL = interfaceC59997ztZ;
        this.gEmmrt = str;
        this.AYXKKw = z;
        this.copydefault = c60022zty;
        this.AhwBna = new java.util.ArrayList<>();
        this.AEQbTJ = new java.util.ArrayList<>();
        this.KWHzl = new java.lang.ThreadLocal<>();
    }

    public final boolean djBIcL() {
        return !OLrzqt();
    }

    public final AbstractC59987ztP EZpvd() {
        return this.copydefault.KWHzl();
    }

    public final void AEQbTJ(@NotNull C60060zuj... c60060zujArr) {
        Intrinsics.checkNotNullParameter(c60060zujArr, "");
        if (!this.AYXKKw) {
            C56406yEe.KWHzl(this.AhwBna, c60060zujArr);
            return;
        }
        throw new java.lang.IllegalStateException("Can't add scope link to a root scope".toString());
    }

    public static /* synthetic */ InterfaceC56387yDm inject$default(final C60060zuj c60060zuj, final InterfaceC59997ztZ interfaceC59997ztZ, LazyThreadSafetyMode lazyThreadSafetyMode, final Function0 function0, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            interfaceC59997ztZ = null;
        }
        if ((i & 2) != 0) {
            lazyThreadSafetyMode = LazyThreadSafetyMode.SYNCHRONIZED;
        }
        if ((i & 4) != 0) {
            function0 = null;
        }
        Intrinsics.checkNotNullParameter(lazyThreadSafetyMode, "");
        Intrinsics.OLrzqt();
        return C56392yDr.EZpvd(lazyThreadSafetyMode, new Function0<T>() { // from class: org.koin.core.scope.Scope$inject$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function0<? extends o.zuc> */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final T invoke() {
                C60060zuj c60060zuj2 = this.this$0;
                InterfaceC59997ztZ interfaceC59997ztZ2 = interfaceC59997ztZ;
                Function0<C60053zuc> function02 = function0;
                Intrinsics.KWHzl(4, ExifInterface.GPS_DIRECTION_TRUE);
                return (T) c60060zuj2.AEQbTJ(C56524yIo.AEQbTJ(Object.class), interfaceC59997ztZ2, function02);
            }
        });
    }

    public static /* synthetic */ InterfaceC56387yDm injectOrNull$default(final C60060zuj c60060zuj, final InterfaceC59997ztZ interfaceC59997ztZ, LazyThreadSafetyMode lazyThreadSafetyMode, final Function0 function0, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            interfaceC59997ztZ = null;
        }
        if ((i & 2) != 0) {
            lazyThreadSafetyMode = LazyThreadSafetyMode.SYNCHRONIZED;
        }
        if ((i & 4) != 0) {
            function0 = null;
        }
        Intrinsics.checkNotNullParameter(lazyThreadSafetyMode, "");
        Intrinsics.OLrzqt();
        return C56392yDr.EZpvd(lazyThreadSafetyMode, new Function0<T>() { // from class: org.koin.core.scope.Scope$injectOrNull$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function0<? extends o.zuc> */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final T invoke() {
                C60060zuj c60060zuj2 = this.this$0;
                InterfaceC59997ztZ interfaceC59997ztZ2 = interfaceC59997ztZ;
                Function0<C60053zuc> function02 = function0;
                Intrinsics.KWHzl(4, ExifInterface.GPS_DIRECTION_TRUE);
                return (T) c60060zuj2.KWHzl(C56524yIo.AEQbTJ(Object.class), interfaceC59997ztZ2, function02);
            }
        });
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: o.zuj */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ java.lang.Object get$default(C60060zuj c60060zuj, InterfaceC59997ztZ interfaceC59997ztZ, Function0 function0, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            interfaceC59997ztZ = null;
        }
        if ((i & 2) != 0) {
            function0 = null;
        }
        Intrinsics.KWHzl(4, ExifInterface.GPS_DIRECTION_TRUE);
        return c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(java.lang.Object.class), interfaceC59997ztZ, function0);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: o.zuj */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ java.lang.Object getOrNull$default(C60060zuj c60060zuj, InterfaceC59997ztZ interfaceC59997ztZ, Function0 function0, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            interfaceC59997ztZ = null;
        }
        if ((i & 2) != 0) {
            function0 = null;
        }
        Intrinsics.KWHzl(4, ExifInterface.GPS_DIRECTION_TRUE);
        return c60060zuj.KWHzl(C56524yIo.AEQbTJ(java.lang.Object.class), interfaceC59997ztZ, function0);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: o.zuj */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ java.lang.Object getOrNull$default(C60060zuj c60060zuj, InterfaceC56551yJo interfaceC56551yJo, InterfaceC59997ztZ interfaceC59997ztZ, Function0 function0, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            interfaceC59997ztZ = null;
        }
        if ((i & 4) != 0) {
            function0 = null;
        }
        return c60060zuj.KWHzl(interfaceC56551yJo, interfaceC59997ztZ, function0);
    }

    public final <T> T KWHzl(@NotNull InterfaceC56551yJo<?> interfaceC56551yJo, InterfaceC59997ztZ interfaceC59997ztZ, Function0<? extends C60053zuc> function0) {
        Intrinsics.checkNotNullParameter(interfaceC56551yJo, "");
        try {
            return (T) AEQbTJ(interfaceC56551yJo, interfaceC59997ztZ, function0);
        } catch (ClosedScopeException unused) {
            this.copydefault.KWHzl().EZpvd("* Scope closed - no instance found for " + C60067zuq.KWHzl(interfaceC56551yJo) + " on scope " + this);
            return null;
        } catch (NoBeanDefFoundException unused2) {
            this.copydefault.KWHzl().EZpvd("* No instance found for type '" + C60067zuq.KWHzl(interfaceC56551yJo) + "' on scope '" + this + '\'');
            return null;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: o.zuj */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ java.lang.Object get$default(C60060zuj c60060zuj, InterfaceC56551yJo interfaceC56551yJo, InterfaceC59997ztZ interfaceC59997ztZ, Function0 function0, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            interfaceC59997ztZ = null;
        }
        if ((i & 4) != 0) {
            function0 = null;
        }
        return c60060zuj.AEQbTJ(interfaceC56551yJo, interfaceC59997ztZ, function0);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final <T> T AEQbTJ(@NotNull InterfaceC56551yJo<?> interfaceC56551yJo, InterfaceC59997ztZ interfaceC59997ztZ, Function0<? extends C60053zuc> function0) {
        java.lang.String str;
        java.lang.String str2 = "";
        Intrinsics.checkNotNullParameter(interfaceC56551yJo, "");
        AbstractC59987ztP abstractC59987ztPKWHzl = this.copydefault.KWHzl();
        Level level = Level.DEBUG;
        if (abstractC59987ztPKWHzl.copydefault(level)) {
            if (interfaceC59997ztZ != null) {
                str = " with qualifier '" + interfaceC59997ztZ + '\'';
                if (str == null) {
                    str = "";
                }
            }
            if (!this.AYXKKw) {
                str2 = "- scope:'" + this.gEmmrt;
            }
            this.copydefault.KWHzl().EZpvd(level, "|- '" + C60067zuq.KWHzl(interfaceC56551yJo) + '\'' + str + ' ' + str2 + "...");
            C60072zuv c60072zuv = C60072zuv.OLrzqt;
            long jCopydefault = c60072zuv.copydefault();
            T t = (T) copydefault(interfaceC59997ztZ, interfaceC56551yJo, function0);
            double dCopydefault = ((double) (c60072zuv.copydefault() - jCopydefault)) / 1000000.0d;
            this.copydefault.KWHzl().EZpvd(level, "|- '" + C60067zuq.KWHzl(interfaceC56551yJo) + "' in " + dCopydefault + " ms");
            return t;
        }
        return (T) copydefault(interfaceC59997ztZ, interfaceC56551yJo, function0);
    }

    public final <T> T copydefault(InterfaceC59997ztZ interfaceC59997ztZ, InterfaceC56551yJo<?> interfaceC56551yJo, Function0<? extends C60053zuc> function0) throws ClosedScopeException {
        if (this.EZpvd) {
            throw new ClosedScopeException("Scope '" + this.gEmmrt + "' is closed");
        }
        yDQ<C60053zuc> ydq = null;
        final C60053zuc c60053zucInvoke = function0 != null ? function0.invoke() : null;
        if (c60053zucInvoke != null) {
            this.copydefault.KWHzl().KWHzl(Level.DEBUG, new Function0<java.lang.String>() { // from class: org.koin.core.scope.Scope$resolveInstance$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                {
                    super(0);
                }

                /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "| >> parameters " + c60053zucInvoke + ' ';
                }
            });
            ydq = this.KWHzl.get();
            if (ydq == null) {
                ydq = new yDQ<>();
                this.KWHzl.set(ydq);
            }
            ydq.addFirst(c60053zucInvoke);
        }
        T t = (T) KWHzl(interfaceC59997ztZ, interfaceC56551yJo, new C59985ztN(this.copydefault.KWHzl(), this, c60053zucInvoke), function0);
        if (ydq != null) {
            this.copydefault.KWHzl().EZpvd("| << parameters");
            ydq.AYXKKw();
        }
        return t;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x008f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final <T> T KWHzl(InterfaceC59997ztZ interfaceC59997ztZ, InterfaceC56551yJo<?> interfaceC56551yJo, C59985ztN c59985ztN, Function0<? extends C60053zuc> function0) throws NoBeanDefFoundException {
        C60053zuc c60053zucCopydefault;
        T t = (T) this.copydefault.OLrzqt().OLrzqt(interfaceC59997ztZ, interfaceC56551yJo, this.djBIcL, c59985ztN);
        if (t == null) {
            this.copydefault.KWHzl().EZpvd("|- ? t:'" + C60067zuq.KWHzl(interfaceC56551yJo) + "' - q:'" + interfaceC59997ztZ + "' look in injected parameters");
            yDQ<C60053zuc> ydq = this.KWHzl.get();
            t = (ydq == null || (c60053zucCopydefault = ydq.copydefault()) == null) ? null : (T) c60053zucCopydefault.copydefault(interfaceC56551yJo);
            if (t == null) {
                if (!this.AYXKKw) {
                    this.copydefault.KWHzl().EZpvd("|- ? t:'" + C60067zuq.KWHzl(interfaceC56551yJo) + "' - q:'" + interfaceC59997ztZ + "' look at scope source");
                    java.lang.Object obj = this.OLrzqt;
                    if (obj == null || !interfaceC56551yJo.copydefault(obj) || interfaceC59997ztZ != null || (t = (T) this.OLrzqt) == null) {
                        t = null;
                    }
                    if (t == null) {
                        this.copydefault.KWHzl().EZpvd("|- ? t:'" + C60067zuq.KWHzl(interfaceC56551yJo) + "' - q:'" + interfaceC59997ztZ + "' look in other scopes");
                        t = (T) copydefault(interfaceC56551yJo, interfaceC59997ztZ, function0);
                        if (t == null) {
                            if (function0 != null) {
                                this.KWHzl.remove();
                                this.copydefault.KWHzl().EZpvd("|- << parameters");
                            }
                            AEQbTJ(interfaceC59997ztZ, interfaceC56551yJo);
                            throw new KotlinNothingValueException();
                        }
                    }
                }
            }
        }
        return t;
    }

    public final <T> T copydefault(InterfaceC56551yJo<?> interfaceC56551yJo, InterfaceC59997ztZ interfaceC59997ztZ, Function0<? extends C60053zuc> function0) {
        java.util.Iterator<C60060zuj> it = this.AhwBna.iterator();
        T t = null;
        while (it.hasNext() && (t = (T) it.next().KWHzl(interfaceC56551yJo, interfaceC59997ztZ, function0)) == null) {
        }
        return t;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Void AEQbTJ(InterfaceC59997ztZ interfaceC59997ztZ, InterfaceC56551yJo<?> interfaceC56551yJo) throws NoBeanDefFoundException {
        java.lang.String str;
        if (interfaceC59997ztZ != null) {
            str = " and qualifier '" + interfaceC59997ztZ + '\'';
            if (str == null) {
                str = "";
            }
        }
        throw new NoBeanDefFoundException("No definition found for type '" + C60067zuq.KWHzl(interfaceC56551yJo) + '\'' + str + ". Check your Modules configuration and add missing type and/or qualifier!");
    }

    public static /* synthetic */ void declare$default(final C60060zuj c60060zuj, final java.lang.Object obj, InterfaceC59997ztZ interfaceC59997ztZ, java.util.List list, boolean z, int i, java.lang.Object obj2) {
        if ((i & 2) != 0) {
            interfaceC59997ztZ = null;
        }
        final InterfaceC59997ztZ interfaceC59997ztZ2 = interfaceC59997ztZ;
        if ((i & 4) != 0) {
            list = yDY.AhwBna();
        }
        final java.util.List list2 = list;
        if ((i & 8) != 0) {
            z = true;
        }
        final boolean z2 = z;
        Intrinsics.checkNotNullParameter(list2, "");
        C60071zuu c60071zuu = C60071zuu.OLrzqt;
        Intrinsics.OLrzqt();
        c60071zuu.copydefault(c60060zuj, new Function0<Unit>() { // from class: org.koin.core.scope.Scope$declare$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: java.util.List<? extends o.yJo<?>> */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
            }

            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX DEBUG: Possible override for method kotlin.jvm.functions.Function0.invoke()Ljava/lang/Object; */
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                C60056zuf c60056zufOLrzqt = this.this$0.valueOf().OLrzqt();
                final Object obj3 = obj;
                InterfaceC59997ztZ interfaceC59997ztZ3 = interfaceC59997ztZ2;
                List<InterfaceC56551yJo<?>> list3 = list2;
                boolean z3 = z2;
                InterfaceC59997ztZ interfaceC59997ztZCopydefault = this.this$0.copydefault();
                String strAEQbTJ = this.this$0.AEQbTJ();
                Kind kind = Kind.Scoped;
                Intrinsics.OLrzqt();
                Function2<C60060zuj, C60053zuc, T> function2 = new Function2<C60060zuj, C60053zuc, T>() { // from class: org.koin.core.scope.Scope$declare$1$invoke$$inlined$declareScopedInstance$1
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                    @Override // kotlin.jvm.functions.Function2
                    public final T invoke(@NotNull C60060zuj c60060zuj2, @NotNull C60053zuc c60053zuc) {
                        Intrinsics.checkNotNullParameter(c60060zuj2, "");
                        Intrinsics.checkNotNullParameter(c60053zuc, "");
                        return (T) obj3;
                    }
                };
                Intrinsics.KWHzl(4, ExifInterface.GPS_DIRECTION_TRUE);
                C59978ztG c59978ztG = new C59978ztG(interfaceC59997ztZCopydefault, C56524yIo.AEQbTJ(Object.class), interfaceC59997ztZ3, function2, kind, list3);
                String strEZpvd = C59977ztF.EZpvd(c59978ztG.EZpvd(), c59978ztG.OLrzqt(), c59978ztG.copydefault());
                AbstractC59982ztK<?> abstractC59982ztK = c60056zufOLrzqt.EZpvd().get(strEZpvd);
                C59989ztR c59989ztR = abstractC59982ztK instanceof C59989ztR ? (C59989ztR) abstractC59982ztK : null;
                if (c59989ztR != null) {
                    Intrinsics.copydefault(obj3, "");
                    c59989ztR.KWHzl(strAEQbTJ, obj3);
                    return;
                }
                C59989ztR c59989ztR2 = new C59989ztR(c59978ztG);
                C60056zuf.saveMapping$default(c60056zufOLrzqt, z3, strEZpvd, c59989ztR2, false, 8, null);
                Iterator<T> it = c59978ztG.valueOf().iterator();
                while (it.hasNext()) {
                    C60056zuf.saveMapping$default(c60056zufOLrzqt, z3, C59977ztF.EZpvd((InterfaceC56551yJo) it.next(), c59978ztG.OLrzqt(), c59978ztG.copydefault()), c59989ztR2, false, 8, null);
                }
            }
        });
    }

    public final void EZpvd(@NotNull InterfaceC60062zul interfaceC60062zul) {
        Intrinsics.checkNotNullParameter(interfaceC60062zul, "");
        this.AEQbTJ.add(interfaceC60062zul);
    }

    public final <T> java.util.List<T> AEQbTJ(@NotNull InterfaceC56551yJo<?> interfaceC56551yJo) {
        Intrinsics.checkNotNullParameter(interfaceC56551yJo, "");
        java.util.List<T> listKWHzl = this.copydefault.OLrzqt().KWHzl(interfaceC56551yJo, new C59985ztN(this.copydefault.KWHzl(), this, null, 4, null));
        java.util.ArrayList<C60060zuj> arrayList = this.AhwBna;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator<T> it = arrayList.iterator();
        while (it.hasNext()) {
            C56406yEe.KWHzl(arrayList2, ((C60060zuj) it.next()).AEQbTJ(interfaceC56551yJo));
        }
        return CollectionsKt___CollectionsKt.djBIcL((java.util.Collection) listKWHzl, (java.lang.Iterable) arrayList2);
    }

    public final void KWHzl() {
        C60071zuu.OLrzqt.copydefault(this, new Function0<Unit>() { // from class: org.koin.core.scope.Scope$close$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX DEBUG: Possible override for method kotlin.jvm.functions.Function0.invoke()Ljava/lang/Object; */
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.this$0.valueOf().KWHzl().EZpvd("|- (-) Scope - id:'" + this.this$0.AEQbTJ() + '\'');
                ArrayList arrayList = this.this$0.AEQbTJ;
                C60060zuj c60060zuj = this.this$0;
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((InterfaceC60062zul) it.next()).copydefault(c60060zuj);
                }
                this.this$0.AEQbTJ.clear();
                this.this$0.KWHzl(null);
                this.this$0.EZpvd = true;
                this.this$0.valueOf().EZpvd().AEQbTJ(this.this$0);
            }
        });
    }

    public java.lang.String toString() {
        return "['" + this.gEmmrt + "']";
    }
}
