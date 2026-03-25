package o;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationLoader;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind;
import o.C56890yWc;
import o.C56984yZp;
import o.InterfaceC56893yWf;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public abstract class yVG<A, C> extends AbstractBinaryClassAnnotationLoader<A, yVK<? extends A, ? extends C>> implements InterfaceC59077zaI<A, C> {
    public final InterfaceC59181zcG<InterfaceC56893yWf, yVK<A, C>> EZpvd;

    public abstract C EZpvd(@NotNull C c);

    public abstract C EZpvd(@NotNull java.lang.String str, @NotNull java.lang.Object obj);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yVG(@NotNull InterfaceC59187zcM interfaceC59187zcM, @NotNull InterfaceC56888yWa interfaceC56888yWa) {
        super(interfaceC56888yWa);
        Intrinsics.checkNotNullParameter(interfaceC59187zcM, "");
        Intrinsics.checkNotNullParameter(interfaceC56888yWa, "");
        this.EZpvd = interfaceC59187zcM.AEQbTJ(new yVC(this));
    }

    public static final yVK OLrzqt(yVG yvg, InterfaceC56893yWf interfaceC56893yWf) {
        Intrinsics.checkNotNullParameter(interfaceC56893yWf, "");
        return yvg.copydefault(interfaceC56893yWf);
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Lo/yWf;)Lkotlin/reflect/jvm/internal/impl/load/kotlin/AbstractBinaryClassAnnotationLoader$StateListAnimator; */
    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationLoader
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public yVK<A, C> KWHzl(@NotNull InterfaceC56893yWf interfaceC56893yWf) {
        Intrinsics.checkNotNullParameter(interfaceC56893yWf, "");
        return this.EZpvd.invoke(interfaceC56893yWf);
    }

    @Override // o.InterfaceC59077zaI
    public C EZpvd(@NotNull AbstractC59164zbq abstractC59164zbq, @NotNull ProtoBuf.Property property, @NotNull AbstractC59233zdF abstractC59233zdF) {
        Intrinsics.checkNotNullParameter(abstractC59164zbq, "");
        Intrinsics.checkNotNullParameter(property, "");
        Intrinsics.checkNotNullParameter(abstractC59233zdF, "");
        return EZpvd(abstractC59164zbq, property, AnnotatedCallableKind.PROPERTY_GETTER, abstractC59233zdF, yVJ.EZpvd);
    }

    public static final java.lang.Object AEQbTJ(yVK yvk, C56890yWc c56890yWc) {
        Intrinsics.checkNotNullParameter(yvk, "");
        Intrinsics.checkNotNullParameter(c56890yWc, "");
        return yvk.OLrzqt().get(c56890yWc);
    }

    public static final java.lang.Object copydefault(yVK yvk, C56890yWc c56890yWc) {
        Intrinsics.checkNotNullParameter(yvk, "");
        Intrinsics.checkNotNullParameter(c56890yWc, "");
        return yvk.copydefault().get(c56890yWc);
    }

    @Override // o.InterfaceC59077zaI
    public C KWHzl(@NotNull AbstractC59164zbq abstractC59164zbq, @NotNull ProtoBuf.Property property, @NotNull AbstractC59233zdF abstractC59233zdF) {
        Intrinsics.checkNotNullParameter(abstractC59164zbq, "");
        Intrinsics.checkNotNullParameter(property, "");
        Intrinsics.checkNotNullParameter(abstractC59233zdF, "");
        return EZpvd(abstractC59164zbq, property, AnnotatedCallableKind.PROPERTY, abstractC59233zdF, yVL.EZpvd);
    }

    public final C EZpvd(AbstractC59164zbq abstractC59164zbq, ProtoBuf.Property property, AnnotatedCallableKind annotatedCallableKind, AbstractC59233zdF abstractC59233zdF, Function2<? super yVK<? extends A, ? extends C>, ? super C56890yWc, ? extends C> function2) {
        C cInvoke;
        InterfaceC56893yWf interfaceC56893yWfAEQbTJ = AEQbTJ(abstractC59164zbq, AbstractBinaryClassAnnotationLoader.AEQbTJ.AEQbTJ(abstractC59164zbq, true, true, yWP.valueOf.KWHzl(property.getFlags()), C56928yXn.EZpvd(property), copydefault(), EZpvd()));
        if (interfaceC56893yWfAEQbTJ == null) {
            return null;
        }
        C56890yWc c56890yWcAEQbTJ = AEQbTJ(property, abstractC59164zbq.OLrzqt(), abstractC59164zbq.KWHzl(), annotatedCallableKind, interfaceC56893yWfAEQbTJ.EZpvd().EZpvd().AEQbTJ((yWQ) yVO.AEQbTJ.KWHzl()));
        if (c56890yWcAEQbTJ == null || (cInvoke = function2.invoke(this.EZpvd.invoke(interfaceC56893yWfAEQbTJ), c56890yWcAEQbTJ)) == null) {
            return null;
        }
        return yMH.copydefault(abstractC59233zdF) ? EZpvd(cInvoke) : cInvoke;
    }

    public final yVK<A, C> copydefault(InterfaceC56893yWf interfaceC56893yWf) {
        java.util.HashMap map = new java.util.HashMap();
        java.util.HashMap map2 = new java.util.HashMap();
        java.util.HashMap map3 = new java.util.HashMap();
        interfaceC56893yWf.KWHzl(new TaskDescription(this, map, interfaceC56893yWf, map3, map2), EZpvd(interfaceC56893yWf));
        return new yVK<>(map, map2, map3);
    }

    public static final class TaskDescription implements InterfaceC56893yWf.StateListAnimator {
        public final /* synthetic */ java.util.HashMap<C56890yWc, C> AEQbTJ;
        public final /* synthetic */ yVG<A, C> EZpvd;
        public final /* synthetic */ java.util.HashMap<C56890yWc, C> KWHzl;
        public final /* synthetic */ java.util.HashMap<C56890yWc, java.util.List<A>> OLrzqt;
        public final /* synthetic */ InterfaceC56893yWf copydefault;

        public TaskDescription(yVG<A, C> yvg, java.util.HashMap<C56890yWc, java.util.List<A>> map, InterfaceC56893yWf interfaceC56893yWf, java.util.HashMap<C56890yWc, C> map2, java.util.HashMap<C56890yWc, C> map3) {
            this.EZpvd = yvg;
            this.OLrzqt = map;
            this.copydefault = interfaceC56893yWf;
            this.KWHzl = map2;
            this.AEQbTJ = map3;
        }

        @Override // o.InterfaceC56893yWf.StateListAnimator
        public InterfaceC56893yWf.ActionBar OLrzqt(C56935yXu c56935yXu, java.lang.String str) {
            Intrinsics.checkNotNullParameter(c56935yXu, "");
            Intrinsics.checkNotNullParameter(str, "");
            C56890yWc.ActionBar actionBar = C56890yWc.KWHzl;
            java.lang.String strAEQbTJ = c56935yXu.AEQbTJ();
            Intrinsics.checkNotNullExpressionValue(strAEQbTJ, "");
            return new Activity(this, actionBar.AEQbTJ(strAEQbTJ, str));
        }

        @Override // o.InterfaceC56893yWf.StateListAnimator
        public InterfaceC56893yWf.TaskDescription EZpvd(C56935yXu c56935yXu, java.lang.String str, java.lang.Object obj) {
            C cEZpvd;
            Intrinsics.checkNotNullParameter(c56935yXu, "");
            Intrinsics.checkNotNullParameter(str, "");
            C56890yWc.ActionBar actionBar = C56890yWc.KWHzl;
            java.lang.String strAEQbTJ = c56935yXu.AEQbTJ();
            Intrinsics.checkNotNullExpressionValue(strAEQbTJ, "");
            C56890yWc c56890yWcOLrzqt = actionBar.OLrzqt(strAEQbTJ, str);
            if (obj != null && (cEZpvd = this.EZpvd.EZpvd(str, obj)) != null) {
                this.AEQbTJ.put(c56890yWcOLrzqt, cEZpvd);
            }
            return new ActionBar(this, c56890yWcOLrzqt);
        }

        public final class Activity extends ActionBar implements InterfaceC56893yWf.ActionBar {
            public final /* synthetic */ TaskDescription AEQbTJ;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Activity(TaskDescription taskDescription, C56890yWc c56890yWc) {
                super(taskDescription, c56890yWc);
                Intrinsics.checkNotNullParameter(c56890yWc, "");
                this.AEQbTJ = taskDescription;
            }

            @Override // o.InterfaceC56893yWf.ActionBar
            public InterfaceC56893yWf.Application OLrzqt(int i, C56929yXo c56929yXo, InterfaceC56686yOo interfaceC56686yOo) {
                Intrinsics.checkNotNullParameter(c56929yXo, "");
                Intrinsics.checkNotNullParameter(interfaceC56686yOo, "");
                C56890yWc c56890yWcCopydefault = C56890yWc.KWHzl.copydefault(copydefault(), i);
                java.util.List<A> arrayList = this.AEQbTJ.OLrzqt.get(c56890yWcCopydefault);
                if (arrayList == null) {
                    arrayList = new java.util.ArrayList<>();
                    this.AEQbTJ.OLrzqt.put(c56890yWcCopydefault, arrayList);
                }
                return this.AEQbTJ.EZpvd.KWHzl(c56929yXo, interfaceC56686yOo, arrayList);
            }
        }

        public class ActionBar implements InterfaceC56893yWf.TaskDescription {
            public final /* synthetic */ TaskDescription EZpvd;
            public final java.util.ArrayList<A> KWHzl;
            public final C56890yWc OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final C56890yWc copydefault() {
                return this.OLrzqt;
            }

            public ActionBar(TaskDescription taskDescription, C56890yWc c56890yWc) {
                Intrinsics.checkNotNullParameter(c56890yWc, "");
                this.EZpvd = taskDescription;
                this.OLrzqt = c56890yWc;
                this.KWHzl = new java.util.ArrayList<>();
            }

            @Override // o.InterfaceC56893yWf.TaskDescription
            public InterfaceC56893yWf.Application copydefault(C56929yXo c56929yXo, InterfaceC56686yOo interfaceC56686yOo) {
                Intrinsics.checkNotNullParameter(c56929yXo, "");
                Intrinsics.checkNotNullParameter(interfaceC56686yOo, "");
                return this.EZpvd.EZpvd.KWHzl(c56929yXo, interfaceC56686yOo, this.KWHzl);
            }

            @Override // o.InterfaceC56893yWf.TaskDescription
            public void EZpvd() {
                if (!this.KWHzl.isEmpty()) {
                    this.EZpvd.OLrzqt.put(this.OLrzqt, this.KWHzl);
                }
            }
        }
    }

    public final boolean copydefault(@NotNull C56929yXo c56929yXo, @NotNull java.util.Map<C56935yXu, ? extends AbstractC56975yZg<?>> map) {
        Intrinsics.checkNotNullParameter(c56929yXo, "");
        Intrinsics.checkNotNullParameter(map, "");
        if (!Intrinsics.EZpvd(c56929yXo, C56629yMl.OLrzqt.KWHzl())) {
            return false;
        }
        AbstractC56975yZg<?> abstractC56975yZg = map.get(C56935yXu.AEQbTJ("value"));
        C56984yZp c56984yZp = abstractC56975yZg instanceof C56984yZp ? (C56984yZp) abstractC56975yZg : null;
        if (c56984yZp == null) {
            return false;
        }
        C56984yZp.ActionBar actionBarKWHzl = c56984yZp.KWHzl();
        C56984yZp.ActionBar.Activity activity = actionBarKWHzl instanceof C56984yZp.ActionBar.Activity ? (C56984yZp.ActionBar.Activity) actionBarKWHzl : null;
        if (activity == null) {
            return false;
        }
        return AEQbTJ(activity.KWHzl());
    }
}
