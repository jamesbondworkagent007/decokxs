package o;

import androidx.exifinterface.media.ExifInterface;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.text.StringsKt__StringsKt;
import o.InterfaceC56893yWf;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class yVI extends yVG<yOJ, AbstractC56975yZg<?>> {
    public final yNP AhwBna;
    public C56921yXg OLrzqt;
    public final C59080zaL copydefault;
    public final yNO gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void AEQbTJ(@NotNull C56921yXg c56921yXg) {
        Intrinsics.checkNotNullParameter(c56921yXg, "");
        this.OLrzqt = c56921yXg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationLoader
    public C56921yXg EZpvd() {
        return this.OLrzqt;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yVI(@NotNull yNP ynp, @NotNull yNO yno, @NotNull InterfaceC59187zcM interfaceC59187zcM, @NotNull InterfaceC56888yWa interfaceC56888yWa) {
        super(interfaceC59187zcM, interfaceC56888yWa);
        Intrinsics.checkNotNullParameter(ynp, "");
        Intrinsics.checkNotNullParameter(yno, "");
        Intrinsics.checkNotNullParameter(interfaceC59187zcM, "");
        Intrinsics.checkNotNullParameter(interfaceC56888yWa, "");
        this.AhwBna = ynp;
        this.gEmmrt = yno;
        this.copydefault = new C59080zaL(ynp, yno);
        this.OLrzqt = C56921yXg.KWHzl;
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Annotation;Lo/yWS;)Ljava/lang/Object; */
    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationLoader, o.InterfaceC59079zaK
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public yOJ KWHzl(@NotNull ProtoBuf.Annotation annotation, @NotNull yWS yws) {
        Intrinsics.checkNotNullParameter(annotation, "");
        Intrinsics.checkNotNullParameter(yws, "");
        return this.copydefault.copydefault(annotation, yws);
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [45=4] */
    /* JADX DEBUG: Method merged with bridge method: EZpvd(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // o.yVG
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public AbstractC56975yZg<?> EZpvd(@NotNull java.lang.String str, @NotNull java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(obj, "");
        if (StringsKt__StringsKt.contains$default((java.lang.CharSequence) "ZBCS", (java.lang.CharSequence) str, false, 2, (java.lang.Object) null)) {
            int iIntValue = ((java.lang.Integer) obj).intValue();
            int iHashCode = str.hashCode();
            if (iHashCode == 66) {
                if (str.equals("B")) {
                    obj = java.lang.Byte.valueOf((byte) iIntValue);
                }
                throw new java.lang.AssertionError(str);
            }
            if (iHashCode == 67) {
                if (str.equals("C")) {
                    obj = java.lang.Character.valueOf((char) iIntValue);
                }
                throw new java.lang.AssertionError(str);
            }
            if (iHashCode == 83) {
                if (str.equals(ExifInterface.LATITUDE_SOUTH)) {
                    obj = java.lang.Short.valueOf((short) iIntValue);
                }
                throw new java.lang.AssertionError(str);
            }
            if (iHashCode == 90 && str.equals("Z")) {
                obj = java.lang.Boolean.valueOf(iIntValue != 0);
            }
            throw new java.lang.AssertionError(str);
        }
        return C56978yZj.OLrzqt.copydefault(obj, this.AhwBna);
    }

    /* JADX DEBUG: Method merged with bridge method: EZpvd(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // o.yVG
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public AbstractC56975yZg<?> EZpvd(@NotNull AbstractC56975yZg<?> abstractC56975yZg) {
        AbstractC56975yZg<?> yzb;
        Intrinsics.checkNotNullParameter(abstractC56975yZg, "");
        if (abstractC56975yZg instanceof C56972yZd) {
            yzb = new C56994yZz(((C56972yZd) abstractC56975yZg).KWHzl().byteValue());
        } else if (abstractC56975yZg instanceof C56991yZw) {
            yzb = new yZC(((C56991yZw) abstractC56975yZg).KWHzl().shortValue());
        } else if (abstractC56975yZg instanceof C56983yZo) {
            yzb = new yZD(((C56983yZo) abstractC56975yZg).KWHzl().intValue());
        } else {
            if (!(abstractC56975yZg instanceof C56987yZs)) {
                return abstractC56975yZg;
            }
            yzb = new yZB(((C56987yZs) abstractC56975yZg).KWHzl().longValue());
        }
        return yzb;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationLoader
    public InterfaceC56893yWf.Application copydefault(@NotNull C56929yXo c56929yXo, @NotNull InterfaceC56686yOo interfaceC56686yOo, @NotNull java.util.List<yOJ> list) {
        Intrinsics.checkNotNullParameter(c56929yXo, "");
        Intrinsics.checkNotNullParameter(interfaceC56686yOo, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new TaskDescription(KWHzl(c56929yXo), c56929yXo, list, interfaceC56686yOo);
    }

    public static final class TaskDescription extends Activity {
        public final /* synthetic */ C56929yXo AEQbTJ;
        public final /* synthetic */ java.util.List<yOJ> EZpvd;
        public final /* synthetic */ InterfaceC56658yNn OLrzqt;
        public final /* synthetic */ InterfaceC56686yOo copydefault;
        public final java.util.HashMap<C56935yXu, AbstractC56975yZg<?>> djBIcL;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TaskDescription(InterfaceC56658yNn interfaceC56658yNn, C56929yXo c56929yXo, java.util.List<yOJ> list, InterfaceC56686yOo interfaceC56686yOo) {
            super();
            this.OLrzqt = interfaceC56658yNn;
            this.AEQbTJ = c56929yXo;
            this.EZpvd = list;
            this.copydefault = interfaceC56686yOo;
            this.djBIcL = new java.util.HashMap<>();
        }

        @Override // o.yVI.Activity
        public void EZpvd(C56935yXu c56935yXu, AbstractC56975yZg<?> abstractC56975yZg) {
            Intrinsics.checkNotNullParameter(abstractC56975yZg, "");
            if (c56935yXu != null) {
                this.djBIcL.put(c56935yXu, abstractC56975yZg);
            }
        }

        @Override // o.yVI.Activity
        public void copydefault(C56935yXu c56935yXu, java.util.ArrayList<AbstractC56975yZg<?>> arrayList) {
            Intrinsics.checkNotNullParameter(arrayList, "");
            if (c56935yXu == null) {
                return;
            }
            InterfaceC56695yOx interfaceC56695yOxKWHzl = yRO.KWHzl(c56935yXu, this.OLrzqt);
            if (interfaceC56695yOxKWHzl != null) {
                java.util.HashMap<C56935yXu, AbstractC56975yZg<?>> map = this.djBIcL;
                C56978yZj c56978yZj = C56978yZj.OLrzqt;
                java.util.List<? extends AbstractC56975yZg<?>> listOLrzqt = C59433zgu.OLrzqt(arrayList);
                AbstractC59233zdF abstractC59233zdFUzCIH = interfaceC56695yOxKWHzl.uzCIH();
                Intrinsics.checkNotNullExpressionValue(abstractC59233zdFUzCIH, "");
                map.put(c56935yXu, c56978yZj.copydefault(listOLrzqt, abstractC59233zdFUzCIH));
                return;
            }
            if (yVI.this.AEQbTJ(this.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) c56935yXu.AEQbTJ(), (java.lang.Object) "value")) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                for (java.lang.Object obj : arrayList) {
                    if (obj instanceof C56970yZb) {
                        arrayList2.add(obj);
                    }
                }
                java.util.List<yOJ> list = this.EZpvd;
                java.util.Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    list.add(((C56970yZb) it.next()).KWHzl());
                }
            }
        }

        @Override // o.InterfaceC56893yWf.Application
        public void copydefault() {
            if (yVI.this.copydefault(this.AEQbTJ, this.djBIcL) || yVI.this.AEQbTJ(this.AEQbTJ)) {
                return;
            }
            this.EZpvd.add(new yOG(this.OLrzqt.bQ_(), this.djBIcL, this.copydefault));
        }
    }

    public abstract class Activity implements InterfaceC56893yWf.Application {
        public abstract void EZpvd(C56935yXu c56935yXu, @NotNull AbstractC56975yZg<?> abstractC56975yZg);

        public abstract void copydefault(C56935yXu c56935yXu, @NotNull java.util.ArrayList<AbstractC56975yZg<?>> arrayList);

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public Activity() {
        }

        @Override // o.InterfaceC56893yWf.Application
        public void AEQbTJ(C56935yXu c56935yXu, java.lang.Object obj) {
            EZpvd(c56935yXu, yVI.this.KWHzl(c56935yXu, obj));
        }

        @Override // o.InterfaceC56893yWf.Application
        public void AEQbTJ(C56935yXu c56935yXu, @NotNull C56977yZi c56977yZi) {
            Intrinsics.checkNotNullParameter(c56977yZi, "");
            EZpvd(c56935yXu, new C56984yZp(c56977yZi));
        }

        @Override // o.InterfaceC56893yWf.Application
        public void OLrzqt(C56935yXu c56935yXu, @NotNull C56929yXo c56929yXo, @NotNull C56935yXu c56935yXu2) {
            Intrinsics.checkNotNullParameter(c56929yXo, "");
            Intrinsics.checkNotNullParameter(c56935yXu2, "");
            EZpvd(c56935yXu, new C56981yZm(c56929yXo, c56935yXu2));
        }

        /* JADX INFO: renamed from: o.yVI$Activity$Activity, reason: collision with other inner class name */
        public static final class C1006Activity implements InterfaceC56893yWf.Activity {
            public final /* synthetic */ Activity AEQbTJ;
            public final /* synthetic */ yVI KWHzl;
            public final /* synthetic */ C56935yXu OLrzqt;
            public final java.util.ArrayList<AbstractC56975yZg<?>> copydefault = new java.util.ArrayList<>();

            public C1006Activity(yVI yvi, C56935yXu c56935yXu, Activity activity) {
                this.KWHzl = yvi;
                this.OLrzqt = c56935yXu;
                this.AEQbTJ = activity;
            }

            @Override // o.InterfaceC56893yWf.Activity
            public void OLrzqt(java.lang.Object obj) {
                this.copydefault.add(this.KWHzl.KWHzl(this.OLrzqt, obj));
            }

            @Override // o.InterfaceC56893yWf.Activity
            public void AEQbTJ(C56929yXo c56929yXo, C56935yXu c56935yXu) {
                Intrinsics.checkNotNullParameter(c56929yXo, "");
                Intrinsics.checkNotNullParameter(c56935yXu, "");
                this.copydefault.add(new C56981yZm(c56929yXo, c56935yXu));
            }

            @Override // o.InterfaceC56893yWf.Activity
            public void OLrzqt(C56977yZi c56977yZi) {
                Intrinsics.checkNotNullParameter(c56977yZi, "");
                this.copydefault.add(new C56984yZp(c56977yZi));
            }

            @Override // o.InterfaceC56893yWf.Activity
            public InterfaceC56893yWf.Application KWHzl(C56929yXo c56929yXo) {
                Intrinsics.checkNotNullParameter(c56929yXo, "");
                java.util.ArrayList arrayList = new java.util.ArrayList();
                yVI yvi = this.KWHzl;
                InterfaceC56686yOo interfaceC56686yOo = InterfaceC56686yOo.copydefault;
                Intrinsics.checkNotNullExpressionValue(interfaceC56686yOo, "");
                InterfaceC56893yWf.Application applicationCopydefault = yvi.copydefault(c56929yXo, interfaceC56686yOo, arrayList);
                Intrinsics.copydefault(applicationCopydefault);
                return new TaskDescription(applicationCopydefault, this, arrayList);
            }

            /* JADX INFO: renamed from: o.yVI$Activity$Activity$TaskDescription */
            public static final class TaskDescription implements InterfaceC56893yWf.Application {
                public final /* synthetic */ C1006Activity EZpvd;
                public final /* synthetic */ InterfaceC56893yWf.Application KWHzl;
                public final /* synthetic */ java.util.ArrayList<yOJ> OLrzqt;
                public final /* synthetic */ InterfaceC56893yWf.Application copydefault;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC56893yWf.Application
                public void AEQbTJ(C56935yXu c56935yXu, java.lang.Object obj) {
                    this.copydefault.AEQbTJ(c56935yXu, obj);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC56893yWf.Application
                public void AEQbTJ(C56935yXu c56935yXu, C56977yZi c56977yZi) {
                    Intrinsics.checkNotNullParameter(c56977yZi, "");
                    this.copydefault.AEQbTJ(c56935yXu, c56977yZi);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC56893yWf.Application
                public InterfaceC56893yWf.Activity EZpvd(C56935yXu c56935yXu) {
                    return this.copydefault.EZpvd(c56935yXu);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC56893yWf.Application
                public InterfaceC56893yWf.Application KWHzl(C56935yXu c56935yXu, C56929yXo c56929yXo) {
                    Intrinsics.checkNotNullParameter(c56929yXo, "");
                    return this.copydefault.KWHzl(c56935yXu, c56929yXo);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC56893yWf.Application
                public void OLrzqt(C56935yXu c56935yXu, C56929yXo c56929yXo, C56935yXu c56935yXu2) {
                    Intrinsics.checkNotNullParameter(c56929yXo, "");
                    Intrinsics.checkNotNullParameter(c56935yXu2, "");
                    this.copydefault.OLrzqt(c56935yXu, c56929yXo, c56935yXu2);
                }

                public TaskDescription(InterfaceC56893yWf.Application application, C1006Activity c1006Activity, java.util.ArrayList<yOJ> arrayList) {
                    this.KWHzl = application;
                    this.EZpvd = c1006Activity;
                    this.OLrzqt = arrayList;
                    this.copydefault = application;
                }

                @Override // o.InterfaceC56893yWf.Application
                public void copydefault() {
                    this.KWHzl.copydefault();
                    this.EZpvd.copydefault.add(new C56970yZb((yOJ) CollectionsKt___CollectionsKt.gHZMYf(this.OLrzqt)));
                }
            }

            @Override // o.InterfaceC56893yWf.Activity
            public void KWHzl() {
                this.AEQbTJ.copydefault(this.OLrzqt, this.copydefault);
            }
        }

        @Override // o.InterfaceC56893yWf.Application
        public InterfaceC56893yWf.Activity EZpvd(C56935yXu c56935yXu) {
            return new C1006Activity(yVI.this, c56935yXu, this);
        }

        @Override // o.InterfaceC56893yWf.Application
        public InterfaceC56893yWf.Application KWHzl(C56935yXu c56935yXu, @NotNull C56929yXo c56929yXo) {
            Intrinsics.checkNotNullParameter(c56929yXo, "");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            yVI yvi = yVI.this;
            InterfaceC56686yOo interfaceC56686yOo = InterfaceC56686yOo.copydefault;
            Intrinsics.checkNotNullExpressionValue(interfaceC56686yOo, "");
            InterfaceC56893yWf.Application applicationCopydefault = yvi.copydefault(c56929yXo, interfaceC56686yOo, arrayList);
            Intrinsics.copydefault(applicationCopydefault);
            return new StateListAnimator(applicationCopydefault, this, c56935yXu, arrayList);
        }

        public static final class StateListAnimator implements InterfaceC56893yWf.Application {
            public final /* synthetic */ Activity AEQbTJ;
            public final /* synthetic */ C56935yXu EZpvd;
            public final /* synthetic */ java.util.ArrayList<yOJ> KWHzl;
            public final /* synthetic */ InterfaceC56893yWf.Application OLrzqt;
            public final /* synthetic */ InterfaceC56893yWf.Application copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC56893yWf.Application
            public void AEQbTJ(C56935yXu c56935yXu, java.lang.Object obj) {
                this.copydefault.AEQbTJ(c56935yXu, obj);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC56893yWf.Application
            public void AEQbTJ(C56935yXu c56935yXu, C56977yZi c56977yZi) {
                Intrinsics.checkNotNullParameter(c56977yZi, "");
                this.copydefault.AEQbTJ(c56935yXu, c56977yZi);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC56893yWf.Application
            public InterfaceC56893yWf.Activity EZpvd(C56935yXu c56935yXu) {
                return this.copydefault.EZpvd(c56935yXu);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC56893yWf.Application
            public InterfaceC56893yWf.Application KWHzl(C56935yXu c56935yXu, C56929yXo c56929yXo) {
                Intrinsics.checkNotNullParameter(c56929yXo, "");
                return this.copydefault.KWHzl(c56935yXu, c56929yXo);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC56893yWf.Application
            public void OLrzqt(C56935yXu c56935yXu, C56929yXo c56929yXo, C56935yXu c56935yXu2) {
                Intrinsics.checkNotNullParameter(c56929yXo, "");
                Intrinsics.checkNotNullParameter(c56935yXu2, "");
                this.copydefault.OLrzqt(c56935yXu, c56929yXo, c56935yXu2);
            }

            public StateListAnimator(InterfaceC56893yWf.Application application, Activity activity, C56935yXu c56935yXu, java.util.ArrayList<yOJ> arrayList) {
                this.OLrzqt = application;
                this.AEQbTJ = activity;
                this.EZpvd = c56935yXu;
                this.KWHzl = arrayList;
                this.copydefault = application;
            }

            @Override // o.InterfaceC56893yWf.Application
            public void copydefault() {
                this.OLrzqt.copydefault();
                this.AEQbTJ.EZpvd(this.EZpvd, new C56970yZb((yOJ) CollectionsKt___CollectionsKt.gHZMYf(this.KWHzl)));
            }
        }
    }

    public final AbstractC56975yZg<?> KWHzl(C56935yXu c56935yXu, java.lang.Object obj) {
        AbstractC56975yZg<?> abstractC56975yZgCopydefault = C56978yZj.OLrzqt.copydefault(obj, this.AhwBna);
        if (abstractC56975yZgCopydefault != null) {
            return abstractC56975yZgCopydefault;
        }
        return AbstractC56979yZk.AEQbTJ.OLrzqt("Unsupported annotation argument: " + c56935yXu);
    }

    public final InterfaceC56658yNn KWHzl(C56929yXo c56929yXo) {
        return yNE.OLrzqt(this.AhwBna, c56929yXo, this.gEmmrt);
    }
}
