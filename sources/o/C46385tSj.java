package o;

import com.okinc.planet.manager.PlanetProfileInitHelper$init$1;
import com.okinc.rxutils.RxBus;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import o.C47265tml;
import o.InterfaceC46389tSn;
import o.xUT;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tSj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C46385tSj {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int OLrzqt = 8;
    public final CoroutineScope KWHzl = CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default((Job) null, 1, (java.lang.Object) null).plus(Dispatchers.getMain()));
    public final CopyOnWriteArrayList<InterfaceC46389tSn> EZpvd = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: o.tSj$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.tSj.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final C46385tSj copydefault() {
            C46385tSj c46385tSjFLIjIY;
            synchronized (this) {
                c46385tSjFLIjIY = tPF.copydefault.fLIjIY();
            }
            return c46385tSjFLIjIY;
        }
    }

    public final void AEQbTJ(@NotNull InterfaceC46387tSl interfaceC46387tSl) {
        Intrinsics.checkNotNullParameter(interfaceC46387tSl, "");
        pUU.EZpvd("PlanetProfileInitHelper", "Init SocialInitHelper");
        BuildersKt__Builders_commonKt.launch$default(this.KWHzl, Dispatchers.getIO(), null, new PlanetProfileInitHelper$init$1(interfaceC46387tSl, this, null), 2, null);
        RxBus.KWHzl(C47265tml.class, new java.lang.String[0]).subscribe(new RxBus.EventCallback<C47265tml>() { // from class: com.okinc.planet.manager.PlanetProfileInitHelper$init$2
            {
                super(this.this$0);
            }

            /* JADX DEBUG: Method merged with bridge method: onEvent(Ljava/lang/Object;)V */
            @Override // com.okinc.rxutils.RxBus.EventCallback
            public void onEvent(C47265tml c47265tml) {
                Iterator it = this.this$0.EZpvd.iterator();
                while (it.hasNext()) {
                    ((InterfaceC46389tSn) it.next()).copydefault(c47265tml);
                }
            }
        });
        RxBus.AEQbTJ("EVENT_OKEX_HOME_MODE_CHANGE").subscribe(new RxBus.EventCallback<java.lang.String>() { // from class: com.okinc.planet.manager.PlanetProfileInitHelper$init$3
            {
                super(this.this$0);
            }

            /* JADX DEBUG: Method merged with bridge method: onEvent(Ljava/lang/Object;)V */
            @Override // com.okinc.rxutils.RxBus.EventCallback
            public void onEvent(String str) {
                Iterator it = this.this$0.EZpvd.iterator();
                while (it.hasNext()) {
                    ((InterfaceC46389tSn) it.next()).copydefault(xUT.OLrzqt.KWHzl());
                }
            }
        });
    }

    public final void AEQbTJ(@NotNull InterfaceC46389tSn interfaceC46389tSn) {
        Intrinsics.checkNotNullParameter(interfaceC46389tSn, "");
        this.EZpvd.add(interfaceC46389tSn);
    }

    public final void KWHzl(@NotNull InterfaceC46389tSn interfaceC46389tSn) {
        Intrinsics.checkNotNullParameter(interfaceC46389tSn, "");
        this.EZpvd.remove(interfaceC46389tSn);
    }
}
