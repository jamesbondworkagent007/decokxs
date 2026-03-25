package com.reown.android.internal.common.model;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public abstract class Namespace {
    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.reown.android.internal.common.model.Namespace.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ Namespace(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract List<String> getChains();

    public abstract List<String> getEvents();

    public abstract List<String> getMethods();

    private Namespace() {
    }

    @JsonClass(generateAdapter = true)
    public static final class Proposal extends Namespace {
        public final List<String> chains;
        public final List<String> events;
        public final List<String> methods;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.reown.android.internal.common.model.Namespace$Proposal */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Proposal copy$default(Proposal proposal, List list, List list2, List list3, int i, Object obj) {
            if ((i & 1) != 0) {
                list = proposal.methods;
            }
            if ((i & 2) != 0) {
                list2 = proposal.chains;
            }
            if ((i & 4) != 0) {
                list3 = proposal.events;
            }
            return proposal.copy(list, list2, list3);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final List<String> component1() {
            return this.methods;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final List<String> component2() {
            return this.chains;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final List<String> component3() {
            return this.events;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Proposal copy(@Json(name = "methods") @NotNull List<String> list, @Json(name = "chains") List<String> list2, @Json(name = "events") @NotNull List<String> list3) {
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(list3, "");
            return new Proposal(list, list2, list3);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Proposal)) {
                return false;
            }
            Proposal proposal = (Proposal) obj;
            return Intrinsics.EZpvd(this.methods, proposal.methods) && Intrinsics.EZpvd(this.chains, proposal.chains) && Intrinsics.EZpvd(this.events, proposal.events);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.reown.android.internal.common.model.Namespace
        public List<String> getChains() {
            return this.chains;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.reown.android.internal.common.model.Namespace
        public List<String> getEvents() {
            return this.events;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.reown.android.internal.common.model.Namespace
        public List<String> getMethods() {
            return this.methods;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = this.methods.hashCode();
            List<String> list = this.chains;
            return (((iHashCode * 31) + (list == null ? 0 : list.hashCode())) * 31) + this.events.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "Proposal(methods=" + this.methods + ", chains=" + this.chains + ", events=" + this.events + ")";
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 java.util.List)
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r2v0 java.util.List))
  (r3v0 java.util.List)
 A[MD:(java.util.List<java.lang.String>, java.util.List<java.lang.String>, java.util.List<java.lang.String>):void (m)] (LINE:16) call: com.reown.android.internal.common.model.Namespace.Proposal.<init>(java.util.List, java.util.List, java.util.List):void type: THIS */
        public /* synthetic */ Proposal(List list, List list2, List list3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(list, (i & 2) != 0 ? null : list2, list3);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Proposal(@Json(name = "methods") @NotNull List<String> list, @Json(name = "chains") List<String> list2, @Json(name = "events") @NotNull List<String> list3) {
            super(null);
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(list3, "");
            this.methods = list;
            this.chains = list2;
            this.events = list3;
        }
    }

    @JsonClass(generateAdapter = true)
    public static final class Session extends Namespace {
        public final List<String> accounts;
        public final List<String> chains;
        public final List<String> events;
        public final List<String> methods;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.reown.android.internal.common.model.Namespace$Session */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Session copy$default(Session session, List list, List list2, List list3, List list4, int i, Object obj) {
            if ((i & 1) != 0) {
                list = session.chains;
            }
            if ((i & 2) != 0) {
                list2 = session.accounts;
            }
            if ((i & 4) != 0) {
                list3 = session.methods;
            }
            if ((i & 8) != 0) {
                list4 = session.events;
            }
            return session.copy(list, list2, list3, list4);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final List<String> component1() {
            return this.chains;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final List<String> component2() {
            return this.accounts;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final List<String> component3() {
            return this.methods;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final List<String> component4() {
            return this.events;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Session copy(@Json(name = "chains") List<String> list, @Json(name = "accounts") @NotNull List<String> list2, @Json(name = "methods") @NotNull List<String> list3, @Json(name = "events") @NotNull List<String> list4) {
            Intrinsics.checkNotNullParameter(list2, "");
            Intrinsics.checkNotNullParameter(list3, "");
            Intrinsics.checkNotNullParameter(list4, "");
            return new Session(list, list2, list3, list4);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Session)) {
                return false;
            }
            Session session = (Session) obj;
            return Intrinsics.EZpvd(this.chains, session.chains) && Intrinsics.EZpvd(this.accounts, session.accounts) && Intrinsics.EZpvd(this.methods, session.methods) && Intrinsics.EZpvd(this.events, session.events);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final List<String> getAccounts() {
            return this.accounts;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.reown.android.internal.common.model.Namespace
        public List<String> getChains() {
            return this.chains;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.reown.android.internal.common.model.Namespace
        public List<String> getEvents() {
            return this.events;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.reown.android.internal.common.model.Namespace
        public List<String> getMethods() {
            return this.methods;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            List<String> list = this.chains;
            return ((((((list == null ? 0 : list.hashCode()) * 31) + this.accounts.hashCode()) * 31) + this.methods.hashCode()) * 31) + this.events.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "Session(chains=" + this.chains + ", accounts=" + this.accounts + ", methods=" + this.methods + ", events=" + this.events + ")";
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r1v0 java.util.List))
  (r2v0 java.util.List)
  (r3v0 java.util.List)
  (r4v0 java.util.List)
 A[MD:(java.util.List<java.lang.String>, java.util.List<java.lang.String>, java.util.List<java.lang.String>, java.util.List<java.lang.String>):void (m)] (LINE:26) call: com.reown.android.internal.common.model.Namespace.Session.<init>(java.util.List, java.util.List, java.util.List, java.util.List):void type: THIS */
        public /* synthetic */ Session(List list, List list2, List list3, List list4, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : list, list2, list3, list4);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Session(@Json(name = "chains") List<String> list, @Json(name = "accounts") @NotNull List<String> list2, @Json(name = "methods") @NotNull List<String> list3, @Json(name = "events") @NotNull List<String> list4) {
            super(null);
            Intrinsics.checkNotNullParameter(list2, "");
            Intrinsics.checkNotNullParameter(list3, "");
            Intrinsics.checkNotNullParameter(list4, "");
            this.chains = list;
            this.accounts = list2;
            this.methods = list3;
            this.events = list4;
        }
    }
}
