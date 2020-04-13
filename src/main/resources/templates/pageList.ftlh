<#import "parts/common.ftlh" as c>

<@c.page>
        <#list users as user>
            <div class="list-group">
                <a href="/page/${user.id}" class="list-group-item list-group-item-action m-2">${user.username}</a>
<#--                <form method="post">-->
<#--                    <input type="hidden" name="userId" value="${user.id}">-->
<#--                    <input type="hidden" name="_csrf" value="${_csrf.token}">-->
<#--                </form>-->
            </div>
        </#list>
</@c.page>