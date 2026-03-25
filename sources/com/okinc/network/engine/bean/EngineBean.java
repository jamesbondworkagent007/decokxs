package com.okinc.network.engine.bean;

import com.google.gson.JsonObject;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class EngineBean {
    public static final int $stable = 8;
    private final List<Rule> rules;
    private final String version;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.network.engine.bean.EngineBean */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ EngineBean copy$default(EngineBean engineBean, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = engineBean.version;
        }
        if ((i & 2) != 0) {
            list = engineBean.rules;
        }
        return engineBean.copy(str, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.version;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Rule> component2() {
        return this.rules;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final EngineBean copy(String str, @NotNull List<Rule> list) {
        Intrinsics.checkNotNullParameter(list, "");
        return new EngineBean(str, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EngineBean)) {
            return false;
        }
        EngineBean engineBean = (EngineBean) obj;
        return Intrinsics.EZpvd((Object) this.version, (Object) engineBean.version) && Intrinsics.EZpvd(this.rules, engineBean.rules);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Rule> getRules() {
        return this.rules;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getVersion() {
        return this.version;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.version;
        return ((str == null ? 0 : str.hashCode()) * 31) + this.rules.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "EngineBean(version=" + this.version + ", rules=" + this.rules + ")";
    }

    public EngineBean(String str, @NotNull List<Rule> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.version = str;
        this.rules = list;
    }

    public static final class Rule {
        public static final int $stable = 8;
        private final Action action;
        private final Match match;
        private final String name;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Rule copy$default(Rule rule, String str, Match match, Action action, int i, Object obj) {
            if ((i & 1) != 0) {
                str = rule.name;
            }
            if ((i & 2) != 0) {
                match = rule.match;
            }
            if ((i & 4) != 0) {
                action = rule.action;
            }
            return rule.copy(str, match, action);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.name;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Match component2() {
            return this.match;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Action component3() {
            return this.action;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Rule copy(@NotNull String str, @NotNull Match match, @NotNull Action action) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(match, "");
            Intrinsics.checkNotNullParameter(action, "");
            return new Rule(str, match, action);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Rule)) {
                return false;
            }
            Rule rule = (Rule) obj;
            return Intrinsics.EZpvd((Object) this.name, (Object) rule.name) && Intrinsics.EZpvd(this.match, rule.match) && Intrinsics.EZpvd(this.action, rule.action);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Action getAction() {
            return this.action;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Match getMatch() {
            return this.match;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getName() {
            return this.name;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((this.name.hashCode() * 31) + this.match.hashCode()) * 31) + this.action.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "Rule(name=" + this.name + ", match=" + this.match + ", action=" + this.action + ")";
        }

        public Rule(@NotNull String str, @NotNull Match match, @NotNull Action action) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(match, "");
            Intrinsics.checkNotNullParameter(action, "");
            this.name = str;
            this.match = match;
            this.action = action;
        }

        public static final class Match {
            public static final int $stable = 8;
            private final BodyMatch bodyMatch;
            private final HeadersMatch headersMatch;
            private final String method;
            private final PathMatch pathMatch;
            private final QueryMatch queryMatch;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ Match copy$default(Match match, String str, PathMatch pathMatch, HeadersMatch headersMatch, QueryMatch queryMatch, BodyMatch bodyMatch, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = match.method;
                }
                if ((i & 2) != 0) {
                    pathMatch = match.pathMatch;
                }
                PathMatch pathMatch2 = pathMatch;
                if ((i & 4) != 0) {
                    headersMatch = match.headersMatch;
                }
                HeadersMatch headersMatch2 = headersMatch;
                if ((i & 8) != 0) {
                    queryMatch = match.queryMatch;
                }
                QueryMatch queryMatch2 = queryMatch;
                if ((i & 16) != 0) {
                    bodyMatch = match.bodyMatch;
                }
                return match.copy(str, pathMatch2, headersMatch2, queryMatch2, bodyMatch);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String component1() {
                return this.method;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final PathMatch component2() {
                return this.pathMatch;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final HeadersMatch component3() {
                return this.headersMatch;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final QueryMatch component4() {
                return this.queryMatch;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final BodyMatch component5() {
                return this.bodyMatch;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Match copy(String str, PathMatch pathMatch, HeadersMatch headersMatch, QueryMatch queryMatch, BodyMatch bodyMatch) {
                return new Match(str, pathMatch, headersMatch, queryMatch, bodyMatch);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Match)) {
                    return false;
                }
                Match match = (Match) obj;
                return Intrinsics.EZpvd((Object) this.method, (Object) match.method) && Intrinsics.EZpvd(this.pathMatch, match.pathMatch) && Intrinsics.EZpvd(this.headersMatch, match.headersMatch) && Intrinsics.EZpvd(this.queryMatch, match.queryMatch) && Intrinsics.EZpvd(this.bodyMatch, match.bodyMatch);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final BodyMatch getBodyMatch() {
                return this.bodyMatch;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final HeadersMatch getHeadersMatch() {
                return this.headersMatch;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String getMethod() {
                return this.method;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final PathMatch getPathMatch() {
                return this.pathMatch;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final QueryMatch getQueryMatch() {
                return this.queryMatch;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                String str = this.method;
                int iHashCode = str == null ? 0 : str.hashCode();
                PathMatch pathMatch = this.pathMatch;
                int iHashCode2 = pathMatch == null ? 0 : pathMatch.hashCode();
                HeadersMatch headersMatch = this.headersMatch;
                int iHashCode3 = headersMatch == null ? 0 : headersMatch.hashCode();
                QueryMatch queryMatch = this.queryMatch;
                int iHashCode4 = queryMatch == null ? 0 : queryMatch.hashCode();
                BodyMatch bodyMatch = this.bodyMatch;
                return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (bodyMatch != null ? bodyMatch.hashCode() : 0);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "Match(method=" + this.method + ", pathMatch=" + this.pathMatch + ", headersMatch=" + this.headersMatch + ", queryMatch=" + this.queryMatch + ", bodyMatch=" + this.bodyMatch + ")";
            }

            public Match(String str, PathMatch pathMatch, HeadersMatch headersMatch, QueryMatch queryMatch, BodyMatch bodyMatch) {
                this.method = str;
                this.pathMatch = pathMatch;
                this.headersMatch = headersMatch;
                this.queryMatch = queryMatch;
                this.bodyMatch = bodyMatch;
            }

            public static final class PathMatch {
                public static final int $stable = 0;
                private final String path;
                private final String pattern;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public static /* synthetic */ PathMatch copy$default(PathMatch pathMatch, String str, String str2, int i, Object obj) {
                    if ((i & 1) != 0) {
                        str = pathMatch.pattern;
                    }
                    if ((i & 2) != 0) {
                        str2 = pathMatch.path;
                    }
                    return pathMatch.copy(str, str2);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final String component1() {
                    return this.pattern;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final String component2() {
                    return this.path;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final PathMatch copy(@NotNull String str, @NotNull String str2) {
                    Intrinsics.checkNotNullParameter(str, "");
                    Intrinsics.checkNotNullParameter(str2, "");
                    return new PathMatch(str, str2);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof PathMatch)) {
                        return false;
                    }
                    PathMatch pathMatch = (PathMatch) obj;
                    return Intrinsics.EZpvd((Object) this.pattern, (Object) pathMatch.pattern) && Intrinsics.EZpvd((Object) this.path, (Object) pathMatch.path);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final String getPath() {
                    return this.path;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final String getPattern() {
                    return this.pattern;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public int hashCode() {
                    return (this.pattern.hashCode() * 31) + this.path.hashCode();
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public String toString() {
                    return "PathMatch(pattern=" + this.pattern + ", path=" + this.path + ")";
                }

                public PathMatch(@NotNull String str, @NotNull String str2) {
                    Intrinsics.checkNotNullParameter(str, "");
                    Intrinsics.checkNotNullParameter(str2, "");
                    this.pattern = str;
                    this.path = str2;
                }
            }

            public static final class HeadersMatch {
                public static final int $stable = 8;
                private final Map<String, String> headers;
                private final String pattern;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.network.engine.bean.EngineBean$Rule$Match$HeadersMatch */
                /* JADX WARN: Multi-variable type inference failed */
                public static /* synthetic */ HeadersMatch copy$default(HeadersMatch headersMatch, String str, Map map, int i, Object obj) {
                    if ((i & 1) != 0) {
                        str = headersMatch.pattern;
                    }
                    if ((i & 2) != 0) {
                        map = headersMatch.headers;
                    }
                    return headersMatch.copy(str, map);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final String component1() {
                    return this.pattern;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final Map<String, String> component2() {
                    return this.headers;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final HeadersMatch copy(@NotNull String str, Map<String, String> map) {
                    Intrinsics.checkNotNullParameter(str, "");
                    return new HeadersMatch(str, map);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof HeadersMatch)) {
                        return false;
                    }
                    HeadersMatch headersMatch = (HeadersMatch) obj;
                    return Intrinsics.EZpvd((Object) this.pattern, (Object) headersMatch.pattern) && Intrinsics.EZpvd(this.headers, headersMatch.headers);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final Map<String, String> getHeaders() {
                    return this.headers;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final String getPattern() {
                    return this.pattern;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public int hashCode() {
                    int iHashCode = this.pattern.hashCode();
                    Map<String, String> map = this.headers;
                    return (iHashCode * 31) + (map == null ? 0 : map.hashCode());
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public String toString() {
                    return "HeadersMatch(pattern=" + this.pattern + ", headers=" + this.headers + ")";
                }

                public HeadersMatch(@NotNull String str, Map<String, String> map) {
                    Intrinsics.checkNotNullParameter(str, "");
                    this.pattern = str;
                    this.headers = map;
                }
            }

            public static final class QueryMatch {
                public static final int $stable = 8;
                private final String pattern;
                private final Map<String, String> query;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.network.engine.bean.EngineBean$Rule$Match$QueryMatch */
                /* JADX WARN: Multi-variable type inference failed */
                public static /* synthetic */ QueryMatch copy$default(QueryMatch queryMatch, String str, Map map, int i, Object obj) {
                    if ((i & 1) != 0) {
                        str = queryMatch.pattern;
                    }
                    if ((i & 2) != 0) {
                        map = queryMatch.query;
                    }
                    return queryMatch.copy(str, map);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final String component1() {
                    return this.pattern;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final Map<String, String> component2() {
                    return this.query;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final QueryMatch copy(@NotNull String str, Map<String, String> map) {
                    Intrinsics.checkNotNullParameter(str, "");
                    return new QueryMatch(str, map);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof QueryMatch)) {
                        return false;
                    }
                    QueryMatch queryMatch = (QueryMatch) obj;
                    return Intrinsics.EZpvd((Object) this.pattern, (Object) queryMatch.pattern) && Intrinsics.EZpvd(this.query, queryMatch.query);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final String getPattern() {
                    return this.pattern;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final Map<String, String> getQuery() {
                    return this.query;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public int hashCode() {
                    int iHashCode = this.pattern.hashCode();
                    Map<String, String> map = this.query;
                    return (iHashCode * 31) + (map == null ? 0 : map.hashCode());
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public String toString() {
                    return "QueryMatch(pattern=" + this.pattern + ", query=" + this.query + ")";
                }

                public QueryMatch(@NotNull String str, Map<String, String> map) {
                    Intrinsics.checkNotNullParameter(str, "");
                    this.pattern = str;
                    this.query = map;
                }
            }

            public static final class BodyMatch {
                public static final int $stable = 8;
                private final Map<String, String> body;
                private final String pattern;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.network.engine.bean.EngineBean$Rule$Match$BodyMatch */
                /* JADX WARN: Multi-variable type inference failed */
                public static /* synthetic */ BodyMatch copy$default(BodyMatch bodyMatch, String str, Map map, int i, Object obj) {
                    if ((i & 1) != 0) {
                        str = bodyMatch.pattern;
                    }
                    if ((i & 2) != 0) {
                        map = bodyMatch.body;
                    }
                    return bodyMatch.copy(str, map);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final String component1() {
                    return this.pattern;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final Map<String, String> component2() {
                    return this.body;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final BodyMatch copy(@NotNull String str, Map<String, String> map) {
                    Intrinsics.checkNotNullParameter(str, "");
                    return new BodyMatch(str, map);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof BodyMatch)) {
                        return false;
                    }
                    BodyMatch bodyMatch = (BodyMatch) obj;
                    return Intrinsics.EZpvd((Object) this.pattern, (Object) bodyMatch.pattern) && Intrinsics.EZpvd(this.body, bodyMatch.body);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final Map<String, String> getBody() {
                    return this.body;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final String getPattern() {
                    return this.pattern;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public int hashCode() {
                    int iHashCode = this.pattern.hashCode();
                    Map<String, String> map = this.body;
                    return (iHashCode * 31) + (map == null ? 0 : map.hashCode());
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public String toString() {
                    return "BodyMatch(pattern=" + this.pattern + ", body=" + this.body + ")";
                }

                public BodyMatch(@NotNull String str, Map<String, String> map) {
                    Intrinsics.checkNotNullParameter(str, "");
                    this.pattern = str;
                    this.body = map;
                }
            }
        }

        public static final class Action {
            public static final int $stable = 8;
            private final ForwardConfig forwardConfig;
            private final Modification modification;
            private final Response response;
            private final String type;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ Action copy$default(Action action, String str, Response response, ForwardConfig forwardConfig, Modification modification, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = action.type;
                }
                if ((i & 2) != 0) {
                    response = action.response;
                }
                if ((i & 4) != 0) {
                    forwardConfig = action.forwardConfig;
                }
                if ((i & 8) != 0) {
                    modification = action.modification;
                }
                return action.copy(str, response, forwardConfig, modification);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String component1() {
                return this.type;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Response component2() {
                return this.response;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final ForwardConfig component3() {
                return this.forwardConfig;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Modification component4() {
                return this.modification;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Action copy(@NotNull String str, Response response, ForwardConfig forwardConfig, Modification modification) {
                Intrinsics.checkNotNullParameter(str, "");
                return new Action(str, response, forwardConfig, modification);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Action)) {
                    return false;
                }
                Action action = (Action) obj;
                return Intrinsics.EZpvd((Object) this.type, (Object) action.type) && Intrinsics.EZpvd(this.response, action.response) && Intrinsics.EZpvd(this.forwardConfig, action.forwardConfig) && Intrinsics.EZpvd(this.modification, action.modification);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final ForwardConfig getForwardConfig() {
                return this.forwardConfig;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Modification getModification() {
                return this.modification;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Response getResponse() {
                return this.response;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String getType() {
                return this.type;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                int iHashCode = this.type.hashCode();
                Response response = this.response;
                int iHashCode2 = response == null ? 0 : response.hashCode();
                ForwardConfig forwardConfig = this.forwardConfig;
                int iHashCode3 = forwardConfig == null ? 0 : forwardConfig.hashCode();
                Modification modification = this.modification;
                return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (modification != null ? modification.hashCode() : 0);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "Action(type=" + this.type + ", response=" + this.response + ", forwardConfig=" + this.forwardConfig + ", modification=" + this.modification + ")";
            }

            public Action(@NotNull String str, Response response, ForwardConfig forwardConfig, Modification modification) {
                Intrinsics.checkNotNullParameter(str, "");
                this.type = str;
                this.response = response;
                this.forwardConfig = forwardConfig;
                this.modification = modification;
            }

            public static final class Response {
                public static final int $stable = 8;
                private final String HTTPVersion;
                private final JsonObject body;
                private final Map<String, String> headers;
                private final String message;
                private final int statusCode;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.okinc.network.engine.bean.EngineBean$Rule$Action$Response */
                /* JADX WARN: Multi-variable type inference failed */
                public static /* synthetic */ Response copy$default(Response response, int i, String str, String str2, Map map, JsonObject jsonObject, int i2, Object obj) {
                    if ((i2 & 1) != 0) {
                        i = response.statusCode;
                    }
                    if ((i2 & 2) != 0) {
                        str = response.HTTPVersion;
                    }
                    String str3 = str;
                    if ((i2 & 4) != 0) {
                        str2 = response.message;
                    }
                    String str4 = str2;
                    if ((i2 & 8) != 0) {
                        map = response.headers;
                    }
                    Map map2 = map;
                    if ((i2 & 16) != 0) {
                        jsonObject = response.body;
                    }
                    return response.copy(i, str3, str4, map2, jsonObject);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final int component1() {
                    return this.statusCode;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final String component2() {
                    return this.HTTPVersion;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final String component3() {
                    return this.message;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final Map<String, String> component4() {
                    return this.headers;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final JsonObject component5() {
                    return this.body;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final Response copy(int i, String str, String str2, Map<String, String> map, JsonObject jsonObject) {
                    return new Response(i, str, str2, map, jsonObject);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof Response)) {
                        return false;
                    }
                    Response response = (Response) obj;
                    return this.statusCode == response.statusCode && Intrinsics.EZpvd((Object) this.HTTPVersion, (Object) response.HTTPVersion) && Intrinsics.EZpvd((Object) this.message, (Object) response.message) && Intrinsics.EZpvd(this.headers, response.headers) && Intrinsics.EZpvd(this.body, response.body);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final JsonObject getBody() {
                    return this.body;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final String getHTTPVersion() {
                    return this.HTTPVersion;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final Map<String, String> getHeaders() {
                    return this.headers;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final String getMessage() {
                    return this.message;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final int getStatusCode() {
                    return this.statusCode;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public int hashCode() {
                    int iHashCode = Integer.hashCode(this.statusCode);
                    String str = this.HTTPVersion;
                    int iHashCode2 = str == null ? 0 : str.hashCode();
                    String str2 = this.message;
                    int iHashCode3 = str2 == null ? 0 : str2.hashCode();
                    Map<String, String> map = this.headers;
                    int iHashCode4 = map == null ? 0 : map.hashCode();
                    JsonObject jsonObject = this.body;
                    return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (jsonObject != null ? jsonObject.hashCode() : 0);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public String toString() {
                    return "Response(statusCode=" + this.statusCode + ", HTTPVersion=" + this.HTTPVersion + ", message=" + this.message + ", headers=" + this.headers + ", body=" + this.body + ")";
                }

                public Response(int i, String str, String str2, Map<String, String> map, JsonObject jsonObject) {
                    this.statusCode = i;
                    this.HTTPVersion = str;
                    this.message = str2;
                    this.headers = map;
                    this.body = jsonObject;
                }
            }

            public static final class ForwardConfig {
                public static final int $stable = 0;
                private final String path;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public static /* synthetic */ ForwardConfig copy$default(ForwardConfig forwardConfig, String str, int i, Object obj) {
                    if ((i & 1) != 0) {
                        str = forwardConfig.path;
                    }
                    return forwardConfig.copy(str);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final String component1() {
                    return this.path;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final ForwardConfig copy(String str) {
                    return new ForwardConfig(str);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof ForwardConfig) && Intrinsics.EZpvd((Object) this.path, (Object) ((ForwardConfig) obj).path);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final String getPath() {
                    return this.path;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public int hashCode() {
                    String str = this.path;
                    if (str == null) {
                        return 0;
                    }
                    return str.hashCode();
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public String toString() {
                    return "ForwardConfig(path=" + this.path + ")";
                }

                public ForwardConfig(String str) {
                    this.path = str;
                }
            }

            public static final class Modification {
                public static final int $stable = 8;
                private final JsonObject body;
                private final Map<String, String> headers;
                private final String method;
                private final Map<String, String> queries;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.network.engine.bean.EngineBean$Rule$Action$Modification */
                /* JADX WARN: Multi-variable type inference failed */
                public static /* synthetic */ Modification copy$default(Modification modification, Map map, Map map2, JsonObject jsonObject, String str, int i, Object obj) {
                    if ((i & 1) != 0) {
                        map = modification.queries;
                    }
                    if ((i & 2) != 0) {
                        map2 = modification.headers;
                    }
                    if ((i & 4) != 0) {
                        jsonObject = modification.body;
                    }
                    if ((i & 8) != 0) {
                        str = modification.method;
                    }
                    return modification.copy(map, map2, jsonObject, str);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final Map<String, String> component1() {
                    return this.queries;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final Map<String, String> component2() {
                    return this.headers;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final JsonObject component3() {
                    return this.body;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final String component4() {
                    return this.method;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final Modification copy(Map<String, String> map, Map<String, String> map2, JsonObject jsonObject, String str) {
                    return new Modification(map, map2, jsonObject, str);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof Modification)) {
                        return false;
                    }
                    Modification modification = (Modification) obj;
                    return Intrinsics.EZpvd(this.queries, modification.queries) && Intrinsics.EZpvd(this.headers, modification.headers) && Intrinsics.EZpvd(this.body, modification.body) && Intrinsics.EZpvd((Object) this.method, (Object) modification.method);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final JsonObject getBody() {
                    return this.body;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final Map<String, String> getHeaders() {
                    return this.headers;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final String getMethod() {
                    return this.method;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final Map<String, String> getQueries() {
                    return this.queries;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public int hashCode() {
                    Map<String, String> map = this.queries;
                    int iHashCode = map == null ? 0 : map.hashCode();
                    Map<String, String> map2 = this.headers;
                    int iHashCode2 = map2 == null ? 0 : map2.hashCode();
                    JsonObject jsonObject = this.body;
                    int iHashCode3 = jsonObject == null ? 0 : jsonObject.hashCode();
                    String str = this.method;
                    return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str != null ? str.hashCode() : 0);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public String toString() {
                    return "Modification(queries=" + this.queries + ", headers=" + this.headers + ", body=" + this.body + ", method=" + this.method + ")";
                }

                public Modification(Map<String, String> map, Map<String, String> map2, JsonObject jsonObject, String str) {
                    this.queries = map;
                    this.headers = map2;
                    this.body = jsonObject;
                    this.method = str;
                }
            }
        }
    }
}
