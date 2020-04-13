<#include "parts/security.ftlh">
<#import "parts/common.ftlh" as c>

<@c.page>
    <div>
        <div class="form-group">
            <h3>${username}</h3>
        </div>
        <#if page.filename == "No info">
            <img src="/img/default-avatar_0.jpg" width="400" class="rounded float-left mt-2 mb-2" alt="default photo">
        <#else>
            <img src="/img/${page.filename}" width="400" class="rounded float-left mt-2 mb-2" alt="user photo">
        </#if>
        <#if isAdmin>
            <form method="post" action="/page/photo" enctype="multipart/form-data">
                <div class="form-group">
                    <div class="custom-file">
                        <input type="file" name="file" id="customFile">
                        <label class="custom-file-label col-md-4" for="customFile">Choose photo</label>
                    </div>
                </div>
                <input type="hidden" name="userId" value="${id}">
                <input type="hidden" name="_csrf" value="${_csrf.token}">
                <div class="form-group">
                    <button type="submit" class="btn btn-primary">Add photo</button>
                </div>
            </form>
            <table class="table table-striped">
                <tbody>
                <tr>
                    <form method="post" action="/page/age">
                        <th scope="row">
                            <div class="form-group">
                                <label >Age:</label>
                            </div>
                        </th>
                        <td>
                            <div class="form-group">
                                <input type="text" name="age" value="${page.age!}">
                            </div>
                            <input type="hidden" name="userId" value="${id}">
                            <input type="hidden" name="_csrf" value="${_csrf.token}">
                        </td>
                        <td>
                            <div class="form-group">
                                <button type="submit" class="btn btn-primary">Save</button>
                            </div>
                        </td>
                    </form>
                </tr>
                <tr>
                    <form method="post" action="/page/about">
                        <th scope="row">
                            <div class="form-group">
                                <label >About:</label>
                            </div>
                        </th>
                        <td>
                            <div class="form-group">
                                <input type="text" name="about" value="${page.about!}">
                            </div>
                            <input type="hidden" name="userId" value="${id}">
                            <input type="hidden" name="_csrf" value="${_csrf.token}">
                        </td>
                        <td>
                            <div class="form-group">
                                <button type="submit" class="btn btn-primary">Save</button>
                            </div>
                        </td>
                    </form>
                </tr>
                <tr>
                    <form method="post" action="/page/education">
                        <th scope="row">
                            <div class="form-group">
                                <label >Education:</label>
                            </div>
                        </th>
                        <td>
                            <div class="form-group">
                                <input type="text" align="center" name="education" value="${page.education!}">
                            </div>
                            <input type="hidden" name="userId" value="${id}">
                            <input type="hidden" name="_csrf" value="${_csrf.token}">
                        </td>
                        <td>
                            <div class="form-group">
                                <button type="submit" class="btn btn-primary">Save</button>
                            </div>
                        </td>
                    </form>
                </tr>
                <tr>
                    <form method="post" action="/page/department">
                        <th scope="row">
                            <div class="form-group">
                                <label >Department:</label>
                            </div>
                        </th>
                        <td>
                            <div class="form-group">
                                <input type="text" name="department" value="${page.department!}">
                            </div>
                            <input type="hidden" name="userId" value="${id}">
                            <input type="hidden" name="_csrf" value="${_csrf.token}">
                        </td>
                        <td>
                            <div class="form-group">
                                <button type="submit" class="btn btn-primary">Save</button>
                            </div>
                        </td>
                    </form>
                </tr>
                <tr>
                    <form method="post" action="/page/position">
                        <th scope="row">
                            <div class="form-group">
                                <label >Position:</label>
                            </div>
                        </th>
                        <td>
                            <div class="form-group">
                                <input type="text" name="position" value="${page.position!}">
                            </div>
                            <input type="hidden" name="userId" value="${id}">
                            <input type="hidden" name="_csrf" value="${_csrf.token}">
                        </td>
                        <td>
                            <div class="form-group">
                                <button type="submit" class="btn btn-primary">Save</button>
                            </div>
                        </td>
                    </form>
                </tr>
                </tbody>
            </table>
        <#else>
            <table class="table table-striped">
                <tbody>
                <tr>
                    <th scope="row">
                        <div class="form-group">
                            <label >Age:</label>
                        </div>
                    </th>
                    <td>
                        <div class="form-group">
                            <h5>${page.age!}</h5>
                        </div>
                    </td>
                </tr>
                <tr>
                    <th scope="row">
                        <div class="form-group">
                            <label>About:</label>
                        </div>
                    </th>
                    <td>
                        <div class="form-group">
                            <h5>${page.about!}</h5>
                        </div>
                    </td>
                </tr>
                <tr>
                    <th scope="row">
                        <div class="form-group">
                            <label >Education:</label>
                        </div>
                    </th>
                    <td>
                        <div class="form-group">
                            <h5>${page.education!}</h5>
                        </div>
                    </td>
                </tr>
                <tr>
                    <th scope="row">
                        <div class="form-group">
                            <label >Department:</label>
                        </div>
                    </th>
                    <td>
                        <div class="form-group">
                            <h5>${page.department!}</h5>
                        </div>
                    </td>
                </tr>
                <tr>
                    <th scope="row">
                        <div class="form-group">
                            <label >Position:</label>
                        </div>
                    </th>
                    <td>
                        <div class="form-group">
                            <h5>${page.position!}</h5>
                        </div>
                    </td>
                </tr>
                </tbody>
            </table>
        </#if>
    </div>
</@c.page>